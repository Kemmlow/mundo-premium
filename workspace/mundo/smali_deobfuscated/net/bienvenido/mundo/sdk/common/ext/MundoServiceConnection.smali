.class public Lnet/bienvenido/mundo/sdk/common/ext/MundoServiceConnection;
.super Landroid/app/IServiceConnection$Stub;
.source "MundoServiceConnection.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>(Landroid/content/ServiceConnection;)V
    .registers 2

    .line 12
    invoke-direct {p0}, Landroid/app/IServiceConnection$Stub;-><init>()V

    .line 13
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/common/ext/MundoServiceConnection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/ServiceConnection;

    return-void
.end method


# virtual methods
.method public connected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .registers 4

    .line 17
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/common/ext/MundoServiceConnection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_a

    if-nez p2, :cond_7

    goto :goto_a

    .line 21
    :cond_7
    invoke-interface {v0, p1, p2}, Landroid/content/ServiceConnection;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    :cond_a
    :goto_a
    return-void
.end method

.method public connected(Landroid/content/ComponentName;Landroid/os/IBinder;Landroid/app/IBinderSession;Z)V
    .registers 5

    .line 25
    iget-object p3, p0, Lnet/bienvenido/mundo/sdk/common/ext/MundoServiceConnection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/ServiceConnection;

    if-eqz p3, :cond_a

    if-nez p2, :cond_7

    goto :goto_a

    .line 29
    :cond_7
    invoke-interface {p3, p1, p2}, Landroid/content/ServiceConnection;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    :cond_a
    :goto_a
    return-void
.end method

.method public connected(Landroid/content/ComponentName;Landroid/os/IBinder;Z)V
    .registers 4

    .line 33
    iget-object p3, p0, Lnet/bienvenido/mundo/sdk/common/ext/MundoServiceConnection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/ServiceConnection;

    if-eqz p3, :cond_a

    if-nez p2, :cond_7

    goto :goto_a

    .line 37
    :cond_7
    invoke-interface {p3, p1, p2}, Landroid/content/ServiceConnection;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    :cond_a
    :goto_a
    return-void
.end method
