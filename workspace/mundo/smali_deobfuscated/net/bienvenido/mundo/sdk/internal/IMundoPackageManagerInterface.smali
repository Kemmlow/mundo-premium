.class public abstract Lnet/bienvenido/mundo/sdk/internal/IMundoPackageManagerInterface;
.super Landroid/os/Binder;
.source "k0.java"

# interfaces
.implements Ltop/bienvenido/date_24323/m0;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 22
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "MundoPackageManagerService"

    .line 23
    invoke-virtual {p0, p0, v0}, Lnet/bienvenido/mundo/sdk/internal/IMundoPackageManagerInterface;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

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

    const-string v0, "MundoPackageManagerService"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_d

    const v2, 0xffffff

    if-gt p1, v2, :cond_d

    .line 35
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_d
    const v2, 0x5f4e5446

    if-ne p1, v2, :cond_16

    .line 38
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :cond_16
    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_368

    .line 262
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 257
    :pswitch_1f
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    sget-object p4, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/ComponentName;

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;)I

    move-result p1

    .line 258
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 259
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 253
    :pswitch_35
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    sget-object p4, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/ComponentName;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;I)V

    .line 254
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 249
    :pswitch_4b
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    sget-object p4, Landroid/content/pm/PackageManager$ComponentEnabledSetting;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, p4}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)V

    .line 250
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 244
    :pswitch_5b
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Ljava/lang/String;)Z

    move-result p1

    .line 245
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 246
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 241
    :pswitch_6d
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(I)V

    return v1

    .line 236
    :pswitch_78
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p1}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃()Ljava/util/ArrayList;

    move-result-object p1

    .line 237
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 238
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    return v1

    .line 231
    :pswitch_86
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;)Z

    move-result p1

    .line 232
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 233
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 227
    :pswitch_98
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Landroid/os/ConditionVariable;

    const-wide/16 v2, 0x2710

    invoke-virtual {p1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    .line 228
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 222
    :pswitch_a3
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 223
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 224
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return v1

    .line 219
    :pswitch_b5
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 216
    :pswitch_c4
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 211
    :pswitch_d3
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;I)I

    move-result p1

    .line 212
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 213
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 206
    :pswitch_e9
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Ljava/lang/String;)I

    move-result p1

    .line 207
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 208
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 201
    :pswitch_fb
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([I)[Ljava/lang/String;

    move-result-object p1

    .line 202
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 203
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return v1

    .line 196
    :pswitch_10d
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Ljava/lang/String;

    move-result-object p1

    .line 197
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 198
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 191
    :pswitch_11f
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈(I)[Ljava/lang/String;

    move-result-object p1

    .line 192
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 193
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return v1

    .line 186
    :pswitch_131
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样(Ljava/lang/String;)I

    move-result p1

    .line 187
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 188
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 183
    :pswitch_143
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼(Ljava/lang/String;)V

    return v1

    .line 178
    :pswitch_14e
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 179
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 180
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 173
    :pswitch_160
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    .line 174
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 175
    invoke-static {p3, p1, v1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Ljava/util/List;I)V

    return v1

    .line 163
    :pswitch_176
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第(Ljava/lang/String;)Landroid/content/pm/ProviderInfo;

    move-result-object p1

    .line 164
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_18a

    .line 166
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 169
    :cond_18a
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 170
    invoke-virtual {p1, p3, v1}, Landroid/content/pm/ProviderInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 158
    :pswitch_191
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(I)Ljava/util/ArrayList;

    move-result-object p1

    .line 159
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 160
    invoke-static {p3, p1, v1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Ljava/util/List;I)V

    return v1

    .line 153
    :pswitch_1a3
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(I)Ljava/util/ArrayList;

    move-result-object p1

    .line 154
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 155
    invoke-static {p3, p1, v1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Ljava/util/List;I)V

    return v1

    .line 148
    :pswitch_1b5
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, v0, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    .line 149
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 150
    invoke-static {p3, p1, v1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Ljava/util/List;I)V

    return v1

    .line 143
    :pswitch_1d3
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, v0, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    .line 144
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 145
    invoke-static {p3, p1, v1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Ljava/util/List;I)V

    return v1

    .line 133
    :pswitch_1f1
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, v2, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/CollectionUtils;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 134
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_21b

    .line 136
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 139
    :cond_21b
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 140
    invoke-virtual {p1, p3, v1}, Landroid/content/pm/ResolveInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 123
    :pswitch_222
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, v2, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/CollectionUtils;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 124
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_24c

    .line 126
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 129
    :cond_24c
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 130
    invoke-virtual {p1, p3, v1}, Landroid/content/pm/ResolveInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 118
    :pswitch_253
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, v0, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    .line 119
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 120
    invoke-static {p3, p1, v1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Ljava/util/List;I)V

    return v1

    .line 113
    :pswitch_271
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    sget-object p4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/Intent;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, v0, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    .line 114
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 115
    invoke-static {p3, p1, v1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Ljava/util/List;I)V

    return v1

    .line 103
    :pswitch_28f
    sget-object p1, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ComponentName;

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/content/ComponentName;)Landroid/content/pm/ComponentInfo;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ProviderInfo;

    .line 104
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_2a6

    .line 106
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 109
    :cond_2a6
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 110
    invoke-virtual {p1, p3, v1}, Landroid/content/pm/ProviderInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 93
    :pswitch_2ad
    sget-object p1, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ComponentName;

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/content/ComponentName;)Landroid/content/pm/ComponentInfo;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ServiceInfo;

    .line 94
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_2c4

    .line 96
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 99
    :cond_2c4
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 100
    invoke-virtual {p1, p3, v1}, Landroid/content/pm/ServiceInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 83
    :pswitch_2cb
    sget-object p1, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ComponentName;

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/content/ComponentName;)Landroid/content/pm/ComponentInfo;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ActivityInfo;

    .line 84
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_2e2

    .line 86
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 89
    :cond_2e2
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    invoke-virtual {p1, p3, v1}, Landroid/content/pm/ActivityInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 73
    :pswitch_2e9
    sget-object p1, Landroid/content/ComponentName;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lnet/bienvenido/mundo/sdk/internal/l0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ComponentName;

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/content/ComponentName;)Landroid/content/pm/ComponentInfo;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ActivityInfo;

    .line 74
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_300

    .line 76
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 79
    :cond_300
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    invoke-virtual {p1, p3, v1}, Landroid/content/pm/ActivityInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 63
    :pswitch_307
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    .line 64
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_31f

    .line 66
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 69
    :cond_31f
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    invoke-virtual {p1, p3, v1}, Landroid/content/pm/ApplicationInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 53
    :pswitch_326
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-virtual {p1, p4, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    .line 54
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-nez p1, :cond_33e

    .line 56
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 59
    :cond_33e
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 60
    invoke-virtual {p1, p3, v1}, Landroid/content/pm/PackageInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return v1

    .line 48
    :pswitch_345
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    .line 49
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 50
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 43
    :pswitch_356
    move-object p1, p0

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->用搅拌机把你妈的阴扩一下(Ljava/lang/String;)Z

    move-result p1

    .line 44
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 45
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_data_368
    .packed-switch 0x1
        :pswitch_356
        :pswitch_345
        :pswitch_326
        :pswitch_307
        :pswitch_2e9
        :pswitch_2cb
        :pswitch_2ad
        :pswitch_28f
        :pswitch_271
        :pswitch_253
        :pswitch_222
        :pswitch_1f1
        :pswitch_1d3
        :pswitch_1b5
        :pswitch_1a3
        :pswitch_191
        :pswitch_176
        :pswitch_160
        :pswitch_14e
        :pswitch_143
        :pswitch_131
        :pswitch_11f
        :pswitch_10d
        :pswitch_fb
        :pswitch_e9
        :pswitch_d3
        :pswitch_c4
        :pswitch_b5
        :pswitch_a3
        :pswitch_98
        :pswitch_86
        :pswitch_78
        :pswitch_6d
        :pswitch_5b
        :pswitch_4b
        :pswitch_35
        :pswitch_1f
    .end packed-switch
.end method
