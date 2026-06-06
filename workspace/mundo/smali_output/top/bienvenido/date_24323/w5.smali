.class public abstract Ltop/bienvenido/date_24323/w5;
.super Ljava/lang/Object;
.source "w5.java"


# static fields
.field public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 17
    new-instance v0, Ltop/bienvenido/date_24323/g9;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltop/bienvenido/date_24323/g9;-><init>(I)V

    sput-object v0, Ltop/bienvenido/date_24323/w5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    .line 74
    :try_start_8
    const-class v0, Landroid/content/Context;

    const-string v2, "createApplicationContext"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Class;

    const-class v4, Landroid/content/pm/ApplicationInfo;

    aput-object v4, v3, v1

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x1

    aput-object v1, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 75
    invoke-virtual {v0, v4}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 76
    new-instance v1, Ltop/bienvenido/date_24323/o2;

    invoke-direct {v1, v0}, Ltop/bienvenido/date_24323/o2;-><init>(Ljava/lang/reflect/Method;)V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_24} :catch_25

    goto :goto_27

    .line 78
    :catch_25
    sget-object v1, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/s2;

    .line 80
    :goto_27
    sput-object v1, Ltop/bienvenido/date_24323/w5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Context;)Ltop/bienvenido/date_24323/v5;
    .registers 6

    const/4 v0, 0x0

    .line 88
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ltop/bienvenido/date_24323/t4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)Landroid/content/pm/ActivityInfo;

    move-result-object v1

    if-eqz v1, :cond_4e

    .line 89
    invoke-virtual {v1}, Landroid/content/pm/ActivityInfo;->getThemeResource()I

    move-result v1

    if-eqz v1, :cond_4e

    .line 90
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    const/4 v2, 0x1

    .line 91
    invoke-virtual {p0, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 92
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    const v3, 0x1010054

    .line 93
    invoke-virtual {p0, v3, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_45

    iget v2, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v2, :cond_45

    .line 94
    iget v3, v1, Landroid/util/TypedValue;->type:I

    const/16 v4, 0x1c

    if-lt v3, v4, :cond_39

    const/16 v4, 0x1f

    if-le v3, v4, :cond_45

    .line 95
    :cond_39
    invoke-virtual {p0, v2}, Landroid/content/res/Resources$Theme;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_45

    .line 96
    new-instance p0, Ltop/bienvenido/date_24323/v5;

    invoke-direct {p0, v2, v0}, Ltop/bienvenido/date_24323/v5;-><init>(Landroid/graphics/drawable/Drawable;Lkotlin/Triple;)V

    return-object p0

    .line 99
    :cond_45
    sget-boolean v2, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼:Z

    if-eqz v2, :cond_4e

    .line 100
    invoke-static {p0, v1}, Ltop/bienvenido/date_24323/w5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)Ltop/bienvenido/date_24323/v5;

    move-result-object p0
    :try_end_4d
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_4d} :catch_4e

    return-object p0

    :catch_4e
    :cond_4e
    return-object v0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)Ltop/bienvenido/date_24323/v5;
    .registers 10

    const v0, 0x101062d

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 25
    :try_start_5
    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v0

    if-eqz v0, :cond_5f

    iget v0, p1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_5f

    invoke-virtual {p0, v0}, Landroid/content/res/Resources$Theme;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_16

    goto :goto_5f

    .line 28
    :cond_16
    new-instance v3, Ltop/bienvenido/date_24323/v5;

    new-instance v4, Lkotlin/Triple;

    const v5, 0x101062f

    invoke-virtual {p0, v5, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v5

    if-eqz v5, :cond_2d

    iget v5, p1, Landroid/util/TypedValue;->resourceId:I

    if-nez v5, :cond_28

    goto :goto_2d

    :cond_28
    invoke-virtual {p0, v5}, Landroid/content/res/Resources$Theme;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_2e

    :cond_2d
    :goto_2d
    move-object v5, v2

    :goto_2e
    const v6, 0x101062c

    invoke-virtual {p0, v6, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v6

    if-eqz v6, :cond_3e

    iget v6, p1, Landroid/util/TypedValue;->data:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_3f

    :cond_3e
    move-object v6, v2

    :goto_3f
    sget-boolean v7, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Z

    if-eqz v7, :cond_47

    instance-of v7, v0, Landroid/graphics/drawable/AdaptiveIconDrawable;

    if-nez v7, :cond_57

    :cond_47
    const v7, 0x1010630

    invoke-virtual {p0, v7, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p0

    if-eqz p0, :cond_57

    iget p0, p1, Landroid/util/TypedValue;->data:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_58

    :cond_57
    move-object p0, v2

    :goto_58
    invoke-direct {v4, v5, v6, p0}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v3, v0, v4}, Ltop/bienvenido/date_24323/v5;-><init>(Landroid/graphics/drawable/Drawable;Lkotlin/Triple;)V
    :try_end_5e
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5e} :catch_5f

    return-object v3

    :catch_5f
    :cond_5f
    :goto_5f
    return-object v2
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 2

    .line 111
    sget-object v0, Ltop/bienvenido/date_24323/你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/concurrent/ExecutorService;

    .line 112
    sget-object v0, Ltop/bienvenido/date_24323/你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ltop/bienvenido/date_24323/w5$2;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/w5$2;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ZLandroid/content/Context;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Ltop/bienvenido/date_24323/g9;)V
    .registers 7

    if-nez p0, :cond_8

    const/4 p0, 0x3

    .line 124
    :try_start_3
    invoke-virtual {p1, p2, p0}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object p0

    goto :goto_1d

    .line 126
    :cond_8
    sget-object p0, Ltop/bienvenido/date_24323/w5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x1

    aput-object p3, v0, v1

    invoke-virtual {p0, p1, v0}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    .line 128
    :goto_1d
    invoke-static {p0}, Ltop/bienvenido/date_24323/w5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Context;)Ltop/bienvenido/date_24323/v5;

    move-result-object p0

    if-eqz p0, :cond_32

    .line 130
    monitor-enter p4
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_24} :catch_32

    .line 131
    :try_start_24
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {p4, p1, p0}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 132
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 133
    monitor-exit p4

    goto :goto_32

    :catchall_2f
    move-exception p0

    monitor-exit p4
    :try_end_31
    .catchall {:try_start_24 .. :try_end_31} :catchall_2f

    :try_start_31
    throw p0
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_32} :catch_32

    :catch_32
    :cond_32
    :goto_32
    return-void
