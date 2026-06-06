.class public final Lnet/bienvenido/mundo/sdk/internal/y0;
.super Landroid/os/Binder;
.source "y0.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/y0;

.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    .line 14
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/y0;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/y0;-><init>()V

    .line 15
    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/y0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/y0;

    .line 16
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 17
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;

    .line 18
    invoke-virtual {v2}, Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 19
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    .line 20
    invoke-virtual {v2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 21
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    .line 22
    invoke-virtual {v2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 23
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;

    .line 24
    invoke-virtual {v2}, Lnet/bienvenido/mundo/sdk/internal/ContentServiceImpl;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 25
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;

    .line 26
    invoke-virtual {v2}, Lnet/bienvenido/mundo/sdk/internal/AccountServiceImpl;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    const-string v2, "https://www.62v.net/jnative/binder"

    .line 27
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 28
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 29
    sput-object v1, Lnet/bienvenido/mundo/sdk/internal/y0;->要不要把你妈卵子扣出来给你做寿司吃:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 9
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInterfaceDescriptor()Ljava/lang/String;
    .registers 2

    const-string v0, "https://www.62v.net/jnative/binder"

    return-object v0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/16 v0, 0x1b59

    if-eq p1, v0, :cond_9

    .line 41
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    :cond_9
    const/4 p1, 0x1

    .line 44
    :try_start_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    const-wide v2, -0x100000000L

    and-long/2addr v2, v0

    const/16 p2, 0x20

    ushr-long/2addr v2, p2

    long-to-int p2, v2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p4, v0

    .line 47
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/TaskRecord;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/ActivityStackSupervisor;

    .line 48
    monitor-enter v0
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_22} :catch_56

    .line 49
    :try_start_22
    iget-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/ActivityStackSupervisor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {v1, p4}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Ljava/lang/Object;

    move-result-object p4

    .line 50
    monitor-exit v0
    :try_end_29
    .catchall {:try_start_22 .. :try_end_29} :catchall_53

    .line 51
    :try_start_29
    check-cast p4, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

    const/4 v1, -0x1

    if-eqz p4, :cond_4f

    .line 54
    invoke-virtual {v0, p2}, Lnet/bienvenido/mundo/sdk/internal/ActivityStackSupervisor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

    if-eqz p2, :cond_4f

    .line 57
    iget-object v0, p2, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p4, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    if-ne v0, v1, :cond_47

    .line 58
    sget v1, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    goto :goto_4f

    .line 60
    :cond_47
    iget v1, p4, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:I

    .line 62
    iget p2, p2, Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:I

    if-ne v1, p2, :cond_4f

    .line 63
    sget v1, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    .line 68
    :cond_4f
    :goto_4f
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_52
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_52} :catch_56

    return p1

    :catchall_53
    move-exception p2

    .line 50
    :try_start_54
    monitor-exit v0
    :try_end_55
    .catchall {:try_start_54 .. :try_end_55} :catchall_53

    :try_start_55
    throw p2
    :try_end_56
    .catch Ljava/lang/Exception; {:try_start_55 .. :try_end_56} :catch_56

    :catch_56
    return p1
.end method
