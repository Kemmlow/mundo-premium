.class public final Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;
.super Ljava/lang/Object;
.source "n0.java"

# interfaces
.implements Ltop/bienvenido/date_24323/p0;


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .registers 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .registers 2

    .line 20
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    return-object v0
.end method

.method public final 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/os/IBinder;)V
    .registers 6

    .line 25
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoWindowManagerService"

    .line 27
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 29
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x8

    invoke-interface {p1, v3, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_15
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_15} :catch_18
    .catchall {:try_start_4 .. :try_end_15} :catchall_16

    goto :goto_1c

    :catchall_16
    move-exception p1

    goto :goto_20

    :catch_18
    move-exception p1

    .line 31
    :try_start_19
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_1c
    .catchall {:try_start_19 .. :try_end_1c} :catchall_16

    .line 33
    :goto_1c
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_20
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 34
    throw p1
.end method

.method public final 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    .line 39
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoWindowManagerService"

    .line 41
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x0

    const/4 v1, 0x1

    const/16 v2, 0xf

    invoke-interface {p1, v2, v0, p2, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_18
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_18} :catch_1b
    .catchall {:try_start_4 .. :try_end_18} :catchall_19

    goto :goto_1f

    :catchall_19
    move-exception p1

    goto :goto_23

    :catch_1b
    move-exception p1

    .line 46
    :try_start_1c
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_1f
    .catchall {:try_start_1c .. :try_end_1f} :catchall_19

    .line 48
    :goto_1f
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_23
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 49
    throw p1
.end method

.method public final 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈(Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    .line 54
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoWindowManagerService"

    .line 56
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 59
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x7

    invoke-interface {p1, v2, v0, p2, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_17
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_17} :catch_1a
    .catchall {:try_start_4 .. :try_end_17} :catchall_18

    goto :goto_1e

    :catchall_18
    move-exception p1

    goto :goto_22

    :catch_1a
    move-exception p1

    .line 61
    :try_start_1b
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_1e
    .catchall {:try_start_1b .. :try_end_1e} :catchall_18

    .line 63
    :goto_1e
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_22
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 64
    throw p1
.end method

.method public final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/os/IBinder;)Z
    .registers 6

    .line 69
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 70
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_9
    const-string v3, "MundoWindowManagerService"

    .line 73
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 75
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 v3, 0x10

    invoke-interface {p1, v3, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 76
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 77
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_1f
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_1f} :catch_26
    .catchall {:try_start_9 .. :try_end_1f} :catchall_24

    if-eqz p1, :cond_2a

    const/4 p1, 0x1

    const/4 v2, 0x1

    goto :goto_2a

    :catchall_24
    move-exception p1

    goto :goto_31

    :catch_26
    move-exception p1

    .line 81
    :try_start_27
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_2a
    .catchall {:try_start_27 .. :try_end_2a} :catchall_24

    .line 83
    :cond_2a
    :goto_2a
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 84
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    .line 83
    :goto_31
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 84
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 85
    throw p1
.end method

.method public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;)V
    .registers 6

    .line 91
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoWindowManagerService"

    .line 93
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 95
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x11

    invoke-interface {p1, v3, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_15
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_15} :catch_18
    .catchall {:try_start_4 .. :try_end_15} :catchall_16

    goto :goto_1c

    :catchall_16
    move-exception p1

    goto :goto_20

    :catch_18
    move-exception p1

    .line 97
    :try_start_19
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_1c
    .catchall {:try_start_19 .. :try_end_1c} :catchall_16

    .line 99
    :goto_1c
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_20
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 100
    throw p1
.end method

