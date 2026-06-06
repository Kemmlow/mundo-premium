.class public final Lnet/bienvenido/mundo/sdk/internal/v;
.super Ljava/lang/Object;
.source "v.java"

# interfaces
.implements Ltop/bienvenido/date_24323/y;


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .registers 2

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .registers 2

    .line 21
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    return-object v0
.end method

.method public final 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机()[Landroid/accounts/AuthenticatorDescription;
    .registers 6

    .line 26
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 27
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 29
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 30
    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 31
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 32
    sget-object v2, Landroid/accounts/AuthenticatorDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/accounts/AuthenticatorDescription;
    :try_end_1f
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_1f} :catch_28
    .catchall {:try_start_8 .. :try_end_1f} :catchall_26

    .line 36
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 37
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v2

    :catchall_26
    move-exception v2

    goto :goto_2f

    :catch_28
    move-exception v2

    .line 34
    :try_start_29
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_2f
    .catchall {:try_start_29 .. :try_end_2f} :catchall_26

    .line 36
    :goto_2f
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 37
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 38
    throw v2
.end method

.method public final 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;
    .registers 6

    .line 43
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 44
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 46
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 47
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 48
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 49
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x1a

    const/4 v2, 0x0

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 50
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 51
    const-class p1, Lnet/bienvenido/mundo/sdk/internal/v;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object p1
    :try_end_28
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_28} :catch_31
    .catchall {:try_start_8 .. :try_end_28} :catchall_2f

    .line 55
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 56
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_2f
    move-exception p1

    goto :goto_38

    :catch_31
    move-exception p1

    .line 53
    :try_start_32
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_38
    .catchall {:try_start_32 .. :try_end_38} :catchall_2f

    .line 55
    :goto_38
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 56
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 57
    throw p1
.end method

.method public final 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化(Ljava/lang/String;)[Landroid/accounts/Account;
    .registers 6

    .line 62
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 63
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 65
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 67
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-interface {p1, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 68
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 69
    sget-object p1, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, p1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/accounts/Account;
    :try_end_22
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_22} :catch_2b
    .catchall {:try_start_8 .. :try_end_22} :catchall_29

    .line 73
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 74
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_29
    move-exception p1

    goto :goto_32

    :catch_2b
    move-exception p1

    .line 71
    :try_start_2c
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_32
    .catchall {:try_start_2c .. :try_end_32} :catchall_29

    .line 73
    :goto_32
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 74
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 75
    throw p1
.end method

.method public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/accounts/Account;)Ljava/lang/String;
    .registers 6

    .line 80
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 81
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 83
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_18

    .line 85
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 86
    invoke-virtual {p1, v0, v3}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 88
    :cond_18
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    :goto_1b
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    invoke-interface {p1, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 91
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 92
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1
    :try_end_27
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_27} :catch_30
    .catchall {:try_start_8 .. :try_end_27} :catchall_2e

    .line 96
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 97
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_2e
    move-exception p1

    goto :goto_37

    :catch_30
    move-exception p1

    .line 94
    :try_start_31
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_37
    .catchall {:try_start_31 .. :try_end_37} :catchall_2e

    .line 96
    :goto_37
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 97
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 98
    throw p1
.end method

