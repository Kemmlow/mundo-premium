.class public final Ltop/bienvenido/date_24323/p9;
.super Ljava/lang/Object;
.source "p9.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/ArrayList;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/q9;


# direct methods
.method public constructor <init>(Ltop/bienvenido/date_24323/q9;)V
    .registers 3

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltop/bienvenido/date_24323/p9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/ArrayList;

    .line 11
    iput-object p1, p0, Ltop/bienvenido/date_24323/p9;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/q9;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 4

    .line 15
    iget-object v0, p0, Ltop/bienvenido/date_24323/p9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 16
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_18

    .line 17
    iget-object v1, p0, Ltop/bienvenido/date_24323/p9;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/q9;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/bienvenido/date_24323/o9;

    invoke-virtual {v1, v2}, Ltop/bienvenido/date_24323/q9;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_18
    return-void
.end method