.method public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈()Z
    .registers 6

    .line 174
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 175
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_9
    const-string v3, "MundoWindowManagerService"

    .line 178
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 179
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 v4, 0x13

    invoke-interface {v3, v4, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 180
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 181
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3
    :try_end_1c
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_1c} :catch_22
    .catchall {:try_start_9 .. :try_end_1c} :catchall_20

    if-eqz v3, :cond_26

    const/4 v2, 0x1

    goto :goto_26

    :catchall_20
    move-exception v2

    goto :goto_2d

    :catch_22
    move-exception v3

    .line 185
    :try_start_23
    invoke-virtual {v3}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_26
    .catchall {:try_start_23 .. :try_end_26} :catchall_20

    .line 187
    :cond_26
    :goto_26
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 188
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    .line 187
    :goto_2d
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 188
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 189
    throw v2
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;)Landroid/content/ComponentName;
    .registers 7

    .line 336
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 337
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_9
    const-string v3, "MundoWindowManagerService"

    .line 339
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 340
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 341
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 v3, 0xc

    const/4 v4, 0x0

    invoke-interface {p1, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 342
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 343
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_2b

    sget-object p1, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p1, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ComponentName;
    :try_end_2a
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_2a} :catch_34
    .catchall {:try_start_9 .. :try_end_2a} :catchall_32

    move-object v2, p1

    .line 348
    :cond_2b
    :goto_2b
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 349
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v2

    :catchall_32
    move-exception p1

    goto :goto_39

    :catch_34
    move-exception p1

    .line 345
    :try_start_35
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_38
    .catchall {:try_start_35 .. :try_end_38} :catchall_32

    goto :goto_2b

    .line 348
    :goto_39
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 349
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 350
    goto :goto_41

    :goto_40
    throw p1

    :goto_41
    goto :goto_40
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(JLandroid/content/Intent;)Landroid/content/Intent;
    .registers 8

    .line 236
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 237
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_9
    const-string v3, "MundoWindowManagerService"

    .line 239
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 240
    invoke-virtual {v0, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    const/4 p1, 0x0

    if-eqz p3, :cond_1c

    const/4 p2, 0x1

    .line 242
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 243
    invoke-virtual {p3, v0, p1}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1f

    .line 245
    :cond_1c
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 247
    :goto_1f
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p3, 0x4

    invoke-interface {p2, p3, v0, v1, p1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 248
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 249
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_37

    sget-object p1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p1, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;
    :try_end_36
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_36} :catch_40
    .catchall {:try_start_9 .. :try_end_36} :catchall_3e

    move-object v2, p1

    .line 254
    :cond_37
    :goto_37
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 255
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v2

    :catchall_3e
    move-exception p1

    goto :goto_45

    :catch_40
    move-exception p1

    .line 251
    :try_start_41
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_44
    .catchall {:try_start_41 .. :try_end_44} :catchall_3e

    goto :goto_37

    .line 254
    :goto_45
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 255
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 256
    goto :goto_4d

    :goto_4c
    throw p1

    :goto_4d
    goto :goto_4c
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;IZ)Landroid/content/Intent;
    .registers 9

    .line 105
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 106
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_9
    const-string v3, "MundoWindowManagerService"

    .line 108
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 109
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x1

    const/4 v3, 0x0

    if-eqz p2, :cond_1c

    .line 111
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 112
    invoke-virtual {p2, v0, v3}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1f

    .line 114
    :cond_1c
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    :goto_1f
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz p4, :cond_26

    const/4 p2, 0x1

    goto :goto_27

    :cond_26
    const/4 p2, 0x0

    .line 117
    :goto_27
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 118
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    invoke-interface {p2, p1, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 119
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 120
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_41

    sget-object p1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p1, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;
    :try_end_40
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_40} :catch_4a
    .catchall {:try_start_9 .. :try_end_40} :catchall_48

    move-object v2, p1

    .line 125
    :cond_41
    :goto_41
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 126
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v2

    :catchall_48
    move-exception p1

    goto :goto_4f

    :catch_4a
    move-exception p1

    .line 122
    :try_start_4b
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_4e
    .catchall {:try_start_4b .. :try_end_4e} :catchall_48

    goto :goto_41

    .line 125
    :goto_4f
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 126
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 127
    goto :goto_57

    :goto_56
    throw p1

    :goto_57
    goto :goto_56
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/String;
    .registers 6

    .line 355
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 356
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoWindowManagerService"

    .line 358
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 359
    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 v3, 0x12

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 360
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 361
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2
    :try_end_1c
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_1c} :catch_25
    .catchall {:try_start_8 .. :try_end_1c} :catchall_23

    .line 366
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 367
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object v2

    :catchall_23
    move-exception v2

    goto :goto_31

    :catch_25
    move-exception v2

    .line 363
    :try_start_26
    invoke-virtual {v2}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_29
    .catchall {:try_start_26 .. :try_end_29} :catchall_23

    .line 366
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 367
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    const/4 v0, 0x0

    return-object v0

    .line 366
    :goto_31
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 367
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 368
    throw v2
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(J)Ljava/util/List;
    .registers 6

    .line 276
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 277
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoWindowManagerService"

    .line 279
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 280
    invoke-virtual {v0, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 281
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x9

    const/4 v2, 0x0

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 282
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 283
    sget-object p1, Landroid/app/ActivityManager$RunningTaskInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, p1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1
    :try_end_21
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_21} :catch_2a
    .catchall {:try_start_8 .. :try_end_21} :catchall_28

    .line 288
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 289
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_28
    move-exception p1

    goto :goto_36

    :catch_2a
    move-exception p1

    .line 285
    :try_start_2b
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_2e
    .catchall {:try_start_2b .. :try_end_2e} :catchall_28

    .line 288
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 289
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    const/4 p1, 0x0

    return-object p1

    .line 288
    :goto_36
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 289
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 290
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(JI)Ljava/util/List;
    .registers 7

    .line 295
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 296
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoWindowManagerService"

    .line 298
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 299
    invoke-virtual {v0, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 300
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 301
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0xa

    const/4 p3, 0x0

    invoke-interface {p1, p2, v0, v1, p3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 302
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 303
    sget-object p1, Landroid/app/ActivityManager$RecentTaskInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, p1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1
    :try_end_24
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_24} :catch_2d
    .catchall {:try_start_8 .. :try_end_24} :catchall_2b

    .line 308
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 309
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_2b
    move-exception p1

    goto :goto_39

    :catch_2d
    move-exception p1

    .line 305
    :try_start_2e
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_31
    .catchall {:try_start_2e .. :try_end_31} :catchall_2b

    .line 308
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 309
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    const/4 p1, 0x0

    return-object p1

    .line 308
    :goto_39
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 309
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 310
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;)V
    .registers 6

    .line 216
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoWindowManagerService"

    .line 218
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_14

    .line 220
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 221
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_17

    .line 223
    :cond_14
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 225
    :goto_17
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 226
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x3

    const/4 v2, 0x0

    invoke-interface {p1, p2, v0, v2, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_21
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_21} :catch_24
    .catchall {:try_start_4 .. :try_end_21} :catchall_22

    goto :goto_28

    :catchall_22
    move-exception p1

    goto :goto_2c

    :catch_24
    move-exception p1

    .line 228
    :try_start_25
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_28
    .catchall {:try_start_25 .. :try_end_28} :catchall_22

    .line 230
    :goto_28
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_2c
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 231
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/os/IBinder;)V
    .registers 6

    .line 261
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoWindowManagerService"

    .line 263
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 264
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 265
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 266
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x5

    invoke-interface {p1, v2, v0, p2, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_17
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_17} :catch_1a
    .catchall {:try_start_4 .. :try_end_17} :catchall_18

    goto :goto_1e

    :catchall_18
    move-exception p1

    goto :goto_22

    :catch_1a
    move-exception p1

    .line 268
    :try_start_1b
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_1e
    .catchall {:try_start_1b .. :try_end_1e} :catchall_18

    .line 270
    :goto_1e
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_22
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 271
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .registers 9

    .line 315
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 316
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoWindowManagerService"

    .line 318
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 319
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 320
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 321
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 322
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 323
    invoke-virtual {v0, p5}, Landroid/os/Parcel;->writeInt(I)V

    .line 324
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0xb

    const/4 p3, 0x0

    invoke-interface {p1, p2, v0, v1, p3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 325
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    :try_end_27
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_27} :catch_2a
    .catchall {:try_start_8 .. :try_end_27} :catchall_28

    goto :goto_2e

    :catchall_28
    move-exception p1

    goto :goto_35

    :catch_2a
    move-exception p1

    .line 327
    :try_start_2b
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_2e
    .catchall {:try_start_2b .. :try_end_2e} :catchall_28

    .line 329
    :goto_2e
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 330
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    .line 329
    :goto_35
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 330
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 331
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)V
    .registers 6

    .line 373
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoWindowManagerService"

    .line 375
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 376
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 377
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x14

    invoke-interface {p1, v3, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_15
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_15} :catch_18
    .catchall {:try_start_4 .. :try_end_15} :catchall_16

    goto :goto_1c

    :catchall_16
    move-exception p1

    goto :goto_20

    :catch_18
    move-exception p1

    .line 379
    :try_start_19
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_1c
    .catchall {:try_start_19 .. :try_end_1c} :catchall_16

    .line 381
    :goto_1c
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_20
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 382
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;[Landroid/content/Intent;I)[Landroid/content/Intent;
    .registers 7

    .line 195
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 196
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoWindowManagerService"

    .line 198
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 199
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x0

    .line 200
    invoke-virtual {v0, p2, p1}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 201
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 202
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p3, 0x2

    invoke-interface {p2, p3, v0, v1, p1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 203
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 204
    sget-object p1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, p1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/content/Intent;
    :try_end_28
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_28} :catch_31
    .catchall {:try_start_8 .. :try_end_28} :catchall_2f

    .line 209
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 210
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_2f
    move-exception p1

    goto :goto_3d

    :catch_31
    move-exception p1

    .line 206
    :try_start_32
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_35
    .catchall {:try_start_32 .. :try_end_35} :catchall_2f

    .line 209
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 210
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    const/4 p1, 0x0

    return-object p1

    .line 209
    :goto_3d
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 210
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 211
    throw p1
.end method

.method public final 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第(Landroid/os/IBinder;)Ljava/lang/String;
    .registers 6

    .line 132
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 133
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoWindowManagerService"

    .line 135
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 136
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 137
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 v2, 0xd

    const/4 v3, 0x0

    invoke-interface {p1, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 138
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 139
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1
    :try_end_1f
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_1f} :catch_28
    .catchall {:try_start_8 .. :try_end_1f} :catchall_26

    .line 144
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 145
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_26
    move-exception p1

    goto :goto_34

    :catch_28
    move-exception p1

    .line 141
    :try_start_29
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_2c
    .catchall {:try_start_29 .. :try_end_2c} :catchall_26

    .line 144
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 145
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    const/4 p1, 0x0

    return-object p1

    .line 144
    :goto_34
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 145
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 146
    throw p1
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 7

    .line 151
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 152
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_9
    const-string v3, "MundoWindowManagerService"

    .line 155
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 156
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 157
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 158
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerBinderProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0xe

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 159
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 160
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_22
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_22} :catch_29
    .catchall {:try_start_9 .. :try_end_22} :catchall_27

    if-eqz p1, :cond_2d

    const/4 p1, 0x1

    const/4 v2, 0x1

    goto :goto_2d

    :catchall_27
    move-exception p1

    goto :goto_34

    :catch_29
    move-exception p1

    .line 164
    :try_start_2a
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_2d
    .catchall {:try_start_2a .. :try_end_2d} :catchall_27

    .line 166
    :cond_2d
    :goto_2d
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 167
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    .line 166
    :goto_34
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 167
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 168
    throw p1
.end method
