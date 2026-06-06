.class public final Ltop/bienvenido/date_24323/y4;
.super Ljava/lang/Object;
.source "y4.java"

# interfaces
.implements Ljava/util/concurrent/Callable;
.implements Ljava/lang/Comparable;


# instance fields
.field public 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/reflect/GenericDeclaration;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .registers 2

    .line 13
    iget-object v0, p0, Ltop/bienvenido/date_24323/y4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/reflect/GenericDeclaration;

    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .registers 9

    const/4 v0, 0x0

    .line 19
    :try_start_1
    instance-of v1, p1, Ljava/lang/Class;

    const/4 v2, 0x1

    if-eqz v1, :cond_b

    .line 20
    check-cast p1, Ljava/lang/reflect/GenericDeclaration;

    iput-object p1, p0, Ltop/bienvenido/date_24323/y4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/reflect/GenericDeclaration;

    return v2

    .line 23
    :cond_b
    instance-of v1, p1, Ljava/lang/String;

    if-nez v1, :cond_10

    return v0

    .line 26
    :cond_10
    iget-object v1, p0, Ltop/bienvenido/date_24323/y4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/reflect/GenericDeclaration;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    :goto_1a
    if-ge v4, v3, :cond_36

    aget-object v5, v1, v4

    .line 27
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_33

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v6

    and-int/lit16 v6, v6, 0x100

    if-eqz v6, :cond_33

    .line 28
    iput-object v5, p0, Ltop/bienvenido/date_24323/y4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/reflect/GenericDeclaration;
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_32} :catch_36

    return v2

    :cond_33
    add-int/lit8 v4, v4, 0x1

    goto :goto_1a

    :catch_36
    :cond_36
    return v0
.end method
