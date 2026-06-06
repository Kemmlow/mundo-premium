.class public final Lnet/bienvenido/mundo/sdk/internal/m1;
.super Ljava/lang/Object;
.source "m1.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;


# direct methods
.method public constructor <init>(Lnet/bienvenido/mundo/sdk/internal/AppWindowController;)V
    .registers 3

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;-><init>()V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;

    .line 17
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)I
    .registers 6

    const/4 v0, 0x0

    .line 96
    :try_start_1
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;

    .line 97
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    .line 98
    iget-object v2, v1, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    iget v3, v1, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    invoke-static {v2, v3, p1}, Lnet/bienvenido/mundo/sdk/internal/你爹菊花被肛烂了生出你这么个辣鸡玩意儿;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([III)I

    move-result p1

    if-gez p1, :cond_12

    return v0

    .line 102
    :cond_12
    iget-object v1, v1, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->要不要把你妈卵子扣出来给你做寿司吃:[I

    aget p1, v1, p1
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_16} :catch_17

    return p1

    :catch_17
    return v0
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 8

    .line 22
    :try_start_0
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    .line 23
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/z1;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/io/File;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iget-object v2, v2, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "components.bin"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/CollectionUtils;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_c0

    .line 25
    invoke-static {v0}, Lkotlin/io/FilesKt;->readBytes(Ljava/io/File;)[B

    move-result-object v0

    .line 26
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 27
    array-length v2, v0

    invoke-virtual {v1, v0, v3, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 28
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 29
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 30
    new-array v2, v0, [I

    .line 31
    new-array v5, v0, [I

    .line 32
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 33
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readIntArray([I)V

    .line 34
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 35
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;

    .line 36
    iput v0, v1, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    .line 37
    iput-object v2, v1, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    .line 38
    iput-object v5, v1, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->要不要把你妈卵子扣出来给你做寿司吃:[I

    .line 39
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    if-eqz v0, :cond_64

    .line 41
    array-length v1, v0

    const/4 v2, 0x0

    :goto_4f
    if-ge v2, v1, :cond_64

    aget-object v5, v0, v2

    .line 42
    iget-boolean v6, v5, Landroid/content/pm/ComponentInfo;->enabled:Z

    if-nez v6, :cond_61

    iget-object v6, v5, Landroid/content/pm/ComponentInfo;->name:Ljava/lang/String;

    invoke-virtual {p0, v6}, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)I

    move-result v6

    if-ne v6, v4, :cond_61

    .line 43
    iput-boolean v4, v5, Landroid/content/pm/ComponentInfo;->enabled:Z

    :cond_61
    add-int/lit8 v2, v2, 0x1

    goto :goto_4f

    .line 47
    :cond_64
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    if-eqz v0, :cond_83

    .line 49
    array-length v1, v0

    const/4 v2, 0x0

    :goto_6e
    if-ge v2, v1, :cond_83

    aget-object v5, v0, v2

    .line 50
    iget-boolean v6, v5, Landroid/content/pm/ComponentInfo;->enabled:Z

    if-nez v6, :cond_80

    iget-object v6, v5, Landroid/content/pm/ComponentInfo;->name:Ljava/lang/String;

    invoke-virtual {p0, v6}, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)I

    move-result v6

    if-ne v6, v4, :cond_80

    .line 51
    iput-boolean v4, v5, Landroid/content/pm/ComponentInfo;->enabled:Z

    :cond_80
    add-int/lit8 v2, v2, 0x1

    goto :goto_6e

    .line 55
    :cond_83
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    if-eqz v0, :cond_a2

    .line 57
    array-length v1, v0

    const/4 v2, 0x0

    :goto_8d
    if-ge v2, v1, :cond_a2

    aget-object v5, v0, v2

    .line 58
    iget-boolean v6, v5, Landroid/content/pm/ComponentInfo;->enabled:Z

    if-nez v6, :cond_9f

    iget-object v6, v5, Landroid/content/pm/ComponentInfo;->name:Ljava/lang/String;

    invoke-virtual {p0, v6}, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)I

    move-result v6

    if-ne v6, v4, :cond_9f

    .line 59
    iput-boolean v4, v5, Landroid/content/pm/ComponentInfo;->enabled:Z

    :cond_9f
    add-int/lit8 v2, v2, 0x1

    goto :goto_8d

    .line 63
    :cond_a2
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    if-eqz v0, :cond_c0

    .line 65
    array-length v1, v0

    :goto_ab
    if-ge v3, v1, :cond_c0

    aget-object v2, v0, v3

    .line 66
    iget-boolean v5, v2, Landroid/content/pm/ComponentInfo;->enabled:Z

    if-nez v5, :cond_bd

    iget-object v5, v2, Landroid/content/pm/ComponentInfo;->name:Ljava/lang/String;

    invoke-virtual {p0, v5}, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)I

    move-result v5

    if-ne v5, v4, :cond_bd

    .line 67
    iput-boolean v4, v2, Landroid/content/pm/ComponentInfo;->enabled:Z
    :try_end_bd
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_bd} :catch_c0

    :cond_bd
    add-int/lit8 v3, v3, 0x1

    goto :goto_ab

    :catch_c0
    :cond_c0
    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;I)V
    .registers 10

    .line 110
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Lnet/bienvenido/mundo/sdk/internal/l1;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/l1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ComponentInfo;

    if-nez v0, :cond_13

    return-void

    :cond_13
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p2, :cond_4b

    .line 115
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;

    .line 116
    iget-object v4, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    iget v5, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-static {v4, v5, p1}, Lnet/bienvenido/mundo/sdk/internal/你爹菊花被肛烂了生出你这么个辣鸡玩意儿;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([III)I

    move-result p1

    if-ltz p1, :cond_3e

    .line 118
    iget-object v4, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    add-int/lit8 v5, p1, 0x1

    .line 120
    iget v6, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    sub-int/2addr v6, v5

    invoke-static {v4, v5, v4, p1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 121
    iget-object v4, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->要不要把你妈卵子扣出来给你做寿司吃:[I

    .line 122
    iget v6, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    sub-int/2addr v6, v5

    invoke-static {v4, v5, v4, p1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 123
    iget p1, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    sub-int/2addr p1, v1

    iput p1, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    .line 125
    :cond_3e
    iget p1, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    if-nez p1, :cond_54

    .line 126
    iput v2, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    .line 127
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/g;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    .line 128
    iput-object p1, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    .line 129
    iput-object p1, v3, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->要不要把你妈卵子扣出来给你做寿司吃:[I

    goto :goto_54

    .line 132
    :cond_4b
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {v3, p1, p2}, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(II)V

    :cond_54
    :goto_54
    const/4 p1, 0x2

    if-eq p2, p1, :cond_5b

    const/4 p1, 0x3

    if-eq p2, p1, :cond_5b

    goto :goto_5c

    :cond_5b
    const/4 v1, 0x0

    .line 141
    :goto_5c
    iput-boolean v1, v0, Landroid/content/pm/ComponentInfo;->enabled:Z
    :try_end_5e
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_5e} :catch_5e

    :catch_5e
    return-void
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃()V
    .registers 6

    .line 78
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;

    .line 79
    iget v1, v0, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    .line 80
    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    .line 81
    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;

    iget-object v2, v2, Lnet/bienvenido/mundo/sdk/internal/你在这叭叭啥呢集众给你吗凑棺材钱;->要不要把你妈卵子扣出来给你做寿司吃:[I

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    .line 82
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 83
    invoke-virtual {v3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 85
    invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 86
    invoke-virtual {v3}, Landroid/os/Parcel;->marshall()[B

    move-result-object v0

    .line 87
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 88
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    .line 89
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/z1;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/io/File;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/m1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iget-object v3, v3, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "components.bin"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Lnet/bienvenido/mundo/sdk/internal/CollectionUtils;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/io/FilesKt;->writeBytes(Ljava/io/File;[B)V
    :try_end_40
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_40} :catch_40

    :catch_40
    return-void
.end method
