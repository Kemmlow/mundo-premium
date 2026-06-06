.class public final Lnet/bienvenido/mundo/sdk/internal/ActivityResolveHelper;
.super Ljava/lang/Object;
.source "e4.java"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .registers 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/ActivityResolveHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .registers 8

    .line 15
    :try_start_0
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ActivityResolveHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/os/IBinder;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 16
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_20

    .line 17
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerServiceProxy;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerServiceProxy;

    invoke-virtual {v0}, Lnet/bienvenido/mundo/sdk/internal/MundoWindowManagerServiceProxy;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ltop/bienvenido/date_24323/p0;

    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;

    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/String;

    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/String;

    sget v6, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:I

    invoke-interface/range {v1 .. v6}, Ltop/bienvenido/date_24323/p0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_20} :catch_20

    :catch_20
    :cond_20
    return-void
.end method
