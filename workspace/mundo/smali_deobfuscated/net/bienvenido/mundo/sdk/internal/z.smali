.class public final Lnet/bienvenido/mundo/sdk/internal/z;
.super Ljava/lang/Object;
.source "z.java"

# interfaces
.implements Ltop/bienvenido/date_24323/c0;


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .registers 2

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .registers 2

    .line 21
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    return-object v0
.end method

.method public final 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(I)Ljava/util/ArrayList;
    .registers 9

    const/4 v0, 0x0

    .line 28
    :try_start_1
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/TaskRecord;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/ActivityStackSupervisor;

    .line 29
    monitor-enter v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_4} :catch_68

    .line 30
    :try_start_4
    iget-object v2, v1, Lnet/bienvenido/mundo/sdk/internal/ActivityStackSupervisor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {v2, p1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Ljava/lang/Object;

    move-result-object p1

    .line 31
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_4 .. :try_end_b} :catchall_65

    .line 32
    :try_start_b
    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

    .line 33
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 34
    iget-object v1, v1, Lnet/bienvenido/mundo/sdk/internal/ActivityStackSupervisor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    const/4 v3, 0x0

    .line 36
    :goto_15
    iget v4, v1, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    if-ge v3, v4, :cond_64

    .line 37
    iget-object v4, v1, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Object;

    aget-object v4, v4, v3

    check-cast v4, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

    if-eqz p1, :cond_35

    .line 38
    iget-object v5, p1, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/String;

    iget-object v6, v4, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/String;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_61

    iget-object v5, p1, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    iget-object v6, v4, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_61

    .line 41
    :cond_35
    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    iget-object v6, v4, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_40

    goto :goto_61

    .line 45
    :cond_40
    new-instance v5, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {v5}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 46
    iget-object v6, v4, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    iput-object v6, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 47
    iget v6, v4, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼:I

    iput v6, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    .line 48
    iget-object v4, v4, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    aput-object v4, v6, v0

    iput-object v6, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->pkgList:[Ljava/lang/String;

    .line 49
    sget v4, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    iput v4, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->uid:I

    const/16 v4, 0x64

    .line 50
    iput v4, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 51
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_61
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_61} :catch_68

    :cond_61
    :goto_61
    add-int/lit8 v3, v3, 0x1

    goto :goto_15

    :cond_64
    return-object v2

    :catchall_65
    move-exception p1

    .line 31
    :try_start_66
    monitor-exit v1
    :try_end_67
    .catchall {:try_start_66 .. :try_end_67} :catchall_65

    :try_start_67
    throw p1
    :try_end_68
    .catch Ljava/lang/Exception; {:try_start_67 .. :try_end_68} :catch_68

    .line 56
    :catch_68
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1
.end method

.method public final 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 6

    .line 182
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 183
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 185
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 186
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 189
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0xf

    const/4 v2, 0x0

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 190
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 191
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_22
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_22} :catch_2e
    .catchall {:try_start_8 .. :try_end_22} :catchall_2c

    if-eqz p1, :cond_25

    const/4 v2, 0x1

    .line 198
    :cond_25
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 199
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    :catchall_2c
    move-exception p1

    goto :goto_35

    :catch_2e
    move-exception p1

    .line 196
    :try_start_2f
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_35
    .catchall {:try_start_2f .. :try_end_35} :catchall_2c

    .line 198
    :goto_35
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 199
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 200
    throw p1
.end method

.method public final 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Landroid/content/Intent;Ljava/lang/String;I)I
    .registers 7

    .line 62
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 63
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 65
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p3, 0x0

    if-eqz p1, :cond_1b

    const/4 v2, 0x1

    .line 68
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    invoke-virtual {p1, v0, p3}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1e

    .line 71
    :cond_1b
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 73
    :goto_1e
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 74
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0xd

    invoke-interface {p1, p2, v0, v1, p3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 75
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 76
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_2f
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2f} :catch_38
    .catchall {:try_start_8 .. :try_end_2f} :catchall_36

    .line 80
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 81
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p1

    :catchall_36
    move-exception p1

    goto :goto_3f

    :catch_38
    move-exception p1

    .line 78
    :try_start_39
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3f
    .catchall {:try_start_39 .. :try_end_3f} :catchall_36

    .line 80
    :goto_3f
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 81
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 82
    throw p1
.end method

.method public final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/ComponentName;
    .registers 7

    .line 87
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 88
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 90
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_18

    const/4 v3, 0x1

    .line 92
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 95
    :cond_18
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 98
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x2

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 99
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 100
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_36

    sget-object p1, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p1, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ComponentName;
    :try_end_35
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_35} :catch_40
    .catchall {:try_start_8 .. :try_end_35} :catchall_3e

    goto :goto_37

    :cond_36
    const/4 p1, 0x0

    .line 104
    :goto_37
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 105
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_3e
    move-exception p1

    goto :goto_47

    :catch_40
    move-exception p1

    .line 102
    :try_start_41
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_47
    .catchall {:try_start_41 .. :try_end_47} :catchall_3e

    .line 104
    :goto_47
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 105
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 106
    throw p1
