.class public abstract Lnet/bienvenido/mundo/sdk/internal/我是月黑风高偷你妈棺材钱的爹;
.super Ljava/lang/Object;
.source "\u6211\u662f\u6708\u9ed1\u98ce\u9ad8\u5077\u4f60\u5988\u68fa\u6750\u94b1\u7684\u7239.java"


# instance fields
.field public 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MethodParameterDefaults;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    .line 11
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MethodParameterDefaults;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/我是月黑风高偷你妈棺材钱的爹;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/Object;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;
    .registers 7

    .line 15
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    .line 16
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/我是月黑风高偷你妈棺材钱的爹;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    const/4 v1, 0x0

    .line 18
    :try_start_5
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/Map;

    monitor-enter v2
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_8} :catch_19

    .line 19
    :try_start_8
    invoke-static {p1}, Landroid/os/ServiceManager;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v3

    if-nez v3, :cond_10

    .line 21
    monitor-exit v2

    return-object v1

    .line 23
    :cond_10
    invoke-static {p1, v0, v3, p2}, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Landroid/os/IBinder;Ljava/lang/Object;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    move-result-object p1

    monitor-exit v2

    return-object p1

    :catchall_16
    move-exception p1

    .line 24
    monitor-exit v2
    :try_end_18
    .catchall {:try_start_8 .. :try_end_18} :catchall_16

    :try_start_18
    throw p1
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_19} :catch_19

    :catch_19
    return-object v1
.end method

.method public abstract 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
.end method

.method public final varargs 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/String;)V
    .registers 7

    .line 33
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    .line 34
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/我是月黑风高偷你妈棺材钱的爹;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    .line 36
    :try_start_4
    array-length v1, p1

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v1, :cond_11

    aget-object v3, p1, v2

    const/4 v4, 0x0

    .line 37
    invoke-static {v3, v0, v4}, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_e} :catch_11

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :catch_11
    :cond_11
    return-void
.end method
