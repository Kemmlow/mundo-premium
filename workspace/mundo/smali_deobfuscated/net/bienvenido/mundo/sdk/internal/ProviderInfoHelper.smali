.class public abstract Lnet/bienvenido/mundo/sdk/internal/ProviderInfoHelper;
.super Ljava/lang/Object;
.source "d1.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 11
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    if-eqz v0, :cond_7

    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/UserHandle;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/UserHandle;

    goto :goto_c

    :cond_7
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/PackageSetting;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/PackageSetting;-><init>()V

    :goto_c
    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/ProviderInfoHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;)Landroid/content/pm/ParceledListSlice;
    .registers 2

    .line 24
    :try_start_0
    new-instance v0, Landroid/content/pm/ParceledListSlice;

    invoke-direct {v0, p0}, Landroid/content/pm/ParceledListSlice;-><init>(Ljava/util/List;)V
    :try_end_5
    .catchall {:try_start_0 .. :try_end_5} :catchall_6

    return-object v0

    :catchall_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/util/List;
    .registers 2

    .line 16
    :try_start_0
    instance-of v0, p0, Landroid/content/pm/ParceledListSlice;

    if-nez v0, :cond_7

    :goto_4
    check-cast p0, Ljava/util/List;

    goto :goto_e

    :cond_7
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/ProviderInfoHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_d
    .catchall {:try_start_0 .. :try_end_d} :catchall_f

    goto :goto_4

    :goto_e
    return-object p0

    :catchall_f
    const/4 p0, 0x0

    return-object p0
.end method
