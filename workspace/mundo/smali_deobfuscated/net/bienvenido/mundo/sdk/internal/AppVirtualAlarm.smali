.class public final Lnet/bienvenido/mundo/sdk/internal/AppVirtualAlarm;
.super Lnet/bienvenido/mundo/sdk/internal/u8;
.source "d3.java"

# interfaces
.implements Landroid/accounts/IAccountManagerResponse;


# instance fields
.field public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/IAccountManagerResponse;

.field public final 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Landroid/accounts/Account;


# direct methods
.method public constructor <init>(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V
    .registers 13

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v5, p4

    .line 13
    invoke-direct/range {v0 .. v7}, Lnet/bienvenido/mundo/sdk/internal/u8;-><init>(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;ZZLjava/lang/String;ZZ)V

    .line 14
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualAlarm;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/IAccountManagerResponse;

    .line 15
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualAlarm;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Landroid/accounts/Account;

    return-void
.end method


# virtual methods
.method public final onResult(Landroid/os/Bundle;)V
    .registers 9

    if-eqz p1, :cond_1f

    const-string v0, "booleanResult"

    const/4 v1, 0x0

    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_1f

    .line 24
    :cond_c
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualAlarm;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Landroid/accounts/Account;

    .line 25
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/IntentMatchHelper;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualAlarm;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/IAccountManagerResponse;

    iget-object v5, v3, Landroid/accounts/Account;->type:Ljava/lang/String;

    iget-object v6, v3, Landroid/accounts/Account;->name:Ljava/lang/String;

    move-object v1, v0

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Lnet/bienvenido/mundo/sdk/internal/IntentMatchHelper;-><init>(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/IntentMatchHelper;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼()V

    return-void

    .line 21
    :cond_1f
    :goto_1f
    invoke-super {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/u8;->onResult(Landroid/os/Bundle;)V

    return-void
.end method

.method public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度()V
    .registers 3

    .line 30
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualAlarm;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Landroid/accounts/IAccountAuthenticator;

    if-eqz v0, :cond_9

    .line 32
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualAlarm;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Landroid/accounts/Account;

    invoke-interface {v0, p0, v1}, Landroid/accounts/IAccountAuthenticator;->getAccountCredentialsForCloning(Landroid/accounts/IAccountManagerResponse;Landroid/accounts/Account;)V

    :cond_9
    return-void
.end method
