.class public final Lnet/bienvenido/mundo/sdk/external/MetaPackageManager;
.super Ljava/lang/Object;
.source "MetaPackageManager.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static acquireObtainAppSplash()V
    .registers 2

    .line 18
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ltop/bienvenido/date_24323/m0;->要不要把你妈卵子扣出来给你做寿司吃(I)V

    return-void
.end method

.method public static acquireReleaseAppSplash()V
    .registers 2

    .line 22
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ltop/bienvenido/date_24323/m0;->要不要把你妈卵子扣出来给你做寿司吃(I)V

    return-void
.end method

.method public static cleanPackageDataAsUser(Ljava/lang/String;I)V
    .registers 3

    .line 216
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Ltop/bienvenido/date_24323/m0;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static cleanPackageDataAsUser(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    .line 26
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0, p1}, Ltop/bienvenido/date_24323/m0;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static createEmptyUser(Ljava/lang/String;I)V
    .registers 3

    .line 221
    :try_start_0
    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/external/MetaPackageManager;->getInstalledUserId(Ljava/lang/String;)[I

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    if-gez v0, :cond_11

    .line 222
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bienvenido/mundo/sdk/external/MetaPackageManager;->createEmptyUser(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_11} :catch_11

    :catch_11
    :cond_11
    return-void
.end method

.method public static createEmptyUser(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    .line 30
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0, p1}, Ltop/bienvenido/date_24323/m0;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static createEmptyUserById(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    .line 36
    :goto_1
    :try_start_1
    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/external/MetaPackageManager;->getInstalledUserId(Ljava/lang/String;)[I

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v1

    if-ltz v1, :cond_e

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 39
    :cond_e
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/bienvenido/mundo/sdk/external/MetaPackageManager;->createEmptyUser(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_15} :catch_15

    :catch_15
    return-void
.end method

.method public static deleteAllAppCache()V
    .registers 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static deleteAppCache(Ljava/lang/String;)V
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static fixInternalAppAndReinstall(Ljava/lang/String;)Z
    .registers 2

    .line 53
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0}, Ltop/bienvenido/date_24323/m0;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static getApplicationInfo(Ljava/lang/String;)Landroid/content/pm/ApplicationInfo;
    .registers 3

    .line 57
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Ltop/bienvenido/date_24323/m0;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    return-object p0
.end method

.method public static getInnerAppPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    .registers 3

    .line 61
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0, p1}, Ltop/bienvenido/date_24323/m0;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    return-object p0
.end method

.method public static getInstalledApplicationInfos()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/content/pm/ApplicationInfo;",
            ">;"
        }
    .end annotation

    .line 65
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ltop/bienvenido/date_24323/m0;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static getInstalledInnerApps()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 69
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0}, Ltop/bienvenido/date_24323/m0;->要不要把你妈卵子扣出来给你做寿司吃()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static getInstalledPackageInfos()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/content/pm/PackageInfo;",
            ">;"
        }
    .end annotation

    .line 73
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ltop/bienvenido/date_24323/m0;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static getInstalledUserId(Ljava/lang/String;)[I
    .registers 9

    const/4 v0, 0x0

    .line 80
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 81
    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/external/MetaPackageManager;->getInstalledUserName(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2b

    .line 83
    array-length v2, p0

    const/4 v3, 0x0

    :goto_e
    if-ge v3, v2, :cond_2b

    aget-object v4, p0, v3

    .line 84
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    :cond_16
    add-int/lit8 v5, v5, -0x1

    if-gez v5, :cond_1b

    goto :goto_28

    .line 91
    :cond_1b
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x30

    if-ge v6, v7, :cond_24

    goto :goto_28

    :cond_24
    const/16 v7, 0x39

    if-le v6, v7, :cond_16

    :goto_28
    add-int/lit8 v3, v3, 0x1

    goto :goto_e

    .line 102
    :cond_2b
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 103
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p0

    .line 104
    new-array v2, p0, [I

    const/4 v3, 0x0

    .line 105
    :goto_35
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_4a

    .line 106
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_35

    :cond_4a
    if-nez p0, :cond_50

    .line 108
    filled-new-array {v0}, [I

    move-result-object v2
    :try_end_50
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_50} :catch_51

    :cond_50
    return-object v2

    :catch_51
    new-array p0, v0, [I

    return-object p0
.end method

.method public static getInstalledUserName(Ljava/lang/String;)[Ljava/lang/String;
    .registers 2

    .line 115
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0}, Ltop/bienvenido/date_24323/m0;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getLaunchIntent(Ljava/lang/String;)Landroid/content/Intent;
    .registers 7

    .line 119
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.category.INFO"

    .line 120
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 121
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 122
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    .line 123
    invoke-virtual {v2}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltop/bienvenido/date_24323/m0;

    const/4 v4, 0x0

    const/high16 v5, 0x20000

    invoke-interface {v3, v0, v4, v5}, Ltop/bienvenido/date_24323/m0;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object v3

    if-nez v3, :cond_35

    .line 126
    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeCategory(Ljava/lang/String;)V

    const-string v1, "android.intent.category.LAUNCHER"

    .line 127
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 128
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 129
    invoke-virtual {v2}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {p0, v0, v4, v5}, Ltop/bienvenido/date_24323/m0;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object v3

    :cond_35
    if-nez v3, :cond_38

    return-object v4

    :cond_38
    const/high16 p0, 0x10000000

    .line 134
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 135
    iget-object p0, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 136
    iget-object v1, p0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object p0, p0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public static getLaunchIntentForPackage(Landroid/content/Intent;)Landroid/content/Intent;
    .registers 4

    .line 141
    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/external/MetaPackageManager;->resolveIntentActivity(Landroid/content/Intent;)Landroid/content/pm/ActivityInfo;

    move-result-object p0

    if-nez p0, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 145
    :cond_8
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 146
    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, p0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object p0, p0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v1, v2, p0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string p0, "android.intent.action.MAIN"

    .line 147
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public static getPackageInfo(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    .registers 3

    .line 152
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Ltop/bienvenido/date_24323/m0;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    return-object p0
.end method

.method public static getReceiverInfo(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;
    .registers 2

    .line 156
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0}, Ltop/bienvenido/date_24323/m0;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;

    move-result-object p0

    return-object p0
.end method

.method public static isAppInstalledAsInternal(Ljava/lang/String;)Z
    .registers 2

    .line 160
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0}, Ltop/bienvenido/date_24323/m0;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isAppSplashExists(Ljava/lang/String;)Z
    .registers 2

    .line 164
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0}, Ltop/bienvenido/date_24323/m0;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isInnerAppInstalled(Ljava/lang/String;)Z
    .registers 2

    .line 168
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0}, Ltop/bienvenido/date_24323/m0;->用搅拌机把你妈的阴扩一下(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static queryIntentActivities(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 172
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0, p1, p2}, Ltop/bienvenido/date_24323/m0;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static queryIntentProviders(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 176
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0, p1, p2}, Ltop/bienvenido/date_24323/m0;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static queryIntentReceivers(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 180
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0, p1, p2}, Ltop/bienvenido/date_24323/m0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static queryIntentServices(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 184
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0, p1, p2}, Ltop/bienvenido/date_24323/m0;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static reloadAllApps()V
    .registers 3

    .line 188
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    const/4 v1, 0x0

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v1}, Ltop/bienvenido/date_24323/m0;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;)Z

    return-void
.end method

.method public static resolveActivityInfo(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;
    .registers 2

    .line 229
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0}, Ltop/bienvenido/date_24323/m0;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;

    move-result-object p0

    return-object p0
.end method

.method public static resolveActivityInfo(Landroid/content/Intent;)Landroid/content/pm/ActivityInfo;
    .registers 4

    .line 192
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    const/high16 v1, 0x20000

    const/4 v2, 0x0

    invoke-interface {v0, p0, v2, v1}, Ltop/bienvenido/date_24323/m0;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    if-eqz p0, :cond_14

    .line 194
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    return-object p0

    :cond_14
    return-object v2
.end method

.method public static resolveIntentActivity(Landroid/content/Intent;)Landroid/content/pm/ActivityInfo;
    .registers 4

    .line 200
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, p0, v2, v1}, Ltop/bienvenido/date_24323/m0;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    if-eqz p0, :cond_13

    .line 202
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    return-object p0

    :cond_13
    return-object v2
.end method

.method public static uninstallAppFully(Ljava/lang/String;)V
    .registers 4

    .line 208
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    const/4 v1, 0x0

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, p0, v1}, Ltop/bienvenido/date_24323/m0;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static waitForBackgroundScanner()V
    .registers 1

    .line 212
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0}, Ltop/bienvenido/date_24323/m0;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈()V

    return-void
.end method
