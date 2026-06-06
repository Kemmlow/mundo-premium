.class public abstract Lnet/bienvenido/mundo/sdk/internal/t5;
.super Landroid/app/job/JobService;
.source "t5.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;


# direct methods
.method public constructor <init>()V
    .registers 5

    .line 18
    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    .line 15
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    const-string v1, "extras"

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/t5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    .line 20
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->用搅拌机把你妈的阴扩一下:Z

    if-eqz v0, :cond_43

    .line 22
    :try_start_10
    const-class v0, Landroid/app/job/JobParameters;

    const-string v1, "callback"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 24
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_3a

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_3a

    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;

    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v2, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;-><init>(J)V

    goto :goto_45

    :cond_3a
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;

    invoke-direct {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_3f
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_3f} :catch_40

    goto :goto_45

    .line 26
    :catch_40
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    goto :goto_45

    .line 29
    :cond_43
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    .line 31
    :goto_45
    iput-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/t5;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;Ltop/bienvenido/date_24323/c0;)Landroid/app/job/JobService;
    .registers 3

    .line 35
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/String;

    invoke-interface {p1, p0, v0}, Ltop/bienvenido/date_24323/c0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p0

    const/4 p1, 0x0

    if-nez p0, :cond_a

    return-object p1

    .line 39
    :cond_a
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->你这种烂货完全是当今社会的毒瘤老子要在你狗脑子上面安一个定时炸弹3次密码不对马上爆炸正好为社会除害:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 41
    instance-of v0, p0, Landroid/app/job/JobService;

    if-eqz v0, :cond_1c

    .line 42
    check-cast p0, Landroid/app/job/JobService;

    return-object p0

    :cond_1c
    return-object p1
.end method


# virtual methods
.method public final onNetworkChanged(Landroid/app/job/JobParameters;)V
    .registers 3

    .line 49
    invoke-virtual {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/t5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/app/job/JobParameters;)Landroid/app/job/JobService;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 51
    invoke-virtual {v0, p1}, Landroid/app/job/JobService;->onNetworkChanged(Landroid/app/job/JobParameters;)V

    :cond_9
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .registers 5

    const/4 p2, 0x2

    if-eqz p1, :cond_d

    :try_start_3
    const-string p3, "android.intent.extra.INTENT"

    .line 78
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_b} :catch_c

    goto :goto_e

    :catch_c
    return p2

    :cond_d
    const/4 p1, 0x0

    :goto_e
    if-nez p1, :cond_11

    return p2

    .line 88
    :cond_11
    sget-object p3, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    const-string v0, "user"

    .line 89
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1d

    const-string v0, "0"

    .line 94
    :cond_1d
    invoke-virtual {p3, p1, v0}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/ComponentName;

    return p2
.end method

.method public final onStartJob(Landroid/app/job/JobParameters;)Z
    .registers 3

    .line 57
    invoke-virtual {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/t5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/app/job/JobParameters;)Landroid/app/job/JobService;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 59
    invoke-virtual {v0, p1}, Landroid/app/job/JobService;->onStartJob(Landroid/app/job/JobParameters;)Z

    move-result p1

    return p1

    :cond_b
    const/4 p1, 0x1

    return p1
.end method

.method public final onStopJob(Landroid/app/job/JobParameters;)Z
    .registers 3

    .line 66
    invoke-virtual {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/t5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/app/job/JobParameters;)Landroid/app/job/JobService;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 68
    invoke-virtual {v0, p1}, Landroid/app/job/JobService;->onStopJob(Landroid/app/job/JobParameters;)Z

    move-result p1

    return p1

    :cond_b
    const/4 p1, 0x1

    return p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/app/job/JobParameters;)Landroid/app/job/JobService;
    .registers 10

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return-object v0

    .line 106
    :cond_4
    :try_start_4
    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v1

    if-eqz v1, :cond_5d

    const-string v2, "mundo_base_string"

    const-string v3, ""

    .line 107
    invoke-virtual {v1, v2, v3}, Landroid/os/PersistableBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v2

    if-eqz v2, :cond_5d

    const-string v3, "mundo_base_bundle"

    invoke-virtual {v1, v3}, Landroid/os/PersistableBundle;->getPersistableBundle(Ljava/lang/String;)Landroid/os/PersistableBundle;

    move-result-object v1

    if-nez v1, :cond_21

    goto :goto_5d

    .line 110
    :cond_21
    sget-boolean v3, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->用搅拌机把你妈的阴扩一下:Z

    if-eqz v3, :cond_45

    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/t5;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v3, p1}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/IBinder;

    if-eqz v3, :cond_45

    .line 111
    iget-object v4, p0, Lnet/bienvenido/mundo/sdk/internal/t5;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    new-instance v5, Lnet/bienvenido/mundo/sdk/internal/BinderWrapper;

    invoke-static {v3}, Landroid/app/job/IJobCallback$Stub;->asInterface(Landroid/os/IBinder;)Landroid/app/job/IJobCallback;

    move-result-object v6

    sget-object v7, Lnet/bienvenido/mundo/sdk/internal/l;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/l;

    invoke-static {v6, v7}, Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/os/IInterface;

    invoke-direct {v5, v3, v6}, Lnet/bienvenido/mundo/sdk/internal/BinderWrapper;-><init>(Landroid/os/IBinder;Landroid/os/IInterface;)V

    invoke-virtual {v4, p1, v5}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    :cond_45
    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/MundoActivityManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoActivityManagerServiceProxy;

    new-instance v4, Lnet/bienvenido/mundo/sdk/internal/t5$1;

    invoke-direct {v4, p0, v2}, Lnet/bienvenido/mundo/sdk/internal/t5$1;-><init>(Lnet/bienvenido/mundo/sdk/internal/t5;Landroid/content/ComponentName;)V

    invoke-virtual {v3, v4}, Lnet/bienvenido/mundo/sdk/internal/MundoActivityManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/job/JobService;

    if-nez v2, :cond_55

    return-object v0

    .line 127
    :cond_55
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/t5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    iget-object v3, v3, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v3, p1, v1}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5c
    .catchall {:try_start_4 .. :try_end_5c} :catchall_5d

    return-object v2

    :catchall_5d
    :cond_5d
    :goto_5d
    return-object v0
.end method
