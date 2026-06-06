.class public final Lnet/bienvenido/mundo/sdk/internal/BroadcastRecord;
.super Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;
.source "c6.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/AppVirtualSensor;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lnet/bienvenido/mundo/sdk/internal/AppVirtualSensor;)V
    .registers 3

    .line 10
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;-><init>()V

    .line 11
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/BroadcastRecord;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 12
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/BroadcastRecord;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/AppVirtualSensor;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    const/4 v0, 0x0

    .line 18
    :try_start_1
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_8

    return-object v0

    .line 22
    :cond_8
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/BroadcastRecord;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 23
    iget-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/BroadcastRecord;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/AppVirtualSensor;

    .line 24
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 25
    sget-object p2, Lnet/bienvenido/mundo/sdk/internal/MethodParameterDefaults;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    .line 26
    new-instance p2, Lnet/bienvenido/mundo/sdk/internal/ParamDefault;

    invoke-direct {p2, p1}, Lnet/bienvenido/mundo/sdk/internal/ParamDefault;-><init>(Ljava/lang/Object;)V

    iput-object p2, p3, Lnet/bienvenido/mundo/sdk/internal/AppVirtualSensor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_19} :catch_1a

    return-object p1

    :catch_1a
    return-object v0
.end method
