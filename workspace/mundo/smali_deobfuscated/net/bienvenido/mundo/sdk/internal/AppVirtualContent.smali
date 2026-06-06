.class public final Lnet/bienvenido/mundo/sdk/internal/AppVirtualContent;
.super Ljava/lang/Object;
.source "d0.java"

# interfaces
.implements Ltop/bienvenido/date_24323/f0;


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .registers 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualContent;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .registers 2

    .line 17
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualContent;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    return-object v0
.end method

.method public final 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Landroid/os/IBinder;)V
    .registers 6

    .line 22
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 23
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoContentService"

    .line 25
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 27
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualContent;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-interface {p1, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_1a
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_1a} :catch_23
    .catchall {:try_start_8 .. :try_end_1a} :catchall_1b

    goto :goto_23

    :catchall_1b
    move-exception p1

    .line 32
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 33
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 34
    throw p1

    .line 32
    :catch_23
    :goto_23
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 33
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;Landroid/os/IBinder;Z)V
    .registers 8

    .line 39
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 40
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoContentService"

    .line 42
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_18

    .line 44
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 45
    invoke-virtual {p1, v0, v3}, Landroid/net/Uri;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 47
    :cond_18
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 49
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    if-eqz p3, :cond_21

    goto :goto_22

    :cond_21
    const/4 v2, 0x0

    .line 50
    :goto_22
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 51
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualContent;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x3

    invoke-interface {p1, p2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 52
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_2e
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2e} :catch_37
    .catchall {:try_start_8 .. :try_end_2e} :catchall_2f

    goto :goto_37

    :catchall_2f
    move-exception p1

    .line 56
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 57
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 58
    throw p1

    .line 56
    :catch_37
    :goto_37
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 57
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/net/Uri;Landroid/os/IBinder;Z)V
    .registers 8

    .line 63
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 64
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoContentService"

    .line 66
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_18

    .line 68
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    invoke-virtual {p1, v0, v3}, Landroid/net/Uri;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 71
    :cond_18
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1b
    if-eqz p3, :cond_1f

    const/4 p1, 0x1

    goto :goto_20

    :cond_1f
    const/4 p1, 0x0

    .line 73
    :goto_20
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 74
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 75
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualContent;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    invoke-interface {p1, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 76
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_2e
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2e} :catch_37
    .catchall {:try_start_8 .. :try_end_2e} :catchall_2f

    goto :goto_37

    :catchall_2f
    move-exception p1

    .line 80
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 81
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 82
    throw p1

    .line 80
    :catch_37
    :goto_37
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 81
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void
.end method
