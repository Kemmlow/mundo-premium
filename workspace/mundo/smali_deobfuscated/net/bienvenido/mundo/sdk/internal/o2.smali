.class public final Lnet/bienvenido/mundo/sdk/internal/o2;
.super Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;
.source "o2.java"


# instance fields
.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .registers 2

    .line 8
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;-><init>()V

    .line 9
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/o2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final varargs 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 16
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/o2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/reflect/Method;

    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_7

    return-object p1

    :catch_7
    move-exception p1

    .line 20
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
