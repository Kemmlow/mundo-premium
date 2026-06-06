.class public final Ltop/bienvenido/date_24323/t6;
.super Ltop/bienvenido/date_24323/a2;
.source "t6.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/t6;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 12
    new-instance v0, Ltop/bienvenido/date_24323/t6;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/t6;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/t6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/t6;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 11
    invoke-direct {p0}, Ltop/bienvenido/date_24323/a2;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    const/4 v0, 0x0

    .line 17
    aget-object v1, p3, v0

    .line 19
    :try_start_3
    sget-boolean v2, Ltop/bienvenido/date_24323/c4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v2, :cond_81

    instance-of v2, v1, Landroid/os/IBinder;

    if-eqz v2, :cond_81

    .line 20
    sget-object v2, Ltop/bienvenido/date_24323/b6;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/b6;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    sget-object v2, Ltop/bienvenido/date_24323/b6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/app/ActivityThread;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getActivityClient"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    const-class v6, Landroid/os/IBinder;

    aput-object v6, v5, v0

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sget-object v3, Ltop/bienvenido/date_24323/b6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/app/ActivityThread;

    new-array v5, v4, [Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Landroid/os/IBinder;

    aput-object v6, v5, v0

    invoke-virtual {v2, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_81

    .line 24
    sget-object v3, Ltop/bienvenido/date_24323/x8;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/n2;

    iget-object v3, v3, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    invoke-virtual {v3, v2}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Intent;

    if-eqz v2, :cond_81

    sget-object v3, Ltop/bienvenido/date_24323/c4;->MundoClass_A1:Ljava/lang/String;

    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_81

    sget-object v3, Ltop/bienvenido/date_24323/c4;->MundoClass_C1:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->hasCategory(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_81

    invoke-virtual {v2}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v3, v4, :cond_81

    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    if-nez v3, :cond_81

    invoke-virtual {v2}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_81

    .line 25
    sget-boolean v2, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_77

    .line 26
    invoke-static {}, Landroid/app/ActivityClient;->getInstance()Landroid/app/ActivityClient;

    move-result-object v2

    check-cast v1, Landroid/os/IBinder;

    invoke-virtual {v2, v1, v0}, Landroid/app/ActivityClient;->moveActivityTaskToBack(Landroid/os/IBinder;Z)V

    return-object v3

    .line 29
    :cond_77
    invoke-static {}, Landroid/app/ActivityTaskManager;->getService()Landroid/app/ActivityTaskManager;

    move-result-object v2

    check-cast v1, Landroid/os/IBinder;

    invoke-virtual {v2, v1, v0}, Landroid/app/ActivityTaskManager;->moveActivityTaskToBack(Landroid/os/IBinder;Z)V
    :try_end_80
    .catchall {:try_start_3 .. :try_end_80} :catchall_81

    return-object v3

    .line 37
    :catchall_81
    :cond_81
    :try_start_81
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_85
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_81 .. :try_end_85} :catch_8d
    .catch Ljava/lang/Exception; {:try_start_81 .. :try_end_85} :catch_86

    return-object p1

    :catch_86
    move-exception p1

    .line 41
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_8d
    move-exception p1

    .line 39
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
