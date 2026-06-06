.class public final Ltop/bienvenido/date_24323/i9;
.super Ljava/lang/Object;
.source "i9.java"


# instance fields
.field public 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

.field public 要不要把你妈卵子扣出来给你做寿司吃:I


# direct methods
.method public constructor <init>(I)V
    .registers 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_a

    .line 9
    sget-object p1, Ltop/bienvenido/date_24323/g;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    iput-object p1, p0, Ltop/bienvenido/date_24323/i9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    goto :goto_e

    .line 11
    :cond_a
    new-array p1, p1, [I

    iput-object p1, p0, Ltop/bienvenido/date_24323/i9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    :goto_e
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Ltop/bienvenido/date_24323/i9;->要不要把你妈卵子扣出来给你做寿司吃:I

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Z
    .registers 8

    .line 17
    iget-object v0, p0, Ltop/bienvenido/date_24323/i9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    iget v1, p0, Ltop/bienvenido/date_24323/i9;->要不要把你妈卵子扣出来给你做寿司吃:I

    invoke-static {v0, v1, p1}, Ltop/bienvenido/date_24323/你爹菊花被肛烂了生出你这么个辣鸡玩意儿;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([III)I

    move-result v0

    const/4 v1, 0x0

    if-ltz v0, :cond_c

    return v1

    .line 21
    :cond_c
    iget v2, p0, Ltop/bienvenido/date_24323/i9;->要不要把你妈卵子扣出来给你做寿司吃:I

    .line 22
    iget-object v3, p0, Ltop/bienvenido/date_24323/i9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    xor-int/lit8 v0, v0, -0x1

    add-int/lit8 v4, v2, 0x1

    .line 25
    array-length v5, v3

    if-gt v4, v5, :cond_20

    add-int/lit8 v1, v0, 0x1

    sub-int/2addr v2, v0

    .line 26
    invoke-static {v3, v0, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    aput p1, v3, v0

    goto :goto_31

    :cond_20
    shl-int/lit8 v2, v4, 0x1

    .line 29
    new-array v2, v2, [I

    .line 30
    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    aput p1, v2, v0

    add-int/lit8 p1, v0, 0x1

    .line 32
    array-length v1, v3

    sub-int/2addr v1, v0

    invoke-static {v3, v0, v2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v3, v2

    .line 35
    :goto_31
    iput-object v3, p0, Ltop/bienvenido/date_24323/i9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    .line 36
    iput v4, p0, Ltop/bienvenido/date_24323/i9;->要不要把你妈卵子扣出来给你做寿司吃:I

    const/4 p1, 0x1

    return p1
.end method
