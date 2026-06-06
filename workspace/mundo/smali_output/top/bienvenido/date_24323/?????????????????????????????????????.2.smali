.class public final Ltop/bienvenido/date_24323/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生;
.super Ljava/lang/Object;
.source "\u6211\u4ed6\u5988\u628a\u4f60\u585e\u8fdb\u4f60\u5a4a\u5b50\u5988\u7684\u5b50\u5bab\u91cc\u518d\u627e\u51e0\u6839\u673a\u5427\u7ed9\u4f60\u6405\u5408\u6405\u5408\u8ba9\u4f60\u8fd9\u4e2a\u6742\u79cd\u6d85\u69c3\u91cd\u751f.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 7
    new-instance v0, Ltop/bienvenido/date_24323/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Landroid/content/pm/ComponentInfo;Landroid/content/pm/ApplicationInfo;)V
    .registers 6

    if-eqz p0, :cond_19

    .line 11
    array-length v0, p0

    const/4 v1, 0x0

    :goto_4
    if-ge v1, v0, :cond_19

    aget-object v2, p0, v1

    .line 12
    iput-object p1, v2, Landroid/content/pm/ComponentInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 15
    instance-of v3, v2, Landroid/content/pm/ServiceInfo;

    if-eqz v3, :cond_16

    .line 16
    check-cast v2, Landroid/content/pm/ServiceInfo;

    iget v3, v2, Landroid/content/pm/ServiceInfo;->flags:I

    and-int/lit8 v3, v3, -0x3

    iput v3, v2, Landroid/content/pm/ServiceInfo;->flags:I

    :cond_16
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_19
    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ApplicationInfo;)Z
    .registers 4

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/16 p0, 0x35d

    .line 23
    invoke-static {p0, v1}, Ltop/bienvenido/mundo/common/initialize/MNative;->invokeRouter(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_15

    .line 25
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_15
    return v0
.end method
