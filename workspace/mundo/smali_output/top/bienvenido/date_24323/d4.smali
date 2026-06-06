.class public final Ltop/bienvenido/date_24323/d4;
.super Ljava/lang/Object;
.source "d4.java"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/g4;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;Ltop/bienvenido/date_24323/g4;)V
    .registers 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Ltop/bienvenido/date_24323/d4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    .line 11
    iput-object p2, p0, Ltop/bienvenido/date_24323/d4;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/g4;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .registers 3

    .line 17
    :try_start_0
    iget-object v0, p0, Ltop/bienvenido/date_24323/d4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 18
    iget-object v0, p0, Ltop/bienvenido/date_24323/d4;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/g4;

    const/4 v1, 0x0

    iput-object v1, v0, Ltop/bienvenido/date_24323/g4;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/Object;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_b} :catch_b

    :catch_b
    return-void
.end method
