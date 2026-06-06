.class public final Lnet/bienvenido/mundo/sdk/internal/m2;
.super Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;
.source "m2.java"


# instance fields
.field public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;)V
    .registers 3

    .line 10
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;-><init>()V

    .line 11
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/m2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/m2;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 17
    invoke-virtual {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/m2;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/Object;)Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 19
    invoke-virtual {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_b
    const/4 p1, 0x0

    return-object p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 4

    .line 55
    invoke-virtual {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/m2;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/Object;)Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    .line 59
    :cond_7
    invoke-virtual {v0, p1, p2}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/Object;)Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;
    .registers 6

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return-object v0

    .line 30
    :cond_4
    :try_start_4
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/m2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    :goto_a
    if-eqz p1, :cond_22

    .line 32
    const-class v2, Ljava/lang/Object;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_12
    .catchall {:try_start_4 .. :try_end_12} :catchall_4e

    if-nez v2, :cond_22

    .line 34
    :try_start_14
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x1

    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_1c} :catch_1d
    .catchall {:try_start_14 .. :try_end_1c} :catchall_4e

    goto :goto_23

    .line 39
    :catch_1d
    :try_start_1d
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    goto :goto_a

    :cond_22
    move-object v2, v0

    :goto_23
    if-nez v2, :cond_26

    return-object v0

    .line 45
    :cond_26
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result p1

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_44

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result p1

    if-nez p1, :cond_44

    new-instance p1, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;

    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    invoke-direct {p1, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;-><init>(J)V

    goto :goto_49

    :cond_44
    new-instance p1, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;

    invoke-direct {p1, v2}, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;-><init>(Ljava/lang/reflect/Field;)V

    .line 46
    :goto_49
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/m2;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    iput-object p1, v1, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;
    :try_end_4d
    .catchall {:try_start_1d .. :try_end_4d} :catchall_4e

    return-object p1

    :catchall_4e
    return-object v0
.end method
