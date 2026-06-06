.class public final Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;
.super Lnet/bienvenido/mundo/sdk/internal/e0;
.source "n4.java"


# static fields
.field public static final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/r6;

.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 12
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;

    .line 13
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/r6;

    const-string v1, ""

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/r6;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/r6;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 11
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/e0;-><init>()V

    return-void
.end method


# virtual methods
.method public final 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Landroid/os/IBinder;)V
    .registers 3

    if-nez p1, :cond_3

    return-void

    .line 21
    :cond_3
    :try_start_3
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/r6;

    .line 22
    monitor-enter v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_6} :catch_e

    .line 23
    :try_start_6
    invoke-virtual {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;)Z

    .line 24
    monitor-exit v0

    goto :goto_e

    :catchall_b
    move-exception p1

    monitor-exit v0
    :try_end_d
    .catchall {:try_start_6 .. :try_end_d} :catchall_b

    :try_start_d
    throw p1
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_e} :catch_e

    :catch_e
    :goto_e
    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;Landroid/os/IBinder;Z)V
    .registers 12

    .line 32
    :try_start_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 33
    sget-object v7, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/r6;

    .line 34
    monitor-enter v7
    :try_end_8
    .catchall {:try_start_0 .. :try_end_8} :catchall_76

    const/4 v2, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move-object v5, v6

    .line 35
    :try_start_e
    invoke-virtual/range {v0 .. v5}, Lnet/bienvenido/mundo/sdk/internal/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;ILandroid/os/IBinder;ZLjava/util/ArrayList;)V

    .line 36
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    monitor-exit v7
    :try_end_14
    .catchall {:try_start_e .. :try_end_14} :catchall_73

    .line 38
    :try_start_14
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_18
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_76

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lnet/bienvenido/mundo/sdk/internal/p6;
    :try_end_24
    .catchall {:try_start_14 .. :try_end_24} :catchall_76

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 41
    :try_start_26
    iget-object v2, p3, Lnet/bienvenido/mundo/sdk/internal/p6;->要不要把你妈卵子扣出来给你做寿司吃:Landroid/os/IBinder;

    invoke-static {v2}, Landroid/database/IContentObserver$Stub;->asInterface(Landroid/os/IBinder;)Landroid/database/IContentObserver;

    move-result-object v2

    .line 42
    sget-boolean v3, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    .line 43
    sget-boolean v3, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Z

    if-eqz v3, :cond_40

    .line 44
    iget-boolean v3, p3, Lnet/bienvenido/mundo/sdk/internal/p6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Z

    .line 45
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    new-array v4, v1, [Landroid/net/Uri;

    aput-object p1, v4, v0

    .line 46
    sget v5, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:I

    invoke-interface {v2, v3, v4, v0, v5}, Landroid/database/IContentObserver;->onChangeEtc(Z[Landroid/net/Uri;II)V

    goto :goto_18

    .line 48
    :cond_40
    iget-boolean v3, p3, Lnet/bienvenido/mundo/sdk/internal/p6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Z

    .line 49
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 50
    sget v4, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:I

    invoke-interface {v2, v3, p1, v4}, Landroid/database/IContentObserver;->onChange(ZLandroid/net/Uri;I)V
    :try_end_49
    .catch Landroid/os/RemoteException; {:try_start_26 .. :try_end_49} :catch_4a
    .catchall {:try_start_26 .. :try_end_49} :catchall_76

    goto :goto_18

    .line 53
    :catch_4a
    :try_start_4a
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/r6;

    monitor-enter v2
    :try_end_4d
    .catchall {:try_start_4a .. :try_end_4d} :catchall_76

    .line 54
    :try_start_4d
    iget-object v3, p3, Lnet/bienvenido/mundo/sdk/internal/p6;->要不要把你妈卵子扣出来给你做寿司吃:Landroid/os/IBinder;

    .line 55
    iget-object p3, p3, Lnet/bienvenido/mundo/sdk/internal/p6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/r6;

    iget-object p3, p3, Lnet/bienvenido/mundo/sdk/internal/r6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    .line 56
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_57
    if-lt v0, v4, :cond_5d

    .line 72
    sget-object p3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 73
    monitor-exit v2

    goto :goto_18

    .line 64
    :cond_5d
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/bienvenido/mundo/sdk/internal/q6;

    iget-object v5, v5, Lnet/bienvenido/mundo/sdk/internal/q6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    if-ne v5, v3, :cond_6e

    .line 65
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v4, v4, -0x1

    :cond_6e
    add-int/2addr v0, v1

    goto :goto_57

    :catchall_70
    move-exception p1

    .line 73
    monitor-exit v2
    :try_end_72
    .catchall {:try_start_4d .. :try_end_72} :catchall_70

    :try_start_72
    throw p1
    :try_end_73
    .catchall {:try_start_72 .. :try_end_73} :catchall_76

    :catchall_73
    move-exception p1

    .line 37
    :try_start_74
    monitor-exit v7
    :try_end_75
    .catchall {:try_start_74 .. :try_end_75} :catchall_73

    :try_start_75
    throw p1
    :try_end_76
    .catchall {:try_start_75 .. :try_end_76} :catchall_76

    :catchall_76
    :cond_76
    return-void
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/net/Uri;Landroid/os/IBinder;Z)V
    .registers 6

    if-eqz p2, :cond_13

    if-nez p1, :cond_5

    goto :goto_13

    .line 86
    :cond_5
    :try_start_5
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/r6;

    .line 87
    monitor-enter v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_8} :catch_13

    const/4 v1, 0x0

    .line 88
    :try_start_9
    invoke-virtual {v0, p1, v1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;ILandroid/os/IBinder;Z)V

    .line 89
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 90
    monitor-exit v0

    goto :goto_13

    :catchall_10
    move-exception p1

    monitor-exit v0
    :try_end_12
    .catchall {:try_start_9 .. :try_end_12} :catchall_10

    :try_start_12
    throw p1
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_13} :catch_13

    :catch_13
    :cond_13
    :goto_13
    return-void
.end method
