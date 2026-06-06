.class public final Ltop/bienvenido/date_24323/r3;
.super Ljava/lang/Object;
.source "r3.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;)Landroid/content/pm/ActivityInfo;
    .registers 4

    const/4 v0, 0x0

    .line 19
    :try_start_1
    sget-boolean v1, Ltop/bienvenido/date_24323/c4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-nez v1, :cond_6

    return-object v0

    .line 22
    :cond_6
    sget-boolean v1, Ltop/bienvenido/date_24323/c4;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    if-eqz v1, :cond_18

    .line 23
    sget-object v1, Ltop/bienvenido/date_24323/a5;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/a5;

    new-instance v2, Ltop/bienvenido/date_24323/r3$1;

    invoke-direct {v2, p0}, Ltop/bienvenido/date_24323/r3$1;-><init>(Landroid/content/Intent;)V

    invoke-virtual {v1, v2}, Ltop/bienvenido/date_24323/a5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ResolveInfo;

    goto :goto_25

    .line 35
    :cond_18
    sget-object v1, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 36
    new-instance v1, Ltop/bienvenido/date_24323/r3$2;

    invoke-direct {v1, p0}, Ltop/bienvenido/date_24323/r3$2;-><init>(Landroid/content/Intent;)V

    invoke-static {v1}, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ResolveInfo;

    :goto_25
    if-eqz p0, :cond_32

    .line 48
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-nez p0, :cond_2c

    goto :goto_32

    .line 51
    :cond_2c
    iget-object v1, p0, Landroid/content/pm/ComponentInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {v1}, Ltop/bienvenido/date_24323/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ApplicationInfo;)Z
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_31} :catch_32

    return-object p0

    :catch_32
    :cond_32
    :goto_32
    return-object v0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Landroid/content/pm/PackageManager;)Landroid/content/pm/ResolveInfo;
    .registers 3

    const/16 v0, 0x200

    .line 86
    invoke-virtual {p1, p0, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ltop/bienvenido/date_24323/m0;)Landroid/content/pm/ResolveInfo;
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 82
    invoke-interface {p1, p0, v0, v1}, Ltop/bienvenido/date_24323/m0;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)V
    .registers 6

    .line 60
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_39

    .line 62
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/internal/content/ReferrerIntent;

    .line 63
    invoke-static {v2}, Ltop/bienvenido/date_24323/xxx烂得过你妈的骚逼么;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;)Lkotlin/Triple;

    move-result-object v3

    if-eqz v3, :cond_36

    .line 65
    sget-boolean v4, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v4, :cond_2d

    .line 66
    invoke-virtual {v3}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Intent;

    .line 67
    invoke-virtual {v3}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_27

    .line 70
    iget-object v3, v2, Lcom/android/internal/content/ReferrerIntent;->mReferrer:Ljava/lang/String;

    .line 72
    :cond_27
    new-instance v2, Lcom/android/internal/content/ReferrerIntent;

    invoke-direct {v2, v4, v3}, Lcom/android/internal/content/ReferrerIntent;-><init>(Landroid/content/Intent;Ljava/lang/String;)V

    goto :goto_33

    .line 74
    :cond_2d
    invoke-virtual {v3}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/internal/content/ReferrerIntent;

    .line 76
    :goto_33
    invoke-interface {p0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_36
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_39
    return-void
.end method
