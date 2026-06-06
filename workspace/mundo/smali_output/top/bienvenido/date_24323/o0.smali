.class public abstract Ltop/bienvenido/date_24323/o0;
.super Landroid/os/Binder;
.source "o0.java"

# interfaces
.implements Ltop/bienvenido/date_24323/p0;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 15
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "MundoWindowManagerService"

    .line 16
    invoke-virtual {p0, p0, v0}, Ltop/bienvenido/date_24323/o0;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .registers 1

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string v0, "MundoWindowManagerService"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_d

    const v2, 0xffffff

    if-gt p1, v2, :cond_d

    .line 27
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_d
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_16

    .line 30
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_16
    const/4 v0, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch p1, :pswitch_data_20a

    .line 163
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 160
    :pswitch_21
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    return v1

    .line 155
    :pswitch_25
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p1}, Ltop/bienvenido/date_24323/h6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈()Z

    move-result p1

    .line 156
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 157
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 150
    :pswitch_33
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p1}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/String;

    move-result-object p1

    .line 151
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 152
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 147
    :pswitch_41
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ltop/bienvenido/date_24323/h6;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;)V

    return v1

    .line 142
    :pswitch_4c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 143
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 144
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 139
    :pswitch_56
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Ltop/bienvenido/date_24323/h6;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 134
    :pswitch_65
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Ltop/bienvenido/date_24323/h6;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    .line 135
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 136
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 129
    :pswitch_7b
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Ltop/bienvenido/date_24323/h6;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第(Landroid/os/IBinder;)Ljava/lang/String;

    move-result-object p1

    .line 130
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 131
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 119
    :pswitch_8d
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;)Landroid/content/ComponentName;

    move-result-object p1

    .line 120
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_a1

    .line 122
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 125
    :cond_a1
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 126
    invoke-virtual {p1, p3, v1}, Landroid/content/ComponentName;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 115
    :pswitch_a8
    move-object v4, p0

    check-cast v4, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v5

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v9

    invoke-virtual/range {v4 .. v9}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 116
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 96
    :pswitch_c6
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, v4, v5, p2}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(JI)Ljava/util/List;

    move-result-object p1

    .line 97
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_de

    .line 99
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 102
    :cond_de
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    .line 103
    invoke-virtual {p3, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p4, 0x0

    :goto_e6
    if-ge p4, p2, :cond_fd

    .line 105
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    if-eqz v0, :cond_f7

    .line 107
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 108
    invoke-interface {v0, p3, v1}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_fa

    .line 110
    :cond_f7
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_fa
    add-int/lit8 p4, p4, 0x1

    goto :goto_e6

    :cond_fd
    return v1

    .line 77
    :pswitch_fe
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(J)Ljava/util/List;

    move-result-object p1

    .line 78
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_112

    .line 80
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 83
    :cond_112
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    .line 84
    invoke-virtual {p3, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p4, 0x0

    :goto_11a
    if-ge p4, p2, :cond_131

    .line 86
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    if-eqz v0, :cond_12b

    .line 88
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 89
    invoke-interface {v0, p3, v1}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_12e

    .line 91
    :cond_12b
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    :goto_12e
    add-int/lit8 p4, p4, 0x1

    goto :goto_11a

    :cond_131
    return v1

    .line 74
    :pswitch_132
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Ltop/bienvenido/date_24323/h6;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/os/IBinder;)V

    return v1

    .line 71
    :pswitch_13d
    move-object p1, v2

    check-cast p1, Landroid/content/pm/ActivityInfo;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p1, p2}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ActivityInfo;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 66
    :pswitch_14c
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Ltop/bienvenido/date_24323/h6;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    .line 67
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 68
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 63
    :pswitch_162
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p3

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/os/IBinder;)V

    return v1

    .line 53
    :pswitch_171
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-eqz p4, :cond_187

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Landroid/content/Intent;

    :cond_187
    invoke-virtual {p1, v4, v5, v2}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(JLandroid/content/Intent;)Landroid/content/Intent;

    move-result-object p1

    .line 54
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_194

    .line 56
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 59
    :cond_194
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 60
    invoke-virtual {p1, p3, v1}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 50
    :pswitch_19b
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_1ad

    sget-object p3, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p3, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Landroid/content/Intent;

    :cond_1ad
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;)V

    return v1

    .line 45
    :pswitch_1b5
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p4

    sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, v0, p2}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;[Landroid/content/Intent;I)[Landroid/content/Intent;

    move-result-object p1

    .line 46
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 47
    invoke-virtual {p3, p1, v1}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    return v1

    .line 35
    :pswitch_1d3
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/h6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1e9

    sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Intent;

    :cond_1e9
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    if-eqz p2, :cond_1f5

    const/4 p2, 0x1

    goto :goto_1f6

    :cond_1f5
    const/4 p2, 0x0

    :goto_1f6
    invoke-virtual {p1, p4, v2, v0, p2}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;IZ)Landroid/content/Intent;

    move-result-object p1

    .line 36
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_203

    .line 38
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 41
    :cond_203
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 42
    invoke-virtual {p1, p3, v1}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    :pswitch_data_20a
    .packed-switch 0x1
        :pswitch_1d3
        :pswitch_1b5
        :pswitch_19b
        :pswitch_171
        :pswitch_162
        :pswitch_14c
        :pswitch_13d
        :pswitch_132
        :pswitch_fe
        :pswitch_c6
        :pswitch_a8
        :pswitch_8d
        :pswitch_7b
        :pswitch_65
        :pswitch_56
        :pswitch_4c
        :pswitch_41
        :pswitch_33
        :pswitch_25
        :pswitch_21
    .end packed-switch
.end method
