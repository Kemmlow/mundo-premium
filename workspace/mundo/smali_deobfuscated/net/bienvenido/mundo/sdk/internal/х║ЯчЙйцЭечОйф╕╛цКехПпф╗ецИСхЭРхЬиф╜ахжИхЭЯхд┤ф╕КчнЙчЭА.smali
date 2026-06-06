.class public final Lnet/bienvenido/mundo/sdk/internal/废物来玩举报可以我坐在你妈坟头上等着;
.super Lnet/bienvenido/mundo/sdk/internal/ParamDefaultsBase;
.source "\u5e9f\u7269\u6765\u73a9\u4e3e\u62a5\u53ef\u4ee5\u6211\u5750\u5728\u4f60\u5988\u575f\u5934\u4e0a\u7b49\u7740.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/废物来玩举报可以我坐在你妈坟头上等着;

.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 7
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/废物来玩举报可以我坐在你妈坟头上等着;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/废物来玩举报可以我坐在你妈坟头上等着;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/废物来玩举报可以我坐在你妈坟头上等着;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/废物来玩举报可以我坐在你妈坟头上等着;

    const/4 v0, 0x0

    .line 34
    :try_start_8
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;-><init>(I)V

    const/4 v3, 0x0

    :goto_10
    if-lt v3, v2, :cond_13

    goto :goto_25

    :cond_13
    new-array v4, v2, [I

    .line 41
    fill-array-data v4, :array_28

    aget v4, v4, v3

    invoke-virtual {v1, v4}, Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Z
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_1d} :catch_20

    add-int/lit8 v3, v3, 0x1

    goto :goto_10

    .line 45
    :catch_20
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;

    invoke-direct {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;-><init>(I)V

    .line 47
    :goto_25
    sput-object v1, Lnet/bienvenido/mundo/sdk/internal/废物来玩举报可以我坐在你妈坟头上等着;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;

    return-void

    :array_28
    .array-data 4
        0x322a742
        -0x7aed85b0
        -0x3562e583    # -5147966.5f
        -0x84ccfd5
        -0xe939fe5
        -0x66eee4b5
        0x717b3da2
        0x2054fe51
        -0xd51e043
        0x19e5ad02
        -0x1833add0
        0x516a29a7
        0x75dd2d9c
        0xcc96c13
        0x231315d
        -0x550ba9
        -0x2ccd38b2
        0x2933cd92
        0x2a564637
        0xa7a881c
        0x50227ef3
        0xf6f97
    .end array-data
.end method

.method public constructor <init>()V
    .registers 1

    .line 6
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultsBase;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 10

    const-string v0, "Assume application obtained permission -> "

    .line 13
    :try_start_2
    const-class v1, Ljava/lang/String;

    invoke-static {p3, v1}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_54

    const-string v2, "android.permission.INTERNET"

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_4f

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    goto :goto_4f

    .line 20
    :cond_1e
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/废物来玩举报可以我坐在你妈坟头上等着;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;

    .line 21
    iget-object v4, v2, Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    iget v2, v2, Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;->要不要把你妈卵子扣出来给你做寿司吃:I

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v5

    invoke-static {v4, v2, v5}, Lnet/bienvenido/mundo/sdk/internal/你爹菊花被肛烂了生出你这么个辣鸡玩意儿;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([III)I

    move-result v2

    if-gez v2, :cond_3e

    const-string v2, "com.google.android."

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3e

    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_54

    .line 22
    :cond_3e
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 17
    :cond_4f
    :goto_4f
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_53
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_53} :catch_54

    return-object p1

    .line 28
    :catch_54
    :cond_54
    invoke-super {p0, p1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultsBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
