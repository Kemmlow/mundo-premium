.class public final Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;
.super Landroid/app/Activity;
.source "MundoSplashLauncher.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 21
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic lambda$狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰$0(Ljava/lang/String;Ljava/lang/String;)V
    .registers 2

    .line 110
    invoke-static {p0, p1}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    .line 119
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;

    if-eqz p1, :cond_a

    .line 121
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_c

    :cond_a
    const-string p1, "0"

    :cond_c
    const/4 v0, 0x0

    .line 124
    invoke-static {v0, p0, p1}, Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ActivityInfo;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .registers 2

    .line 24
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 25
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;)V

    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .registers 2

    .line 30
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    if-eqz p1, :cond_9

    .line 32
    invoke-virtual {p0, p1}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;)V

    goto :goto_c

    .line 34
    :cond_9
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->finish()V

    :goto_c
    return-void
.end method

.method public final onPause()V
    .registers 1

    .line 40
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 41
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->finish()V

    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;)V
    .registers 12

    :try_start_0
    const-string v0, "mundo_base_string"

    .line 47
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_117

    .line 48
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_117

    .line 49
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/w5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_10} :catch_11a

    .line 51
    :try_start_10
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/w5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bienvenido/mundo/sdk/internal/v5;
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_1c} :catch_1d

    goto :goto_1e

    :catch_1d
    const/4 v1, 0x0

    :goto_1e
    if-eqz v1, :cond_f9

    .line 56
    :try_start_20
    sget-boolean v2, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    .line 57
    sget-boolean v2, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_31

    .line 58
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 60
    :cond_31
    iget-object v2, v1, Lnet/bienvenido/mundo/sdk/internal/v5;->要不要把你妈卵子扣出来给你做寿司吃:Lkotlin/Triple;

    if-nez v2, :cond_44

    .line 61
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    iget-object v1, v1, Lnet/bienvenido/mundo/sdk/internal/v5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_f9

    .line 63
    :cond_44
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-static {v3, v4, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    .line 64
    iget-object v3, v1, Lnet/bienvenido/mundo/sdk/internal/v5;->要不要把你妈卵子扣出来给你做寿司吃:Lkotlin/Triple;

    .line 65
    new-instance v4, Landroid/widget/FrameLayout;

    invoke-direct {v4, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 66
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v6, -0x1

    invoke-direct {v5, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    invoke-virtual {v3}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    .line 68
    invoke-virtual {v3}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    .line 69
    new-instance v7, Landroid/widget/ImageView;

    invoke-direct {v7, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    mul-int/lit8 v8, v2, 0xe

    .line 71
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v9, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v8, 0x11

    .line 72
    iput v8, v9, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 73
    invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 74
    iget-object v1, v1, Lnet/bienvenido/mundo/sdk/internal/v5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/graphics/drawable/Drawable;

    .line 75
    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 76
    instance-of v8, v1, Landroid/graphics/drawable/Animatable;

    if-eqz v8, :cond_90

    .line 77
    check-cast v1, Landroid/graphics/drawable/Animatable;

    invoke-interface {v1}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_90
    if-eqz v6, :cond_ab

    .line 80
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v5, :cond_9e

    .line 81
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-eq v1, v8, :cond_ab

    .line 82
    :cond_9e
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_ab

    .line 83
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 87
    :cond_ab
    invoke-virtual {v4, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 88
    invoke-virtual {v3}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_dd

    .line 90
    new-instance v3, Landroid/view/View;

    invoke-direct {v3, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 91
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    mul-int/lit8 v7, v2, 0xa

    mul-int/lit8 v8, v2, 0x4

    invoke-direct {v6, v7, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0x51

    .line 92
    iput v7, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    mul-int/lit8 v2, v2, 0x3

    .line 93
    iput v2, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 94
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    invoke-virtual {v3, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 96
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Z

    if-eqz v1, :cond_da

    const/4 v1, 0x0

    .line 97
    invoke-virtual {v3, v1}, Landroid/view/View;->forceHasOverlappingRendering(Z)V

    .line 99
    :cond_da
    invoke-virtual {v4, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :cond_dd
    if-eqz v5, :cond_e7

    .line 102
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    goto :goto_f6

    .line 104
    :cond_e7
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/FrameLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 106
    :goto_f6
    invoke-virtual {p0, v4}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->setContentView(Landroid/view/View;)V

    :cond_f9
    :goto_f9
    const-string v1, "mundo_base_bundle"

    .line 109
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 110
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0, p1}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 113
    :cond_117
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/manifest/MundoSplashLauncher;->finish()V
    :try_end_11a
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_11a} :catch_11a

    :catch_11a
    return-void
.end method
