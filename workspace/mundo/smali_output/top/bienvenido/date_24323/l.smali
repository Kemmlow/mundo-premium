.class public final Ltop/bienvenido/date_24323/l;
.super Ltop/bienvenido/date_24323/b2;
.source "l.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/l;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 8
    new-instance v0, Ltop/bienvenido/date_24323/l;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/l;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/l;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/l;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ltop/bienvenido/date_24323/b2;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    .line 13
    :try_start_0
    sget-boolean v0, Ltop/bienvenido/date_24323/c4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_2d

    .line 15
    array-length v0, p3

    const/4 v1, 0x0

    :goto_6
    if-lt v1, v0, :cond_a

    const/4 v1, -0x1

    goto :goto_14

    .line 21
    :cond_a
    const-class v2, Landroid/app/Notification;

    aget-object v3, p3, v1

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2a

    :goto_14
    if-ltz v1, :cond_2d

    .line 27
    aget-object v0, p3, v1

    check-cast v0, Landroid/app/Notification;

    invoke-virtual {v0}, Landroid/app/Notification;->clone()Landroid/app/Notification;

    move-result-object v0

    .line 28
    sget-object v2, Ltop/bienvenido/date_24323/洗浴中心有你妈服务百姓千万家;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/n2;

    .line 29
    sget-object v2, Ltop/bienvenido/date_24323/c4;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    invoke-static {v0, v2}, Ltop/bienvenido/date_24323/洗浴中心有你妈服务百姓千万家;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/app/Notification;Ljava/lang/String;)V

    .line 30
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    aput-object v0, p3, v1
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_29} :catch_2d

    goto :goto_2d

    :cond_2a
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 36
    :catch_2d
    :cond_2d
    :goto_2d
    invoke-super {p0, p1, p2, p3}, Ltop/bienvenido/date_24323/b2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
