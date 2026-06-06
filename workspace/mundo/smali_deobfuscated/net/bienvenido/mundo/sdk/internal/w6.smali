.class public final Lnet/bienvenido/mundo/sdk/internal/w6;
.super Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;
.source "w6.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;[Ljava/lang/Object;Ltop/bienvenido/date_24323/m0;)Lkotlin/Unit;
    .registers 4

    const/4 v0, 0x1

    .line 37
    aget-object p1, p1, v0

    .line 38
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_e

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_f

    :cond_e
    const/4 p1, 0x0

    :goto_f
    invoke-interface {p2, p0, p1}, Ltop/bienvenido/date_24323/m0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;I)V

    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    .line 11
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_17

    const/4 v0, 0x0

    .line 13
    :try_start_5
    aget-object v0, p3, v0

    check-cast v0, Landroid/content/ComponentName;

    if-eqz v0, :cond_17

    .line 15
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    new-instance v2, Lnet/bienvenido/mundo/sdk/internal/w6$1;

    invoke-direct {v2, p0, v0, p3}, Lnet/bienvenido/mundo/sdk/internal/w6$1;-><init>(Lnet/bienvenido/mundo/sdk/internal/w6;Landroid/content/ComponentName;[Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_15} :catch_17

    const/4 p1, 0x0

    return-object p1

    .line 33
    :catch_17
    :cond_17
    invoke-super {p0, p1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
