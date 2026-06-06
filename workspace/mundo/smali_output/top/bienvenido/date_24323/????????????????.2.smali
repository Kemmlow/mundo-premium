.class public final Ltop/bienvenido/date_24323/当初就应该把你射在墙上你个狗儿子;
.super Ltop/bienvenido/date_24323/a2;
.source "\u5f53\u521d\u5c31\u5e94\u8be5\u628a\u4f60\u5c04\u5728\u5899\u4e0a\u4f60\u4e2a\u72d7\u513f\u5b50.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 6
    invoke-direct {p0}, Ltop/bienvenido/date_24323/a2;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ltop/bienvenido/date_24323/m0;)I
    .registers 2

    .line 43
    invoke-interface {p1, p0}, Ltop/bienvenido/date_24323/m0;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Ljava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    const/4 v0, 0x0

    .line 10
    aget-object v0, p3, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    .line 13
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_a} :catch_b

    goto :goto_d

    :catch_b
    nop

    :cond_c
    move-object v0, v1

    .line 19
    :goto_d
    sget-boolean v2, Ltop/bienvenido/date_24323/c4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v2, :cond_2d

    if-eqz v0, :cond_2d

    .line 21
    sget-object v2, Ltop/bienvenido/date_24323/a5;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/a5;

    new-instance v3, Ltop/bienvenido/date_24323/当初就应该把你射在墙上你个狗儿子$1;

    invoke-direct {v3, p0, v0}, Ltop/bienvenido/date_24323/当初就应该把你射在墙上你个狗儿子$1;-><init>(Ltop/bienvenido/date_24323/当初就应该把你射在墙上你个狗儿子;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ltop/bienvenido/date_24323/a5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2d

    .line 33
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_2d

    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 39
    :cond_2d
    :try_start_2d
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_31} :catch_32

    return-object p1

    :catch_32
    return-object v1
.end method
