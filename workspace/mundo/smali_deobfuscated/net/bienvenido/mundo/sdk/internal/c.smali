.class public final Lnet/bienvenido/mundo/sdk/internal/c;
.super Lnet/bienvenido/mundo/sdk/internal/我是月黑风高偷你妈棺材钱的爹;
.source "c.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 7
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/c;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/c;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/c;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/c;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 6
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/我是月黑风高偷你妈棺材钱的爹;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 8

    .line 12
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MethodParameterDefaults;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;

    .line 13
    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/c;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    const-string v1, "content"

    const/4 v2, 0x0

    .line 14
    invoke-static {v1, v0, v2}, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    move-result-object v0

    if-nez v0, :cond_e

    return-void

    .line 18
    :cond_e
    iget-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    .line 20
    :try_start_10
    const-class v3, Landroid/content/ContentResolver;

    const-string v4, "sContentService"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    const/4 v4, 0x1

    .line 21
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 22
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    and-int/lit8 v4, v4, 0x8

    if-nez v4, :cond_3a

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    move-result v4

    if-nez v4, :cond_3a

    new-instance v4, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;

    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v5, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;-><init>(J)V

    goto :goto_42

    :cond_3a
    new-instance v4, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;

    invoke-direct {v4, v3}, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_3f
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_3f} :catch_40

    goto :goto_42

    .line 24
    :catch_40
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    .line 26
    :goto_42
    invoke-virtual {v4, v2, v1}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    iget-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    new-instance v2, Lnet/bienvenido/mundo/sdk/internal/野爹我手持八倍镜sks瞄准你婊子妈那残破不堪的子宫一阵压枪点射瞬间将你婊子的子宫打的千疮百孔血流如注然后野爹再对准你亲妈的子宫点燃一颗冲天炮顷刻间你妈上了天;

    invoke-direct {v2}, Lnet/bienvenido/mundo/sdk/internal/野爹我手持八倍镜sks瞄准你婊子妈那残破不堪的子宫一阵压枪点射瞬间将你婊子的子宫打的千疮百孔血流如注然后野爹再对准你亲妈的子宫点燃一颗冲天炮顷刻间你妈上了天;-><init>()V

    const v3, 0x5532714c

    invoke-virtual {v1, v3, v2}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 28
    iget-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    new-instance v2, Lnet/bienvenido/mundo/sdk/internal/a;

    invoke-direct {v2}, Lnet/bienvenido/mundo/sdk/internal/a;-><init>()V

    const v3, 0x7f10693

    invoke-virtual {v1, v3, v2}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 29
    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/b;

    invoke-direct {v1}, Lnet/bienvenido/mundo/sdk/internal/b;-><init>()V

    const v2, 0x3b9d3c59

    invoke-virtual {v0, v2, v1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    return-void
.end method
