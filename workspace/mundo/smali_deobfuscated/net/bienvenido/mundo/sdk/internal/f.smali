.class public final Lnet/bienvenido/mundo/sdk/internal/f;
.super Lnet/bienvenido/mundo/sdk/internal/我是月黑风高偷你妈棺材钱的爹;
.source "f.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/f;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 6
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/f;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/f;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/f;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/f;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 5
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/我是月黑风高偷你妈棺材钱的爹;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 5

    .line 13
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MethodParameterDefaults;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/DefaultParamHandler;

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/f;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    .line 14
    const-class v0, Landroid/hardware/display/DisplayManagerGlobal;

    const-string v1, "getInstance"

    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/g;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/MundoReflection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_34

    .line 15
    const-class v1, Landroid/hardware/display/DisplayManagerGlobal;

    const-string v2, "mDm"

    invoke-static {v1, v2}, Lnet/bienvenido/mundo/sdk/internal/MundoReflection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    move-result-object v1

    invoke-virtual {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_34

    const-string v3, "display"

    invoke-virtual {p0, v3, v2}, Lnet/bienvenido/mundo/sdk/internal/f;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/Object;)Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    move-result-object v2

    if-nez v2, :cond_2f

    goto :goto_34

    .line 18
    :cond_2f
    iget-object v2, v2, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_34
    :goto_34
    return-void
.end method
