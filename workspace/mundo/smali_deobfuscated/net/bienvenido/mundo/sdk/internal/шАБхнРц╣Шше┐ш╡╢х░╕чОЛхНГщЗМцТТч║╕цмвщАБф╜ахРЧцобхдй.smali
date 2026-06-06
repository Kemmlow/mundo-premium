.class public final Lnet/bienvenido/mundo/sdk/internal/老子湘西赶尸王千里撒纸欢送你吗殡天;
.super Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;
.source "\u8001\u5b50\u6e58\u897f\u8d76\u5c38\u738b\u5343\u91cc\u6492\u7eb8\u6b22\u9001\u4f60\u5417\u6ba1\u5929.java"


# instance fields
.field public final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 6
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;-><init>()V

    .line 7
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    const-string v1, "mOpMode"

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/老子湘西赶尸王千里撒纸欢送你吗殡天;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 11
    invoke-super {p0, p1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 13
    :try_start_4
    sget-boolean p2, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz p2, :cond_18

    instance-of p2, p1, Landroid/app/SyncNotedAppOp;

    if-eqz p2, :cond_18

    .line 14
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/老子湘西赶尸王千里撒纸欢送你吗殡天;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    iget-object p2, p2, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_18} :catch_18

    :catch_18
    :cond_18
    return-object p1
.end method
