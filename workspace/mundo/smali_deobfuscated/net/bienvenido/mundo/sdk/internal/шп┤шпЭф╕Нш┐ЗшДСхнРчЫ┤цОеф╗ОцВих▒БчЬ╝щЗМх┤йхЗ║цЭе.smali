.class public final Lnet/bienvenido/mundo/sdk/internal/说话不过脑子直接从您屁眼里崩出来;
.super Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;
.source "\u8bf4\u8bdd\u4e0d\u8fc7\u8111\u5b50\u76f4\u63a5\u4ece\u60a8\u5c41\u773c\u91cc\u5d29\u51fa\u6765.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 9
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ltop/bienvenido/date_24323/y;)Lkotlin/Unit;
    .registers 6

    const/4 v0, 0x0

    .line 22
    aget-object v0, p0, v0

    check-cast v0, Landroid/os/IInterface;

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    .line 23
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_e

    :cond_d
    move-object v0, v1

    :goto_e
    const/4 v2, 0x1

    .line 24
    aget-object v2, p0, v2

    if-eqz v2, :cond_18

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_19

    :cond_18
    move-object v2, v1

    :goto_19
    const/4 v3, 0x2

    .line 26
    aget-object p0, p0, v3

    if-eqz p0, :cond_22

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 31
    :cond_22
    invoke-interface {p1, v0, v2, v1}, Ltop/bienvenido/date_24323/y;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 12
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/MundoAccountManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoAccountManagerServiceProxy;

    new-instance p2, Lnet/bienvenido/mundo/sdk/internal/说话不过脑子直接从您屁眼里崩出来$1;

    invoke-direct {p2, p0, p3}, Lnet/bienvenido/mundo/sdk/internal/说话不过脑子直接从您屁眼里崩出来$1;-><init>(Lnet/bienvenido/mundo/sdk/internal/说话不过脑子直接从您屁眼里崩出来;[Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/MundoAccountManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
