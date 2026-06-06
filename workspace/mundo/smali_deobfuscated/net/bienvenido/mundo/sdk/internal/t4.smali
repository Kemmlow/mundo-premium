.class public abstract Lnet/bienvenido/mundo/sdk/internal/t4;
.super Ljava/lang/Object;
.source "t4.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Z)I
    .registers 3

    if-eqz p1, :cond_a

    .line 58
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    goto :goto_17

    .line 60
    :cond_a
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 61
    new-instance p1, Lnet/bienvenido/mundo/sdk/internal/t4$2;

    invoke-direct {p1, p0}, Lnet/bienvenido/mundo/sdk/internal/t4$2;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ApplicationInfo;

    :goto_17
    if-eqz p0, :cond_1c

    .line 69
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->uid:I

    return p0

    :cond_1c
    const/4 p0, -0x1

    return p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/pm/ActivityInfo;
    .registers 4

    .line 17
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    invoke-virtual {v1, p1}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1e

    const/4 p1, 0x0

    .line 20
    invoke-virtual {v0, p0, v1, p1}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/internal/CollectionUtils;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ResolveInfo;

    goto :goto_2b

    .line 22
    :cond_1e
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 23
    new-instance p1, Lnet/bienvenido/mundo/sdk/internal/t4$1;

    invoke-direct {p1, p0}, Lnet/bienvenido/mundo/sdk/internal/t4$1;-><init>(Landroid/content/Intent;)V

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ResolveInfo;

    :goto_2b
    if-eqz p0, :cond_30

    .line 31
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    return-object p0

    :cond_30
    return-object v1
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)Landroid/content/pm/ActivityInfo;
    .registers 3

    .line 42
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->MundoClass_A1:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->MundoClass_C1:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 43
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v1

    if-eqz v1, :cond_1c

    const-string v1, "com.android.vending"

    .line 44
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    :cond_1c
    invoke-static {v0, p0}, Lnet/bienvenido/mundo/sdk/internal/t4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/pm/ActivityInfo;

    move-result-object v1

    if-eqz v1, :cond_23

    return-object v1

    .line 50
    :cond_23
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->MundoClass_C1:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeCategory(Ljava/lang/String;)V

    .line 51
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 52
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->MundoClass_C2:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0, p0}, Lnet/bienvenido/mundo/sdk/internal/t4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/pm/ActivityInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Landroid/content/pm/PackageManager;)Landroid/content/pm/ApplicationInfo;
    .registers 3

    const/16 v0, 0x200

    .line 76
    :try_start_2
    invoke-virtual {p1, p0, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_6} :catch_7

    return-object p0

    :catch_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Landroid/content/pm/PackageManager;)Landroid/content/pm/ResolveInfo;
    .registers 3

    const/4 v0, 0x0

    .line 37
    invoke-virtual {p1, p0, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    return-object p0
.end method
