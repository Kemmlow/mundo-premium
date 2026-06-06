.class public final Ltop/bienvenido/date_24323/h1;
.super Ljava/lang/Object;
.source "h1.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/h1;

.field public static 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/g9;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 13
    new-instance v0, Ltop/bienvenido/date_24323/h1;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/h1;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/h1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/h1;

    .line 14
    new-instance v0, Ltop/bienvenido/date_24323/g9;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltop/bienvenido/date_24323/g9;-><init>(I)V

    sput-object v0, Ltop/bienvenido/date_24323/h1;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/g9;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Landroid/content/pm/PackageManager;)Landroid/content/pm/PackageInfo;
    .registers 3

    const/16 v0, 0x201

    .line 65
    :try_start_2
    invoke-virtual {p1, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_6} :catch_7

    return-object p0

    :catch_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ltop/bienvenido/date_24323/m0;)Landroid/content/pm/PackageInfo;
    .registers 3

    const/4 v0, 0x1

    .line 59
    invoke-interface {p1, p0, v0}, Ltop/bienvenido/date_24323/m0;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 10

    .line 20
    :try_start_0
    sget-object v0, Ltop/bienvenido/date_24323/c4;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    .line 21
    sget-object v1, Ltop/bienvenido/date_24323/c4;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/String;

    .line 22
    sget-boolean v2, Ltop/bienvenido/date_24323/c4;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    if-eqz v2, :cond_16

    .line 23
    sget-object v2, Ltop/bienvenido/date_24323/a5;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/a5;

    new-instance v3, Ltop/bienvenido/date_24323/h1$1;

    invoke-direct {v3, p0, v0}, Ltop/bienvenido/date_24323/h1$1;-><init>(Ltop/bienvenido/date_24323/h1;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ltop/bienvenido/date_24323/a5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    goto :goto_23

    .line 30
    :cond_16
    sget-object v2, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 31
    new-instance v2, Ltop/bienvenido/date_24323/h1$2;

    invoke-direct {v2, p0, v0}, Ltop/bienvenido/date_24323/h1$2;-><init>(Ltop/bienvenido/date_24323/h1;Ljava/lang/String;)V

    invoke-static {v2}, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    :goto_23
    if-eqz v0, :cond_60

    .line 38
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    if-nez v0, :cond_2a

    goto :goto_60

    .line 41
    :cond_2a
    new-instance v2, Ltop/bienvenido/date_24323/g9;

    array-length v3, v0

    invoke-direct {v2, v3}, Ltop/bienvenido/date_24323/g9;-><init>(I)V

    const/4 v3, 0x0

    .line 42
    aget-object v4, v0, v3

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 43
    invoke-static {v4}, Ltop/bienvenido/date_24323/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ApplicationInfo;)Z

    .line 44
    array-length v5, v0

    :goto_39
    if-ge v3, v5, :cond_5d

    aget-object v6, v0, v3

    .line 45
    iget-object v7, v6, Landroid/content/pm/ActivityInfo;->processName:Ljava/lang/String;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x1

    if-nez v7, :cond_4b

    iget v7, v6, Landroid/content/pm/ActivityInfo;->flags:I

    and-int/2addr v7, v8

    if-eqz v7, :cond_5a

    .line 46
    :cond_4b
    iget-object v7, v6, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v7

    .line 47
    iput-object v4, v6, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 48
    iput-boolean v8, v6, Landroid/content/pm/ActivityInfo;->enabled:Z

    .line 49
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    invoke-virtual {v2, v7, v6}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    :cond_5a
    add-int/lit8 v3, v3, 0x1

    goto :goto_39

    .line 53
    :cond_5d
    sput-object v2, Ltop/bienvenido/date_24323/h1;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/g9;
    :try_end_5f
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_5f} :catch_60

    nop

    :catch_60
    :cond_60
    :goto_60
    return-void
.end method
