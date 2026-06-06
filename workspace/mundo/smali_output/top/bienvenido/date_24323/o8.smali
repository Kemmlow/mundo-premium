.class public final Ltop/bienvenido/date_24323/o8;
.super Ltop/bienvenido/date_24323/u8;
.source "o8.java"

# interfaces
.implements Landroid/accounts/IAccountManagerResponse;


# instance fields
.field public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;


# direct methods
.method public constructor <init>(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;Z)V
    .registers 12

    .line 12
    iget-object v2, p2, Landroid/accounts/Account;->type:Ljava/lang/String;

    const/4 v4, 0x1

    iget-object v5, p2, Landroid/accounts/Account;->name:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p3

    invoke-direct/range {v0 .. v7}, Ltop/bienvenido/date_24323/u8;-><init>(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;ZZLjava/lang/String;ZZ)V

    .line 13
    iput-object p2, p0, Ltop/bienvenido/date_24323/o8;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;

    return-void
.end method


# virtual methods
.method public final onResult(Landroid/os/Bundle;)V
    .registers 4

    if-eqz p1, :cond_2b

    const-string v0, "booleanResult"

    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2b

    const-string v1, "intent"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2b

    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 20
    sget-object v0, Ltop/bienvenido/date_24323/k3;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/k3;

    .line 21
    iget-object v1, p0, Ltop/bienvenido/date_24323/o8;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {v1}, Ltop/bienvenido/date_24323/k3;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/accounts/Account;)Z

    .line 25
    :cond_22
    invoke-virtual {p0}, Ltop/bienvenido/date_24323/o8;->用搅拌机把你妈的阴扩一下()Landroid/accounts/IAccountManagerResponse;

    move-result-object v0

    if-eqz v0, :cond_2b

    .line 28
    :try_start_28
    invoke-interface {v0, p1}, Landroid/accounts/IAccountManagerResponse;->onResult(Landroid/os/Bundle;)V
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_2b} :catch_2b

    .line 33
    :catch_2b
    :cond_2b
    invoke-super {p0, p1}, Ltop/bienvenido/date_24323/u8;->onResult(Landroid/os/Bundle;)V

    return-void
.end method

.method public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度()V
    .registers 3

    .line 38
    iget-object v0, p0, Ltop/bienvenido/date_24323/o8;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Landroid/accounts/IAccountAuthenticator;

    if-eqz v0, :cond_9

    .line 40
    iget-object v1, p0, Ltop/bienvenido/date_24323/o8;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;

    invoke-interface {v0, p0, v1}, Landroid/accounts/IAccountAuthenticator;->getAccountRemovalAllowed(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;)V

    :cond_9
    return-void
.end method
