.class public abstract Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;
.super Ljava/lang/Object;
.source "z2.java"


# static fields
.field public static final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:I

.field public static final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 15
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoHostContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    if-nez v0, :cond_28

    .line 18
    invoke-static {}, Lnet/bienvenido/mundo/sdk/internal/HiddenApiBypass;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V

    :try_start_7
    const-string v1, "android.app.ActivityThread"

    .line 20
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "currentApplication"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    invoke-virtual {v1}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_23} :catch_24

    goto :goto_28

    :catch_24
    move-exception v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 25
    :cond_28
    :goto_28
    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 26
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    .line 27
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    .line 28
    sput v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    const v1, 0x186a0

    .line 29
    div-int/2addr v0, v1

    sput v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:I

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .registers 2

    .line 34
    :try_start_0
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_a} :catch_b

    return-object p0

    :catch_b
    const/4 p0, 0x0

    return-object p0
.end method
