.class public final Ltop/bienvenido/date_24323/w3;
.super Ltop/bienvenido/date_24323/b2;
.source "w3.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 10
    invoke-direct {p0}, Ltop/bienvenido/date_24323/b2;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/internal/Ref$ObjectRef;[Landroid/content/Intent;Ltop/bienvenido/date_24323/p0;)[Landroid/content/Intent;
    .registers 4

    .line 72
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Landroid/os/IBinder;

    sget v0, Ltop/bienvenido/date_24323/c4;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:I

    invoke-interface {p2, p0, p1, v0}, Ltop/bienvenido/date_24323/p0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;[Landroid/content/Intent;I)[Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 13

    .line 13
    sget-boolean v0, Ltop/bienvenido/date_24323/c4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_6e

    .line 15
    :try_start_4
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroid/os/IBinder;

    invoke-static {v0, v1}, Lkotlin/collections/ArraysKt;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    .line 16
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    if-ltz v0, :cond_1b

    .line 18
    aget-object v2, p3, v0

    check-cast v2, Landroid/os/IBinder;

    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 20
    :cond_1b
    array-length v2, p3

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1e
    if-lt v4, v2, :cond_22

    const/4 v4, -0x1

    goto :goto_2c

    .line 27
    :cond_22
    const-class v5, [Landroid/content/Intent;

    aget-object v6, p3, v4

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6b

    :goto_2c
    if-ltz v4, :cond_6e

    .line 33
    aget-object v2, p3, v4

    check-cast v2, [Landroid/content/Intent;

    const/4 v5, 0x1

    new-array v6, v5, [Landroid/os/IBinder;

    .line 35
    sget-object v7, Ltop/bienvenido/date_24323/f6;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/f6;

    new-instance v8, Ltop/bienvenido/date_24323/w3$1;

    invoke-direct {v8, p0, v1, v2}, Ltop/bienvenido/date_24323/w3$1;-><init>(Ltop/bienvenido/date_24323/w3;Lkotlin/jvm/internal/Ref$ObjectRef;[Landroid/content/Intent;)V

    invoke-virtual {v7, v8}, Ltop/bienvenido/date_24323/f6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/content/Intent;

    if-eqz v1, :cond_6e

    .line 49
    array-length v7, v1

    if-nez v7, :cond_4c

    .line 50
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_4c
    aget-object v3, v6, v3

    if-eqz v3, :cond_54

    if-ltz v0, :cond_54

    .line 54
    aput-object v3, p3, v0

    .line 56
    :cond_54
    aput-object v1, p3, v4

    .line 57
    array-length v0, v1

    array-length v2, v2

    if-eq v0, v2, :cond_6e

    add-int/2addr v4, v5

    .line 59
    const-class v0, [Ljava/lang/String;

    aget-object v2, p3, v4

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6e

    .line 60
    array-length v0, v1

    new-array v0, v0, [Ljava/lang/String;

    aput-object v0, p3, v4
    :try_end_6a
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_6a} :catch_6e

    goto :goto_6e

    :cond_6b
    add-int/lit8 v4, v4, 0x1

    goto :goto_1e

    .line 68
    :catch_6e
    :cond_6e
    :goto_6e
    invoke-super {p0, p1, p2, p3}, Ltop/bienvenido/date_24323/b2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
