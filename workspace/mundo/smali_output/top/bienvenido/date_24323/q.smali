.class public abstract Ltop/bienvenido/date_24323/q;
.super Landroid/os/Binder;
.source "q.java"

# interfaces
.implements Ltop/bienvenido/date_24323/r;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 13
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "MundoAppThread"

    .line 14
    invoke-virtual {p0, p0, v0}, Ltop/bienvenido/date_24323/q;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method private readIntent(Landroid/os/Parcel;)Landroid/content/Intent;
    .registers 3

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1c

    .line 25
    sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    if-eqz p1, :cond_1b

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    :cond_1b
    return-object p1

    :cond_1c
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .registers 1

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string v0, "MundoAppThread"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_d

    const v2, 0xffffff

    if-gt p1, v2, :cond_d

    .line 38
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_d
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_16

    .line 41
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_16
    packed-switch p1, :pswitch_data_aa

    .line 103
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 91
    :pswitch_1e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    .line 92
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p3

    .line 93
    invoke-direct {p0, p2}, Ltop/bienvenido/date_24323/q;->readIntent(Landroid/os/Parcel;)Landroid/content/Intent;

    move-result-object p2

    if-eqz p3, :cond_30

    .line 96
    invoke-static {p2, p3}, Ltop/bienvenido/date_24323/w4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;)V

    goto :goto_33

    .line 98
    :cond_30
    invoke-static {p1, p2}, Ltop/bienvenido/date_24323/w4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;)V

    :goto_33
    return v1

    .line 84
    :pswitch_34
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 85
    move-object p2, p0

    check-cast p2, Ltop/bienvenido/date_24323/b6;

    invoke-virtual {p2, p1}, Ltop/bienvenido/date_24323/b6;->孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    .line 86
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 87
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    return v1

    .line 80
    :pswitch_46
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p1

    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    return v1

    .line 76
    :pswitch_4e
    move-object p1, p0

    check-cast p1, Ltop/bienvenido/date_24323/b6;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Ltop/bienvenido/date_24323/b6;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈(Landroid/os/IBinder;)V

    return v1

    .line 67
    :pswitch_59
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    .line 68
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p3

    .line 69
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    .line 70
    invoke-direct {p0, p2}, Ltop/bienvenido/date_24323/q;->readIntent(Landroid/os/Parcel;)Landroid/content/Intent;

    move-result-object p2

    .line 72
    move-object v0, p0

    check-cast v0, Ltop/bienvenido/date_24323/b6;

    invoke-virtual {v0, p3, p2, p1, p4}, Ltop/bienvenido/date_24323/b6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;I)V

    return v1

    .line 60
    :pswitch_70
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    .line 61
    invoke-direct {p0, p2}, Ltop/bienvenido/date_24323/q;->readIntent(Landroid/os/Parcel;)Landroid/content/Intent;

    move-result-object p2

    .line 62
    move-object p3, p0

    check-cast p3, Ltop/bienvenido/date_24323/b6;

    invoke-virtual {p3, p1, p2}, Ltop/bienvenido/date_24323/b6;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/os/IBinder;Landroid/content/Intent;)V

    return v1

    .line 54
    :pswitch_7f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    .line 55
    invoke-direct {p0, p2}, Ltop/bienvenido/date_24323/q;->readIntent(Landroid/os/Parcel;)Landroid/content/Intent;

    move-result-object p2

    .line 56
    move-object p3, p0

    check-cast p3, Ltop/bienvenido/date_24323/b6;

    invoke-virtual {p3, p1, p2}, Ltop/bienvenido/date_24323/b6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;)V

    return v1

    .line 46
    :pswitch_8e
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 47
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p3

    .line 48
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    if-eqz p2, :cond_a2

    const/4 p2, 0x1

    goto :goto_a3

    :cond_a2
    const/4 p2, 0x0

    .line 50
    :goto_a3
    move-object v0, p0

    check-cast v0, Ltop/bienvenido/date_24323/b6;

    invoke-virtual {v0, p1, p3, p4, p2}, Ltop/bienvenido/date_24323/b6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return v1

    :pswitch_data_aa
    .packed-switch 0x1
        :pswitch_8e
        :pswitch_7f
        :pswitch_70
        :pswitch_59
        :pswitch_4e
        :pswitch_46
        :pswitch_34
        :pswitch_1e
    .end packed-switch
.end method
