package net.bienvenido.mundo.sdk.manifest;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Triple;
import kotlin.text.StringsKt;
import net.bienvenido.mundo.sdk.internal.SparseArrayMap;
import net.bienvenido.mundo.sdk.internal.WindowManagerServiceImpl;
import net.bienvenido.mundo.sdk.internal.v5;
import net.bienvenido.mundo.sdk.internal.w5;
import net.bienvenido.mundo.sdk.internal.sConditionCheckField;

public final class MundoSplashLauncher extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m601(getIntent());
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m601(intent);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */

    public final void m601(Intent intent) {
        v5 v5Var;
        try {
            String stringExtra = intent.getStringExtra("mundo_base_string");
            if (stringExtra != null && !StringsKt.isBlank(stringExtra)) {
                SparseArrayMap g9Var = w5.f406;
                try {
                    v5Var = (v5) w5.f406.m162(stringExtra.hashCode());
                } catch (Exception e) {
                    v5Var = null;
                }
                if (v5Var != null) {
                    boolean z = sConditionCheckField.ProcessCallbackWrapper;
                    if (sConditionCheckField.activityThreadRef) {
                        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                    }
                    if (v5Var.f393 == null) {
                        getWindow().getDecorView().setBackground(v5Var.f392);
                    } else {
                        int iApplyDimension = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
                        Triple triple = v5Var.f393;
                        FrameLayout frameLayout = new FrameLayout(this);
                        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        Integer num = (Integer) triple.getSecond();
                        Integer num2 = (Integer) triple.getThird();
                        ImageView imageView = new ImageView(this);
                        int i = iApplyDimension * 14;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
                        layoutParams.gravity = 17;
                        imageView.setLayoutParams(layoutParams);
                        Drawable drawable = v5Var.f392;
                        imageView.setImageDrawable(drawable);
                        if (drawable instanceof Animatable) {
                            ((Animatable) drawable).start();
                        }
                        if (num2 != null) {
                            int iIntValue = num2.intValue();
                            if ((num == null || iIntValue != num.intValue()) && num2.intValue() != 0) {
                                imageView.setBackgroundColor(num2.intValue());
                            }
                        }
                        frameLayout.addView(imageView);
                        Drawable drawable2 = (Drawable) triple.getFirst();
                        if (drawable2 != null) {
                            View view = new View(this);
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iApplyDimension * 10, iApplyDimension * 4);
                            layoutParams2.gravity = 81;
                            layoutParams2.bottomMargin = iApplyDimension * 3;
                            view.setLayoutParams(layoutParams2);
                            view.setBackground(drawable2);
                            if (sConditionCheckField.sServiceNameField) {
                                view.forceHasOverlappingRendering(false);
                            }
                            frameLayout.addView(view);
                        }
                        if (num != null) {
                            frameLayout.setBackgroundColor(num.intValue());
                        } else {
                            frameLayout.setBackground(getWindow().getDecorView().getBackground());
                        }
                        setContentView(frameLayout);
                    }
                }
                String stringExtra2 = intent.getStringExtra("mundo_base_bundle");
                getWindow().getDecorView().findViewById(R.id.content).post(() -> {
                    m602(stringExtra, stringExtra2);
                });
                return;
            }
            finish();
        } catch (Exception AppVirtualUsb) {
        }
    }


    public static final void m602(String str, String str2) {
        WindowManagerServiceImpl h6Var = WindowManagerServiceImpl.f178;
        String str3 = str2;
        if (str2 == null || str2.length() == 0) {
            str3 = "0";
        }
        WindowManagerServiceImpl.m214((ActivityInfo) null, str, str3);
    }
}
