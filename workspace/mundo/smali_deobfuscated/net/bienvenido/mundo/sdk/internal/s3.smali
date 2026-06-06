.class public abstract Lnet/bienvenido/mundo/sdk/internal/s3;
.super Ljava/lang/Object;
.source "s3.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/util/Singleton;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 15
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3e

    .line 17
    :try_start_6
    const-class v0, Landroid/app/ActivityManager;

    const-string v3, "IActivityManagerSingleton"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 19
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_2f

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_2f

    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;

    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v3, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    invoke-direct {v1, v3, v4}, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;-><init>(J)V

    goto :goto_37

    :cond_2f
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;

    invoke-direct {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_34} :catch_35

    goto :goto_37

    .line 21
    :catch_35
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    .line 23
    :goto_37
    invoke-virtual {v1, v2}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Singleton;

    goto :goto_75

    .line 26
    :cond_3e
    :try_start_3e
    const-class v0, Landroid/app/ActivityManagerNative;

    const-string v3, "gDefault"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 28
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_67

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_67

    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;

    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v3, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    invoke-direct {v1, v3, v4}, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;-><init>(J)V

    goto :goto_6f

    :cond_67
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;

    invoke-direct {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/StaticFieldAccessor;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_6c
    .catch Ljava/lang/Exception; {:try_start_3e .. :try_end_6c} :catch_6d

    goto :goto_6f

    .line 30
    :catch_6d
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    .line 32
    :goto_6f
    invoke-virtual {v1, v2}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Singleton;

    .line 34
    :goto_75
    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/s3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/util/Singleton;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
