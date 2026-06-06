.class public final Ltop/bienvenido/date_24323/y8;
.super Ltop/bienvenido/date_24323/b2;
.source "y8.java"


# instance fields
.field public final 要不要把你妈卵子扣出来给你做寿司吃:Lcom/android/internal/infra/AndroidFuture;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 6
    invoke-direct {p0}, Ltop/bienvenido/date_24323/b2;-><init>()V

    const/4 v0, 0x0

    .line 7
    invoke-static {v0}, Lcom/android/internal/infra/AndroidFuture;->completedFuture(Ljava/lang/Object;)Lcom/android/internal/infra/AndroidFuture;

    move-result-object v0

    iput-object v0, p0, Ltop/bienvenido/date_24323/y8;->要不要把你妈卵子扣出来给你做寿司吃:Lcom/android/internal/infra/AndroidFuture;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    .line 11
    const-class v0, Lcom/android/internal/infra/AndroidFuture;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object p1, p0, Ltop/bienvenido/date_24323/y8;->要不要把你妈卵子扣出来给你做寿司吃:Lcom/android/internal/infra/AndroidFuture;

    goto :goto_13

    :cond_f
    invoke-super {p0, p1, p2, p3}, Ltop/bienvenido/date_24323/b2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_13
    return-object p1
.end method
