.class public abstract Ltop/bienvenido/date_24323/x0;
.super Ljava/lang/Object;
.source "x0.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Landroid/content/Intent;)Landroid/os/IBinder;
    .registers 4

    .line 9
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    :cond_8
    const-string v1, "mundo_base_bundle"

    .line 13
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    check-cast p0, Landroid/content/Intent;

    if-eqz p0, :cond_16

    const/4 v1, -0x1

    .line 16
    :try_start_13
    invoke-virtual {p1, p0, v1}, Landroid/content/Intent;->fillIn(Landroid/content/Intent;I)I
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_16} :catch_16

    :catch_16
    :cond_16
    const-string p0, "mundo_base_string"

    .line 20
    invoke-virtual {v0, p0}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p0

    return-object p0
.end method
