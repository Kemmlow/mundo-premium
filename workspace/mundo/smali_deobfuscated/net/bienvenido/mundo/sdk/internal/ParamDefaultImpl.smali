.class public final Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;
.super Lnet/bienvenido/mundo/sdk/internal/u8;
.source "g3.java"


# instance fields
.field public final 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化:Landroid/os/Bundle;

.field public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;

.field public final 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Ljava/lang/String;

.field public final 肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你:Z

.field public final 说话不过脑子直接从您屁眼里崩出来:Z


# direct methods
.method public constructor <init>(Landroid/accounts/IAccountManagerResponse;ZLandroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/String;Ljava/lang/String;)V
    .registers 19

    move-object v8, p0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p8

    move v3, p2

    move-object/from16 v5, p9

    .line 17
    invoke-direct/range {v0 .. v7}, Lnet/bienvenido/mundo/sdk/internal/u8;-><init>(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;ZZLjava/lang/String;ZZ)V

    move-object v0, p3

    .line 18
    iput-object v0, v8, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;

    move-object v0, p4

    .line 19
    iput-object v0, v8, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Ljava/lang/String;

    move-object v0, p5

    .line 20
    iput-object v0, v8, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化:Landroid/os/Bundle;

    move v0, p6

    .line 21
    iput-boolean v0, v8, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->说话不过脑子直接从您屁眼里崩出来:Z

    move/from16 v0, p7

    .line 22
    iput-boolean v0, v8, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你:Z

    return-void
.end method


# virtual methods
.method public final onResult(Landroid/os/Bundle;)V
    .registers 11

    if-eqz p1, :cond_93

    const-string v0, "authtoken"

    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7e

    const-string v1, "authAccount"

    .line 30
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "accountType"

    .line 31
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_77

    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_77

    if-eqz v1, :cond_77

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_27

    goto :goto_77

    .line 36
    :cond_27
    iget-boolean v3, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->说话不过脑子直接从您屁眼里崩出来:Z

    if-nez v3, :cond_37

    .line 37
    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    new-instance v4, Landroid/accounts/Account;

    invoke-direct {v4, v1, v2}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Ljava/lang/String;

    invoke-virtual {v3, v4, v1, v0}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V

    :cond_37
    const-string v1, "android.accounts.expiry"

    const-wide/16 v2, 0x0

    .line 39
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    .line 40
    iget-boolean v3, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->说话不过脑子直接从您屁眼里崩出来:Z

    if-eqz v3, :cond_7e

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-lez v5, :cond_7e

    .line 41
    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    .line 42
    iget-object v4, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;

    .line 43
    iget-object v5, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Ljava/lang/String;

    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v4, :cond_7e

    if-eqz v5, :cond_7e

    .line 46
    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/i3;

    iget-object v3, v3, Lnet/bienvenido/mundo/sdk/internal/i3;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/s9;

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v8, v6, v1

    if-gtz v8, :cond_7e

    .line 49
    iget-object v3, v3, Lnet/bienvenido/mundo/sdk/internal/s9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/q9;

    new-instance v6, Lnet/bienvenido/mundo/sdk/internal/o9;

    invoke-direct {v6, v4, v5}, Lnet/bienvenido/mundo/sdk/internal/o9;-><init>(Landroid/accounts/Account;Ljava/lang/String;)V

    new-instance v4, Lnet/bienvenido/mundo/sdk/internal/r9;

    invoke-direct {v4, v0, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/r9;-><init>(Ljava/lang/String;J)V

    invoke-virtual {v3, v6, v4}, Lnet/bienvenido/mundo/sdk/internal/q9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/o9;Lnet/bienvenido/mundo/sdk/internal/r9;)V

    goto :goto_7e

    :cond_77
    :goto_77
    const/4 p1, 0x5

    const-string v0, "the type and name should not be empty"

    .line 33
    invoke-virtual {p0, p1, v0}, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->onError(ILjava/lang/String;)V

    return-void

    :cond_7e
    :goto_7e
    const-string v0, "intent"

    .line 54
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    if-eqz v0, :cond_93

    iget-boolean v0, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你:Z

    if-eqz v0, :cond_93

    iget-boolean v0, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->说话不过脑子直接从您屁眼里崩出来:Z

    if-nez v0, :cond_93

    .line 55
    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/u8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Bundle;)V

    .line 58
    :cond_93
    invoke-super {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/u8;->onResult(Landroid/os/Bundle;)V

    return-void
.end method

.method public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度()V
    .registers 11

    .line 64
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Landroid/accounts/IAccountAuthenticator;

    if-eqz v0, :cond_3c

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getAuthToken"

    const/4 v3, 0x4

    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Landroid/accounts/IAccountAuthenticatorResponse;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-class v5, Landroid/accounts/Account;

    const/4 v7, 0x1

    aput-object v5, v4, v7

    const-class v5, Ljava/lang/String;

    const/4 v8, 0x2

    aput-object v5, v4, v8

    const-class v5, Landroid/os/Bundle;

    const/4 v9, 0x3

    aput-object v5, v4, v9

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p0, v2, v6

    .line 77
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Landroid/accounts/Account;

    aput-object v3, v2, v7

    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Ljava/lang/String;

    aput-object v3, v2, v8

    iget-boolean v3, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultImpl;->肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你:Z

    .line 82
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v9

    .line 77
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3c
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_3c} :catch_3c

    :catch_3c
    :cond_3c
    return-void
.end method
