.class public final Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;
.super Lnet/bienvenido/mundo/sdk/common/ext/MundoBleCallback;
.source "\u6263\u4f60\u7684\u5375\u5b50\u7ed9\u4f60\u5bb6\u54e5\u54e5\u505a\u5bff\u53f8\u5403\u53bb\u5427.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/bluetooth/IBluetoothManagerCallback;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;


# direct methods
.method public constructor <init>(Landroid/bluetooth/IBluetoothManagerCallback;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V
    .registers 3

    .line 13
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/common/ext/MundoBleCallback;-><init>()V

    .line 14
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/bluetooth/IBluetoothManagerCallback;

    .line 15
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    return-void
.end method


# virtual methods
.method public final onBluetoothOff()V
    .registers 2

    .line 20
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/bluetooth/IBluetoothManagerCallback;

    invoke-interface {v0}, Landroid/bluetooth/IBluetoothManagerCallback;->onBluetoothOff()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_5} :catch_5

    :catch_5
    return-void
.end method

.method public final onBluetoothOn()V
    .registers 2

    .line 27
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/bluetooth/IBluetoothManagerCallback;

    invoke-interface {v0}, Landroid/bluetooth/IBluetoothManagerCallback;->onBluetoothOn()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_5} :catch_5

    :catch_5
    return-void
.end method

.method public final onBluetoothServiceDown()V
    .registers 2

    .line 34
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/bluetooth/IBluetoothManagerCallback;

    invoke-interface {v0}, Landroid/bluetooth/IBluetoothManagerCallback;->onBluetoothServiceDown()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_5} :catch_5

    :catch_5
    return-void
.end method

.method public final onBluetoothServiceUp(Landroid/bluetooth/IBluetooth;)V
    .registers 4

    .line 41
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/bluetooth/IBluetoothManagerCallback;

    if-eqz p1, :cond_d

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    invoke-static {p1, v1}, Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/IBluetooth;

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    :goto_e
    invoke-interface {v0, p1}, Landroid/bluetooth/IBluetoothManagerCallback;->onBluetoothServiceUp(Landroid/bluetooth/IBluetooth;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_11} :catch_11

    :catch_11
    return-void
.end method

.method public final onBluetoothServiceUp(Landroid/os/IBinder;)V
    .registers 6

    .line 55
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/bluetooth/IBluetoothManagerCallback;

    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/BinderWrapper;

    invoke-static {p1}, Landroid/bluetooth/IBluetooth$Stub;->asInterface(Landroid/os/IBinder;)Landroid/bluetooth/IBluetooth;

    move-result-object v2

    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    invoke-static {v2, v3}, Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/IInterface;

    invoke-direct {v1, p1, v2}, Lnet/bienvenido/mundo/sdk/internal/BinderWrapper;-><init>(Landroid/os/IBinder;Landroid/os/IInterface;)V

    invoke-interface {v0, v1}, Landroid/bluetooth/IBluetoothManagerCallback;->onBluetoothServiceUp(Landroid/os/IBinder;)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_16} :catch_16

    :catch_16
    return-void
.end method

.method public final onBrEdrDown()V
    .registers 2

    .line 48
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/扣你的卵子给你家哥哥做寿司吃去吧;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/bluetooth/IBluetoothManagerCallback;

    invoke-interface {v0}, Landroid/bluetooth/IBluetoothManagerCallback;->onBrEdrDown()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_5} :catch_5

    :catch_5
    return-void
.end method
