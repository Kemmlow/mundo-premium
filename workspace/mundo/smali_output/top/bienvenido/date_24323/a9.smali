.class public final Ltop/bienvenido/date_24323/a9;
.super Ltop/bienvenido/date_24323/a2;
.source "a9.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ltop/bienvenido/date_24323/a2;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    const/4 p1, 0x0

    .line 11
    :try_start_1
    const-class p2, Lcom/android/internal/infra/AndroidFuture;

    invoke-static {p3, p2}, Ltop/bienvenido/date_24323/a2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/internal/infra/AndroidFuture;

    if-nez p2, :cond_c

    return-object p1

    .line 16
    :cond_c
    new-instance p3, Landroid/content/Intent;

    sget-object v0, Ltop/bienvenido/date_24323/c4;->MundoClass_A1:Ljava/lang/String;

    invoke-direct {p3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lcom/android/internal/infra/AndroidFuture;->complete(Ljava/lang/Object;)Z
    :try_end_16
    .catchall {:try_start_1 .. :try_end_16} :catchall_16

    :catchall_16
    return-object p1
.end method
