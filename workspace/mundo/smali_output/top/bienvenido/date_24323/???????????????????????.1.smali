.class public final Ltop/bienvenido/date_24323/只有强者才配拥有父母可惜你是孤儿本来就没有父母;
.super Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;
.source "\u53ea\u6709\u5f3a\u8005\u624d\u914d\u62e5\u6709\u7236\u6bcd\u53ef\u60dc\u4f60\u662f\u5b64\u513f\u672c\u6765\u5c31\u6ca1\u6709\u7236\u6bcd.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/只有强者才配拥有父母可惜你是孤儿本来就没有父母;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 10
    new-instance v0, Ltop/bienvenido/date_24323/只有强者才配拥有父母可惜你是孤儿本来就没有父母;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/只有强者才配拥有父母可惜你是孤儿本来就没有父母;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/只有强者才配拥有父母可惜你是孤儿本来就没有父母;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/只有强者才配拥有父母可惜你是孤儿本来就没有父母;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 9
    invoke-direct {p0}, Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 6

    .line 15
    const-class v0, Landroid/bluetooth/BluetoothAdapter;

    const-string v1, "sGetProfileConnectionStateCache"

    invoke-static {v0, v1}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Ltop/bienvenido/date_24323/s2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IpcDataCache;

    if-eqz v0, :cond_4d

    .line 16
    const-class v2, Landroid/bluetooth/BluetoothAdapter;

    const-string v3, "sBluetoothProfileQuery"

    invoke-static {v2, v3}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Ltop/bienvenido/date_24323/s2;

    move-result-object v2

    invoke-virtual {v2, v1}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IpcDataCache$QueryHandler;

    if-nez v1, :cond_22

    goto :goto_4d

    .line 19
    :cond_22
    const-class v2, Landroid/app/PropertyInvalidatedCache;

    const-string v3, "mComputer"

    invoke-static {v2, v3}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Ltop/bienvenido/date_24323/s2;

    move-result-object v2

    new-instance v3, Ltop/bienvenido/mundo/common/ext/ExtQueryHandler;

    invoke-direct {v3, v1}, Ltop/bienvenido/mundo/common/ext/ExtQueryHandler;-><init>(Landroid/os/IpcDataCache$QueryHandler;)V

    invoke-virtual {v2, v0, v3}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    :try_start_32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "clear"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v2, v3, [Ljava/lang/Object;

    .line 25
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_48
    .catchall {:try_start_32 .. :try_end_48} :catchall_49

    goto :goto_4d

    :catchall_49
    move-exception v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4d
    :goto_4d
    return-void
.end method
