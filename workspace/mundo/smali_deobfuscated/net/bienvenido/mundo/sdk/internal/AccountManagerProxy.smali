.class public final Lnet/bienvenido/mundo/sdk/internal/AccountManagerProxy;
.super Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;
.source "k6.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 10
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 10

    .line 16
    :try_start_0
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_53

    const/4 v0, 0x1

    aget-object v0, p3, v0

    if-eqz v0, :cond_53

    invoke-static {v0}, Lnet/bienvenido/mundo/sdk/internal/ProviderInfoHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_53

    .line 17
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_13
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_42

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationChannel;

    .line 18
    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/洗浴中心有你妈服务百姓千万家;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    .line 19
    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    .line 20
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/洗浴中心有你妈服务百姓千万家;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    iget-object v4, v4, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v2}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lnet/bienvenido/mundo/sdk/internal/你婊子妈子宫肌瘤过多花重金邀请我去给她治疗我就拿着一颗原子弹在她子宫里引爆;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    invoke-virtual {v2}, Landroid/app/NotificationChannel;->getSound()Landroid/net/Uri;

    move-result-object v3

    if-eqz v3, :cond_13

    .line 22
    sget-object v3, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/app/NotificationChannel;->getAudioAttributes()Landroid/media/AudioAttributes;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    goto :goto_13

    .line 25
    :cond_42
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/ProviderInfoHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 26
    const-class v1, Landroid/content/pm/ParceledListSlice;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_53

    .line 27
    invoke-static {v0}, Lnet/bienvenido/mundo/sdk/internal/ProviderInfoHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)Landroid/content/pm/ParceledListSlice;
    :try_end_53
    .catchall {:try_start_0 .. :try_end_53} :catchall_53

    .line 32
    :catchall_53
    :cond_53
    invoke-super {p0, p1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