.method public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;
    .registers 7

    .line 189
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 190
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 192
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_18

    const/4 v3, 0x1

    .line 194
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 195
    invoke-virtual {p1, v0, v2}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 197
    :cond_18
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 199
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 200
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x2

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 201
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 202
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1
    :try_end_2b
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2b} :catch_34
    .catchall {:try_start_8 .. :try_end_2b} :catchall_32

    .line 206
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 207
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_32
    move-exception p1

    goto :goto_3b

    :catch_34
    move-exception p1

    .line 204
    :try_start_35
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3b
    .catchall {:try_start_35 .. :try_end_3b} :catchall_32

    .line 206
    :goto_3b
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 207
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 208
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/accounts/Account;Ljava/lang/String;)V
    .registers 7

    .line 352
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 353
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 355
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_18

    const/4 v3, 0x1

    .line 357
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 358
    invoke-virtual {p1, v0, v2}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 360
    :cond_18
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 362
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 363
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0xe

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 364
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_28
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_28} :catch_31
    .catchall {:try_start_8 .. :try_end_28} :catchall_2f

    .line 368
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 369
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_2f
    move-exception p1

    goto :goto_38

    :catch_31
    move-exception p1

    .line 366
    :try_start_32
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_38
    .catchall {:try_start_32 .. :try_end_38} :catchall_2f

    .line 368
    :goto_38
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 369
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 370
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V
    .registers 8

    .line 375
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 376
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 378
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_18

    const/4 v3, 0x1

    .line 380
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 381
    invoke-virtual {p1, v0, v2}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 383
    :cond_18
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 385
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 387
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0xf

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 388
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_2b
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2b} :catch_34
    .catchall {:try_start_8 .. :try_end_2b} :catchall_32

    .line 392
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 393
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_32
    move-exception p1

    goto :goto_3b

    :catch_34
    move-exception p1

    .line 390
    :try_start_35
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3b
    .catchall {:try_start_35 .. :try_end_3b} :catchall_32

    .line 392
    :goto_3b
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 393
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 394
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;)V
    .registers 6

    .line 581
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 582
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 584
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 585
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_1b

    const/4 v2, 0x1

    .line 587
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 588
    invoke-virtual {p2, v0, p1}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1e

    .line 590
    :cond_1b
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 592
    :goto_1e
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 v2, 0x18

    invoke-interface {p2, v2, v0, v1, p1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 593
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_28
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_28} :catch_31
    .catchall {:try_start_8 .. :try_end_28} :catchall_2f

    .line 597
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 598
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_2f
    move-exception p1

    goto :goto_38

    :catch_31
    move-exception p1

    .line 595
    :try_start_32
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_38
    .catchall {:try_start_32 .. :try_end_38} :catchall_2f

    .line 597
    :goto_38
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 598
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 599
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;Landroid/os/Bundle;Z)V
    .registers 8

    .line 508
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 509
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 511
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 512
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1b

    .line 514
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 515
    invoke-virtual {p2, v0, v2}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1e

    .line 517
    :cond_1b
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1e
    if-eqz p3, :cond_27

    .line 520
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 521
    invoke-virtual {p3, v0, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_2a

    .line 523
    :cond_27
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_2a
    if-eqz p4, :cond_2d

    goto :goto_2e

    :cond_2d
    const/4 p1, 0x0

    .line 525
    :goto_2e
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 526
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x14

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 527
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_3b
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_3b} :catch_44
    .catchall {:try_start_8 .. :try_end_3b} :catchall_42

    .line 531
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 532
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_42
    move-exception p1

    goto :goto_4b

    :catch_44
    move-exception p1

    .line 529
    :try_start_45
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_4b
    .catchall {:try_start_45 .. :try_end_4b} :catchall_42

    .line 531
    :goto_4b
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 532
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 533
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;Ljava/lang/String;)V
    .registers 7

    .line 557
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 558
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 560
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 561
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_1b

    const/4 v2, 0x1

    .line 563
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 564
    invoke-virtual {p2, v0, p1}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1e

    .line 566
    :cond_1b
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 568
    :goto_1e
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 569
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p3, 0x17

    invoke-interface {p2, p3, v0, v1, p1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 570
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_2b
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2b} :catch_34
    .catchall {:try_start_8 .. :try_end_2b} :catchall_32

    .line 574
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 575
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_32
    move-exception p1

    goto :goto_3b

    :catch_34
    move-exception p1

    .line 572
    :try_start_35
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3b
    .catchall {:try_start_35 .. :try_end_3b} :catchall_32

    .line 574
    :goto_3b
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 575
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 576
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;Ljava/lang/String;ZLandroid/os/Bundle;)V
    .registers 9

    .line 458
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 459
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 461
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 462
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1b

    .line 464
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 465
    invoke-virtual {p2, v0, v2}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1e

    .line 467
    :cond_1b
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 469
    :goto_1e
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    if-eqz p4, :cond_25

    const/4 p2, 0x1

    goto :goto_26

    :cond_25
    const/4 p2, 0x0

    .line 470
    :goto_26
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz p5, :cond_32

    .line 472
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 473
    invoke-virtual {p5, v0, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_35

    .line 475
    :cond_32
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 477
    :goto_35
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x12

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 478
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_3f
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_3f} :catch_48
    .catchall {:try_start_8 .. :try_end_3f} :catchall_46

    .line 482
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 483
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_46
    move-exception p1

    goto :goto_4f

    :catch_48
    move-exception p1

    .line 480
    :try_start_49
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_4f
    .catchall {:try_start_49 .. :try_end_4f} :catchall_46

    .line 482
    :goto_4f
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 483
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 484
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;Ljava/lang/String;ZZLandroid/os/Bundle;)V
    .registers 10

    .line 399
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 400
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 402
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 403
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1b

    .line 405
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 406
    invoke-virtual {p2, v0, v2}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1e

    .line 408
    :cond_1b
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 410
    :goto_1e
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    if-eqz p4, :cond_25

    const/4 p2, 0x1

    goto :goto_26

    :cond_25
    const/4 p2, 0x0

    .line 411
    :goto_26
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz p5, :cond_2d

    const/4 p2, 0x1

    goto :goto_2e

    :cond_2d
    const/4 p2, 0x0

    .line 412
    :goto_2e
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz p6, :cond_3a

    .line 414
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 415
    invoke-virtual {p6, v0, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_3d

    .line 417
    :cond_3a
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 419
    :goto_3d
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x10

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 420
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_47
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_47} :catch_50
    .catchall {:try_start_8 .. :try_end_47} :catchall_4e

    .line 424
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 425
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_4e
    move-exception p1

    goto :goto_57

    :catch_50
    move-exception p1

    .line 422
    :try_start_51
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_57
    .catchall {:try_start_51 .. :try_end_57} :catchall_4e

    .line 424
    :goto_57
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 425
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 426
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;Z)V
    .registers 7

    .line 232
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 233
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 235
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 236
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1b

    .line 238
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 239
    invoke-virtual {p2, v0, v2}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1e

    .line 241
    :cond_1b
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1e
    if-eqz p3, :cond_21

    goto :goto_22

    :cond_21
    const/4 p1, 0x0

    .line 243
    :goto_22
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 244
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x9

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 245
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_2f
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2f} :catch_38
    .catchall {:try_start_8 .. :try_end_2f} :catchall_36

    .line 249
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 250
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_36
    move-exception p1

    goto :goto_3f

    :catch_38
    move-exception p1

    .line 247
    :try_start_39
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3f
    .catchall {:try_start_39 .. :try_end_3f} :catchall_36

    .line 249
    :goto_3f
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 250
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 251
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;[Ljava/lang/String;)V
    .registers 7

    .line 103
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 104
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 106
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 107
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_1b

    const/4 v2, 0x1

    .line 109
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 110
    invoke-virtual {p2, v0, p1}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1e

    .line 112
    :cond_1b
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 114
    :goto_1e
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 115
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p3, 0x6

    invoke-interface {p2, p3, v0, v1, p1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 116
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_2a
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2a} :catch_33
    .catchall {:try_start_8 .. :try_end_2a} :catchall_31

    .line 120
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 121
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_31
    move-exception p1

    goto :goto_3a

    :catch_33
    move-exception p1

    .line 118
    :try_start_34
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3a
    .catchall {:try_start_34 .. :try_end_3a} :catchall_31

    .line 120
    :goto_3a
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 121
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 122
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V
    .registers 7

    .line 538
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 539
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 541
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 542
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 543
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 544
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 545
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x16

    const/4 p3, 0x0

    invoke-interface {p1, p2, v0, v1, p3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 546
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_21
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_21} :catch_2a
    .catchall {:try_start_8 .. :try_end_21} :catchall_28

    .line 550
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 551
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_28
    move-exception p1

    goto :goto_31

    :catch_2a
    move-exception p1

    .line 548
    :try_start_2b
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_31
    .catchall {:try_start_2b .. :try_end_31} :catchall_28

    .line 550
    :goto_31
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 551
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 552
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLandroid/os/Bundle;)V
    .registers 10

    .line 431
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 432
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 434
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 435
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 436
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 437
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 438
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    if-eqz p5, :cond_1f

    const/4 p3, 0x1

    goto :goto_20

    :cond_1f
    const/4 p3, 0x0

    .line 439
    :goto_20
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz p6, :cond_2c

    .line 441
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 442
    invoke-virtual {p6, v0, p2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_2f

    .line 444
    :cond_2c
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 446
    :goto_2f
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p3, 0x11

    invoke-interface {p1, p3, v0, v1, p2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 447
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_39
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_39} :catch_42
    .catchall {:try_start_8 .. :try_end_39} :catchall_40

    .line 451
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 452
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_40
    move-exception p1

    goto :goto_49

    :catch_42
    move-exception p1

    .line 449
    :try_start_43
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_49
    .catchall {:try_start_43 .. :try_end_49} :catchall_40

    .line 451
    :goto_49
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 452
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 453
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;Z)V
    .registers 7

    .line 489
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 490
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 492
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 493
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 494
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p3, :cond_18

    const/4 p2, 0x1

    goto :goto_19

    :cond_18
    const/4 p2, 0x0

    .line 495
    :goto_19
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 496
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p3, 0x13

    invoke-interface {p2, p3, v0, v1, p1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 497
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_26
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_26} :catch_2f
    .catchall {:try_start_8 .. :try_end_26} :catchall_2d

    .line 501
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 502
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_2d
    move-exception p1

    goto :goto_36

    :catch_2f
    move-exception p1

    .line 499
    :try_start_30
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_36
    .catchall {:try_start_30 .. :try_end_36} :catchall_2d

    .line 501
    :goto_36
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 502
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 503
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;[Ljava/lang/String;)V
    .registers 7

    .line 213
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 214
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 216
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 217
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 218
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 219
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 220
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x7

    const/4 p3, 0x0

    invoke-interface {p1, p2, v0, v1, p3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 221
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_20
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_20} :catch_29
    .catchall {:try_start_8 .. :try_end_20} :catchall_27

    .line 225
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 226
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_27
    move-exception p1

    goto :goto_30

    :catch_29
    move-exception p1

    .line 223
    :try_start_2a
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_30
    .catchall {:try_start_2a .. :try_end_30} :catchall_27

    .line 225
    :goto_30
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 226
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 227
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    .line 334
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 335
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 337
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 338
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 339
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 340
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0xb

    const/4 v2, 0x0

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 341
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_1e
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_1e} :catch_27
    .catchall {:try_start_8 .. :try_end_1e} :catchall_25

    .line 345
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 346
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_25
    move-exception p1

    goto :goto_2e

    :catch_27
    move-exception p1

    .line 343
    :try_start_28
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_2e
    .catchall {:try_start_28 .. :try_end_2e} :catchall_25

    .line 345
    :goto_2e
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 346
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 347
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/accounts/Account;)Z
    .registers 7

    .line 280
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 281
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 283
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_18

    .line 286
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 287
    invoke-virtual {p1, v0, v3}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 289
    :cond_18
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 291
    :goto_1b
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 v4, 0xa

    invoke-interface {p1, v4, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 292
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 293
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_29
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_29} :catch_35
    .catchall {:try_start_8 .. :try_end_29} :catchall_33

    if-nez p1, :cond_2c

    const/4 v2, 0x0

    .line 300
    :cond_2c
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 301
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    :catchall_33
    move-exception p1

    goto :goto_3c

    :catch_35
    move-exception p1

    .line 298
    :try_start_36
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3c
    .catchall {:try_start_36 .. :try_end_3c} :catchall_33

    .line 300
    :goto_3c
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 301
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 302
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)Z
    .registers 9

    .line 604
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 605
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 607
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_18

    .line 610
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 611
    invoke-virtual {p1, v0, v3}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 613
    :cond_18
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 615
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    if-eqz p3, :cond_27

    .line 617
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 618
    invoke-virtual {p3, v0, v3}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_2a

    .line 620
    :cond_27
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 622
    :goto_2a
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 623
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x19

    invoke-interface {p1, p2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 624
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 625
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_3b
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_3b} :catch_47
    .catchall {:try_start_8 .. :try_end_3b} :catchall_45

    if-nez p1, :cond_3e

    const/4 v2, 0x0

    .line 632
    :cond_3e
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 633
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    :catchall_45
    move-exception p1

    goto :goto_4e

    :catch_47
    move-exception p1

    .line 630
    :try_start_48
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_4e
    .catchall {:try_start_48 .. :try_end_4e} :catchall_45

    .line 632
    :goto_4e
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 633
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 634
    throw p1
