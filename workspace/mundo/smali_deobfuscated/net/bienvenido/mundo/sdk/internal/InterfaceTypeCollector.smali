.class public final Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;
.super Ljava/lang/Object;
.source "z0.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)Ljava/lang/Object;
    .registers 5

    .line 21
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/z0$1;

    invoke-direct {v0, p1, p0}, Lnet/bienvenido/mundo/sdk/internal/z0$1;-><init>(Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/Object;)V

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    .line 37
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;-><init>(I)V

    .line 38
    invoke-static {p0, v1}, Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;)V

    .line 39
    sget-object p0, Lnet/bienvenido/mundo/sdk/internal/g;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Class;

    invoke-virtual {v1, p0}, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Class;

    invoke-static {p1, p0, v0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    if-nez p4, :cond_4

    .line 45
    sget-object p4, Lnet/bienvenido/mundo/sdk/internal/g;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:[Ljava/lang/Object;

    .line 47
    :cond_4
    invoke-virtual {p0, p1, p3, p4}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;)V
    .registers 3

    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    .line 12
    const-class v0, Ljava/lang/Object;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    const/4 p0, 0x0

    :cond_14
    if-eqz p0, :cond_19

    .line 16
    invoke-static {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;)V

    :cond_19
    return-void
.end method
