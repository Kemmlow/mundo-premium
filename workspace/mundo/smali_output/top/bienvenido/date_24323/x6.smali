.class public final Ltop/bienvenido/date_24323/x6;
.super Ltop/bienvenido/date_24323/a2;
.source "x6.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 6
    invoke-direct {p0}, Ltop/bienvenido/date_24323/a2;-><init>()V

    return-void
.end method

.method private isFbApp(Ljava/lang/String;)Z
    .registers 4

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    :cond_4
    const-string v1, "com.facebook.katana"

    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    const-string v1, "com.facebook.orca"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    const-string v1, "com.facebook.wakizashi"

    .line 11
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1d

    :cond_1c
    const/4 v0, 0x1

    :cond_1d
    return v0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ltop/bienvenido/date_24323/m0;)Z
    .registers 2

    .line 59
    invoke-interface {p1, p0}, Ltop/bienvenido/date_24323/m0;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    const/4 v0, 0x0

    .line 17
    aget-object v1, p3, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    .line 21
    :try_start_6
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_a} :catch_b

    goto :goto_d

    :catch_b
    nop

    :cond_c
    move-object v1, v2

    :goto_d
    if-eqz v1, :cond_2f

    .line 28
    invoke-direct {p0, v1}, Ltop/bienvenido/date_24323/x6;->isFbApp(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_16

    return-object v2

    .line 33
    :cond_16
    sget-object v2, Ltop/bienvenido/date_24323/a5;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/a5;

    new-instance v3, Ltop/bienvenido/date_24323/x6$1;

    invoke-direct {v3, p0, v1}, Ltop/bienvenido/date_24323/x6$1;-><init>(Ltop/bienvenido/date_24323/x6;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ltop/bienvenido/date_24323/a5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_2f

    .line 44
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2f

    .line 45
    sget-object v1, Ltop/bienvenido/date_24323/z2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    aput-object v1, p3, v0

    .line 50
    :cond_2f
    :try_start_2f
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_33
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2f .. :try_end_33} :catch_3b
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_33} :catch_34

    return-object p1

    :catch_34
    move-exception p1

    .line 54
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_3b
    move-exception p1

    .line 52
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
