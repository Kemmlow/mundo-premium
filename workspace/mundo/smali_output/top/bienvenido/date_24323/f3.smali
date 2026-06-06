.class public final Ltop/bienvenido/date_24323/f3;
.super Ltop/bienvenido/mundo/common/ext/MundoAccountResponse;
.source "f3.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .registers 2

    .line 12
    invoke-direct {p0}, Ltop/bienvenido/mundo/common/ext/MundoAccountResponse;-><init>()V

    .line 13
    iput-object p1, p0, Ltop/bienvenido/date_24323/f3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final onError(ILjava/lang/String;)V
    .registers 3

    return-void
.end method

.method public final onResult(Landroid/os/Bundle;)V
    .registers 6

    const-string v0, "accounts"

    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_9

    return-void

    .line 24
    :cond_9
    array-length v0, p1

    .line 25
    new-array v1, v0, [Landroid/accounts/Account;

    const/4 v2, 0x0

    :goto_d
    if-ge v2, v0, :cond_18

    .line 27
    aget-object v3, p1, v2

    check-cast v3, Landroid/accounts/Account;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    .line 29
    :cond_18
    sget-object p1, Ltop/bienvenido/date_24323/k3;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/k3;

    .line 30
    iget-object v0, p0, Ltop/bienvenido/date_24323/f3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-static {v0, v1}, Ltop/bienvenido/date_24323/k3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;[Landroid/accounts/Account;)V

    return-void
.end method
