.class public abstract Ltop/bienvenido/date_24323/你妈自挂东南枝坐好等鞭尸;
.super Ljava/lang/Object;
.source "\u4f60\u5988\u81ea\u6302\u4e1c\u5357\u679d\u5750\u597d\u7b49\u97ad\u5c38.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/util/ArrayList;
    .registers 7

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    sget-object v1, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/n5;

    invoke-virtual {v1}, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃()Ljava/util/ArrayList;

    move-result-object v1

    .line 68
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.accounts.AccountAuthenticator"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_16
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_51

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 70
    sget-object v4, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/n5;

    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    sget-object v5, Ltop/bienvenido/date_24323/n5;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ltop/bienvenido/date_24323/obfclass2;

    invoke-virtual {v5, v3}, Ltop/bienvenido/date_24323/obfclass2;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3e

    .line 73
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    const/4 v5, 0x0

    const/16 v6, 0x80

    invoke-virtual {v4, v3, v5, v6}, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_16

    .line 75
    :cond_3e
    sget-object v4, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 77
    new-instance v4, Ltop/bienvenido/date_24323/你妈自挂东南枝坐好等鞭尸$1;

    invoke-direct {v4, v2, v3}, Ltop/bienvenido/date_24323/你妈自挂东南枝坐好等鞭尸$1;-><init>(Landroid/content/Intent;Ljava/lang/String;)V

    invoke-static {v4}, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_16

    .line 87
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_16

    :cond_51
    return-object v0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;ILandroid/content/pm/PackageManager;)Ljava/util/List;
    .registers 4

    .line 95
    invoke-virtual {p0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p3, p0, p2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ResolveInfo;)Ltop/bienvenido/date_24323/j1;
    .registers 7

    const/4 v0, 0x0

    .line 41
    :try_start_1
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 42
    sget-object v1, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.accounts.AccountAuthenticator"

    .line 43
    invoke-virtual {p0, v1, v2}, Landroid/content/pm/ServiceInfo;->loadXmlMetaData(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/res/XmlResourceParser;

    move-result-object v2
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_f} :catch_4d
    .catchall {:try_start_1 .. :try_end_f} :catchall_4b

    if-nez v2, :cond_17

    if-eqz v2, :cond_16

    .line 59
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_16
    return-object v0

    .line 48
    :cond_17
    :goto_17
    :try_start_17
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->next()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eq v3, v4, :cond_22

    if-eq v3, v5, :cond_22

    goto :goto_17

    :cond_22
    if-ne v3, v5, :cond_46

    const-string v3, "account-authenticator"

    .line 51
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_46

    .line 52
    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v3

    .line 53
    iget-object v4, p0, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Landroid/content/pm/ApplicationInfo;)Landroid/content/res/Resources;

    move-result-object v1

    iget-object v4, p0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-static {v1, v4, v3, p0}, Ltop/bienvenido/date_24323/你妈自挂东南枝坐好等鞭尸;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/res/Resources;Ljava/lang/String;Landroid/util/AttributeSet;Landroid/content/pm/ServiceInfo;)Ltop/bienvenido/date_24323/j1;

    move-result-object p0
    :try_end_40
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_40} :catch_49
    .catchall {:try_start_17 .. :try_end_40} :catchall_58

    if-eqz v2, :cond_45

    .line 59
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_45
    return-object p0

    :cond_46
    if-eqz v2, :cond_57

    goto :goto_54

    :catch_49
    move-exception p0

    goto :goto_4f

    :catchall_4b
    move-exception p0

    goto :goto_5a

    :catch_4d
    move-exception p0

    move-object v2, v0

    .line 56
    :goto_4f
    :try_start_4f
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_52
    .catchall {:try_start_4f .. :try_end_52} :catchall_58

    if-eqz v2, :cond_57

    .line 59
    :goto_54
    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_57
    return-object v0

    :catchall_58
    move-exception p0

    move-object v0, v2

    :goto_5a
    if-eqz v0, :cond_5f

    invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->close()V

    .line 61
    :cond_5f
    goto :goto_61

    :goto_60
    throw p0

    :goto_61
    goto :goto_60
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/res/Resources;Ljava/lang/String;Landroid/util/AttributeSet;Landroid/content/pm/ServiceInfo;)Ltop/bienvenido/date_24323/j1;
    .registers 15

    const/4 v0, 0x0

    .line 22
    :try_start_1
    sget-object v1, Lcom/android/internal/R$styleable;->AccountAuthenticator:[I

    invoke-virtual {p0, p2, v1}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p0
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_45

    const/4 p2, 0x0

    .line 24
    :try_start_8
    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_39

    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_39

    .line 26
    new-instance v10, Ltop/bienvenido/date_24323/j1;

    const/4 v1, 0x1

    invoke-virtual {p0, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    const/4 v1, 0x2

    invoke-virtual {p0, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    const/4 v1, 0x3

    invoke-virtual {p0, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    const/4 v1, 0x4

    invoke-virtual {p0, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    const/4 v1, 0x5

    invoke-virtual {p0, v1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    move-object v1, v10

    move-object v3, p1

    move-object v9, p3

    invoke-direct/range {v1 .. v9}, Ltop/bienvenido/date_24323/j1;-><init>(Ljava/lang/String;Ljava/lang/String;IIIIZLandroid/content/pm/ServiceInfo;)V
    :try_end_35
    .catchall {:try_start_8 .. :try_end_35} :catchall_40

    .line 31
    :try_start_35
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V
    :try_end_38
    .catchall {:try_start_35 .. :try_end_38} :catchall_45

    return-object v10

    .line 28
    :cond_39
    :try_start_39
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V
    :try_end_3c
    .catchall {:try_start_39 .. :try_end_3c} :catchall_40

    .line 31
    :try_start_3c
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0

    :catchall_40
    move-exception p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 32
    throw p1
    :try_end_45
    .catchall {:try_start_3c .. :try_end_45} :catchall_45

    :catchall_45
    return-object v0
.end method
