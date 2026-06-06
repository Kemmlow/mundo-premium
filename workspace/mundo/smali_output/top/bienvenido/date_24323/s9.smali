.class public final Ltop/bienvenido/date_24323/s9;
.super Ljava/lang/Object;
.source "s9.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/q9;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ltop/bienvenido/date_24323/q9;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/q9;-><init>()V

    iput-object v0, p0, Ltop/bienvenido/date_24323/s9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/q9;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/accounts/Account;Ljava/lang/String;)Ltop/bienvenido/date_24323/r9;
    .registers 8

    .line 9
    iget-object v0, p0, Ltop/bienvenido/date_24323/s9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/q9;

    new-instance v1, Ltop/bienvenido/date_24323/o9;

    invoke-direct {v1, p1, p2}, Ltop/bienvenido/date_24323/o9;-><init>(Landroid/accounts/Account;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ltop/bienvenido/date_24323/q9;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ltop/bienvenido/date_24323/r9;

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    if-eqz p2, :cond_1a

    .line 11
    iget-wide v2, p2, Ltop/bienvenido/date_24323/r9;->要不要把你妈卵子扣出来给你做寿司吃:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_1a

    return-object p2

    :cond_1a
    const/4 v0, 0x0

    if-nez p2, :cond_1e

    return-object v0

    .line 17
    :cond_1e
    iget-object v1, p0, Ltop/bienvenido/date_24323/s9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/q9;

    iget-object p1, p1, Landroid/accounts/Account;->type:Ljava/lang/String;

    iget-object p2, p2, Ltop/bienvenido/date_24323/r9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    invoke-virtual {v1, p1, p2}, Ltop/bienvenido/date_24323/q9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
