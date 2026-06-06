.class public final Ltop/bienvenido/date_24323/z3;
.super Ltop/bienvenido/date_24323/b2;
.source "z3.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/z3;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 14
    new-instance v0, Ltop/bienvenido/date_24323/z3;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/z3;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/z3;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/z3;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 13
    invoke-direct {p0}, Ltop/bienvenido/date_24323/b2;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;[Ljava/lang/Object;Ltop/bienvenido/date_24323/p0;)Landroid/content/Intent;
    .registers 6

    .line 83
    sget v0, Ltop/bienvenido/date_24323/c4;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:I

    .line 84
    const-class v1, Ljava/lang/Number;

    invoke-static {p2, v1}, Ltop/bienvenido/date_24323/a2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    if-eqz p2, :cond_11

    .line 85
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    goto :goto_12

    :cond_11
    const/4 p2, -0x1

    :goto_12
    if-ltz p2, :cond_16

    const/4 p2, 0x1

    goto :goto_17

    :cond_16
    const/4 p2, 0x0

    :goto_17
    invoke-interface {p3, p0, p1, v0, p2}, Ltop/bienvenido/date_24323/p0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;IZ)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 10

    .line 18
    sget-boolean v0, Ltop/bienvenido/date_24323/c4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_ab

    .line 20
    :try_start_4
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    .line 22
    array-length v1, p3

    const/4 v2, 0x0

    :goto_a
    if-lt v2, v1, :cond_e

    const/4 v2, -0x1

    goto :goto_18

    .line 28
    :cond_e
    const-class v3, Landroid/content/Intent;

    aget-object v4, p3, v2

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a7

    :goto_18
    if-ltz v2, :cond_ab

    .line 34
    aget-object v1, p3, v2

    check-cast v1, Landroid/content/Intent;

    if-eqz v1, :cond_58

    const-string v3, "Mundo_Log"

    .line 37
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "[VM OUTGOING] App is launching Intent: Action="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", Data="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", Pkg="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    :cond_58
    const-class v3, Landroid/os/IBinder;

    invoke-static {v0, v3}, Lkotlin/collections/ArraysKt;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v3, 0x0

    if-ltz v0, :cond_66

    .line 41
    aget-object v0, p3, v0

    check-cast v0, Landroid/os/IBinder;

    goto :goto_67

    :cond_66
    move-object v0, v3

    .line 43
    :goto_67
    sget-object v4, Ltop/bienvenido/date_24323/f6;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/f6;

    new-instance v5, Ltop/bienvenido/date_24323/z3$1;

    invoke-direct {v5, p0, v0, v1, p3}, Ltop/bienvenido/date_24323/z3$1;-><init>(Ltop/bienvenido/date_24323/z3;Landroid/os/IBinder;Landroid/content/Intent;[Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Ltop/bienvenido/date_24323/f6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    if-eqz v0, :cond_79

    .line 59
    aput-object v0, p3, v2

    goto :goto_ab

    .line 61
    :cond_79
    sget-object v0, Ltop/bienvenido/date_24323/l8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    .line 62
    invoke-virtual {v1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v4, "https"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9e

    .line 63
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_91

    .line 66
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    :cond_91
    const-string v0, "m.facebook.com"

    .line 68
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9e

    const/high16 v0, 0x10000000

    .line 69
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 72
    :cond_9e
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 73
    invoke-static {v1}, Ltop/bienvenido/date_24323/l8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    aput-object v0, p3, v2
    :try_end_a6
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_a6} :catch_ab

    goto :goto_ab

    :cond_a7
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_a

    .line 79
    :catch_ab
    :cond_ab
    :goto_ab
    invoke-super {p0, p1, p2, p3}, Ltop/bienvenido/date_24323/b2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ltop/bienvenido/date_24323/a1;)V
    .registers 5

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 89
    fill-array-data v0, :array_38

    invoke-virtual {p1, v0, p0}, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILtop/bienvenido/date_24323/a2;)V

    .line 90
    sget-boolean v0, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Z

    if-eqz v0, :cond_10

    .line 91
    invoke-static {}, Ltop/bienvenido/date_24323/你野爹我冲进妓院看见你妈正在跟人玩SM你那废物爸蹲在角落自慰射旁边狗屎上你妈被狗屎塞逼才生下了你这个人狗杂交的崽种;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V

    .line 93
    :cond_10
    iget-object v0, p1, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/w3;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/w3;-><init>()V

    const v2, -0x14a0b611

    invoke-virtual {v0, v2, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 94
    iget-object v0, p1, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v1, Ltop/bienvenido/date_24323/x3;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/x3;-><init>()V

    const v2, 0x752e21d8

    invoke-virtual {v0, v2, v1}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 95
    iget-object p1, p1, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v0, Ltop/bienvenido/date_24323/y3;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/y3;-><init>()V

    const v1, 0x60a24cbd

    invoke-virtual {p1, v1, v0}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    return-void

    :array_38
    .array-data 4
        -0x5b20666f
        0x46d8580e
        -0x738efae5
        0x3bb96819
        -0x2d8f30f2
        -0x379acf01
        0x55e77262
    .end array-data
.end method
