.class public final Lnet/bienvenido/mundo/sdk/internal/q6;
.super Ljava/lang/Object;
.source "q6.java"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/r6;

.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Z


# direct methods
.method public constructor <init>(Lnet/bienvenido/mundo/sdk/internal/r6;Landroid/os/IBinder;Z)V
    .registers 4

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/q6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/r6;

    .line 12
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/q6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    .line 13
    iput-boolean p3, p0, Lnet/bienvenido/mundo/sdk/internal/q6;->要不要把你妈卵子扣出来给你做寿司吃:Z

    const/4 p1, 0x0

    .line 15
    :try_start_a
    invoke-interface {p2, p0, p1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_d} :catch_e

    goto :goto_11

    .line 17
    :catch_e
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/internal/q6;->binderDied()V

    :goto_11
    return-void
.end method


# virtual methods
.method public final binderDied()V
    .registers 3

    .line 24
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/q6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/r6;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/q6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/r6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;)Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_7} :catch_7

    :catch_7
    return-void
.end method
