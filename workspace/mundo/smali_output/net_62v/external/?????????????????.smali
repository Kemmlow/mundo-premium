.class public final Lnet_62v/external/要不要把你妈卵子扣出来给你做寿司吃;
.super Ltop/bienvenido/date_24323/a2;
.source "\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/reflect/InvocationHandler;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/InvocationHandler;)V
    .registers 2

    .line 10
    invoke-direct {p0}, Ltop/bienvenido/date_24323/a2;-><init>()V

    .line 11
    iput-object p1, p0, Lnet_62v/external/要不要把你妈卵子扣出来给你做寿司吃;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/reflect/InvocationHandler;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 17
    :try_start_0
    iget-object v0, p0, Lnet_62v/external/要不要把你妈卵子扣出来给你做寿司吃;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/reflect/InvocationHandler;

    invoke-interface {v0, p1, p2, p3}, Ljava/lang/reflect/InvocationHandler;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_0 .. :try_end_6} :catchall_7

    return-object p1

    :catchall_7
    move-exception p1

    .line 19
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
