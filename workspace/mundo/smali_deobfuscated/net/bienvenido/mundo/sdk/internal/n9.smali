.class public final Lnet/bienvenido/mundo/sdk/internal/n9;
.super Lnet/bienvenido/mundo/sdk/internal/u8;
.source "n9.java"

# interfaces
.implements Landroid/accounts/IAccountManagerResponse;


# instance fields
.field public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;

.field public final 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;[Ljava/lang/String;)V
    .registers 12

    .line 13
    iget-object v2, p2, Landroid/accounts/Account;->type:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p2, Landroid/accounts/Account;->name:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lnet/bienvenido/mundo/sdk/internal/u8;-><init>(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;ZZLjava/lang/String;ZZ)V

    .line 14
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/n9;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;

    .line 15
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/n9;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onResult(Landroid/os/Bundle;)V
    .registers 6

    const-string v0, "booleanResult"

    .line 20
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/internal/n9;->用搅拌机把你妈的阴扩一下()Landroid/accounts/IAccountManagerResponse;

    move-result-object v1

    if-eqz v1, :cond_21

    if-nez p1, :cond_11

    :try_start_a
    const-string p1, "null bundle"

    const/4 v0, 0x5

    .line 24
    invoke-interface {v1, v0, p1}, Landroid/accounts/IAccountManagerResponse;->onError(ILjava/lang/String;)V

    return-void

    .line 27
    :cond_11
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const/4 v3, 0x0

    .line 28
    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 29
    invoke-interface {v1, v2}, Landroid/accounts/IAccountManagerResponse;->onResult(Landroid/os/Bundle;)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_21} :catch_21

    :catch_21
    :cond_21
    return-void
.end method

.method public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度()V
    .registers 4

    .line 38
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/n9;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Landroid/accounts/IAccountAuthenticator;

    if-eqz v0, :cond_12

    .line 40
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/n9;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/n9;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:[Ljava/lang/String;

    invoke-interface {v0, p0, v1, v2}, Landroid/accounts/IAccountAuthenticator;->hasFeatures(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;[Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_b} :catch_c

    goto :goto_12

    :catch_c
    const/4 v0, 0x1

    const-string v1, "remote exception"

    .line 43
    invoke-virtual {p0, v0, v1}, Lnet/bienvenido/mundo/sdk/internal/n9;->onError(ILjava/lang/String;)V

    :cond_12
    :goto_12
    return-void
.end method
