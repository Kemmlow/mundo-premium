.class public Ltop/bienvenido/mundo/common/ext/MundoBleCallback;
.super Landroid/bluetooth/IBluetoothManagerCallback$Stub;
.source "MundoBleCallback.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Landroid/bluetooth/IBluetoothManagerCallback$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public onBluetoothOff()V
    .registers 1

    return-void
.end method

.method public onBluetoothOn()V
    .registers 1

    return-void
.end method

.method public onBluetoothServiceDown()V
    .registers 1

    return-void
.end method

.method public onBluetoothServiceUp(Landroid/bluetooth/IBluetooth;)V
    .registers 2

    return-void
.end method

.method public onBluetoothServiceUp(Landroid/os/IBinder;)V
    .registers 2

    return-void
.end method

.method public onBrEdrDown()V
    .registers 1

    return-void
.end method
