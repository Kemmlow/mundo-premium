.class public final Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;
.super Ljava/util/AbstractCollection;
.source "h9.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 53
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 54
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;-><init>(I)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    return-void
.end method

.method public constructor <init>(I)V
    .registers 3

    .line 9
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 10
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-direct {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;-><init>(I)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 6

    .line 49
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 50
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    filled-new-array {v1}, [I

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v0, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;-><init>([I[Ljava/lang/Object;)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .registers 4

    .line 15
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .registers 3

    .line 20
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    const/4 v1, 0x0

    .line 21
    iput v1, v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    .line 22
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/g;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    iput-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    .line 23
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/g;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:[Ljava/lang/Object;

    iput-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Object;

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .registers 4

    .line 28
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    .line 29
    iget-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    iget v0, v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {v1, v0, p1}, Lnet/bienvenido/mundo/sdk/internal/你爹菊花被肛烂了生出你这么个辣鸡玩意儿;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([III)I

    move-result p1

    if-ltz p1, :cond_12

    const/4 p1, 0x1

    goto :goto_13

    :cond_12
    const/4 p1, 0x0

    :goto_13
    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .registers 3

    .line 34
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/f9;

    invoke-direct {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/f9;-><init>(Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .registers 3

    .line 41
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->要不要把你妈卵子扣出来给你做寿司吃(I)Z

    move-result p1

    return p1
.end method

.method public final size()I
    .registers 2

    .line 46
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    iget v0, v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    return v0
.end method
