.class public final Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;
.super Ljava/lang/Object;
.source "t8.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 15
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;-><init>(I)V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    .line 31
    :try_start_8
    const-class v0, Landroid/os/ServiceManager;

    const-string v2, "sCache"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v2, 0x1

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 33
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v2

    and-int/lit8 v2, v2, 0x8

    if-nez v2, :cond_32

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_32

    new-instance v2, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;

    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v3, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;-><init>(J)V

    goto :goto_3a

    :cond_32
    new-instance v2, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;

    invoke-direct {v2, v0}, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_37
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_37} :catch_38

    goto :goto_3a

    .line 35
    :catch_38
    :try_start_38
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    :goto_3a
    const/4 v0, 0x0

    .line 37
    invoke-virtual {v2, v0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;
    :try_end_41
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_41} :catch_42

    goto :goto_47

    .line 39
    :catch_42
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;-><init>(I)V

    .line 41
    :goto_47
    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/BinderWrapper;)Landroid/os/Service;
    .registers 8

    const-string v0, "android.os.ServiceWithMetadata"

    const/4 v1, 0x0

    .line 82
    :try_start_3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "service"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v2, p0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    const-class p0, Landroid/os/Service;

    const-string v3, "serviceWithMetadata"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v6, 0x0

    aput-object v0, v5, v6

    invoke-virtual {p0, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    new-array v0, v4, [Ljava/lang/Object;

    aput-object v2, v0, v6

    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/Service;
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_34} :catch_35

    return-object p0

    :catch_35
    return-object v1
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Landroid/os/IBinder;Ljava/lang/Object;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;
    .registers 6

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Working on "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " with invocation handler..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    invoke-direct {v0, p3, p1}, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;-><init>(Ljava/lang/Object;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V

    .line 93
    new-instance p1, Lnet/bienvenido/mundo/sdk/internal/BinderWrapper;

    iget-object p3, v0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    check-cast p3, Landroid/os/IInterface;

    invoke-direct {p1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/BinderWrapper;-><init>(Landroid/os/IBinder;Landroid/os/IInterface;)V

    .line 94
    sget-object p2, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    .line 95
    monitor-enter p2

    .line 96
    :try_start_25
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p3

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {p2, p3, v1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 97
    sget-object p3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 98
    monitor-exit p2
    :try_end_33
    .catchall {:try_start_25 .. :try_end_33} :catchall_3e

    .line 99
    sget-object p3, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/Map;

    .line 100
    monitor-enter p3

    .line 101
    :try_start_36
    invoke-interface {p3, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    monitor-exit p3

    return-object v0

    :catchall_3b
    move-exception p0

    monitor-exit p3
    :try_end_3d
    .catchall {:try_start_36 .. :try_end_3d} :catchall_3b

    throw p0

    :catchall_3e
    move-exception p0

    .line 98
    :try_start_3f
    monitor-exit p2
    :try_end_40
    .catchall {:try_start_3f .. :try_end_40} :catchall_3e

    throw p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;
    .registers 11

    const/4 v0, 0x0

    .line 108
    :try_start_1
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/Map;

    monitor-enter v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_4} :catch_59

    .line 109
    :try_start_4
    invoke-static {p0}, Landroid/os/ServiceManager;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v2

    if-nez v2, :cond_c

    .line 111
    monitor-exit v1

    return-object v0

    :cond_c
    if-nez p2, :cond_2d

    .line 115
    invoke-interface {v2}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_28

    .line 116
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v3, "$Stub"

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_29

    :cond_28
    move-object p2, v0

    :goto_29
    if-nez p2, :cond_2d

    .line 119
    monitor-exit v1
    :try_end_2c
    .catchall {:try_start_4 .. :try_end_2c} :catchall_56

    return-object v0

    .line 123
    :cond_2d
    :try_start_2d
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    const-string v3, "asInterface"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    const-class v6, Landroid/os/IBinder;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-virtual {p2, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    .line 124
    invoke-virtual {p2, v4}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v2, v3, v7

    .line 125
    invoke-virtual {p2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4a
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_4a} :catch_54
    .catchall {:try_start_2d .. :try_end_4a} :catchall_56

    if-nez p2, :cond_4e

    .line 127
    :try_start_4c
    monitor-exit v1
    :try_end_4d
    .catchall {:try_start_4c .. :try_end_4d} :catchall_56

    return-object v0

    .line 129
    :cond_4e
    :try_start_4e
    invoke-static {p0, p1, v2, p2}, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Landroid/os/IBinder;Ljava/lang/Object;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    move-result-object p0
    :try_end_52
    .catch Ljava/lang/Exception; {:try_start_4e .. :try_end_52} :catch_54
    .catchall {:try_start_4e .. :try_end_52} :catchall_56

    :try_start_52
    monitor-exit v1

    return-object p0

    .line 131
    :catch_54
    monitor-exit v1

    return-object v0

    :catchall_56
    move-exception p0

    .line 133
    monitor-exit v1
    :try_end_58
    .catchall {:try_start_52 .. :try_end_58} :catchall_56

    :try_start_58
    throw p0
    :try_end_59
    .catch Ljava/lang/Exception; {:try_start_58 .. :try_end_59} :catch_59

    :catch_59
    return-object v0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 6

    .line 48
    :try_start_0
    const-class v0, Landroid/os/ServiceManager;

    const-string v1, "sServiceManager"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 50
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_2b

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_2b

    .line 53
    :cond_1f
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;

    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v2, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;-><init>(J)V

    goto :goto_33

    .line 51
    :cond_2b
    :goto_2b
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;

    invoke-direct {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_30
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_30} :catch_31
    .catchall {:try_start_0 .. :try_end_30} :catchall_7f

    goto :goto_33

    .line 56
    :catch_31
    :try_start_31
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    .line 58
    :goto_33
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MethodParameterDefaults;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    const/4 v2, 0x0

    .line 59
    invoke-virtual {v1, v2}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_7f

    .line 61
    new-instance v4, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    invoke-direct {v4, v3, v0}, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;-><init>(Ljava/lang/Object;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V

    const v0, -0x4beefd81

    const v3, 0x72a6408d

    .line 62
    filled-new-array {v0, v3}, [I

    move-result-object v0

    new-instance v3, Lnet/bienvenido/mundo/sdk/internal/r8;

    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/s8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/s8;

    invoke-direct {v3, v5}, Lnet/bienvenido/mundo/sdk/internal/r8;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v0, v3}, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V

    .line 63
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Z

    if-eqz v0, :cond_7a

    const v0, -0x31f0b26d

    const v3, -0x1dde2ebb

    .line 64
    filled-new-array {v0, v3}, [I

    move-result-object v0

    new-instance v3, Lnet/bienvenido/mundo/sdk/internal/r8;

    sget-boolean v5, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样:Z

    if-eqz v5, :cond_6f

    new-instance v5, Lnet/bienvenido/mundo/sdk/internal/t8$1;

    invoke-direct {v5}, Lnet/bienvenido/mundo/sdk/internal/t8$1;-><init>()V

    goto :goto_74

    .line 68
    :cond_6f
    new-instance v5, Lnet/bienvenido/mundo/sdk/internal/t8$2;

    invoke-direct {v5}, Lnet/bienvenido/mundo/sdk/internal/t8$2;-><init>()V

    :goto_74
    invoke-direct {v3, v5}, Lnet/bienvenido/mundo/sdk/internal/r8;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 64
    invoke-virtual {v4, v0, v3}, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V

    .line 74
    :cond_7a
    iget-object v0, v4, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    invoke-virtual {v1, v2, v0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7f
    .catchall {:try_start_31 .. :try_end_7f} :catchall_7f

    :catchall_7f
    :cond_7f
    return-void
.end method

.method public static final 要不要把你妈卵子扣出来给你做寿司吃(Lnet/bienvenido/mundo/sdk/internal/BinderWrapper;)Landroid/os/Service;
    .registers 8

    const/4 v0, 0x0

    .line 20
    :try_start_1
    const-class v1, Landroid/os/Service;

    const-string v2, "binder"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Landroid/os/IBinder;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p0, v2, v6

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/Service;
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1b} :catch_1c

    return-object p0

    :catch_1c
    return-object v0
.end method
