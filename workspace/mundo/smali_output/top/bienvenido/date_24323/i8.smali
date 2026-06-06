.class public final Ltop/bienvenido/date_24323/i8;
.super Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;
.source "i8.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/i8;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 13
    new-instance v0, Ltop/bienvenido/date_24323/i8;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/i8;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/i8;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/i8;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 12
    invoke-direct {p0}, Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ltop/bienvenido/date_24323/i8;[Ljava/lang/Object;)V
    .registers 6

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x1

    .line 17
    aget-object v0, p1, p0

    .line 19
    :try_start_6
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_12

    move-object v1, v0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    goto :goto_13

    :cond_12
    const/4 v1, 0x0

    :goto_13
    const/high16 v2, 0x400000

    and-int/2addr v1, v2

    if-eqz v1, :cond_41

    .line 20
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_2d

    .line 21
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/32 v2, -0x400001

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, p1, p0

    goto :goto_41

    .line 22
    :cond_2d
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_41

    .line 23
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const v1, -0x400001

    and-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p1, p0
    :try_end_41
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_41} :catch_41

    :catch_41
    :cond_41
    :goto_41
    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 9

    .line 36
    sget-object v0, Ltop/bienvenido/date_24323/q4;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/k1;

    iput-object v0, p0, Ltop/bienvenido/date_24323/i8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/a2;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_6
    const-string v2, "android.app.ActivityThread"

    .line 39
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getPackageManager"

    new-array v4, v0, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_1a} :catch_1b

    goto :goto_20

    :catch_1b
    move-exception v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    move-object v2, v1

    :goto_20
    if-eqz v2, :cond_29a

    const-string v3, "package"

    .line 43
    invoke-virtual {p0, v3, v2}, Ltop/bienvenido/date_24323/i8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/Object;)Ltop/bienvenido/date_24323/a1;

    move-result-object v2

    if-nez v2, :cond_2c

    goto/16 :goto_29a

    .line 46
    :cond_2c
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    .line 48
    :try_start_2e
    const-class v4, Landroid/app/ActivityThread;

    const-string v5, "sPackageManager"

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v5, 0x1

    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 50
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    and-int/lit8 v5, v5, 0x8

    if-nez v5, :cond_59

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    move-result v5

    if-eqz v5, :cond_4d

    goto :goto_59

    .line 53
    :cond_4d
    new-instance v5, Ltop/bienvenido/date_24323/q2;

    sget-object v6, Ltop/bienvenido/date_24323/t9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v6, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    invoke-direct {v5, v6, v7}, Ltop/bienvenido/date_24323/q2;-><init>(J)V

    goto :goto_61

    .line 51
    :cond_59
    :goto_59
    new-instance v5, Ltop/bienvenido/date_24323/p2;

    invoke-direct {v5, v4}, Ltop/bienvenido/date_24323/p2;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_5e
    .catch Ljava/lang/Exception; {:try_start_2e .. :try_end_5e} :catch_5f

    goto :goto_61

    .line 56
    :catch_5f
    sget-object v5, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/s2;

    .line 58
    :goto_61
    invoke-virtual {v5, v1, v3}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    const v4, 0x28e6dcf7

    sget-object v5, Ltop/bienvenido/date_24323/废物来玩举报可以我坐在你妈坟头上等着;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/废物来玩举报可以我坐在你妈坟头上等着;

    invoke-virtual {v3, v4, v5}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 60
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v4, Ltop/bienvenido/date_24323/跟你合作就像在操一只装满尿的靴子;

    sget-object v5, Ltop/bienvenido/date_24323/p7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/p7;

    invoke-direct {v4, v5}, Ltop/bienvenido/date_24323/跟你合作就像在操一只装满尿的靴子;-><init>(Lkotlin/jvm/functions/Function2;)V

    const v5, 0x33ecc5b3

    invoke-virtual {v3, v5, v4}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 61
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v4, Ltop/bienvenido/date_24323/跟你合作就像在操一只装满尿的靴子;

    sget-object v5, Ltop/bienvenido/date_24323/v7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/v7;

    invoke-direct {v4, v5}, Ltop/bienvenido/date_24323/跟你合作就像在操一只装满尿的靴子;-><init>(Lkotlin/jvm/functions/Function2;)V

    const v5, 0x47f310b5

    invoke-virtual {v3, v5, v4}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 62
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v4, Ltop/bienvenido/date_24323/w7;

    invoke-direct {v4}, Ltop/bienvenido/date_24323/w7;-><init>()V

    const v5, 0x4f0ab5fe

    invoke-virtual {v3, v5, v4}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 63
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v4, Ltop/bienvenido/date_24323/跟你合作就像在操一只装满尿的靴子;

    sget-object v5, Ltop/bienvenido/date_24323/x7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/x7;

    invoke-direct {v4, v5}, Ltop/bienvenido/date_24323/跟你合作就像在操一只装满尿的靴子;-><init>(Lkotlin/jvm/functions/Function2;)V

    const v5, -0x3dfcc12d

    invoke-virtual {v3, v5, v4}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 64
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v4, Ltop/bienvenido/date_24323/跟你合作就像在操一只装满尿的靴子;

    sget-object v5, Ltop/bienvenido/date_24323/y7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/y7;

    invoke-direct {v4, v5}, Ltop/bienvenido/date_24323/跟你合作就像在操一只装满尿的靴子;-><init>(Lkotlin/jvm/functions/Function2;)V

    const v5, 0x66e083cd

    invoke-virtual {v3, v5, v4}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 65
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v4, Ltop/bienvenido/date_24323/g1;

    sget-object v5, Ltop/bienvenido/date_24323/z7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/z7;

    invoke-direct {v4, v5}, Ltop/bienvenido/date_24323/g1;-><init>(Lkotlin/jvm/functions/Function2;)V

    const v5, 0x5f659c07

    invoke-virtual {v3, v5, v4}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 66
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v4, Ltop/bienvenido/date_24323/g1;

    sget-object v5, Ltop/bienvenido/date_24323/a8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/a8;

    invoke-direct {v4, v5}, Ltop/bienvenido/date_24323/g1;-><init>(Lkotlin/jvm/functions/Function2;)V

    const v5, -0x8fea22f

    invoke-virtual {v3, v5, v4}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 67
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v4, Ltop/bienvenido/date_24323/d8;

    invoke-direct {v4}, Ltop/bienvenido/date_24323/d8;-><init>()V

    const v5, 0xffec0de

    invoke-virtual {v3, v5, v4}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 68
    new-instance v3, Ltop/bienvenido/date_24323/h8;

    invoke-direct {v3}, Ltop/bienvenido/date_24323/h8;-><init>()V

    .line 69
    sget-boolean v4, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你:Z

    if-eqz v4, :cond_f9

    .line 73
    sget-boolean v5, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:Z

    if-eqz v5, :cond_f9

    .line 75
    sget-boolean v5, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->说话不过脑子直接从您屁眼里崩出来:Z

    if-nez v5, :cond_f9

    .line 76
    new-instance v5, Ltop/bienvenido/date_24323/m;

    invoke-direct {v5, v3}, Ltop/bienvenido/date_24323/m;-><init>(Ltop/bienvenido/date_24323/h8;)V

    move-object v3, v5

    .line 80
    :cond_f9
    iget-object v5, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    const v6, -0x65fa7818

    invoke-virtual {v5, v6, v3}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 81
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v5, Ltop/bienvenido/date_24323/e8;

    invoke-direct {v5}, Ltop/bienvenido/date_24323/e8;-><init>()V

    const v6, -0x5c63e682

    invoke-virtual {v3, v6, v5}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 82
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v5, Ltop/bienvenido/date_24323/v6;

    invoke-direct {v5}, Ltop/bienvenido/date_24323/v6;-><init>()V

    const v6, -0x19c08e0a

    invoke-virtual {v3, v6, v5}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 83
    iget-object v3, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v5, Ltop/bienvenido/date_24323/w6;

    invoke-direct {v5}, Ltop/bienvenido/date_24323/w6;-><init>()V

    const v6, -0x390a896

    invoke-virtual {v3, v6, v5}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 84
    sget-object v3, Ltop/bienvenido/date_24323/q4;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ltop/bienvenido/date_24323/b2;

    const/16 v5, 0xd

    new-array v5, v5, [I

    .line 85
    fill-array-data v5, :array_29c

    invoke-virtual {v2, v5, v3}, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILtop/bienvenido/date_24323/a2;)V

    const v5, 0x3eb265ff

    const v6, 0x6a564c12

    .line 86
    filled-new-array {v5, v6}, [I

    move-result-object v5

    sget-object v6, Ltop/bienvenido/date_24323/q4;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Ltop/bienvenido/date_24323/p4;

    invoke-virtual {v2, v5, v6}, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILtop/bienvenido/date_24323/a2;)V

    const v5, -0xf24ebe8

    const v6, -0x573e4cfd

    const v7, 0x77695e3

    .line 87
    filled-new-array {v7, v5, v6}, [I

    move-result-object v5

    sget-object v6, Ltop/bienvenido/date_24323/q4;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ltop/bienvenido/date_24323/p4;

    invoke-virtual {v2, v5, v6}, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILtop/bienvenido/date_24323/a2;)V

    .line 88
    sget-boolean v5, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v5, :cond_223

    .line 89
    sget-boolean v5, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Z

    if-eqz v5, :cond_161

    .line 90
    sget-object v1, Ltop/bienvenido/date_24323/d1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 91
    sget-object v1, Ltop/bienvenido/date_24323/h;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/pm/ParceledListSlice;

    :cond_161
    const v5, 0x397b2586

    const v6, -0x62a59995

    .line 95
    filled-new-array {v5, v6}, [I

    move-result-object v5

    new-instance v6, Ltop/bienvenido/date_24323/p4;

    invoke-direct {v6, v1}, Ltop/bienvenido/date_24323/p4;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v5, v6}, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILtop/bienvenido/date_24323/a2;)V

    .line 96
    sget-boolean v1, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    if-eqz v1, :cond_223

    .line 97
    iget-object v1, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    const v5, -0x7a88e474

    invoke-virtual {v1, v5, v3}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    if-eqz v4, :cond_1a0

    .line 100
    :try_start_181
    sget-object v1, Ltop/bienvenido/date_24323/b6;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/b6;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    new-instance v1, Ltop/bienvenido/date_24323/n2;

    const-string v3, "mPreloadHandler"

    invoke-direct {v1, v3}, Ltop/bienvenido/date_24323/n2;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    sget-object v3, Ltop/bienvenido/date_24323/b6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/app/ActivityThread;

    invoke-virtual {v1, v3}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 102
    instance-of v3, v1, Landroid/os/Handler;

    if-eqz v3, :cond_1a0

    .line 103
    check-cast v1, Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_19e
    .catch Ljava/lang/Exception; {:try_start_181 .. :try_end_19e} :catch_19f

    goto :goto_1a0

    :catch_19f
    nop

    .line 108
    :cond_1a0
    :goto_1a0
    sget-boolean v0, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Z

    if-eqz v0, :cond_223

    .line 109
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/x6;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/x6;-><init>()V

    const v3, -0x50c1c152

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 111
    :try_start_1b1
    new-instance v0, Ltop/bienvenido/date_24323/z5;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/z5;-><init>()V

    .line 112
    const-class v1, Landroid/content/pm/PackageManager;

    const-string v3, "sPackageInfoCache"

    invoke-virtual {v0, v1, v3}, Ltop/bienvenido/date_24323/z5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)V

    .line 113
    const-class v1, Landroid/content/pm/PackageManager;

    const-string v3, "sApplicationInfoCache"

    invoke-virtual {v0, v1, v3}, Ltop/bienvenido/date_24323/z5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)V

    .line 114
    const-class v1, Landroid/permission/PermissionManager;

    const-string v3, "sPackageNamePermissionCache"

    invoke-virtual {v0, v1, v3}, Ltop/bienvenido/date_24323/z5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)V

    .line 115
    const-class v1, Landroid/permission/PermissionManager;

    const-string v3, "sPermissionCache"

    invoke-virtual {v0, v1, v3}, Ltop/bienvenido/date_24323/z5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)V

    .line 116
    sget-boolean v1, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼:Z

    if-eqz v1, :cond_1f7

    .line 117
    sget-boolean v1, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Z

    if-eqz v1, :cond_1e1

    .line 119
    const-class v3, Landroid/permission/PermissionManager;

    const-string v4, "sPermissionRequestStateCache"

    invoke-virtual {v0, v3, v4}, Ltop/bienvenido/date_24323/z5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)V

    .line 121
    :cond_1e1
    sget-object v3, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eqz v1, :cond_1f0

    const-string v1, "sGetPackagesForUidCache"

    goto :goto_1f2

    :cond_1f0
    const-string v1, "mGetPackagesForUidCache"

    .line 127
    :goto_1f2
    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/z5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_1f5
    .catch Ljava/lang/Exception; {:try_start_1b1 .. :try_end_1f5} :catch_1f6

    goto :goto_1f7

    :catch_1f6
    nop

    .line 131
    :cond_1f7
    :goto_1f7
    sget-boolean v0, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼:Z

    if-eqz v0, :cond_223

    .line 132
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/y6;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/y6;-><init>()V

    const v3, -0x3856353f

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 133
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    const v1, -0x7e2a8db

    sget-object v3, Ltop/bienvenido/date_24323/q4;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/p4;

    invoke-virtual {v0, v1, v3}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 134
    sget-boolean v0, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了:Z

    if-eqz v0, :cond_223

    .line 135
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/z6;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/z6;-><init>()V

    const v3, -0x6e8469b7

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 141
    :cond_223
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    const v1, -0x20b8fd77

    sget-object v3, Ltop/bienvenido/date_24323/q4;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/p4;

    invoke-virtual {v0, v1, v3}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 142
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/c7;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/c7;-><init>()V

    const v3, -0x68ac9fe

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 143
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/f7;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/f7;-><init>()V

    const v3, -0x11b9e4d7

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 144
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/i7;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/i7;-><init>()V

    const v3, 0x51e88891

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 145
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/l7;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/l7;-><init>()V

    const v3, -0x21a77c58

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 146
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/o7;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/o7;-><init>()V

    const v3, 0x6a75e340

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 147
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/s7;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/s7;-><init>()V

    const v3, -0x5b352233

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 148
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/t7;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/t7;-><init>()V

    const v3, -0x4c53c841

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 149
    iget-object v0, v2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/u7;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/u7;-><init>()V

    const v3, 0x65616911

    invoke-virtual {v0, v3, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 150
    sget-object v0, Ltop/bienvenido/date_24323/你妈妈逼里的微生物细菌太多了我把抗原塞你母亲B里我看看能不能清除细菌;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/你妈妈逼里的微生物细菌太多了我把抗原塞你母亲B里我看看能不能清除细菌;

    invoke-virtual {v0, v2}, Ltop/bienvenido/date_24323/你妈妈逼里的微生物细菌太多了我把抗原塞你母亲B里我看看能不能清除细菌;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ltop/bienvenido/date_24323/a1;)V

    :cond_29a
    :goto_29a
    return-void

    nop

    :array_29c
    .array-data 4
        0xfb72de5
        0x26f44cd9
        0x4ebe9469
        -0x780e876
        -0x3ca2ffb7
        0x3dc38394
        -0x7a88e474
        -0x7e617c58
        0x622d7720    # 7.9996765E20f
        0x6906c614
        0x29135afd
        0x5cc74668
        0x5bfcf381
    .end array-data
.end method
