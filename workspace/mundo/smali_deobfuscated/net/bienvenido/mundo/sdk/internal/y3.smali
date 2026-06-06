.class public final Lnet/bienvenido/mundo/sdk/internal/y3;
.super Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;
.source "y3.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ltop/bienvenido/date_24323/p0;)Ljava/util/List;
    .registers 9

    const/4 v0, 0x0

    .line 44
    aget-object v1, p0, v0

    .line 45
    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_e

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    goto :goto_f

    :cond_e
    const/4 v1, 0x0

    :goto_f
    const/4 v2, 0x1

    .line 46
    aget-object p0, p0, v2

    .line 47
    instance-of v2, p0, Ljava/lang/Number;

    if-eqz v2, :cond_1c

    .line 48
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v0

    :cond_1c
    int-to-long v1, v1

    const/16 p0, 0x20

    shl-long/2addr v1, p0

    const-wide v3, -0x100000000L

    and-long/2addr v1, v3

    int-to-long v3, v0

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long/2addr v1, v3

    .line 50
    sget p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:I

    invoke-interface {p1, v1, v2, p0}, Ltop/bienvenido/date_24323/p0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(JI)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    .line 12
    :try_start_0
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_26

    .line 13
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerServiceProxy;

    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/y3$1;

    invoke-direct {v1, p0, p3}, Lnet/bienvenido/mundo/sdk/internal/y3$1;-><init>(Lnet/bienvenido/mundo/sdk/internal/y3;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_26

    .line 25
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/ProviderInfoHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 26
    const-class v1, Landroid/content/pm/ParceledListSlice;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_25

    invoke-static {v0}, Lnet/bienvenido/mundo/sdk/internal/ProviderInfoHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)Landroid/content/pm/ParceledListSlice;

    move-result-object v0
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_25} :catch_26

    :cond_25
    return-object v0

    .line 34
    :catch_26
    :cond_26
    :try_start_26
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2a
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_26 .. :try_end_2a} :catch_32
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_2a} :catch_2b

    return-object p1

    :catch_2b
    move-exception p1

    .line 38
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_32
    move-exception p1

    .line 36
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
