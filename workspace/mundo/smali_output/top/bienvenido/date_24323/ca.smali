.class public final Ltop/bienvenido/date_24323/ca;
.super Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;
.source "ca.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/ca;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 9
    new-instance v0, Ltop/bienvenido/date_24323/ca;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/ca;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/ca;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/ca;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ltop/bienvenido/date_24323/i9;Landroid/view/WindowManager$LayoutParams;Ljava/lang/String;)Lkotlin/Unit;
    .registers 4

    .line 73
    iput-object p2, p1, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 74
    iget-object p2, p0, Ltop/bienvenido/date_24323/i9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    iget p0, p0, Ltop/bienvenido/date_24323/i9;->要不要把你妈卵子扣出来给你做寿司吃:I

    iget v0, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    invoke-static {p2, p0, v0}, Ltop/bienvenido/date_24323/你爹菊花被肛烂了生出你这么个辣鸡玩意儿;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([III)I

    move-result p0

    if-ltz p0, :cond_12

    const/16 p0, 0x7f6

    .line 75
    iput p0, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 77
    :cond_12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 14

    .line 16
    sget-object v0, Ltop/bienvenido/date_24323/q4;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ltop/bienvenido/date_24323/b2;

    .line 17
    iput-object v0, p0, Ltop/bienvenido/date_24323/ca;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/a2;

    const/4 v1, 0x0

    :try_start_5
    const-string v2, "android.view.WindowManagerGlobal"

    .line 20
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2
    :try_end_b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_b} :catch_c

    goto :goto_11

    :catch_c
    move-exception v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    move-object v2, v1

    .line 24
    :goto_11
    sget-object v3, Ltop/bienvenido/date_24323/g;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Class;

    const-string v4, "getWindowSession"

    .line 25
    invoke-static {v2, v4, v3}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ltop/bienvenido/date_24323/s2;

    move-result-object v4

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/Object;

    invoke-virtual {v4, v1, v6}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_7c

    .line 27
    new-instance v6, Ltop/bienvenido/date_24323/a1;

    invoke-direct {v6, v4, v0}, Ltop/bienvenido/date_24323/a1;-><init>(Ljava/lang/Object;Ltop/bienvenido/date_24323/a2;)V

    const-string v0, "sWindowSession"

    .line 28
    invoke-static {v2, v0}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Ltop/bienvenido/date_24323/s2;

    move-result-object v0

    iget-object v4, v6, Ltop/bienvenido/date_24323/a1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    invoke-virtual {v0, v1, v4}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    sget-boolean v0, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Z

    if-eqz v0, :cond_56

    .line 30
    new-instance v0, Ltop/bienvenido/date_24323/i9;

    invoke-direct {v0, v5}, Ltop/bienvenido/date_24323/i9;-><init>(I)V

    const/4 v4, 0x5

    .line 31
    iput v4, v0, Ltop/bienvenido/date_24323/i9;->要不要把你妈卵子扣出来给你做寿司吃:I

    const/16 v4, 0x7d7

    const/16 v7, 0x7da

    const/16 v8, 0x7d2

    const/16 v9, 0x7d3

    const/16 v10, 0x7d6

    .line 32
    filled-new-array {v8, v9, v10, v4, v7}, [I

    move-result-object v4

    iput-object v4, v0, Ltop/bienvenido/date_24323/i9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    .line 33
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 34
    new-instance v4, Ltop/bienvenido/date_24323/ca$1;

    invoke-direct {v4, p0, v0}, Ltop/bienvenido/date_24323/ca$1;-><init>(Ltop/bienvenido/date_24323/ca;Ltop/bienvenido/date_24323/i9;)V

    goto :goto_69

    .line 46
    :cond_56
    new-instance v4, Ltop/bienvenido/date_24323/aa;

    new-instance v0, Ltop/bienvenido/date_24323/ca$2;

    const-class v9, Ljava/lang/Object;

    const-string v10, "name"

    const-string v11, "desc"

    const/4 v12, 0x0

    move-object v7, v0

    move-object v8, p0

    invoke-direct/range {v7 .. v12}, Ltop/bienvenido/date_24323/ca$2;-><init>(Ltop/bienvenido/date_24323/ca;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-direct {v4, v0}, Ltop/bienvenido/date_24323/aa;-><init>(Ljava/lang/Object;)V

    :goto_69
    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 56
    fill-array-data v0, :array_d6

    new-instance v7, Ltop/bienvenido/date_24323/v4;

    const-class v8, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v7, v8, v4}, Ltop/bienvenido/date_24323/v4;-><init>(Ljava/lang/Class;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6, v0, v7}, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILtop/bienvenido/date_24323/a2;)V

    .line 57
    iget-object v0, v6, Ltop/bienvenido/date_24323/a1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    goto :goto_7d

    :cond_7c
    move-object v0, v1

    :goto_7d
    const-string v4, "getWindowManagerService"

    .line 61
    invoke-static {v2, v4, v3}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ltop/bienvenido/date_24323/s2;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Object;

    invoke-virtual {v3, v1, v4}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_d5

    const-string v4, "window"

    .line 62
    invoke-virtual {p0, v4, v3}, Ltop/bienvenido/date_24323/ca;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/Object;)Ltop/bienvenido/date_24323/a1;

    move-result-object v3

    if-nez v3, :cond_94

    goto :goto_d5

    :cond_94
    const-string v4, "sWindowManagerService"

    .line 65
    invoke-static {v2, v4}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Ltop/bienvenido/date_24323/s2;

    move-result-object v2

    iget-object v4, v3, Ltop/bienvenido/date_24323/a1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    invoke-virtual {v2, v1, v4}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-boolean v4, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->要不要把你妈卵子扣出来给你做寿司吃:Z

    if-eqz v4, :cond_ab

    const-string v4, "com.android.internal.policy."

    goto :goto_ad

    :cond_ab
    const-string v4, "com.android.internal.policy.impl."

    :goto_ad
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "PhoneWindow$WindowManagerHolder"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "sWindowManager"

    invoke-static {v2, v4}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)Ltop/bienvenido/date_24323/s2;

    move-result-object v2

    iget-object v4, v3, Ltop/bienvenido/date_24323/a1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    invoke-virtual {v2, v1, v4}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v0, :cond_d5

    .line 68
    iget-object v1, v3, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v2, Ltop/bienvenido/date_24323/p4;

    invoke-direct {v2, v0}, Ltop/bienvenido/date_24323/p4;-><init>(Ljava/lang/Object;)V

    const v0, 0x6a952cec

    invoke-virtual {v1, v0, v2}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    :cond_d5
    :goto_d5
    return-void

    :array_d6
    .array-data 4
        0x178a1
        -0x320b545
        -0x36e42fa0    # -638214.0f
        -0x2109a8e3
        -0x4a515aa1
        -0x7b5c1da
        0x2ab878e3
    .end array-data
.end method
