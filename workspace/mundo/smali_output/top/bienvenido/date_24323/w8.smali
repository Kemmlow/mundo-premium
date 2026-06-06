.class public final Ltop/bienvenido/date_24323/w8;
.super Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;
.source "w8.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/w8;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 13
    new-instance v0, Ltop/bienvenido/date_24323/w8;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/w8;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/w8;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/w8;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 12
    invoke-direct {p0}, Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 14

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    sget-object v1, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "debug_app"

    const/4 v3, 0x0

    .line 25
    invoke-static {v1, v2, v3}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 26
    const-class v2, Landroid/provider/Settings$Global;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "font_scale"

    .line 27
    invoke-static {v1, v2, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 28
    const-class v2, Landroid/provider/Settings$System;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "accessibility_enabled"

    .line 29
    invoke-static {v1, v2, v3}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 30
    const-class v2, Landroid/provider/Settings$Secure;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    sget-boolean v2, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:Z

    const-string v4, "sNameValueCache"

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_e0

    .line 33
    :try_start_34
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-class v8, Landroid/provider/Settings;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v8, "$Config"

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    sget-boolean v8, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->用搅拌机把你妈的阴扩一下:Z
    :try_end_56
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_56} :catch_e0

    if-eqz v8, :cond_ba

    .line 37
    :try_start_58
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 38
    invoke-virtual {v1, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 39
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v2

    and-int/lit8 v2, v2, 0x8

    if-nez v2, :cond_7d

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_7d

    new-instance v2, Ltop/bienvenido/date_24323/q2;

    sget-object v8, Ltop/bienvenido/date_24323/t9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v8, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    invoke-direct {v2, v8, v9}, Ltop/bienvenido/date_24323/q2;-><init>(J)V

    goto :goto_85

    :cond_7d
    new-instance v2, Ltop/bienvenido/date_24323/p2;

    invoke-direct {v2, v1}, Ltop/bienvenido/date_24323/p2;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_82
    .catch Ljava/lang/Exception; {:try_start_58 .. :try_end_82} :catch_83

    goto :goto_85

    .line 41
    :catch_83
    :try_start_83
    sget-object v2, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/s2;

    .line 43
    :goto_85
    invoke-virtual {v2, v5}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_e0

    .line 45
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    sget v8, Ltop/bienvenido/date_24323/z2;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:I

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 49
    :cond_93
    const-class v8, Ljava/lang/Object;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8
    :try_end_99
    .catch Ljava/lang/Exception; {:try_start_83 .. :try_end_99} :catch_e0

    if-eqz v8, :cond_9c

    goto :goto_e0

    :cond_9c
    :try_start_9c
    const-string v8, "getStringForUser"

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Class;

    .line 53
    const-class v10, Landroid/content/ContentResolver;

    aput-object v10, v9, v3

    const-class v10, Ljava/lang/String;

    aput-object v10, v9, v7

    aput-object v2, v9, v6

    invoke-virtual {v1, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    .line 54
    invoke-virtual {v8, v7}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_b2
    .catch Ljava/lang/Exception; {:try_start_9c .. :try_end_b2} :catch_b3

    goto :goto_e0

    .line 58
    :catch_b3
    :try_start_b3
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1
    :try_end_b7
    .catch Ljava/lang/Exception; {:try_start_b3 .. :try_end_b7} :catch_e0

    if-nez v1, :cond_93

    goto :goto_e0

    :cond_ba
    :try_start_ba
    const-string v8, "getString"

    new-array v9, v6, [Ljava/lang/Class;

    .line 69
    const-class v10, Landroid/content/ContentResolver;

    aput-object v10, v9, v3

    const-class v10, Ljava/lang/String;

    aput-object v10, v9, v7

    invoke-virtual {v2, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 70
    invoke-virtual {v2, v7}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 71
    new-instance v8, Ltop/bienvenido/date_24323/o2;

    invoke-direct {v8, v2}, Ltop/bienvenido/date_24323/o2;-><init>(Ljava/lang/reflect/Method;)V
    :try_end_d2
    .catch Ljava/lang/Exception; {:try_start_ba .. :try_end_d2} :catch_d3

    goto :goto_d5

    .line 73
    :catch_d3
    :try_start_d3
    sget-object v8, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/s2;

    :goto_d5
    new-array v2, v6, [Ljava/lang/Object;

    aput-object v1, v2, v3

    const-string v1, "mimi"

    aput-object v1, v2, v7

    .line 75
    invoke-virtual {v8, v5, v2}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_e0
    .catch Ljava/lang/Exception; {:try_start_d3 .. :try_end_e0} :catch_e0

    .line 80
    :catch_e0
    :cond_e0
    :goto_e0
    new-instance v1, Ltop/bienvenido/date_24323/n2;

    const-string v2, "mContentProvider"

    invoke-direct {v1, v2}, Ltop/bienvenido/date_24323/n2;-><init>(Ljava/lang/String;)V

    .line 81
    new-instance v2, Ltop/bienvenido/date_24323/v8;

    invoke-direct {v2}, Ltop/bienvenido/date_24323/v8;-><init>()V

    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f0
    :goto_f0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_154

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Class;

    .line 85
    :try_start_fc
    sget-boolean v9, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Z

    if-eqz v9, :cond_103

    const-string v9, "sProviderHolder"

    goto :goto_104

    :cond_103
    move-object v9, v4

    :goto_104
    invoke-virtual {v8, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    .line 86
    invoke-virtual {v9, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 87
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v10

    and-int/lit8 v10, v10, 0x8

    if-nez v10, :cond_129

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    move-result v10

    if-nez v10, :cond_129

    new-instance v10, Ltop/bienvenido/date_24323/q2;

    sget-object v11, Ltop/bienvenido/date_24323/t9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v11, v9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v11

    invoke-direct {v10, v11, v12}, Ltop/bienvenido/date_24323/q2;-><init>(J)V

    goto :goto_131

    :cond_129
    new-instance v10, Ltop/bienvenido/date_24323/p2;

    invoke-direct {v10, v9}, Ltop/bienvenido/date_24323/p2;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_12e
    .catch Ljava/lang/Exception; {:try_start_fc .. :try_end_12e} :catch_12f

    goto :goto_131

    .line 89
    :catch_12f
    :try_start_12f
    sget-object v10, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/s2;

    .line 91
    :goto_131
    invoke-virtual {v10, v5}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_f0

    .line 93
    sget-boolean v10, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼:Z

    if-eqz v10, :cond_13e

    .line 94
    invoke-virtual {v2, v8}, Ltop/bienvenido/date_24323/v8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;)V

    .line 96
    :cond_13e
    sget-object v8, Ltop/bienvenido/date_24323/u;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/u;

    .line 97
    iget-object v8, v1, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    invoke-virtual {v8, v9}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_f0

    .line 99
    iget-object v10, v1, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    invoke-static {v8}, Ltop/bienvenido/date_24323/u;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v10, v9, v8}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_151
    .catch Ljava/lang/Exception; {:try_start_12f .. :try_end_151} :catch_152

    goto :goto_f0

    :catch_152
    nop

    goto :goto_f0

    .line 105
    :cond_154
    sget-object v0, Ltop/bienvenido/date_24323/b6;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/b6;

    .line 106
    sget-object v1, Ltop/bienvenido/date_24323/b6;->obfclass6:Ljava/util/Map;

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    :try_start_15b
    sget-object v0, Ltop/bienvenido/date_24323/b6;->我一拳把你个造谣智障砸进你婊子妈屁眼子里幻化成屎你妈这吃屎的废物还以为你爹我学会了复制神功复制出一坨屎给她吃呢:Ljava/lang/reflect/Constructor;

    new-array v2, v6, [Ljava/lang/Object;

    const-string v4, "settings"

    aput-object v4, v2, v3

    sget v3, Ltop/bienvenido/date_24323/z2;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_172
    .catch Ljava/lang/Exception; {:try_start_15b .. :try_end_172} :catch_172

    .line 117
    :catch_172
    :try_start_172
    const-class v0, Landroid/app/ActivityThread;

    const-string v1, "mProviderRefCountMap"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 118
    invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 119
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_19b

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_19b

    new-instance v1, Ltop/bienvenido/date_24323/q2;

    sget-object v2, Ltop/bienvenido/date_24323/t9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v2, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ltop/bienvenido/date_24323/q2;-><init>(J)V

    goto :goto_1a3

    :cond_19b
    new-instance v1, Ltop/bienvenido/date_24323/p2;

    invoke-direct {v1, v0}, Ltop/bienvenido/date_24323/p2;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_1a0
    .catch Ljava/lang/Exception; {:try_start_172 .. :try_end_1a0} :catch_1a1

    goto :goto_1a3

    .line 121
    :catch_1a1
    sget-object v1, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/s2;

    .line 123
    :goto_1a3
    sget-object v0, Ltop/bienvenido/date_24323/b6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/app/ActivityThread;

    invoke-virtual {v1, v0}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
