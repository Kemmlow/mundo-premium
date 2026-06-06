.class public final Lnet/bienvenido/mundo/sdk/manifest/MundoReceiver;
.super Landroid/content/BroadcastReceiver;
.source "MundoReceiver.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 5

    .line 13
    :try_start_0
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    if-eqz p2, :cond_22

    const-string v0, "android.intent.extra.INTENT"

    .line 14
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    if-nez v0, :cond_f

    goto :goto_22

    .line 17
    :cond_f
    const-class v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1d

    const-string p2, "0"

    :cond_1d
    const/4 v1, 0x0

    .line 22
    invoke-virtual {p1, v0, p2, v1}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Landroid/content/Intent;Ljava/lang/String;I)I
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_21} :catch_22

    nop

    :catch_22
    :cond_22
    :goto_22
    return-void
.end method
