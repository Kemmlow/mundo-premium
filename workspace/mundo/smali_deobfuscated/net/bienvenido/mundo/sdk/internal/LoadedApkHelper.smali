.class public final Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;
.super Lnet/bienvenido/mundo/sdk/internal/我是月黑风高偷你妈棺材钱的爹;
.source "j8.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 8
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/我是月黑风高偷你妈棺材钱的爹;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 8

    .line 15
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MethodParameterDefaults;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;

    .line 16
    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    const-string v1, "phone"

    const/4 v2, 0x0

    .line 17
    invoke-static {v1, v0, v2}, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_64

    .line 19
    sget-boolean v3, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼:Z

    if-nez v3, :cond_16

    sget-boolean v3, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->爷半夜挖开你妈的棺材拿出手机扫描二维码扫你妈身上的尸斑成功解锁一辆共享单车证明你妈在阴间也还是万人骑:Z

    if-eqz v3, :cond_4a

    .line 21
    :cond_16
    :try_start_16
    const-class v3, Landroid/telephony/TelephonyManager;

    const-string v4, "sITelephony"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 22
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 23
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    and-int/lit8 v4, v4, 0x8

    if-nez v4, :cond_3f

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    move-result v4

    if-nez v4, :cond_3f

    new-instance v4, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;

    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v5, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;-><init>(J)V

    goto :goto_47

    :cond_3f
    new-instance v4, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;

    invoke-direct {v4, v3}, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_44
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_44} :catch_45

    goto :goto_47

    .line 25
    :catch_45
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    .line 27
    :goto_47
    invoke-virtual {v4, v2, v2}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4a
    const v3, 0x27b86d49

    const v4, 0x3f0308fe

    const v5, -0x4208d879

    const v6, 0x440feb49

    .line 29
    filled-new-array {v5, v6, v3, v4}, [I

    move-result-object v3

    new-instance v4, Lnet/bienvenido/mundo/sdk/internal/ParamDefault;

    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/e;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    invoke-direct {v4, v5}, Lnet/bienvenido/mundo/sdk/internal/ParamDefault;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v4}, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V

    .line 31
    :cond_64
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:Z

    if-eqz v0, :cond_71

    .line 32
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    const-string v0, "ions"

    .line 33
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    invoke-static {v0, v3, v2}, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    .line 35
    :cond_71
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    const-string v0, "isub"

    .line 36
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    invoke-static {v0, v3, v2}, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    move-result-object v0

    if-eqz v0, :cond_92

    .line 37
    sget-boolean v3, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->要不要把你妈卵子扣出来给你做寿司吃:Z

    if-eqz v3, :cond_92

    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/e;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/util/ArrayList;

    if-eqz v3, :cond_92

    .line 38
    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    new-instance v4, Lnet/bienvenido/mundo/sdk/internal/ParamDefault;

    invoke-direct {v4, v3}, Lnet/bienvenido/mundo/sdk/internal/ParamDefault;-><init>(Ljava/lang/Object;)V

    const v3, -0x26dd2d3b

    invoke-virtual {v0, v3, v4}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    :cond_92
    const-string v0, "telephony.registry"

    .line 40
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    invoke-static {v0, v3, v2}, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    move-result-object v0

    if-eqz v0, :cond_ab

    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Z

    if-eqz v0, :cond_ab

    const-string v0, "android.telephony.TelephonyRegistryManager"

    const-string v3, "sRegistry"

    .line 41
    invoke-static {v0, v3}, Lnet/bienvenido/mundo/sdk/internal/MundoReflection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_ab
    const-string v0, "iphonesubinfo"

    .line 43
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/LoadedApkHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    invoke-static {v0, v3, v2}, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    move-result-object v0

    if-eqz v0, :cond_f1

    .line 44
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Z

    if-nez v0, :cond_bd

    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->爷半夜挖开你妈的棺材拿出手机扫描二维码扫你妈身上的尸斑成功解锁一辆共享单车证明你妈在阴间也还是万人骑:Z

    if-eqz v0, :cond_f1

    .line 46
    :cond_bd
    :try_start_bd
    const-class v0, Landroid/telephony/TelephonyManager;

    const-string v3, "sIPhoneSubInfo"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 48
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_e6

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_e6

    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;

    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v3, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    invoke-direct {v1, v3, v4}, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;-><init>(J)V

    goto :goto_ee

    :cond_e6
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;

    invoke-direct {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_eb
    .catch Ljava/lang/Exception; {:try_start_bd .. :try_end_eb} :catch_ec

    goto :goto_ee

    .line 50
    :catch_ec
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    .line 52
    :goto_ee
    invoke-virtual {v1, v2, v2}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_f1
    return-void
.end method
