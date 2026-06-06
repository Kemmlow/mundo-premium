.class public final Ltop/bienvenido/date_24323/x3;
.super Ltop/bienvenido/date_24323/a2;
.source "x3.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ltop/bienvenido/date_24323/a2;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ltop/bienvenido/date_24323/p0;)Ljava/util/List;
    .registers 9

    const/4 v0, 0x0

    .line 43
    aget-object p0, p0, v0

    .line 44
    instance-of v1, p0, Ljava/lang/Number;

    if-eqz v1, :cond_d

    .line 45
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 47
    :cond_d
    sget p0, Ltop/bienvenido/date_24323/c4;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:I

    int-to-long v1, p0

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    int-to-long v3, v0

    const/16 p0, 0x20

    shl-long/2addr v3, p0

    const-wide v5, -0x100000000L

    and-long/2addr v3, v5

    or-long/2addr v1, v3

    invoke-interface {p1, v1, v2}, Ltop/bienvenido/date_24323/p0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(J)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    .line 13
    sget-boolean v0, Ltop/bienvenido/date_24323/c4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_12

    .line 14
    sget-object v0, Ltop/bienvenido/date_24323/f6;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/f6;

    new-instance v1, Ltop/bienvenido/date_24323/x3$1;

    invoke-direct {v1, p0, p3}, Ltop/bienvenido/date_24323/x3$1;-><init>(Ltop/bienvenido/date_24323/x3;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ltop/bienvenido/date_24323/f6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    .line 28
    :goto_13
    sget-boolean v1, Ltop/bienvenido/date_24323/c4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v1, :cond_1b

    if-nez v0, :cond_1a

    goto :goto_1b

    :cond_1a
    return-object v0

    .line 30
    :cond_1b
    :goto_1b
    :try_start_1b
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1f
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1b .. :try_end_1f} :catch_27
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1f} :catch_20

    return-object p1

    :catch_20
    move-exception p1

    .line 34
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_27
    move-exception p1

    .line 32
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
