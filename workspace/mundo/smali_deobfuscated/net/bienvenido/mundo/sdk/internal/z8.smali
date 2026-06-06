.class public final Lnet/bienvenido/mundo/sdk/internal/z8;
.super Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;
.source "z8.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 6
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    const/4 p1, 0x0

    .line 10
    :try_start_1
    const-class p2, Lcom/android/internal/infra/AndroidFuture;

    invoke-static {p3, p2}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/internal/infra/AndroidFuture;

    if-nez p2, :cond_c

    return-object p1

    :cond_c
    const-string p3, "true"

    .line 14
    invoke-virtual {p2, p3}, Lcom/android/internal/infra/AndroidFuture;->complete(Ljava/lang/Object;)Z
    :try_end_11
    .catchall {:try_start_1 .. :try_end_11} :catchall_11

    :catchall_11
    return-object p1
.end method
