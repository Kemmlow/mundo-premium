.class public final Lnet/bienvenido/mundo/sdk/external/MetaStorageManager;
.super Ljava/lang/Object;
.source "MetaStorageManager.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static obtainAppDataDir(Ljava/lang/String;I)Ljava/io/File;
    .registers 2

    .line 24
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bienvenido/mundo/sdk/external/MetaStorageManager;->obtainAppDataDir(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static obtainAppDataDir(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .registers 5

    .line 11
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/VirtualFileSystem;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/io/File;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-static {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/CollectionUtils;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static obtainAppExternalStorageDir(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 15
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0}, Ltop/bienvenido/date_24323/m0;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static setExternalRootDirectory(Ljava/lang/String;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 20
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoPackageManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/m0;

    invoke-interface {v0, p0}, Ltop/bienvenido/date_24323/m0;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼(Ljava/lang/String;)V

    return-void
.end method
