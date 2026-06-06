package com.apex.vapp;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import net_62v.external.MetaApplicationInstaller;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.lsposed.lsparanoid.Obfuscate;

@Obfuscate
public class AppList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private AppListAdapter adapter;
    private List<AppInfo> allApps = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clone_app);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
        }

        recyclerView = findViewById(R.id.list_apps_recycler_view);
        progressBar = findViewById(R.id.list_apps_progress_bar);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AppListAdapter(this, this::installApp);
        recyclerView.setAdapter(adapter);

        loadInstalledApps();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void installApp(AppInfo appInfo) {
        Toast.makeText(this, "Adding...", Toast.LENGTH_SHORT).show();
        new Thread(() -> {
            boolean success = false;
            try {
                MetaApplicationInstaller.cloneApp(appInfo.packageName);
                success = true;
            } catch (Throwable e) { e.printStackTrace(); }

            boolean finalSuccess = success;
            runOnUiThread(() -> {
                if (finalSuccess) {
                    setResult(Activity.RESULT_OK); finish();
                } else {
                    Toast.makeText(this, "Error adding app", Toast.LENGTH_LONG).show();
                }
            });
        }).start();
    }

    private void loadInstalledApps() {
        progressBar.setVisibility(View.VISIBLE);
        new Thread(() -> {
            PackageManager pm = getPackageManager();
            List<PackageInfo> packages = pm.getInstalledPackages(0);
            allApps.clear();
            String hostPkg = getPackageName();
            for (PackageInfo pkgInfo : packages) {

                if ((pkgInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0) continue;
                if (pkgInfo.packageName.equals(hostPkg)) continue;

                allApps.add(new AppInfo(
                        pkgInfo.packageName,
                        pkgInfo.applicationInfo.loadLabel(pm).toString(),
                        pkgInfo.applicationInfo.loadIcon(pm)
                ));
            }

            Collections.sort(allApps, (o1, o2) -> Collator.getInstance(Locale.getDefault()).compare(o1.appName, o2.appName));

            runOnUiThread(() -> {
                progressBar.setVisibility(View.GONE);
                adapter.setApps(allApps);
            });
        }).start();
    }

    private static class AppInfo {
        final String packageName, appName;
        final Drawable icon;
        AppInfo(String pkg, String name, Drawable icon) {
            this.packageName = pkg; this.appName = name; this.icon = icon;
        }
    }

    private static class AppListAdapter extends RecyclerView.Adapter<AppListAdapter.AppViewHolder> {
        private final Context context;
        private List<AppInfo> apps = new ArrayList<>();
        private final OnAppClickListener listener;

        interface OnAppClickListener { void onAppClick(AppInfo app); }

        AppListAdapter(Context ctx, OnAppClickListener l) { this.context = ctx; this.listener = l; }

        public void setApps(List<AppInfo> apps) {
            this.apps = apps; notifyDataSetChanged();
        }

        @NonNull @Override
        public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AppViewHolder(LayoutInflater.from(context).inflate(R.layout.item_app, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
            AppInfo app = apps.get(position);
            holder.appName.setText(app.appName);
            holder.appIcon.setImageDrawable(app.icon);

            String currentLetter = app.appName.substring(0, 1).toUpperCase();
            if (position == 0) {
                holder.letterHeader.setVisibility(View.VISIBLE);
                holder.letterHeader.setText(currentLetter);
            } else {
                String previousLetter = apps.get(position - 1).appName.substring(0, 1).toUpperCase();
                if (!currentLetter.equals(previousLetter)) {
                    holder.letterHeader.setVisibility(View.VISIBLE);
                    holder.letterHeader.setText(currentLetter);
                } else {
                    holder.letterHeader.setVisibility(View.GONE);
                }
            }

            holder.btnInstall.setOnClickListener(v -> listener.onAppClick(app));
            holder.itemView.setOnClickListener(v -> listener.onAppClick(app));
        }

        @Override public int getItemCount() { return apps.size(); }

        static class AppViewHolder extends RecyclerView.ViewHolder {
            ImageView appIcon; TextView appName, btnInstall, letterHeader;
            AppViewHolder(View v) {
                super(v);
                appIcon = v.findViewById(R.id.item_app_icon);
                appName = v.findViewById(R.id.item_app_name);
                btnInstall = v.findViewById(R.id.btn_install);
                letterHeader = v.findViewById(R.id.tv_letter_header);
            }
        }
    }
}