.class public abstract Ltop/bienvenido/date_24323/d;
.super Ljava/lang/Object;
.source "d.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)Ljava/lang/String;
    .registers 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 16
    :goto_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x29

    const/16 v6, 0x28

    if-lt v2, v4, :cond_37

    if-eqz v3, :cond_36

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v2, v4

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 49
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_21
    if-gtz v3, :cond_30

    :goto_23
    if-gez v3, :cond_2b

    .line 58
    invoke-virtual {v1, v0, v6}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_23

    .line 60
    :cond_2b
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_36

    .line 54
    :cond_30
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, -0x1

    goto :goto_21

    :cond_36
    :goto_36
    return-object p0

    .line 19
    :cond_37
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v7, 0x27

    if-eq v4, v7, :cond_43

    const/16 v7, 0x22

    if-ne v4, v7, :cond_4a

    :cond_43
    if-nez v1, :cond_47

    move v1, v4

    goto :goto_4a

    :cond_47
    if-ne v1, v4, :cond_4a

    const/4 v1, 0x0

    :cond_4a
    :goto_4a
    if-nez v1, :cond_55

    if-ne v4, v6, :cond_51

    add-int/lit8 v3, v3, 0x1

    goto :goto_55

    :cond_51
    if-ne v4, v5, :cond_55

    add-int/lit8 v3, v3, -0x1

    :cond_55
    :goto_55
    add-int/lit8 v2, v2, 0x1

    goto :goto_4
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;Landroid/os/Bundle;)V
    .registers 3

    const-string v0, "limit"

    .line 77
    invoke-virtual {p0, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_14

    .line 78
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_14

    :cond_f
    const-string v0, "android:query-arg-sql-limit"

    .line 81
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_14
    :goto_14
    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Bundle;)V
    .registers 6

    const-string v0, "android:query-arg-sql-selection"

    .line 85
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    if-eqz v1, :cond_16

    .line 86
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, " GROUP BY "

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    goto :goto_17

    :cond_16
    const/4 v3, -0x1

    :goto_17
    if-eq v3, v2, :cond_34

    const/4 v2, 0x0

    .line 88
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v3, 0xa

    .line 89
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 90
    invoke-static {v2}, Ltop/bienvenido/date_24323/d;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 91
    invoke-static {v1}, Ltop/bienvenido/date_24323/d;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 92
    invoke-virtual {p0, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "android:query-arg-sql-group-by"

    .line 93
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_34
    return-void
.end method

.method public static 要不要把你妈卵子扣出来给你做寿司吃(Landroid/os/Bundle;)V
    .registers 6

    const-string v0, "android:query-arg-sql-sort-order"

    .line 66
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    if-eqz v1, :cond_16

    .line 67
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, " LIMIT "

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    goto :goto_17

    :cond_16
    const/4 v3, -0x1

    :goto_17
    if-eq v3, v2, :cond_2c

    const/4 v2, 0x0

    .line 69
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v3, 0x7

    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-virtual {p0, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "android:query-arg-sql-limit"

    .line 72
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2c
    return-void
.end method
