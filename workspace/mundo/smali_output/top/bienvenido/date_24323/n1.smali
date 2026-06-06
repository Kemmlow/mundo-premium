.class public abstract Ltop/bienvenido/date_24323/n1;
.super Ljava/lang/Object;
.source "n1.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ResolveInfo;Landroid/content/pm/ResolveInfo;)I
    .registers 6

    .line 48
    iget v0, p0, Landroid/content/pm/ResolveInfo;->priority:I

    .line 49
    iget v1, p1, Landroid/content/pm/ResolveInfo;->priority:I

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq v0, v1, :cond_d

    if-le v0, v1, :cond_b

    goto :goto_c

    :cond_b
    const/4 v2, 0x1

    :goto_c
    return v2

    .line 53
    :cond_d
    iget-boolean p0, p0, Landroid/content/pm/ResolveInfo;->isDefault:Z

    .line 54
    iget-boolean p1, p1, Landroid/content/pm/ResolveInfo;->isDefault:Z

    if-eq p0, p1, :cond_18

    if-eqz p0, :cond_16

    goto :goto_17

    :cond_16
    const/4 v2, 0x1

    :goto_17
    return v2

    :cond_18
    const/4 p0, 0x0

    return p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 44
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final varargs 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    .registers 6

    .line 16
    array-length v0, p1

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_f

    aget-object v2, p1, v1

    .line 17
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    move-object p0, v3

    goto :goto_2

    :cond_f
    return-object p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)Ljava/util/List;
    .registers 3

    .line 23
    new-instance v0, Ltop/bienvenido/date_24323/n1$1;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/n1$1;-><init>()V

    .line 28
    new-instance v1, Ltop/bienvenido/date_24323/n1$2;

    invoke-direct {v1, v0}, Ltop/bienvenido/date_24323/n1$2;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    return-object p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(II)Z
    .registers 2

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_5

    const/4 p0, 0x1

    goto :goto_6

    :cond_5
    const/4 p0, 0x0

    :goto_6
    return p0
.end method
