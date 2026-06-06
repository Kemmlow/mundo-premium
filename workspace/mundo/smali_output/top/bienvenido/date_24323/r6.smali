.class public final Ltop/bienvenido/date_24323/r6;
.super Ljava/lang/Object;
.source "r6.java"


# instance fields
.field public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltop/bienvenido/date_24323/r6;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltop/bienvenido/date_24323/r6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    .line 13
    iput-object p1, p0, Ltop/bienvenido/date_24323/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;ILandroid/os/IBinder;Z)V
    .registers 10

    const/4 v0, 0x0

    if-nez p1, :cond_5

    const/4 v1, 0x0

    goto :goto_f

    .line 17
    :cond_5
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    :goto_f
    if-ne p2, v1, :cond_1c

    .line 18
    iget-object p1, p0, Ltop/bienvenido/date_24323/r6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    new-instance p2, Ltop/bienvenido/date_24323/q6;

    invoke-direct {p2, p0, p3, p4}, Ltop/bienvenido/date_24323/q6;-><init>(Ltop/bienvenido/date_24323/r6;Landroid/os/IBinder;Z)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1c
    if-eqz p1, :cond_32

    if-nez p2, :cond_25

    .line 21
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    goto :goto_33

    :cond_25
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v1

    add-int/lit8 v2, p2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_33

    :cond_32
    const/4 v1, 0x0

    .line 22
    :goto_33
    iget-object v2, p0, Ltop/bienvenido/date_24323/r6;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_39
    if-ge v0, v2, :cond_54

    .line 24
    iget-object v3, p0, Ltop/bienvenido/date_24323/r6;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltop/bienvenido/date_24323/r6;

    .line 25
    iget-object v4, v3, Ltop/bienvenido/date_24323/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_51

    add-int/lit8 p2, p2, 0x1

    .line 26
    invoke-virtual {v3, p1, p2, p3, p4}, Ltop/bienvenido/date_24323/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;ILandroid/os/IBinder;Z)V

    return-void

    :cond_51
    add-int/lit8 v0, v0, 0x1

    goto :goto_39

    .line 30
    :cond_54
    new-instance v0, Ltop/bienvenido/date_24323/r6;

    invoke-direct {v0, v1}, Ltop/bienvenido/date_24323/r6;-><init>(Ljava/lang/String;)V

    .line 31
    iget-object v1, p0, Ltop/bienvenido/date_24323/r6;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    .line 32
    invoke-virtual {v0, p1, p2, p3, p4}, Ltop/bienvenido/date_24323/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;ILandroid/os/IBinder;Z)V

    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;ILandroid/os/IBinder;ZLjava/util/ArrayList;)V
    .registers 21

    move-object v0, p0

    move/from16 v7, p2

    move-object/from16 v8, p3

    move/from16 v9, p4

    move-object/from16 v10, p5

    const/4 v1, 0x0

    const/4 v11, 0x1

    if-nez p1, :cond_f

    const/4 v2, 0x0

    goto :goto_18

    .line 37
    :cond_f
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, v11

    :goto_18
    const/4 v3, 0x0

    if-lt v7, v2, :cond_20

    .line 38
    invoke-virtual {p0, v11, v8, v9, v10}, Ltop/bienvenido/date_24323/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ZLandroid/os/IBinder;ZLjava/util/ArrayList;)V

    :goto_1e
    move-object v12, v3

    goto :goto_3a

    :cond_20
    if-eqz p1, :cond_36

    if-nez v7, :cond_29

    .line 43
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    goto :goto_36

    .line 45
    :cond_29
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    add-int/lit8 v3, v7, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    .line 48
    :cond_36
    :goto_36
    invoke-virtual {p0, v1, v8, v9, v10}, Ltop/bienvenido/date_24323/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ZLandroid/os/IBinder;ZLjava/util/ArrayList;)V

    goto :goto_1e

    .line 50
    :goto_3a
    iget-object v2, v0, Ltop/bienvenido/date_24323/r6;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v13

    const/4 v14, 0x0

    :goto_41
    if-ge v14, v13, :cond_68

    .line 52
    iget-object v1, v0, Ltop/bienvenido/date_24323/r6;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/bienvenido/date_24323/r6;

    if-eqz v12, :cond_55

    .line 53
    iget-object v2, v1, Ltop/bienvenido/date_24323/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_65

    :cond_55
    add-int/lit8 v3, v7, 0x1

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    .line 54
    invoke-virtual/range {v1 .. v6}, Ltop/bienvenido/date_24323/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;ILandroid/os/IBinder;ZLjava/util/ArrayList;)V

    if-eqz v12, :cond_65

    return-void

    :cond_65
    add-int/lit8 v14, v14, 0x1

    goto :goto_41

    :cond_68
    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ZLandroid/os/IBinder;ZLjava/util/ArrayList;)V
    .registers 9

    .line 94
    iget-object v0, p0, Ltop/bienvenido/date_24323/r6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_28

    .line 96
    iget-object v2, p0, Ltop/bienvenido/date_24323/r6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/bienvenido/date_24323/q6;

    .line 97
    iget-object v3, v2, Ltop/bienvenido/date_24323/q6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    if-ne v3, p2, :cond_17

    if-eqz p3, :cond_25

    :cond_17
    if-nez p1, :cond_1d

    .line 98
    iget-boolean v2, v2, Ltop/bienvenido/date_24323/q6;->要不要把你妈卵子扣出来给你做寿司吃:Z

    if-eqz v2, :cond_25

    .line 99
    :cond_1d
    new-instance v2, Ltop/bienvenido/date_24323/p6;

    invoke-direct {v2, p0, v3, p3}, Ltop/bienvenido/date_24323/p6;-><init>(Ltop/bienvenido/date_24323/r6;Landroid/os/IBinder;Z)V

    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_25
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_28
    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;)Z
    .registers 8

    .line 63
    iget-object v0, p0, Ltop/bienvenido/date_24323/r6;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_8
    const/4 v3, 0x1

    if-ge v2, v0, :cond_24

    .line 68
    iget-object v4, p0, Ltop/bienvenido/date_24323/r6;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltop/bienvenido/date_24323/r6;

    invoke-virtual {v4, p1}, Ltop/bienvenido/date_24323/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;)Z

    move-result v4

    if-eqz v4, :cond_22

    .line 69
    iget-object v4, p0, Ltop/bienvenido/date_24323/r6;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v0, v0, -0x1

    :cond_22
    add-int/2addr v2, v3

    goto :goto_8

    .line 76
    :cond_24
    iget-object v0, p0, Ltop/bienvenido/date_24323/r6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_2b
    if-lt v2, v0, :cond_2e

    goto :goto_42

    .line 82
    :cond_2e
    iget-object v4, p0, Ltop/bienvenido/date_24323/r6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltop/bienvenido/date_24323/q6;

    .line 83
    iget-object v5, v4, Ltop/bienvenido/date_24323/q6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    if-ne v5, p1, :cond_54

    .line 84
    iget-object v0, p0, Ltop/bienvenido/date_24323/r6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 85
    invoke-interface {p1, v4, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 90
    :goto_42
    iget-object p1, p0, Ltop/bienvenido/date_24323/r6;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_53

    iget-object p1, p0, Ltop/bienvenido/date_24323/r6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_53

    const/4 v1, 0x1

    :cond_53
    return v1

    :cond_54
    add-int/lit8 v2, v2, 0x1

    goto :goto_2b
.end method
