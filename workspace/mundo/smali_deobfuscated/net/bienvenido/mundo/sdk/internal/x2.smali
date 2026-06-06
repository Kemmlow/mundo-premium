.class public final Lnet/bienvenido/mundo/sdk/internal/x2;
.super Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;
.source "x2.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 5
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    .line 8
    invoke-super {p0, p1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_8

    const/4 p1, 0x0

    return-object p1

    .line 13
    :cond_8
    :try_start_8
    new-instance p2, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    sget-object p3, Lnet/bienvenido/mundo/sdk/internal/MethodParameterDefaults;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;

    invoke-direct {p2, p1, p3}, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;-><init>(Ljava/lang/Object;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V

    .line 14
    iget-object p3, p2, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualSensor;

    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/w2;

    invoke-direct {v1}, Lnet/bienvenido/mundo/sdk/internal/w2;-><init>()V

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/AppVirtualSensor;-><init>(Lkotlin/jvm/functions/Function1;)V

    const v1, 0x143f1b92

    invoke-virtual {p3, v1, v0}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 15
    iget-object p1, p2, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_23} :catch_23

    :catch_23
    return-object p1
.end method
