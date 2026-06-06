.class public abstract Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;
.super Ljava/lang/Object;
.source "t9.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 12
    :try_start_0
    const-class v0, Lsun/misc/Unsafe;

    const-string v1, "getUnsafe"

    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/g;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 14
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/g;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:[Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsun/misc/Unsafe;

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_19} :catch_1a

    return-void

    :catch_1a
    move-exception v0

    .line 18
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>()V
    .registers 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
