.class public final Ltop/bienvenido/date_24323/p5;
.super Ljava/lang/Object;
.source "p5.java"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/o5;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;Ltop/bienvenido/date_24323/o5;)V
    .registers 3

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ltop/bienvenido/date_24323/p5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    .line 12
    iput-object p2, p0, Ltop/bienvenido/date_24323/p5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/o5;

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ltop/bienvenido/date_24323/p5;Ltop/bienvenido/date_24323/o5;)V
    .registers 4

    const/4 v0, 0x0

    .line 17
    :try_start_1
    invoke-interface {p0, p1, v0}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 18
    invoke-static {p2}, Ltop/bienvenido/date_24323/q5;->要不要把你妈卵子扣出来给你做寿司吃(Ltop/bienvenido/date_24323/o5;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_7} :catch_7

    :catch_7
    return-void
.end method


# virtual methods
.method public final binderDied()V
    .registers 5

    .line 25
    sget-object v0, Ltop/bienvenido/date_24323/你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/concurrent/ExecutorService;

    .line 26
    iget-object v0, p0, Ltop/bienvenido/date_24323/p5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    .line 27
    iget-object v1, p0, Ltop/bienvenido/date_24323/p5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/o5;

    .line 28
    sget-object v2, Ltop/bienvenido/date_24323/你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ltop/bienvenido/date_24323/p5$1;

    invoke-direct {v3, p0, v0, v1}, Ltop/bienvenido/date_24323/p5$1;-><init>(Ltop/bienvenido/date_24323/p5;Landroid/os/IBinder;Ltop/bienvenido/date_24323/o5;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