.end method

.method public static final 要不要把你妈卵子扣出来给你做寿司吃()V
    .registers 12

    .line 36
    :try_start_0
    new-instance v6, Ltop/bienvenido/date_24323/g9;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Ltop/bienvenido/date_24323/g9;-><init>(I)V

    .line 37
    sput-object v6, Ltop/bienvenido/date_24323/w5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    .line 38
    sget-object v8, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 39
    sget-object v0, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/n5;

    invoke-virtual {v0}, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃()Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_45

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 40
    sget-object v0, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/n5;

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    sget-object v1, Ltop/bienvenido/date_24323/n5;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ltop/bienvenido/date_24323/obfclass2;

    invoke-virtual {v1, v3}, Ltop/bienvenido/date_24323/obfclass2;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_33

    .line 43
    invoke-virtual {v0, v3, v7}, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    goto :goto_34

    :cond_33
    const/4 v0, 0x0

    :goto_34
    move-object v4, v0

    .line 44
    sget-object v0, Ltop/bienvenido/date_24323/你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/concurrent/ExecutorService;

    .line 46
    sget-object v10, Ltop/bienvenido/date_24323/你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/concurrent/ExecutorService;

    new-instance v11, Ltop/bienvenido/date_24323/w5$1;

    move-object v0, v11

    move-object v2, v8

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Ltop/bienvenido/date_24323/w5$1;-><init>(ZLandroid/content/Context;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Ltop/bienvenido/date_24323/g9;)V

    invoke-interface {v10, v11}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_44
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_44} :catch_45

    goto :goto_14

    :catch_45
    :cond_45
    return-void
.end method
