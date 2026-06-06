.class public final Lnet/bienvenido/mundo/sdk/internal/u2;
.super Ljava/lang/Object;
.source "u2.java"

# interfaces
.implements Ljava/util/Iterator;
.implements Ljava/util/Map$Entry;


# instance fields
.field public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/v2;

.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:I

.field public 要不要把你妈卵子扣出来给你做寿司吃:I


# direct methods
.method public constructor <init>(Lnet/bienvenido/mundo/sdk/internal/v2;)V
    .registers 3

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->要不要把你妈卵子扣出来给你做寿司吃:I

    .line 12
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/v2;

    .line 13
    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/obfclass1;

    iget-object p1, p1, Lnet/bienvenido/mundo/sdk/internal/obfclass1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    iget p1, p1, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:I

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .registers 3

    .line 18
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/v2;

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/obfclass1;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/obfclass1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Object;

    iget v1, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->要不要把你妈卵子扣出来给你做寿司吃:I

    shl-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .registers 3

    .line 23
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/v2;

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/obfclass1;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/obfclass1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Object;

    iget v1, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->要不要把你妈卵子扣出来给你做寿司吃:I

    shl-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final hasNext()Z
    .registers 3

    .line 28
    iget v0, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->要不要把你妈卵子扣出来给你做寿司吃:I

    iget v1, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:I

    if-ge v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .registers 2

    .line 33
    iget v0, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->要不要把你妈卵子扣出来给你做寿司吃:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->要不要把你妈卵子扣出来给你做寿司吃:I

    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 39
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/v2;

    .line 40
    iget v1, p0, Lnet/bienvenido/mundo/sdk/internal/u2;->要不要把你妈卵子扣出来给你做寿司吃:I

    .line 41
    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/obfclass1;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/obfclass1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    shl-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x1

    .line 43
    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Object;

    .line 44
    aget-object v2, v0, v1

    .line 45
    aput-object p1, v0, v1

    return-object v2
.end method
