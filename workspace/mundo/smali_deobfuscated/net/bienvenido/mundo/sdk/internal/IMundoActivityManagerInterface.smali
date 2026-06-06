.class public abstract Lnet/bienvenido/mundo/sdk/internal/IMundoActivityManagerInterface;
.super Landroid/os/Binder;
.source "a0.java"

# interfaces
.implements Ltop/bienvenido/date_24323/c0;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 17
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "MundoActivityManagerService"

    .line 18
    invoke-virtual {p0, p0, v0}, Lnet/bienvenido/mundo/sdk/internal/IMundoActivityManagerInterface;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .registers 1

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string v0, "MundoActivityManagerService"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_d

    const v2, 0xffffff

    if-gt p1, v2, :cond_d

    .line 29
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_d
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_16

    .line 32
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_16
    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_1f0

    .line 137
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 132
    :pswitch_20
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/UserInfo;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    .line 133
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 134
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    return v1

    .line 129
    :pswitch_3a
    invoke-static {}, Lnet/bienvenido/mundo/sdk/internal/TaskRecord;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V

    return v1

    .line 124
    :pswitch_3e
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    .line 125
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 126
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 121
    :pswitch_53
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 116
    :pswitch_62
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-eqz p4, :cond_74

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p4

    move-object v2, p4

    check-cast v2, Landroid/content/Intent;

    :cond_74
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, v2, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Landroid/content/Intent;Ljava/lang/String;I)I

    move-result p1

    .line 117
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 118
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 113
    :pswitch_87
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/os/IBinder;)V

    return v1

    .line 110
    :pswitch_92
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_ac

    sget-object v0, Landroid/content/IntentFilter;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Landroid/content/IntentFilter;

    :cond_ac
    invoke-virtual {p1, p3, p4, v2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILandroid/os/IBinder;Landroid/content/IntentFilter;)V

    return v1

    .line 105
    :pswitch_b0
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(I)[Ljava/lang/String;

    move-result-object p1

    .line 106
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 107
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return v1

    .line 90
    :pswitch_c2
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(I)Ljava/util/ArrayList;

    move-result-object p1

    .line 91
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 92
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    .line 93
    invoke-virtual {p3, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p4, 0x0

    :goto_d8
    if-ge p4, p2, :cond_ef

    .line 95
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    if-eqz v2, :cond_e9

    .line 97
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 98
    invoke-interface {v2, p3, v1}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_ec

    .line 100
    :cond_e9
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_ec
    add-int/lit8 p4, p4, 0x1

    goto :goto_d8

    :cond_ef
    return v1

    .line 85
    :pswitch_f0
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    sget-object p4, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/UserInfo;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/ComponentName;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    .line 86
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 87
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    return v1

    .line 80
    :pswitch_10a
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_120

    sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Intent;

    :cond_120
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p4, v2, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;Landroid/os/IBinder;)Z

    move-result p1

    .line 81
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 82
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 75
    :pswitch_12f
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/os/IBinder;)Z

    move-result p1

    .line 76
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 77
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 70
    :pswitch_141
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/UserInfo;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, v0, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;)I

    move-result p1

    .line 71
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 72
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 65
    :pswitch_15f
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    sget-object p4, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/UserInfo;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/ComponentName;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, v0, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;Landroid/os/IBinder;I)Z

    move-result p1

    .line 66
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 67
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 60
    :pswitch_17d
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/UserInfo;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/lang/String;)I

    move-result p1

    .line 61
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 62
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 50
    :pswitch_197
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/UserInfo;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object p1

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_1b3

    .line 53
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 56
    :cond_1b3
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    invoke-virtual {p1, p3, v1}, Landroid/content/ComponentName;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 37
    :pswitch_1ba
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 38
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 39
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-gez p1, :cond_1ca

    move-object p1, v2

    goto :goto_1cc

    .line 40
    :cond_1ca
    new-array p1, p1, [Landroid/content/pm/ProviderInfo;

    .line 41
    :goto_1cc
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-gez p4, :cond_1d3

    goto :goto_1d5

    .line 42
    :cond_1d3
    new-array v2, p4, [Ljava/lang/String;

    :goto_1d5
    move-object p4, v2

    .line 43
    move-object v2, p0

    check-cast v2, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v7

    move-object v5, p1

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;[Landroid/content/pm/ProviderInfo;[Ljava/lang/String;I)Landroid/os/IBinder;

    move-result-object p2

    .line 44
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 45
    invoke-virtual {p3, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 46
    invoke-virtual {p3, p1, v1}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 47
    invoke-virtual {p3, p4}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return v1

    :pswitch_data_1f0
    .packed-switch 0x1
        :pswitch_1ba
        :pswitch_197
        :pswitch_17d
        :pswitch_15f
        :pswitch_141
        :pswitch_12f
        :pswitch_10a
        :pswitch_f0
        :pswitch_c2
        :pswitch_b0
        :pswitch_92
        :pswitch_87
        :pswitch_62
        :pswitch_53
        :pswitch_3e
        :pswitch_3a
        :pswitch_20
    .end packed-switch
.end method
