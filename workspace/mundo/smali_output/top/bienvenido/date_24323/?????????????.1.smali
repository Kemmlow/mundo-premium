.class public final Ltop/bienvenido/date_24323/请让我先捅烂你亲妈臭逼为敬;
.super Ltop/bienvenido/date_24323/a2;
.source "\u8bf7\u8ba9\u6211\u5148\u6345\u70c2\u4f60\u4eb2\u5988\u81ed\u903c\u4e3a\u656c.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/请让我先捅烂你亲妈臭逼为敬;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 8
    new-instance v0, Ltop/bienvenido/date_24323/请让我先捅烂你亲妈臭逼为敬;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/请让我先捅烂你亲妈臭逼为敬;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/请让我先捅烂你亲妈臭逼为敬;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/请让我先捅烂你亲妈臭逼为敬;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ltop/bienvenido/date_24323/a2;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    const/4 v0, 0x0

    .line 14
    aget-object v0, p3, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    .line 18
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

    .line 24
    :goto_d
    sget-object v2, Ltop/bienvenido/date_24323/c4;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 25
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 30
    :cond_18
    :try_start_18
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_1c} :catch_1d

    return-object p1

    :catch_1d
    return-object v1
.end method
