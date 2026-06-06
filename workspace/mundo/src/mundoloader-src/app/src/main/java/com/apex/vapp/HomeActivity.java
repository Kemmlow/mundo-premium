package com.apex.vapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import net_62v.external.MetaActivityManager;
import net_62v.external.MetaApplicationInstaller;
import net_62v.external.MetaPackageManager;

import java.util.ArrayList;
import java.util.List;

import org.lsposed.lsparanoid.Obfuscate;

@Obfuscate
public class HomeActivity extends AppCompatActivity {

    private HomeAppAdapter mAdapter;
    private DrawerLayout drawerLayout;
    private static final int REQUEST_SELECT_APP = 5;

    private final String[] GMS_PACKAGES = {
            "com.android.chrome",
            "com.android.vending",
            "com.google.android.play.games",
            "com.google.android.gms",
            "com.google.android.gsf"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
        }

        toolbar.setNavigationOnClickListener(v -> drawerLayout.openDrawer(GravityCompat.START));

        NavigationView navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.menu_add_gms) {
                installGMS();
            } else if (id == R.id.menu_disable_gms) {
                uninstallGMS();
            } else if (id == R.id.menu_telegram) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/mundo_prem")));
            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });

        RecyclerView recyclerView = findViewById(R.id.rv_home_apps);
        FloatingActionButton fab = findViewById(R.id.fab_add);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        mAdapter = new HomeAppAdapter(this, this::launchApp, this::showDeleteDialog);
        recyclerView.setAdapter(mAdapter);

        fab.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, AppList.class);
            startActivityForResult(intent, REQUEST_SELECT_APP);
        });
    }

    private void installGMS() {
        Toast.makeText(this, "Adding GMS packages...", Toast.LENGTH_SHORT).show();
        new Thread(() -> {
            for (String pkg : GMS_PACKAGES) {
                try {
                    MetaApplicationInstaller.cloneApp(pkg);
                } catch (Throwable ignore) {}
            }
            runOnUiThread(() -> {
                Toast.makeText(this, "GMS Added", Toast.LENGTH_SHORT).show();
                loadVirtualApps();
            });
        }).start();
    }

    private void uninstallGMS() {
        Toast.makeText(this, "Removing GMS packages...", Toast.LENGTH_SHORT).show();
        new Thread(() -> {
            for (String pkg : GMS_PACKAGES) {
                try {
                    MetaPackageManager.uninstallAppFully(pkg);
                } catch (Throwable ignore) {}
            }
            runOnUiThread(() -> {
                Toast.makeText(this, "GMS Disabled", Toast.LENGTH_SHORT).show();
                loadVirtualApps();
            });
        }).start();
    }

    private void launchApp(PackageAppData appData) {
        if (appData.isEmpty) return;
        try {
            MetaActivityManager.launchApp(appData.packageName);
        } catch (Throwable e) {
            Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void showDeleteDialog(PackageAppData appData) {
        if (appData.isEmpty) return;
        new AlertDialog.Builder(this)
                .setTitle("Delete App")
                .setMessage("Remove " + appData.getName() + "?")
                .setPositiveButton("Delete", (dialog, which) -> {
                    new Thread(() -> {
                        try {
                            MetaPackageManager.uninstallAppFully(appData.packageName);
                            runOnUiThread(this::loadVirtualApps);
                        } catch (Throwable e) { e.printStackTrace(); }
                    }).start();
                })
                .setNegativeButton("Cancel", null)
                .show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadVirtualApps();
    }

    private void loadVirtualApps() {
        new Thread(() -> {
            List<PackageAppData> models = new ArrayList<>();
            try {
                List<String> innerApps = MetaPackageManager.getInstalledInnerApps();
                if (innerApps != null) {
                    for (String pkg : innerApps) {

                        if (pkg.equals("com.google.android.gms") || pkg.equals("com.google.android.gsf")) {
                            continue;
                        }
                        try {
                            ApplicationInfo info = MetaPackageManager.getApplicationInfo(pkg);
                            if (info == null) { info = new ApplicationInfo(); info.packageName = pkg; }
                            models.add(new PackageAppData(this, info));
                        } catch (Exception ignore) {}
                    }
                }
            } catch (Exception ignore) {}

            int remainder = models.size() % 4;
            if (remainder != 0 || models.isEmpty()) {
                int emptyNeeded = models.isEmpty() ? 4 : (4 - remainder);
                for (int i = 0; i < emptyNeeded; i++) {
                    models.add(new PackageAppData());
                }
            }

            runOnUiThread(() -> mAdapter.setApps(models));
        }).start();
    }

    public static class PackageAppData {
        public String packageName, name;
        public Drawable icon;
        public boolean isEmpty = false;

        public PackageAppData() {
            this.isEmpty = true;
        }

        public PackageAppData(Context ctx, ApplicationInfo info) {
            this.packageName = info.packageName;
            PackageManager pm = ctx.getPackageManager();
            try {
                ApplicationInfo host = pm.getApplicationInfo(packageName, 0);
                this.name = host.loadLabel(pm).toString();
                this.icon = host.loadIcon(pm);
            } catch (Exception e) {
                this.name = packageName;
                this.icon = ContextCompat.getDrawable(ctx, android.R.drawable.sym_def_app_icon);
            }
        }
        public String getName() { return name; }
        public Drawable getIcon() { return icon; }
    }

    private static class HomeAppAdapter extends RecyclerView.Adapter<HomeAppAdapter.ViewHolder> {
        private final Context context;
        private List<PackageAppData> apps = new ArrayList<>();
        private final OnAppClickListener click, longClick;

        public interface OnAppClickListener { void onClick(PackageAppData app); }

        public HomeAppAdapter(Context ctx, OnAppClickListener c, OnAppClickListener lc) {
            this.context = ctx; this.click = c; this.longClick = lc;
        }

        public void setApps(List<PackageAppData> apps) {
            this.apps = apps; notifyDataSetChanged();
        }

        @NonNull @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_home_app, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            PackageAppData app = apps.get(position);

            if (app.isEmpty) {

                holder.icon.setImageDrawable(null);
                holder.name.setText("");
                holder.itemView.setClickable(false);
                holder.itemView.setOnLongClickListener(null);
            } else {

                holder.name.setText(app.getName());
                holder.icon.setImageDrawable(app.getIcon());
                holder.itemView.setClickable(true);
                holder.itemView.setOnClickListener(v -> click.onClick(app));
                holder.itemView.setOnLongClickListener(v -> { longClick.onClick(app); return true; });
            }
        }

        @Override public int getItemCount() { return apps.size(); }

        static class ViewHolder extends RecyclerView.ViewHolder {
            ImageView icon; TextView name;
            ViewHolder(View v) { super(v); icon = v.findViewById(R.id.iv_icon); name = v.findViewById(R.id.tv_name); }
        }
    }
}