.end method

.method public final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃()V
    .registers 6

    .line 359
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoActivityManagerService"

    .line 361
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 362
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x10

    invoke-interface {v1, v4, v0, v2, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_12
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_12} :catch_18
    .catchall {:try_start_4 .. :try_end_12} :catchall_16

    .line 366
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_16
    move-exception v1

    goto :goto_1f

    :catch_18
    move-exception v1

    .line 364
    :try_start_19
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1f
    .catchall {:try_start_19 .. :try_end_1f} :catchall_16

    .line 366
    :goto_1f
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 367
    throw v1
.end method

.method public final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    .line 301
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoActivityManagerService"

    .line 303
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 304
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 305
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 306
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x0

    const/4 v1, 0x1

    const/16 v2, 0xe

    invoke-interface {p1, v2, v0, p2, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_18
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_18} :catch_1e
    .catchall {:try_start_4 .. :try_end_18} :catchall_1c

    .line 310
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_1c
    move-exception p1

    goto :goto_25

    :catch_1e
    move-exception p1

    .line 308
    :try_start_1f
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_25
    .catchall {:try_start_1f .. :try_end_25} :catchall_1c

    .line 310
    :goto_25
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 311
    throw p1
.end method

.method public final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(I)[Ljava/lang/String;
    .registers 6

    .line 283
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 284
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 286
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 287
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 288
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 v2, 0xa

    const/4 v3, 0x0

    invoke-interface {p1, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 289
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 290
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object p1
    :try_end_1f
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_1f} :catch_28
    .catchall {:try_start_8 .. :try_end_1f} :catchall_26

    .line 294
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 295
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_26
    move-exception p1

    goto :goto_2f

    :catch_28
    move-exception p1

    .line 292
    :try_start_29
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_2f
    .catchall {:try_start_29 .. :try_end_2f} :catchall_26

    .line 294
    :goto_2f
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 295
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 296
    throw p1
.end method

.method public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/IBinder;
    .registers 7

    .line 205
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 206
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 208
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_18

    const/4 v3, 0x1

    .line 210
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 211
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 213
    :cond_18
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 215
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 216
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x11

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 217
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 218
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1
    :try_end_2c
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2c} :catch_35
    .catchall {:try_start_8 .. :try_end_2c} :catchall_33

    .line 222
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 223
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_33
    move-exception p1

    goto :goto_3c

    :catch_35
    move-exception p1

    .line 220
    :try_start_36
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3c
    .catchall {:try_start_36 .. :try_end_3c} :catchall_33

    .line 222
    :goto_3c
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 223
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 224
    throw p1
.end method

