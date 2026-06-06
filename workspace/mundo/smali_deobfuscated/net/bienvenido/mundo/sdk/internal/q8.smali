.class public abstract Lnet/bienvenido/mundo/sdk/internal/q8;
.super Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;
.source "q8.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 12
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;-><init>()V

    return-void
.end method

.method private isFbApp(Ljava/lang/String;)Z
    .registers 4

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    :cond_4
    const-string v1, "com.facebook.katana"

    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    const-string v1, "com.facebook.orca"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    const-string v1, "com.facebook.wakizashi"

    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1d

    :cond_1c
    const/4 v0, 0x1

    :cond_1d
    return v0
.end method

.method private isFbAuthIntent(Landroid/content/Intent;)Z
    .registers 6

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    .line 22
    :cond_4
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1c

    const-string v3, "facebook.com"

    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1c

    const-string v3, "oauth"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1c

    return v2

    .line 24
    :cond_1c
    invoke-virtual {p1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v1, "fbconnect"

    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    const-string v1, "fb-messenger"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_31

    goto :goto_32

    :cond_31
    return v0

    :cond_32
    :goto_32
    return v2
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/q8;Ljava/lang/Object;[Ljava/lang/Object;Ltop/bienvenido/date_24323/m0;)Landroid/content/pm/ResolveInfo;
    .registers 6

    .line 91
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/internal/q8;->要不要把你妈卵子扣出来给你做寿司吃()Lkotlin/jvm/functions/Function4;

    move-result-object p0

    const/4 v0, 0x1

    .line 92
    aget-object v0, p2, v0

    if-eqz v0, :cond_e

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    const/4 v1, 0x2

    .line 94
    aget-object p2, p2, v1

    .line 95
    instance-of v1, p2, Ljava/lang/Number;

    if-eqz v1, :cond_1d

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    goto :goto_1e

    :cond_1d
    const/4 p2, 0x0

    :goto_1e
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p3, p1, v0, p2}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ResolveInfo;

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    const/4 v0, 0x0

    .line 32
    aget-object v0, p3, v0

    const/4 v1, 0x0

    .line 34
    :try_start_4
    instance-of v2, v0, Landroid/content/Intent;

    if-eqz v2, :cond_3c

    .line 35
    move-object v2, v0

    check-cast v2, Landroid/content/Intent;

    .line 36
    invoke-virtual {v2}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object v3

    .line 37
    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v4

    .line 40
    invoke-direct {p0, v3}, Lnet/bienvenido/mundo/sdk/internal/q8;->isFbApp(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3b

    if-eqz v4, :cond_26

    invoke-virtual {v4}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lnet/bienvenido/mundo/sdk/internal/q8;->isFbApp(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_26

    goto :goto_3b

    .line 45
    :cond_26
    invoke-direct {p0, v2}, Lnet/bienvenido/mundo/sdk/internal/q8;->isFbAuthIntent(Landroid/content/Intent;)Z

    move-result v2

    if-eqz v2, :cond_2d

    return-object v1

    .line 49
    :cond_2d
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    new-instance v3, Lnet/bienvenido/mundo/sdk/internal/q8$1;

    invoke-direct {v3, p0, v0, p3}, Lnet/bienvenido/mundo/sdk/internal/q8$1;-><init>(Lnet/bienvenido/mundo/sdk/internal/q8;Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    goto :goto_4e

    :cond_3b
    :goto_3b
    return-object v1

    .line 55
    :cond_3c
    instance-of v2, v0, Landroid/content/ComponentName;

    if-eqz v2, :cond_4d

    .line 56
    check-cast v0, Landroid/content/ComponentName;

    .line 57
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/bienvenido/mundo/sdk/internal/q8;->isFbApp(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4d

    return-object v1

    :cond_4d
    move-object v0, v1

    :goto_4e
    if-nez v0, :cond_5d

    const/4 v0, 0x2

    .line 64
    invoke-static {p3, v0}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;I)V

    .line 65
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 66
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroid/content/pm/ResolveInfo;

    :cond_5d
    if-nez v0, :cond_60

    return-object v1

    .line 72
    :cond_60
    iget-object p1, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz p1, :cond_6f

    iget-object p1, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-direct {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/q8;->isFbApp(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6f

    return-object v1

    .line 76
    :cond_6f
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/internal/q8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ComponentInfo;

    iget-object p1, p1, Landroid/content/pm/ComponentInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz p1, :cond_8a

    .line 77
    sget-object p2, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    iget-object p3, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8a

    .line 78
    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ApplicationInfo;)Z
    :try_end_8a
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_8a} :catch_8b

    :cond_8a
    return-object v0

    :catch_8b
    return-object v1
.end method

.method public abstract 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Lkotlin/jvm/functions/Function1;
.end method

.method public abstract 要不要把你妈卵子扣出来给你做寿司吃()Lkotlin/jvm/functions/Function4;
.end method
