.class public final Lnet/bienvenido/mundo/sdk/internal/e1;
.super Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;
.source "e1.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 6
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    .line 9
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_16

    .line 11
    :try_start_4
    const-class v0, Landroid/app/job/JobInfo;

    invoke-static {p3, v0}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobInfo;

    if-eqz v0, :cond_16

    .line 13
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/ContentProviderRecord;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/ContentProviderRecord;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    invoke-static {v0}, Lnet/bienvenido/mundo/sdk/internal/ContentProviderRecord;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/app/job/JobInfo;)V
    :try_end_16
    .catchall {:try_start_4 .. :try_end_16} :catchall_16

    .line 19
    :catchall_16
    :cond_16
    invoke-super {p0, p1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
