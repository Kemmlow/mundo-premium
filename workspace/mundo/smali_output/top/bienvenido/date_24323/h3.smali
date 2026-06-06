.class public final Ltop/bienvenido/date_24323/h3;
.super Ltop/bienvenido/date_24323/u8;
.source "h3.java"


# instance fields
.field public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/accounts/IAccountManagerResponse;)V
    .registers 12

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p3

    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v7}, Ltop/bienvenido/date_24323/u8;-><init>(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;ZZLjava/lang/String;ZZ)V

    .line 12
    iput-object p2, p0, Ltop/bienvenido/date_24323/h3;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onResult(Landroid/os/Bundle;)V
    .registers 4

    if-nez p1, :cond_6

    .line 18
    invoke-super {p0, p1}, Ltop/bienvenido/date_24323/u8;->onResult(Landroid/os/Bundle;)V

    return-void

    :cond_6
    const-string v0, "authTokenLabelKey"

    .line 21
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 22
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 23
    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-super {p0, v1}, Ltop/bienvenido/date_24323/u8;->onResult(Landroid/os/Bundle;)V

    return-void
.end method

.method public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度()V
    .registers 4

    .line 29
    iget-object v0, p0, Ltop/bienvenido/date_24323/h3;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Landroid/accounts/IAccountAuthenticator;

    if-eqz v0, :cond_c

    .line 32
    :try_start_4
    move-object v1, p0

    check-cast v1, Landroid/accounts/IAccountManagerResponse;

    iget-object v2, p0, Ltop/bienvenido/date_24323/h3;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/accounts/IAccountAuthenticator;->getAuthTokenLabel(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_c} :catch_c

    :catch_c
    :cond_c
    return-void
.end method
