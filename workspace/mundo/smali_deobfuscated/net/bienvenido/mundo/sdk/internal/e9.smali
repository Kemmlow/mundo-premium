.class public abstract Lnet/bienvenido/mundo/sdk/internal/e9;
.super Ljava/lang/Object;
.source "e9.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([IIII)[I
    .registers 6

    add-int/lit8 v0, p1, 0x1

    .line 6
    array-length v1, p0

    if-gt v0, v1, :cond_e

    add-int/lit8 v0, p2, 0x1

    sub-int/2addr p1, p2

    .line 7
    invoke-static {p0, p2, p0, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    aput p3, p0, p2

    return-object p0

    :cond_e
    shl-int/lit8 p1, v0, 0x1

    .line 11
    new-array p1, p1, [I

    const/4 v0, 0x0

    .line 12
    invoke-static {p0, v0, p1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    aput p3, p1, p2

    add-int/lit8 p3, p2, 0x1

    .line 14
    array-length v0, p0

    sub-int/2addr v0, p2

    invoke-static {p0, p2, p1, p3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p1
.end method
