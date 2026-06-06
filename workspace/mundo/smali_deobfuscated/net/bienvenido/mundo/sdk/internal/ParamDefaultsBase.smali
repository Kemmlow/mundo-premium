.class public Lnet/bienvenido/mundo/sdk/internal/ParamDefaultsBase;
.super Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;
.source "k1.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;-><init>()V

    return-void
.end method

.method private static sneakyThrow(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "Ljava/lang/RuntimeException;",
            "^TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 12
    throw p0
.end method


# virtual methods
.method public 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    .line 17
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_19

    .line 18
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    .line 19
    array-length v1, p3

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v1, :cond_19

    .line 21
    aget-object v3, p3, v2

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    .line 22
    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    aput-object v3, p3, v2

    :cond_16
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 28
    :cond_19
    :try_start_19
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1d
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_19 .. :try_end_1d} :catch_24
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_1d} :catch_1e

    return-object p1

    :catch_1e
    move-exception p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1

    :catch_24
    move-exception p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultsBase;->sneakyThrow(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    goto :goto_2f

    :goto_2e
    throw p1

    :goto_2f
    goto :goto_2e
.end method
