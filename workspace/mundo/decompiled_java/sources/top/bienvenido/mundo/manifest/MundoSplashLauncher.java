package top.bienvenido.mundo.manifest;

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
import top.bienvenido.date_24323.g9;
import top.bienvenido.date_24323.h6;
import top.bienvenido.date_24323.v5;
import top.bienvenido.date_24323.w5;
import top.bienvenido.date_24323.父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;

/* loaded from: MundoSplashLauncher.class */
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
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m601(Intent intent) {
        v5 v5Var;
        try {
            String stringExtra = intent.getStringExtra("mundo_base_string");
            if (stringExtra != null && !StringsKt.isBlank(stringExtra)) {
                g9 g9Var = w5.f406;
                try {
                    v5Var = (v5) w5.f406.m162(stringExtra.hashCode());
                } catch (Exception e) {
                    v5Var = null;
                }
                if (v5Var != null) {
                    boolean z = 父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                    if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟) {
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
                            if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈) {
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
        } catch (Exception e2) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m602(String str, String str2) {
        h6 h6Var = h6.f178;
        String str3 = str2;
        if (str2 == null || str2.length() == 0) {
            str3 = "0";
        }
        h6.m214((ActivityInfo) null, str, str3);
    }
}
