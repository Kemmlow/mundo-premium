.class public final Ltop/bienvenido/date_24323/x2;
.super Ltop/bienvenido/date_24323/b2;
.source "x2.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 5
    invoke-direct {p0}, Ltop/bienvenido/date_24323/b2;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    .line 8
    invoke-super {p0, p1, p2, p3}, Ltop/bienvenido/date_24323/b2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_8

    const/4 p1, 0x0

    return-object p1

    .line 13
    :cond_8
    :try_start_8
    new-instance p2, Ltop/bienvenido/date_24323/a1;

    sget-object p3, Ltop/bienvenido/date_24323/q4;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ltop/bienvenido/date_24323/b2;

    invoke-direct {p2, p1, p3}, Ltop/bienvenido/date_24323/a1;-><init>(Ljava/lang/Object;Ltop/bienvenido/date_24323/a2;)V

    .line 14
    iget-object p3, p2, Ltop/bienvenido/date_24323/a1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/g9;

    new-instance v0, Ltop/bienvenido/date_24323/d6;

    new-instance v1, Ltop/bienvenido/date_24323/w2;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/w2;-><init>()V

    invoke-direct {v0, v1}, Ltop/bienvenido/date_24323/d6;-><init>(Lkotlin/jvm/functions/Function1;)V

    const v1, 0x143f1b92

    invoke-virtual {p3, v1, v0}, Ltop/bienvenido/date_24323/g9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 15
    iget-object p1, p2, Ltop/bienvenido/date_24323/a1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_23} :catch_23

    :catch_23
    return-object p1
.end method
