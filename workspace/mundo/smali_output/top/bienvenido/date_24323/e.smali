.class public final Ltop/bienvenido/date_24323/e;
.super Ljava/lang/Object;
.source "e.java"


# static fields
.field public static final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 17

    const-string v0, "blackeji.62v.net"

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_e
    const/16 v5, 0x10

    if-ge v4, v5, :cond_24

    const/16 v5, 0x24

    .line 22
    invoke-virtual {v2, v5}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v5

    const-string v6, "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    .line 24
    :cond_24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Ltop/bienvenido/date_24323/e;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    .line 25
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v4, 0x8

    new-array v5, v4, [Ljava/lang/String;

    const-string v6, "35133133"

    aput-object v6, v5, v3

    const-string v6, "86576905"

    const/4 v7, 0x1

    aput-object v6, v5, v7

    const-string v6, "86811305"

    const/4 v8, 0x2

    aput-object v6, v5, v8

    const-string v6, "86538206"

    const/4 v9, 0x3

    aput-object v6, v5, v9

    const-string v6, "35619596"

    const/4 v10, 0x4

    aput-object v6, v5, v10

    const-string v6, "86415006"

    const/4 v11, 0x5

    aput-object v6, v5, v11

    const-string v6, "86953506"

    const/4 v12, 0x6

    aput-object v6, v5, v12

    const/4 v6, 0x7

    const-string v13, "86866106"

    aput-object v13, v5, v6

    invoke-virtual {v1, v4}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v4

    aget-object v4, v5, v4

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    :goto_66
    const/16 v5, 0xa

    if-ge v4, v12, :cond_74

    .line 28
    invoke-virtual {v1, v5}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_66

    .line 30
    :cond_74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    :goto_7b
    const/16 v13, 0xe

    const/16 v14, 0x30

    if-lt v4, v13, :cond_14c

    add-int/2addr v6, v12

    .line 46
    rem-int/2addr v6, v5

    if-eqz v6, :cond_88

    rsub-int/lit8 v1, v6, 0x3a

    int-to-char v14, v1

    .line 47
    :cond_88
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Ltop/bienvenido/date_24323/e;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    .line 49
    sget-boolean v1, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->要不要把你妈卵子扣出来给你做寿司吃:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_149

    .line 52
    :try_start_96
    const-class v1, Lsun/misc/Unsafe;

    const-string v4, "allocateInstance"

    new-array v5, v7, [Ljava/lang/Class;

    const-class v6, Ljava/lang/Class;

    aput-object v6, v5, v3

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 53
    invoke-virtual {v1, v7}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 54
    sget-object v4, Ltop/bienvenido/date_24323/t9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    new-array v5, v7, [Ljava/lang/Object;

    const-class v6, Landroid/telephony/SubscriptionInfo;

    aput-object v6, v5, v3

    invoke-virtual {v1, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/SubscriptionInfo;
    :try_end_b5
    .catch Ljava/lang/Exception; {:try_start_96 .. :try_end_b5} :catch_b6

    move-object v2, v1

    :catch_b6
    :try_start_b6
    const-string v1, "mDisplayName"

    .line 59
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 60
    sget-object v4, Ltop/bienvenido/date_24323/e;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    const-string v5, "mIccId"

    .line 61
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const-string v6, "mCarrierName"

    .line 62
    invoke-static {v6, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const-string v6, "mNumber"

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    invoke-static {v6, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    const-string v12, "mCountryIso"

    const-string v13, "826"

    .line 64
    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v13, 0x0

    :goto_e1
    if-ge v13, v11, :cond_10b

    new-array v14, v11, [Lkotlin/Pair;

    aput-object v1, v14, v3

    aput-object v5, v14, v7

    aput-object v0, v14, v8

    aput-object v6, v14, v9

    aput-object v12, v14, v10

    .line 66
    aget-object v14, v14, v13

    .line 67
    new-instance v15, Ltop/bienvenido/date_24323/n2;

    invoke-virtual {v14}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v9, v16

    check-cast v9, Ljava/lang/String;

    invoke-direct {v15, v9}, Ltop/bienvenido/date_24323/n2;-><init>(Ljava/lang/String;)V

    iget-object v9, v15, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    invoke-virtual {v14}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v9, v2, v14}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v13, v13, 0x1

    const/4 v9, 0x3

    goto :goto_e1

    .line 69
    :cond_10b
    sget-boolean v0, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:Z

    if-eqz v0, :cond_13f

    const-string v0, "mGroupOwner"

    const-string v1, ""

    .line 70
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const-string v1, "mCardString"

    .line 71
    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x0

    :goto_11e
    if-ge v4, v8, :cond_13f

    new-array v5, v8, [Lkotlin/Pair;

    aput-object v0, v5, v3

    aput-object v1, v5, v7

    .line 73
    aget-object v5, v5, v4

    .line 74
    new-instance v6, Ltop/bienvenido/date_24323/n2;

    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-direct {v6, v9}, Ltop/bienvenido/date_24323/n2;-><init>(Ljava/lang/String;)V

    iget-object v6, v6, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v6, v2, v5}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_13c
    .catch Ljava/lang/Exception; {:try_start_b6 .. :try_end_13c} :catch_13f

    add-int/lit8 v4, v4, 0x1

    goto :goto_11e

    .line 79
    :catch_13f
    :cond_13f
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    new-array v0, v7, [Landroid/telephony/SubscriptionInfo;

    aput-object v2, v0, v3

    .line 80
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    .line 84
    :cond_149
    sput-object v2, Ltop/bienvenido/date_24323/e;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    return-void

    .line 38
    :cond_14c
    rem-int/lit8 v9, v4, 0x2

    if-nez v9, :cond_158

    .line 39
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    add-int/2addr v9, v6

    add-int/lit8 v6, v9, -0x30

    goto :goto_167

    .line 41
    :cond_158
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    sub-int/2addr v9, v14

    mul-int/lit8 v9, v9, 0x2

    if-ge v9, v5, :cond_163

    add-int/2addr v12, v9

    goto :goto_167

    :cond_163
    add-int/lit8 v12, v12, 0x1

    add-int/2addr v12, v9

    sub-int/2addr v12, v5

    :goto_167
    add-int/lit8 v4, v4, 0x1

    const/4 v9, 0x3

    goto/16 :goto_7b
.end method

.method public constructor <init>()V
    .registers 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
