.class public abstract Lnet/bienvenido/mundo/sdk/internal/r4;
.super Ljava/lang/Object;
.source "r4.java"


# static fields
.field public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 62
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 63
    invoke-virtual {v0}, Landroid/content/Context;->getObbDir()Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_c

    .line 66
    invoke-virtual {v0}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    move-result-object v1

    .line 68
    :cond_c
    new-instance v0, Ljava/io/File;

    const-string v2, "scopedStorage"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/r4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/io/File;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 10

    .line 23
    :try_start_0
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    const-string v1, "storage"

    .line 24
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/storage/StorageManager;

    .line 25
    invoke-virtual {v0}, Landroid/content/Context;->getObbDirs()[Ljava/io/File;

    move-result-object v0

    .line 26
    sget-boolean v2, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_19

    .line 27
    invoke-virtual {v1}, Landroid/os/storage/StorageManager;->getStorageVolumes()Ljava/util/List;

    move-result-object v1
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_18} :catch_b5

    goto :goto_3a

    .line 30
    :cond_19
    :try_start_19
    const-class v2, Landroid/os/storage/StorageManager;

    const-string v5, "getVolumeList"

    sget-object v6, Lnet/bienvenido/mundo/sdk/internal/g;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Class;

    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 31
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 32
    new-instance v5, Lnet/bienvenido/mundo/sdk/internal/o2;

    invoke-direct {v5, v2}, Lnet/bienvenido/mundo/sdk/internal/o2;-><init>(Ljava/lang/reflect/Method;)V
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_2b} :catch_2c

    goto :goto_2e

    .line 34
    :catch_2c
    :try_start_2c
    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    :goto_2e
    new-array v2, v3, [Ljava/lang/Object;

    .line 36
    invoke-virtual {v5, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/os/storage/StorageVolume;

    invoke-static {v1}, Lkotlin/collections/ArraysKt;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1
    :try_end_3a
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_3a} :catch_b5

    .line 39
    :goto_3a
    :try_start_3a
    const-class v2, Landroid/os/storage/StorageVolume;

    const-string v5, "mPath"

    invoke-virtual {v2, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 40
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 41
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    and-int/lit8 v5, v5, 0x8

    if-nez v5, :cond_63

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    move-result v5

    if-nez v5, :cond_63

    new-instance v5, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;

    sget-object v6, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v6, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    invoke-direct {v5, v6, v7}, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;-><init>(J)V

    goto :goto_6b

    :cond_63
    new-instance v5, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;

    invoke-direct {v5, v2}, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_68
    .catch Ljava/lang/Exception; {:try_start_3a .. :try_end_68} :catch_69

    goto :goto_6b

    .line 43
    :catch_69
    :try_start_69
    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    .line 45
    :goto_6b
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/storage/StorageVolume;

    .line 46
    invoke-virtual {v2}, Landroid/os/storage/StorageVolume;->isRemovable()Z

    move-result v6

    if-eqz v6, :cond_6f

    invoke-virtual {v2}, Landroid/os/storage/StorageVolume;->getState()Ljava/lang/String;

    move-result-object v6

    const-string v7, "mounted"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6f

    invoke-virtual {v5, v2}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    if-eqz v2, :cond_6f

    .line 47
    array-length v6, v0

    const/4 v7, 0x0

    :goto_97
    if-ge v7, v6, :cond_6f

    .line 49
    aget-object v7, v0, v7

    .line 50
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b3

    .line 51
    new-instance v0, Ljava/io/File;

    const-string v1, "scopedStorage"

    invoke-direct {v0, v7, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/r4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/io/File;
    :try_end_b2
    .catch Ljava/lang/Exception; {:try_start_69 .. :try_end_b2} :catch_b5

    return-void

    :cond_b3
    const/4 v7, 0x1

    goto :goto_97

    :catch_b5
    :cond_b5
    return-void
.end method
