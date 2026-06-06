.class public final Lnet/bienvenido/mundo/sdk/common/initialize/MNative;
.super Ljava/lang/Object;
.source "MNative.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:I


# direct methods
.method static constructor <clinit>()V
    .registers 8

    :try_start_0
    const-string v0, "qbyr5rthukuw"

    .line 11
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_0 .. :try_end_5} :catchall_5

    :catchall_5
    :try_start_5
    const-string v0, "msaoaidsec"

    .line 15
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_5 .. :try_end_a} :catchall_b

    goto :goto_c

    :catchall_b
    nop

    .line 19
    :goto_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0xfa

    rem-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    long-to-int v1, v0

    int-to-byte v0, v1

    const/4 v1, 0x1

    new-array v2, v1, [B

    const/4 v3, 0x0

    aput-byte v0, v2, v3

    const/16 v4, 0x270f

    .line 20
    invoke-static {v4, v2}, Lnet/bienvenido/mundo/sdk/common/initialize/MNative;->exec(I[B)[B

    move-result-object v2

    if-eqz v2, :cond_30

    .line 21
    array-length v4, v2

    if-eqz v4, :cond_30

    aget-byte v2, v2, v3

    xor-int/lit8 v0, v0, 0x5a

    int-to-byte v0, v0

    if-eq v2, v0, :cond_70

    :cond_30
    :try_start_30
    const-string v0, "sun.misc.Unsafe"

    .line 23
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "theUnsafe"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    const/4 v4, 0x0

    .line 26
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "putInt"

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Class;

    .line 27
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v7, v6, v3

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v6, v1

    invoke-virtual {v0, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v4, v5, [Ljava/lang/Object;

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v1

    invoke-virtual {v0, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_68
    .catch Ljava/lang/Exception; {:try_start_30 .. :try_end_68} :catch_69

    goto :goto_70

    .line 29
    :catch_69
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    :cond_70
    :goto_70
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static decode([B)Ljava/lang/Object;
    .registers 7

    const/4 v0, 0x0

    if-eqz p0, :cond_52

    .line 80
    array-length v1, p0

    if-nez v1, :cond_7

    goto :goto_52

    :cond_7
    const/4 v1, 0x0

    .line 81
    aget-byte v2, p0, v1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_17

    .line 82
    aget-byte p0, p0, v3

    if-ne p0, v3, :cond_12

    const/4 v1, 0x1

    :cond_12
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_17
    const/4 v1, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-ne v2, v5, :cond_3a

    .line 83
    aget-byte v0, p0, v3

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    aget-byte v2, p0, v5

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v0, v2

    aget-byte v2, p0, v4

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v0, v2

    aget-byte p0, p0, v1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_3a
    if-ne v2, v4, :cond_44

    .line 84
    new-instance v0, Ljava/lang/String;

    array-length v1, p0

    sub-int/2addr v1, v3

    invoke-direct {v0, p0, v3, v1}, Ljava/lang/String;-><init>([BII)V

    return-object v0

    :cond_44
    if-ne v2, v1, :cond_52

    .line 86
    :try_start_46
    new-instance v1, Ljava/lang/String;

    array-length v2, p0

    sub-int/2addr v2, v3

    invoke-direct {v1, p0, v3, v2}, Ljava/lang/String;-><init>([BII)V

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_51
    .catch Ljava/lang/Exception; {:try_start_46 .. :try_end_51} :catch_52

    return-object p0

    :catch_52
    :cond_52
    :goto_52
    return-object v0
.end method

.method private static native exec(I[B)[B
.end method

.method public static varargs invokeRouter(I[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 40
    :try_start_0
    invoke-static {p0, p1}, Lnet/bienvenido/mundo/sdk/common/initialize/MNative;->router(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_0 .. :try_end_4} :catchall_5

    return-object p0

    :catchall_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final ioctl(ILjava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 47
    check-cast p1, Ljava/io/Serializable;

    invoke-static {p0, p1}, Lnet/bienvenido/mundo/sdk/common/initialize/MNative;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/io/Serializable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static native router(I[Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/io/Serializable;)Ljava/lang/Object;
    .registers 9

    const/16 v0, 0x3e9

    const/4 v1, 0x0

    if-eq p0, v0, :cond_5c

    const/16 v0, 0x3eb

    if-ne p0, v0, :cond_a

    goto :goto_5c

    .line 53
    :cond_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0xfa

    rem-long/2addr v2, v4

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    long-to-int v0, v2

    int-to-byte v0, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p1, :cond_36

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    .line 58
    array-length v4, p1

    add-int/2addr v4, v3

    new-array v4, v4, [B

    .line 59
    aput-byte v0, v4, v2

    const/4 v5, 0x0

    .line 60
    :goto_29
    array-length v6, p1

    if-ge v5, v6, :cond_37

    add-int/lit8 v6, v5, 0x1

    aget-byte v5, p1, v5

    xor-int/2addr v5, v0

    int-to-byte v5, v5

    aput-byte v5, v4, v6

    move v5, v6

    goto :goto_29

    :cond_36
    move-object v4, v1

    .line 65
    :cond_37
    :try_start_37
    invoke-static {p0, v4}, Lnet/bienvenido/mundo/sdk/common/initialize/MNative;->exec(I[B)[B

    move-result-object p0
    :try_end_3b
    .catchall {:try_start_37 .. :try_end_3b} :catchall_5c

    if-eqz p0, :cond_57

    .line 70
    array-length p1, p0

    if-le p1, v3, :cond_57

    .line 71
    aget-byte p1, p0, v2

    .line 72
    array-length v0, p0

    sub-int/2addr v0, v3

    new-array v1, v0, [B

    :goto_46
    if-ge v2, v0, :cond_52

    add-int/lit8 v3, v2, 0x1

    .line 73
    aget-byte v4, p0, v3

    xor-int/2addr v4, p1

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    move v2, v3

    goto :goto_46

    .line 74
    :cond_52
    invoke-static {v1}, Lnet/bienvenido/mundo/sdk/common/initialize/MNative;->decode([B)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 76
    :cond_57
    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/common/initialize/MNative;->decode([B)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :catchall_5c
    :cond_5c
    :goto_5c
    return-object v1
.end method
