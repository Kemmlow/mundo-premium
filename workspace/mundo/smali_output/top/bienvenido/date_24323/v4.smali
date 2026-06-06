.class public final Ltop/bienvenido/date_24323/v4;
.super Ltop/bienvenido/date_24323/b2;
.source "v4.java"


# instance fields
.field public final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

.field public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lkotlin/jvm/functions/Function2;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lkotlin/jvm/functions/Function2;)V
    .registers 4

    .line 29
    invoke-direct {p0}, Ltop/bienvenido/date_24323/b2;-><init>()V

    .line 30
    sget-object v0, Ltop/bienvenido/date_24323/z2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    .line 31
    iput-object p1, p0, Ltop/bienvenido/date_24323/v4;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Class;

    .line 32
    iput-object p2, p0, Ltop/bienvenido/date_24323/v4;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lkotlin/jvm/functions/Function2;

    .line 33
    iput-object v0, p0, Ltop/bienvenido/date_24323/v4;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V
    .registers 4

    .line 11
    invoke-direct {p0}, Ltop/bienvenido/date_24323/b2;-><init>()V

    .line 12
    iput-object p1, p0, Ltop/bienvenido/date_24323/v4;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Class;

    .line 13
    iput-object p2, p0, Ltop/bienvenido/date_24323/v4;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lkotlin/jvm/functions/Function2;

    .line 14
    iput-object p3, p0, Ltop/bienvenido/date_24323/v4;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    .line 20
    :try_start_0
    iget-object v0, p0, Ltop/bienvenido/date_24323/v4;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Class;

    invoke-static {p3, v0}, Ltop/bienvenido/date_24323/a2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 22
    iget-object v1, p0, Ltop/bienvenido/date_24323/v4;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Ltop/bienvenido/date_24323/v4;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    invoke-interface {v1, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_0 .. :try_end_f} :catchall_f

    .line 26
    :catchall_f
    :cond_f
    invoke-super {p0, p1, p2, p3}, Ltop/bienvenido/date_24323/b2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
