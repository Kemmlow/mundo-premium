.class public abstract Ltop/bienvenido/date_24323/p8;
.super Ltop/bienvenido/date_24323/a2;
.source "p8.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 16
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

    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    const-string v1, "com.facebook.orca"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    const-string v1, "com.facebook.wakizashi"

    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1d

    :cond_1c
    const/4 v0, 0x1

    :cond_1d
    return v0
.end method

.method private isFbAuthIntent(Landroid/content/Intent;)Z
    .registers 6

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    .line 26
    :cond_4
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1c

    const-string v3, "facebook.com"

    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1c

    const-string v3, "oauth"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1c

    return v2

    .line 28
    :cond_1c
    invoke-virtual {p1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v1, "fbconnect"

    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    const-string v1, "fb-messenger"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_31

    goto :goto_32

    :cond_31
    return v0

    :cond_32
    :goto_32
    return v2
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ltop/bienvenido/date_24323/p8;Ljava/lang/Object;[Ljava/lang/Object;Ltop/bienvenido/date_24323/m0;)Ljava/util/List;
    .registers 6

    .line 100
    invoke-virtual {p0}, Ltop/bienvenido/date_24323/p8;->要不要把你妈卵子扣出来给你做寿司吃()Lkotlin/jvm/functions/Function4;

    move-result-object p0

    .line 101
    instance-of v0, p1, Landroid/content/Intent;

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    check-cast p1, Landroid/content/Intent;

    goto :goto_d

    :cond_c
    move-object p1, v1

    :goto_d
    if-nez p1, :cond_10

    return-object v1

    :cond_10
    const/4 v0, 0x1

    .line 105
    aget-object v0, p2, v0

    if-eqz v0, :cond_19

    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_19
    const/4 v0, 0x2

    .line 107
    aget-object p2, p2, v0

    .line 108
    instance-of v0, p2, Ljava/lang/Number;

    if-eqz v0, :cond_27

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    goto :goto_28

    :cond_27
    const/4 p2, 0x0

    :goto_28
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p3, p1, v1, p2}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    const/4 v0, 0x0

    .line 35
    aget-object v0, p3, v0

    .line 37
    :try_start_3
    instance-of v1, v0, Landroid/content/Intent;

    if-eqz v1, :cond_63

    .line 38
    move-object v1, v0

    check-cast v1, Landroid/content/Intent;

    .line 39
    invoke-virtual {v1}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object v2

    .line 40
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v3

    .line 43
    invoke-direct {p0, v2}, Ltop/bienvenido/date_24323/p8;->isFbApp(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_47

    if-eqz v3, :cond_25

    invoke-virtual {v3}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Ltop/bienvenido/date_24323/p8;->isFbApp(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_25

    goto :goto_47

    .line 48
    :cond_25
    invoke-direct {p0, v1}, Ltop/bienvenido/date_24323/p8;->isFbAuthIntent(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_63

    .line 49
    const-class p1, Landroid/content/pm/ParceledListSlice;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_41

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ltop/bienvenido/date_24323/d1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)Landroid/content/pm/ParceledListSlice;

    move-result-object p1

    goto :goto_46

    :cond_41
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_46
    return-object p1

    .line 44
    :cond_47
    :goto_47
    const-class p1, Landroid/content/pm/ParceledListSlice;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_5d

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ltop/bienvenido/date_24323/d1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)Landroid/content/pm/ParceledListSlice;

    move-result-object p1

    goto :goto_62

    :cond_5d
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_62
    return-object p1

    .line 53
    :cond_63
    sget-object v1, Ltop/bienvenido/date_24323/a5;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/a5;

    new-instance v2, Ltop/bienvenido/date_24323/p8$1;

    invoke-direct {v2, p0, v0, p3}, Ltop/bienvenido/date_24323/p8$1;-><init>(Ltop/bienvenido/date_24323/p8;Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ltop/bienvenido/date_24323/a5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_74

    .line 61
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 64
    :cond_74
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ltop/bienvenido/date_24323/d1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_80

    .line 67
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 70
    :cond_80
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 71
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz p1, :cond_ac

    .line 74
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8e
    :goto_8e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_ac

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 75
    iget-object v1, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz v1, :cond_a1

    .line 76
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    goto :goto_a2

    :cond_a1
    const/4 v1, 0x0

    .line 77
    :goto_a2
    invoke-direct {p0, v1}, Ltop/bienvenido/date_24323/p8;->isFbApp(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8e

    .line 78
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8e

    .line 83
    :cond_ac
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 84
    :cond_b0
    :goto_b0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d8

    .line 85
    invoke-virtual {p0}, Ltop/bienvenido/date_24323/p8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ComponentInfo;

    iget-object v0, v0, Landroid/content/pm/ComponentInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v0, :cond_b0

    .line 86
    sget-object v1, Ltop/bienvenido/date_24323/z2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    iget-object v2, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b0

    .line 87
    invoke-static {v0}, Ltop/bienvenido/date_24323/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ApplicationInfo;)Z

    goto :goto_b0

    .line 90
    :cond_d8
    const-class p1, Landroid/content/pm/ParceledListSlice;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_e8

    invoke-static {p3}, Ltop/bienvenido/date_24323/d1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)Landroid/content/pm/ParceledListSlice;

    move-result-object p3
    :try_end_e8
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_e8} :catch_e9

    :cond_e8
    return-object p3

    :catch_e9
    nop

    .line 92
    const-class p1, Landroid/content/pm/ParceledListSlice;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_f9

    sget-object p1, Ltop/bienvenido/date_24323/h;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/pm/ParceledListSlice;

    goto :goto_fb

    :cond_f9
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_fb
    return-object p1
.end method

.method public abstract 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Lkotlin/jvm/functions/Function1;
.end method

.method public abstract 要不要把你妈卵子扣出来给你做寿司吃()Lkotlin/jvm/functions/Function4;
.end method
