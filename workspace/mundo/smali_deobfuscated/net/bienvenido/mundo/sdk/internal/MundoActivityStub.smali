.class public abstract Lnet/bienvenido/mundo/sdk/internal/MundoActivityStub;
.super Landroid/app/Activity;
.source "o3.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 9
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;Ltop/bienvenido/date_24323/p0;)Lkotlin/Unit;
    .registers 3

    .line 11
    invoke-interface {p2, p0, p1}, Ltop/bienvenido/date_24323/p0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;)V

    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .registers 2

    const/4 p1, 0x0

    .line 17
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 18
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/internal/MundoActivityStub;->finishAndRemoveTask()V

    return-void
.end method

.method public final onDestroy()V
    .registers 3

    .line 26
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 28
    :try_start_3
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/internal/MundoActivityStub;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 29
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼:Z

    if-eqz v1, :cond_e

    .line 30
    invoke-static {}, Lnet/bienvenido/mundo/sdk/internal/本野爹我用虎式坦克击落然后后空翻落地之后子宫炸裂一堆蛆虫看你妈的血逼很银荡便在你妈的血逼里筑了个巢;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    :try_end_e
    .catchall {:try_start_3 .. :try_end_e} :catchall_24

    :cond_e
    :try_start_e
    const-string v1, "user"

    .line 33
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_14} :catch_15
    .catchall {:try_start_e .. :try_end_14} :catchall_24

    goto :goto_16

    :catch_15
    const/4 v1, 0x0

    :goto_16
    if-eqz v1, :cond_24

    .line 37
    :try_start_18
    invoke-static {v0}, Lnet/bienvenido/mundo/sdk/internal/xxx烂得过你妈的骚逼么;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;)Lkotlin/Triple;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual {v0}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;
    :try_end_24
    .catchall {:try_start_18 .. :try_end_24} :catchall_24

    :catchall_24
    :cond_24
    return-void
.end method