.method public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/os/IBinder;)Z
    .registers 6

    .line 111
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 112
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 114
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 117
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-interface {p1, v2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 118
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 119
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_1e
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_1e} :catch_2a
    .catchall {:try_start_8 .. :try_end_1e} :catchall_28

    if-eqz p1, :cond_21

    const/4 v3, 0x1

    .line 126
    :cond_21
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 127
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v3

    :catchall_28
    move-exception p1

    goto :goto_31

    :catch_2a
    move-exception p1

    .line 124
    :try_start_2b
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_31
    .catchall {:try_start_2b .. :try_end_31} :catchall_28

    .line 126
    :goto_31
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 127
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 128
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;Ljava/lang/String;)Landroid/os/IBinder;
    .registers 7

    .line 372
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 373
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 375
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_18

    const/4 v3, 0x1

    .line 377
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 378
    invoke-virtual {p1, v0, v2}, Landroid/content/ComponentName;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 380
    :cond_18
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 382
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 383
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p2, 0x8

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 384
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 385
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1
    :try_end_2c
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2c} :catch_35
    .catchall {:try_start_8 .. :try_end_2c} :catchall_33

    .line 389
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 390
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_33
    move-exception p1

    goto :goto_3c

    :catch_35
    move-exception p1

    .line 387
    :try_start_36
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3c
    .catchall {:try_start_36 .. :try_end_3c} :catchall_33

    .line 389
    :goto_3c
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 390
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 391
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;[Landroid/content/pm/ProviderInfo;[Ljava/lang/String;I)Landroid/os/IBinder;
    .registers 9

    .line 133
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 134
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 136
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 137
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 138
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 139
    array-length p1, p3

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 140
    array-length p1, p4

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    invoke-virtual {v0, p5}, Landroid/os/Parcel;->writeInt(I)V

    .line 142
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x1

    const/4 p5, 0x0

    invoke-interface {p1, p2, v0, v1, p5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 143
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 144
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    .line 145
    sget-object p2, Landroid/content/pm/ProviderInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, p3, p2}, Landroid/os/Parcel;->readTypedArray([Ljava/lang/Object;Landroid/os/Parcelable$Creator;)V

    .line 146
    invoke-virtual {v1, p4}, Landroid/os/Parcel;->readStringArray([Ljava/lang/String;)V
    :try_end_34
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_34} :catch_3d
    .catchall {:try_start_8 .. :try_end_34} :catchall_3b

    .line 151
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 152
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1

    :catchall_3b
    move-exception p1

    goto :goto_44

    :catch_3d
    move-exception p1

    .line 149
    :try_start_3e
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_44
    .catchall {:try_start_3e .. :try_end_44} :catchall_3b

    .line 151
    :goto_44
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 152
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 153
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILandroid/os/IBinder;Landroid/content/IntentFilter;)V
    .registers 6

    .line 396
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoActivityManagerService"

    .line 398
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 399
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 400
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    if-eqz p3, :cond_1a

    .line 402
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 403
    invoke-virtual {p3, v0, p2}, Landroid/content/IntentFilter;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1d

    .line 405
    :cond_1a
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 407
    :goto_1d
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/16 p3, 0xb

    const/4 v1, 0x0

    invoke-interface {p2, p3, v0, v1, p1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_25
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_25} :catch_2b
    .catchall {:try_start_4 .. :try_end_25} :catchall_29

    .line 411
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_29
    move-exception p1

    goto :goto_32

    :catch_2b
    move-exception p1

    .line 409
    :try_start_2c
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_32
    .catchall {:try_start_2c .. :try_end_32} :catchall_29

    .line 411
    :goto_32
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 412
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;Landroid/os/IBinder;I)Z
    .registers 8

    .line 254
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 255
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 257
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_18

    .line 260
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 261
    invoke-virtual {p1, v0, v3}, Landroid/content/ComponentName;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 263
    :cond_18
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 265
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 266
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 267
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x4

    invoke-interface {p1, p2, v0, v1, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 268
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 269
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_2e
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2e} :catch_3a
    .catchall {:try_start_8 .. :try_end_2e} :catchall_38

    if-nez p1, :cond_31

    const/4 v2, 0x0

    .line 276
    :cond_31
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 277
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return v2

    :catchall_38
    move-exception p1

    goto :goto_41

    :catch_3a
    move-exception p1

    .line 274
    :try_start_3b
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_41
    .catchall {:try_start_3b .. :try_end_41} :catchall_38

    .line 276
    :goto_41
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 277
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 278
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;Landroid/os/IBinder;)Z
    .registers 7

    .line 330
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 331
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 333
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 334
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1b

    .line 337
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 338
    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1e

    .line 340
    :cond_1b
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 342
    :goto_1e
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 343
    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p3, 0x7

    invoke-interface {p2, p3, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 344
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 345
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p2
    :try_end_2e
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2e} :catch_3a
    .catchall {:try_start_8 .. :try_end_2e} :catchall_38

    if-nez p2, :cond_31

    const/4 p1, 0x0

    .line 352
    :cond_31
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 353
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p1

    :catchall_38
    move-exception p1

    goto :goto_41

    :catch_3a
    move-exception p1

    .line 350
    :try_start_3b
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_41
    .catchall {:try_start_3b .. :try_end_41} :catchall_38

    .line 352
    :goto_41
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 353
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 354
    throw p1
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;)I
    .registers 8

    .line 229
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 230
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 232
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_18

    const/4 v3, 0x1

    .line 234
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 235
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 237
    :cond_18
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 239
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 240
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 241
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x5

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 242
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 243
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_2e
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2e} :catch_37
    .catchall {:try_start_8 .. :try_end_2e} :catchall_35

    .line 247
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 248
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p1

    :catchall_35
    move-exception p1

    goto :goto_3e

    :catch_37
    move-exception p1

    .line 245
    :try_start_38
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3e
    .catchall {:try_start_38 .. :try_end_3e} :catchall_35

    .line 247
    :goto_3e
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 248
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 249
    throw p1
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/lang/String;)I
    .registers 7

    .line 158
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 159
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    :try_start_8
    const-string v2, "MundoActivityManagerService"

    .line 161
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_18

    const/4 v3, 0x1

    .line 163
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 164
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1b

    .line 166
    :cond_18
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 168
    :goto_1b
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 169
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 p2, 0x3

    invoke-interface {p1, p2, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 170
    invoke-virtual {v1}, Landroid/os/Parcel;->readException()V

    .line 171
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result p1
    :try_end_2b
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_2b} :catch_34
    .catchall {:try_start_8 .. :try_end_2b} :catchall_32

    .line 175
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 176
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p1

    :catchall_32
    move-exception p1

    goto :goto_3b

    :catch_34
    move-exception p1

    .line 173
    :try_start_35
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3b
    .catchall {:try_start_35 .. :try_end_3b} :catchall_32

    .line 175
    :goto_3b
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 176
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 177
    throw p1
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/os/IBinder;)V
    .registers 6

    .line 316
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_4
    const-string v1, "MundoActivityManagerService"

    .line 318
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 319
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 320
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0xc

    invoke-interface {p1, v3, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_15
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_15} :catch_1b
    .catchall {:try_start_4 .. :try_end_15} :catchall_19

    .line 324
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_19
    move-exception p1

    goto :goto_22

    :catch_1b
    move-exception p1

    .line 322
    :try_start_1c
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_22
    .catchall {:try_start_1c .. :try_end_22} :catchall_19

    .line 324
    :goto_22
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 325
    throw p1
.end method
