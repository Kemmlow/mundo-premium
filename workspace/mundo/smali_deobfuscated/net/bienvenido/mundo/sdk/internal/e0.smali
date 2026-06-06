.class public abstract Lnet/bienvenido/mundo/sdk/internal/e0;
.super Landroid/os/Binder;
.source "e0.java"

# interfaces
.implements Ltop/bienvenido/date_24323/f0;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 13
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "MundoContentService"

    .line 14
    invoke-virtual {p0, p0, v0}, Lnet/bienvenido/mundo/sdk/internal/e0;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .registers 1

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string v0, "MundoContentService"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_d

    const v2, 0xffffff

    if-gt p1, v2, :cond_d

    .line 26
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_d
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_16

    .line 29
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_16
    const/4 v0, 0x0

    const/4 v2, 0x0

    if-ne p1, v1, :cond_3e

    .line 35
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_29

    sget-object p1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroid/net/Uri;

    .line 37
    :cond_29
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_30

    const/4 v2, 0x1

    .line 40
    :cond_30
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, v0, p2, v2}, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/net/Uri;Landroid/os/IBinder;Z)V

    .line 41
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :cond_3e
    const/4 v3, 0x2

    if-ne p1, v3, :cond_4f

    .line 45
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Landroid/os/IBinder;)V

    .line 46
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    :cond_4f
    const/4 v3, 0x3

    if-eq p1, v3, :cond_57

    .line 50
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 52
    :cond_57
    sget-object p1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 53
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-eqz p4, :cond_63

    .line 54
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    .line 56
    :cond_63
    check-cast v0, Landroid/net/Uri;

    .line 57
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    .line 58
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    if-eqz p2, :cond_70

    const/4 v2, 0x1

    .line 61
    :cond_70
    move-object p2, p0

    check-cast p2, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;

    invoke-virtual {p2, v0, p1, v2}, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;Landroid/os/IBinder;Z)V

    .line 62
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1
.end method
