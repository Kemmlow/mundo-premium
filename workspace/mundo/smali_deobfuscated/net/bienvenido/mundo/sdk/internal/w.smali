.class public abstract Lnet/bienvenido/mundo/sdk/internal/w;
.super Landroid/os/Binder;
.source "w.java"

# interfaces
.implements Ltop/bienvenido/date_24323/y;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "MundoAccountManagerService"

    .line 15
    invoke-virtual {p0, p0, v0}, Lnet/bienvenido/mundo/sdk/internal/w;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .registers 1

    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "MundoAccountManagerService"

    const/4 v4, 0x1

    if-lt v0, v4, :cond_13

    const v5, 0xffffff

    if-gt v0, v5, :cond_13

    .line 26
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_13
    const v5, 0x5f4e5446

    if-ne v0, v5, :cond_1c

    .line 29
    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v4

    :cond_1c
    const/4 v3, 0x0

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_354

    .line 170
    invoke-super/range {p0 .. p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    .line 165
    :pswitch_26
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 166
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 167
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    return v4

    .line 160
    :pswitch_3d
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3}, Lnet/bienvenido/mundo/sdk/internal/x;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/accounts/Account;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-eqz v7, :cond_5b

    sget-object v5, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/Bundle;

    :cond_5b
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0, v3, v6, v5, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)Z

    move-result v0

    .line 161
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 162
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v4

    .line 156
    :pswitch_72
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_89

    sget-object v5, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/accounts/Account;

    :cond_89
    invoke-virtual {v0, v3, v5}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;)V

    .line 157
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 152
    :pswitch_90
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_a6

    sget-object v5, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/accounts/Account;

    :cond_a6
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v5, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;Ljava/lang/String;)V

    .line 153
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 148
    :pswitch_b1
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v5, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 143
    :pswitch_c8
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3}, Lnet/bienvenido/mundo/sdk/internal/x;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/accounts/Account;

    invoke-virtual {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/accounts/Account;)Z

    move-result v0

    .line 144
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 145
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v4

    .line 132
    :pswitch_df
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    .line 133
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_f2

    sget-object v6, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v6, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/accounts/Account;

    goto :goto_f3

    :cond_f2
    move-object v6, v5

    .line 134
    :goto_f3
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-eqz v7, :cond_101

    sget-object v5, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/Bundle;

    .line 136
    :cond_101
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_108

    const/4 v3, 0x1

    .line 139
    :cond_108
    move-object/from16 v1, p0

    check-cast v1, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual {v1, v0, v6, v5, v3}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;Landroid/os/Bundle;Z)V

    .line 140
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 122
    :pswitch_113
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    .line 123
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 125
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_122

    const/4 v3, 0x1

    .line 128
    :cond_122
    move-object/from16 v1, p0

    check-cast v1, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual {v1, v0, v5, v3}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;Z)V

    .line 129
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 118
    :pswitch_12d
    move-object/from16 v6, p0

    check-cast v6, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_145

    sget-object v0, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/accounts/Account;

    move-object v8, v0

    goto :goto_146

    :cond_145
    move-object v8, v5

    :goto_146
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_152

    const/4 v10, 0x1

    goto :goto_153

    :cond_152
    const/4 v10, 0x0

    :goto_153
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_162

    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/os/Bundle;

    :cond_162
    move-object v11, v5

    invoke-virtual/range {v6 .. v11}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;Ljava/lang/String;ZLandroid/os/Bundle;)V

    .line 119
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 114
    :pswitch_16a
    move-object/from16 v12, p0

    check-cast v12, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v13

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_187

    const/16 v17, 0x1

    goto :goto_189

    :cond_187
    const/16 v17, 0x0

    :goto_189
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_198

    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/os/Bundle;

    :cond_198
    move-object/from16 v18, v5

    invoke-virtual/range {v12 .. v18}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ZLandroid/os/Bundle;)V

    .line 115
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 110
    :pswitch_1a1
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-eqz v7, :cond_1b8

    sget-object v7, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v7, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/accounts/Account;

    goto :goto_1b9

    :cond_1b8
    move-object v7, v5

    :goto_1b9
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_1c5

    const/4 v9, 0x1

    goto :goto_1c6

    :cond_1c5
    const/4 v9, 0x0

    :goto_1c6
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v10

    if-eqz v10, :cond_1ce

    const/4 v10, 0x1

    goto :goto_1cf

    :cond_1ce
    const/4 v10, 0x0

    :goto_1cf
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_1de

    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/os/Bundle;

    :cond_1de
    move-object v11, v5

    move-object v5, v0

    invoke-virtual/range {v5 .. v11}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;Ljava/lang/String;ZZLandroid/os/Bundle;)V

    .line 111
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 106
    :pswitch_1e7
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3}, Lnet/bienvenido/mundo/sdk/internal/x;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/accounts/Account;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v5, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 102
    :pswitch_202
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3}, Lnet/bienvenido/mundo/sdk/internal/x;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/accounts/Account;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/accounts/Account;Ljava/lang/String;)V

    .line 103
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 98
    :pswitch_219
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3}, Lnet/bienvenido/mundo/sdk/internal/x;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/accounts/Account;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v5, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 93
    :pswitch_234
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3}, Lnet/bienvenido/mundo/sdk/internal/x;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/accounts/Account;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 94
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 95
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v4

    .line 89
    :pswitch_24f
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 83
    :pswitch_262
    sget-object v0, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/x;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/accounts/Account;

    if-nez v0, :cond_26d

    goto :goto_271

    .line 84
    :cond_26d
    invoke-static {v0}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/accounts/Account;)Z

    move-result v3

    .line 85
    :goto_271
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 86
    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeInt(I)V

    return v4

    .line 74
    :pswitch_278
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    .line 75
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_28a

    sget-object v5, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/accounts/Account;

    .line 76
    :cond_28a
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_291

    const/4 v3, 0x1

    .line 79
    :cond_291
    move-object/from16 v1, p0

    check-cast v1, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual {v1, v0, v5, v3}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;Z)V

    .line 80
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 70
    :pswitch_29c
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v5, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/os/IBinder;Ljava/lang/String;[Ljava/lang/String;)V

    .line 71
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 66
    :pswitch_2b3
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v5, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;[Ljava/lang/String;)V

    .line 67
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 62
    :pswitch_2ca
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_2e0

    sget-object v5, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/accounts/Account;

    :cond_2e0
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v5, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/accounts/Account;[Ljava/lang/String;)V

    .line 63
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    return v4

    .line 57
    :pswitch_2eb
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v0

    .line 58
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 59
    invoke-virtual {v2, v0, v4}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    return v4

    .line 50
    :pswitch_2fe
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 51
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    .line 52
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第()[Landroid/accounts/Account;

    move-result-object v0

    .line 53
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 54
    invoke-virtual {v2, v0, v4}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    return v4

    .line 45
    :pswitch_313
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机()[Landroid/accounts/AuthenticatorDescription;

    move-result-object v0

    .line 46
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 47
    invoke-virtual {v2, v0, v4}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    return v4

    .line 40
    :pswitch_322
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3}, Lnet/bienvenido/mundo/sdk/internal/x;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/accounts/Account;

    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 41
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 42
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v4

    .line 35
    :pswitch_33d
    move-object/from16 v0, p0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3}, Lnet/bienvenido/mundo/sdk/internal/x;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/accounts/Account;

    invoke-virtual {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/accounts/Account;)Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 37
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v4

    :pswitch_data_354
    .packed-switch 0x1
        :pswitch_33d
        :pswitch_322
        :pswitch_313
        :pswitch_2fe
        :pswitch_2eb
        :pswitch_2ca
        :pswitch_2b3
        :pswitch_29c
        :pswitch_278
        :pswitch_262
        :pswitch_24f
        :pswitch_234
        :pswitch_219
        :pswitch_202
        :pswitch_1e7
        :pswitch_1a1
        :pswitch_16a
        :pswitch_12d
        :pswitch_113
        :pswitch_df
        :pswitch_c8
        :pswitch_b1
        :pswitch_90
        :pswitch_72
        :pswitch_3d
        :pswitch_26
    .end packed-switch
.end method
