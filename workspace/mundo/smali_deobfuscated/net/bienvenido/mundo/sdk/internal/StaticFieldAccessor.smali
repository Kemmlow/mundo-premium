.class public final Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;
.super Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;
.source "p2.java"


# instance fields
.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .registers 2

    .line 8
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;-><init>()V

    .line 9
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/reflect/Field;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 15
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_6} :catch_7

    return-object p1

    :catch_7
    move-exception p1

    .line 17
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 4

    .line 25
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_5} :catch_6

    return-void

    :catch_6
    move-exception p1

    .line 27
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
