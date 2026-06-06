.class public final Lnet/bienvenido/mundo/sdk/internal/ParamDefaultFactory;
.super Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;
.source "o4.java"


# instance fields
.field public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/Object;

.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/Class;Landroid/os/Parcelable;)V
    .registers 4

    .line 11
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;-><init>()V

    .line 12
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultFactory;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    .line 13
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultFactory;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Class;

    .line 14
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultFactory;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    .line 20
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultFactory;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Class;

    .line 21
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultFactory;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/Object;

    .line 23
    array-length v2, p3

    const/4 v3, 0x0

    :goto_6
    if-lt v3, v2, :cond_9

    goto :goto_17

    .line 28
    :cond_9
    aget-object v4, p3, v3

    invoke-virtual {v0, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    .line 29
    aput-object v1, p3, v3
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_13} :catch_17

    goto :goto_17

    :cond_14
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 36
    :catch_17
    :goto_17
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ParamDefaultFactory;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    invoke-virtual {v0, p1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
