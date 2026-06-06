.class public final Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了;
.super Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;
.source "\u4f60\u518d\u8fd9\u6837\u706b\u846c\u573a\u90a3\u8fb9\u8981\u6253\u7535\u8bdd\u95ee\u4f60\u5988\u51e0\u5206\u719f\u7684\u4e86.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 17
    new-instance v0, Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 16
    invoke-direct {p0}, Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function1;Landroid/app/servertransaction/ClientTransaction;)Lkotlin/Unit;
    .registers 5

    .line 97
    :try_start_0
    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;
    :try_end_6
    .catchall {:try_start_0 .. :try_end_6} :catchall_7

    goto :goto_8

    :catchall_7
    const/4 p0, 0x0

    :goto_8
    if-eqz p0, :cond_2a

    .line 100
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2a

    .line 101
    instance-of v0, p0, Landroid/app/servertransaction/LaunchActivityItem;

    if-eqz v0, :cond_20

    .line 102
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p3}, Landroid/app/servertransaction/ClientTransaction;->getActivityToken()Landroid/os/IBinder;

    move-result-object p2

    invoke-interface {p1, p0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_27

    .line 103
    :cond_20
    instance-of p1, p0, Landroid/app/servertransaction/NewIntentItem;

    if-eqz p1, :cond_27

    .line 104
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    :cond_27
    :goto_27
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 108
    :cond_2a
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/app/servertransaction/LaunchActivityItem;)Lkotlin/Unit;
    .registers 6

    .line 80
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getActivityToken"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v1, v2, [Ljava/lang/Object;

    .line 82
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;
    :try_end_19
    .catchall {:try_start_0 .. :try_end_19} :catchall_1a

    goto :goto_1b

    :catchall_1a
    const/4 v0, 0x0

    .line 86
    :goto_1b
    :try_start_1b
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/functions/Function2;

    invoke-interface {p0, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_22
    .catchall {:try_start_1b .. :try_end_22} :catchall_23

    goto :goto_27

    :catchall_23
    move-exception p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 90
    :goto_27
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 7

    .line 21
    sget-boolean v0, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度:Z

    if-nez v0, :cond_20

    .line 25
    sget-boolean v1, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->用搅拌机把你妈的阴扩一下:Z

    if-eqz v1, :cond_20

    .line 27
    :try_start_8
    const-class v0, Landroid/app/servertransaction/ClientTransactionItem;

    const-string v1, "getActivityToken"

    sget-object v2, Ltop/bienvenido/date_24323/g;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 29
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v0
    :try_end_1e
    .catchall {:try_start_8 .. :try_end_1e} :catchall_1f

    goto :goto_20

    :catchall_1f
    const/4 v0, 0x0

    .line 35
    :cond_20
    :goto_20
    new-instance v1, Ltop/bienvenido/date_24323/q3;

    const-class v2, Landroid/app/servertransaction/LaunchActivityItem;

    const-string v3, "mIntent"

    invoke-static {v2, v3}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Ltop/bienvenido/date_24323/s2;

    move-result-object v2

    const-class v3, Landroid/app/servertransaction/LaunchActivityItem;

    const-string v4, "mInfo"

    invoke-static {v3, v4}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Ltop/bienvenido/date_24323/s2;

    move-result-object v3

    const-class v4, Landroid/app/servertransaction/LaunchActivityItem;

    const-string v5, "mReferrer"

    invoke-static {v4, v5}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Ltop/bienvenido/date_24323/s2;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Ltop/bienvenido/date_24323/q3;-><init>(Ltop/bienvenido/date_24323/s2;Ltop/bienvenido/date_24323/s2;Ltop/bienvenido/date_24323/s2;)V

    .line 36
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 38
    sget-boolean v3, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼:Z

    if-eqz v3, :cond_4c

    .line 39
    new-instance v3, Ltop/bienvenido/date_24323/你是粪坑里无性繁殖来的一只蛆靠老子施舍的大粪苟活一时你爹因为操你瞎妈装逼不戴套鸡巴当时就切除了你婊子妈太脏了;

    invoke-direct {v3, v2, v1}, Ltop/bienvenido/date_24323/你是粪坑里无性繁殖来的一只蛆靠老子施舍的大粪苟活一时你爹因为操你瞎妈装逼不戴套鸡巴当时就切除了你婊子妈太脏了;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Ltop/bienvenido/date_24323/q3;)V

    move-object v1, v3

    .line 41
    :cond_4c
    iput-object v1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 42
    new-instance v1, Ltop/bienvenido/date_24323/p3;

    const-class v3, Landroid/app/servertransaction/NewIntentItem;

    const-string v4, "mIntents"

    invoke-static {v3, v4}, Ltop/bienvenido/date_24323/r2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Ltop/bienvenido/date_24323/s2;

    move-result-object v3

    invoke-direct {v1, v3}, Ltop/bienvenido/date_24323/p3;-><init>(Ltop/bienvenido/date_24323/s2;)V

    if-eqz v0, :cond_6d

    .line 44
    const-class v0, Landroid/app/servertransaction/LaunchActivityItem;

    new-instance v3, Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了$1;

    invoke-direct {v3, p0, v2}, Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了$1;-><init>(Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-static {v0, v3}, Ltop/bienvenido/date_24323/i4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V

    .line 55
    const-class v0, Landroid/app/servertransaction/NewIntentItem;

    invoke-static {v0, v1}, Ltop/bienvenido/date_24323/i4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V

    goto :goto_83

    .line 57
    :cond_6d
    sget-boolean v0, Ltop/bienvenido/date_24323/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Z

    if-eqz v0, :cond_74

    sget-object v0, Ltop/bienvenido/date_24323/前两天你祖宗咋没把你带走呢;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/前两天你祖宗咋没把你带走呢;

    goto :goto_79

    :cond_74
    new-instance v0, Ltop/bienvenido/date_24323/你亲妈今晚八点在空中翻腾七周半炸成一朵美丽烟花照亮整个台湾海峡;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/你亲妈今晚八点在空中翻腾七周半炸成一朵美丽烟花照亮整个台湾海峡;-><init>()V

    .line 58
    :goto_79
    const-class v3, Landroid/app/servertransaction/ClientTransaction;

    new-instance v4, Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了$2;

    invoke-direct {v4, p0, v0, v2, v1}, Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了$2;-><init>(Ltop/bienvenido/date_24323/你再这样火葬场那边要打电话问你妈几分熟的了;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$ObjectRef;Ltop/bienvenido/date_24323/p3;)V

    invoke-static {v3, v4}, Ltop/bienvenido/date_24323/i4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V

    :goto_83
    return-void
.end method
