.class public final Ltop/bienvenido/date_24323/f1;
.super Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;
.source "f1.java"


# static fields
.field public static final 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/i9;

.field public static final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ltop/bienvenido/date_24323/n2;

.field public static final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ltop/bienvenido/date_24323/n2;

.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/f1;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 15
    new-instance v0, Ltop/bienvenido/date_24323/f1;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/f1;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/f1;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/f1;

    .line 16
    new-instance v0, Ltop/bienvenido/date_24323/n2;

    const-string v1, "service"

    invoke-direct {v0, v1}, Ltop/bienvenido/date_24323/n2;-><init>(Ljava/lang/String;)V

    sput-object v0, Ltop/bienvenido/date_24323/f1;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ltop/bienvenido/date_24323/n2;

    .line 17
    new-instance v0, Ltop/bienvenido/date_24323/n2;

    const-string v1, "extras"

    invoke-direct {v0, v1}, Ltop/bienvenido/date_24323/n2;-><init>(Ljava/lang/String;)V

    sput-object v0, Ltop/bienvenido/date_24323/f1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ltop/bienvenido/date_24323/n2;

    .line 18
    new-instance v0, Ltop/bienvenido/date_24323/i9;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ltop/bienvenido/date_24323/i9;-><init>(I)V

    sput-object v0, Ltop/bienvenido/date_24323/f1;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/i9;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 14
    invoke-direct {p0}, Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;-><init>()V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;Ltop/bienvenido/date_24323/c0;)I
    .registers 5

    .line 65
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p0

    new-instance v0, Ltop/bienvenido/mundo/common/ext/MundoServiceConnection;

    const/4 v1, 0x0

    move-object v2, v1

    check-cast v2, Landroid/content/ServiceConnection;

    invoke-direct {v0, v1}, Ltop/bienvenido/mundo/common/ext/MundoServiceConnection;-><init>(Landroid/content/ServiceConnection;)V

    sget-object v1, Ltop/bienvenido/date_24323/c4;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/String;

    invoke-interface {p1, p0, v0, v1}, Ltop/bienvenido/date_24323/c0;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/app/job/JobInfo;)V
    .registers 7

    .line 32
    invoke-virtual {p0}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    move-result-object v0

    .line 33
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 34
    sget-object v2, Ltop/bienvenido/date_24323/z2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    .line 35
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    return-void

    .line 38
    :cond_11
    sget-object v1, Ltop/bienvenido/date_24323/f1;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/i9;

    .line 39
    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-virtual {v1, v3}, Ltop/bienvenido/date_24323/i9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Z

    move-result v3

    if-eqz v3, :cond_34

    .line 40
    sget-object v3, Ltop/bienvenido/date_24323/b4;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/b4;

    new-instance v4, Ltop/bienvenido/date_24323/f1$1;

    invoke-direct {v4, v0}, Ltop/bienvenido/date_24323/f1$1;-><init>(Landroid/content/ComponentName;)V

    invoke-virtual {v3, v4}, Ltop/bienvenido/date_24323/b4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 51
    iget v3, v1, Ltop/bienvenido/date_24323/i9;->要不要把你妈卵子扣出来给你做寿司吃:I

    const/16 v4, 0x80

    if-le v3, v4, :cond_34

    const/4 v3, 0x0

    .line 52
    iput v3, v1, Ltop/bienvenido/date_24323/i9;->要不要把你妈卵子扣出来给你做寿司吃:I

    .line 55
    :cond_34
    sget-object v1, Ltop/bienvenido/date_24323/f1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ltop/bienvenido/date_24323/n2;

    .line 56
    new-instance v3, Landroid/os/PersistableBundle;

    invoke-direct {v3}, Landroid/os/PersistableBundle;-><init>()V

    const-string v4, "mundo_base_bundle"

    .line 57
    invoke-virtual {p0}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/os/PersistableBundle;->putPersistableBundle(Ljava/lang/String;Landroid/os/PersistableBundle;)V

    const-string v4, "mundo_base_string"

    .line 58
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Landroid/os/PersistableBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 60
    iget-object v0, v1, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    invoke-virtual {v0, p0, v3}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    sget-object v0, Ltop/bienvenido/date_24323/f1;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ltop/bienvenido/date_24323/n2;

    iget-object v0, v0, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    new-instance v1, Landroid/content/ComponentName;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-class v4, Ltop/bienvenido/mundo/manifest/MundoService$Companion$STUB;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget v4, Ltop/bienvenido/date_24323/c4;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 5

    .line 22
    sget-object v0, Ltop/bienvenido/date_24323/q4;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ltop/bienvenido/date_24323/b2;

    .line 23
    iput-object v0, p0, Ltop/bienvenido/date_24323/f1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/a2;

    const-string v1, "jobscheduler"

    const/4 v2, 0x0

    .line 24
    invoke-static {v1, v0, v2}, Ltop/bienvenido/date_24323/t8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ltop/bienvenido/date_24323/a2;Ljava/lang/String;)Ltop/bienvenido/date_24323/a1;

    move-result-object v0

    if-nez v0, :cond_e

    return-void

    :cond_e
    const v1, -0x29996d69

    const v2, -0x5f0671f8

    const v3, 0x78d48add

    .line 28
    filled-new-array {v3, v1, v2}, [I

    move-result-object v1

    new-instance v2, Ltop/bienvenido/date_24323/e1;

    invoke-direct {v2}, Ltop/bienvenido/date_24323/e1;-><init>()V

    invoke-virtual {v0, v1, v2}, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILtop/bienvenido/date_24323/a2;)V

    return-void
.end method