.end method

.method public final 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第()[Landroid/accounts/Account;
    .registers 6

    .line 127
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 128
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 130
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 131
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 132
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 133
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v4, 0x4

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 134
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 135
    sget-object v2, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/accounts/Account;
    :try_end_26
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_26} :catch_2f
    .catchall {:try_start_8 .. :try_end_26} :catchall_2d

    .line 139
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 140
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v2

    :catchall_2d
    move-exception v2

    goto :goto_36

    :catch_2f
    move-exception v2

    .line 137
    :try_start_30
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_36
    .catchall {:try_start_30 .. :try_end_36} :catchall_2d

    .line 139
    :goto_36
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 140
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 141
    throw v2
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;
    .registers 7

    .line 165
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 166
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 168
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_18

    const/4 v3, 0x1

    .line 170
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 171
    invoke-virtual {p1, v0, v2}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 173
    :cond_18
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 175
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 176
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0xc

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 177
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 178
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1
    :try_end_2c
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2c} :catch_35
    .catchall {:try_start_8 .. :try_end_2c} :catchall_33

    .line 182
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 183
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_33
    move-exception p1

    goto :goto_3c

    :catch_35
    move-exception p1

    .line 180
    :try_start_36
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3c
    .catchall {:try_start_36 .. :try_end_3c} :catchall_33

    .line 182
    :goto_3c
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 183
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 184
    throw p1
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V
    .registers 8

    .line 256
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 257
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 259
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_18

    const/4 v3, 0x1

    .line 261
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 262
    invoke-virtual {p1, v0, v2}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 264
    :cond_18
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 266
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 267
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 268
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0xd

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 269
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_2b
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2b} :catch_34
    .catchall {:try_start_8 .. :try_end_2b} :catchall_32

    .line 273
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 274
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_32
    move-exception p1

    goto :goto_3b

    :catch_34
    move-exception p1

    .line 271
    :try_start_35
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3b
    .catchall {:try_start_35 .. :try_end_3b} :catchall_32

    .line 273
    :goto_3b
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 274
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 275
    throw p1
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/os/IBinder;Ljava/lang/String;[Ljava/lang/String;)V
    .registers 7

    .line 146
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 147
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 149
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 150
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 151
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 152
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 153
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x8

    const/4 p3, 0x0

    invoke-interface {p1, p2, v0, v1, p3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 154
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_21
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_21} :catch_2a
    .catchall {:try_start_8 .. :try_end_21} :catchall_28

    .line 158
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 159
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_28
    move-exception p1

    goto :goto_31

    :catch_2a
    move-exception p1

    .line 156
    :try_start_2b
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_31
    .catchall {:try_start_2b .. :try_end_31} :catchall_28

    .line 158
    :goto_31
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 159
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 160
    throw p1
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/accounts/Account;)Z
    .registers 7

    .line 307
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 308
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoAccountManagerService"

    .line 310
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_18

    .line 313
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 314
    invoke-virtual {p1, v0, v3}, Landroid/accounts/Account;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 316
    :cond_18
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 318
    :goto_1b
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/v;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 v4, 0x15

    invoke-interface {p1, v4, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 319
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 320
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_29
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_29} :catch_35
    .catchall {:try_start_8 .. :try_end_29} :catchall_33

    if-nez p1, :cond_2c

    const/4 v2, 0x0

    .line 327
    :cond_2c
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 328
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    :catchall_33
    move-exception p1

    goto :goto_3c

    :catch_35
    move-exception p1

    .line 325
    :try_start_36
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3c
    .catchall {:try_start_36 .. :try_end_3c} :catchall_33

    .line 327
    :goto_3c
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 328
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 329
    throw p1
.end method
