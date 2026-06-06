.class public final Lnet/bienvenido/mundo/sdk/internal/y6;
.super Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;
.source "y6.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ltop/bienvenido/date_24323/m0;)Z
    .registers 2

    .line 55
    invoke-interface {p1, p0}, Ltop/bienvenido/date_24323/m0;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    const/4 v0, 0x0

    .line 14
    aget-object v1, p3, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    .line 18
    :try_start_6
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_a
    .catchall {:try_start_6 .. :try_end_a} :catchall_b

    goto :goto_d

    :catchall_b
    nop

    :cond_c
    move-object v1, v2

    :goto_d
    if-eqz v1, :cond_35

    .line 28
    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    new-instance v4, Lnet/bienvenido/mundo/sdk/internal/y6$1;

    invoke-direct {v4, p0, v1}, Lnet/bienvenido/mundo/sdk/internal/y6$1;-><init>(Lnet/bienvenido/mundo/sdk/internal/y6;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_22

    .line 40
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :cond_22
    if-eqz v0, :cond_35

    .line 43
    const-class p1, Landroid/content/pm/IOnChecksumsReadyListener;

    invoke-static {p3, p1}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/IOnChecksumsReadyListener;

    if-nez p1, :cond_2f

    return-object v2

    .line 47
    :cond_2f
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-interface {p1, p2}, Landroid/content/pm/IOnChecksumsReadyListener;->onChecksumsReady(Ljava/util/List;)V

    return-object v2

    .line 51
    :cond_35
    invoke-super {p0, p1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
