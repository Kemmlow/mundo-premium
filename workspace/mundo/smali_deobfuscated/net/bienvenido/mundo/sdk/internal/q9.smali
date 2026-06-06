.class public final Lnet/bienvenido/mundo/sdk/internal/q9;
.super Landroid/util/LruCache;
.source "q9.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/obfclass2;


# direct methods
.method public constructor <init>()V
    .registers 3

    const v0, 0xfa00

    .line 11
    invoke-direct {p0, v0}, Landroid/util/LruCache;-><init>(I)V

    .line 12
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;-><init>(I)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/q9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    .line 13
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;-><init>(I)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/q9;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    return-void
.end method


# virtual methods
.method public final entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 5

    .line 19
    check-cast p2, Lnet/bienvenido/mundo/sdk/internal/o9;

    .line 20
    check-cast p3, Lnet/bienvenido/mundo/sdk/internal/r9;

    .line 21
    check-cast p4, Lnet/bienvenido/mundo/sdk/internal/r9;

    if-eqz p3, :cond_23

    if-nez p4, :cond_23

    .line 22
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/q9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    new-instance p4, Landroid/util/Pair;

    iget-object p2, p2, Lnet/bienvenido/mundo/sdk/internal/o9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/accounts/Account;

    iget-object p2, p2, Landroid/accounts/Account;->type:Ljava/lang/String;

    iget-object p3, p3, Lnet/bienvenido/mundo/sdk/internal/r9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    invoke-direct {p4, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p4}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/p9;

    if-nez p1, :cond_20

    goto :goto_23

    .line 25
    :cond_20
    invoke-virtual {p1}, Lnet/bienvenido/mundo/sdk/internal/p9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V

    :cond_23
    :goto_23
    return-void
.end method

.method public final sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 30
    check-cast p2, Lnet/bienvenido/mundo/sdk/internal/r9;

    iget-object p1, p2, Lnet/bienvenido/mundo/sdk/internal/r9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    .line 53
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/q9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    new-instance v1, Landroid/util/Pair;

    invoke-direct {v1, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/p9;

    if-eqz p1, :cond_12

    .line 55
    invoke-virtual {p1}, Lnet/bienvenido/mundo/sdk/internal/p9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V

    :cond_12
    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/o9;Lnet/bienvenido/mundo/sdk/internal/r9;)V
    .registers 6

    .line 34
    new-instance v0, Landroid/util/Pair;

    iget-object v1, p1, Lnet/bienvenido/mundo/sdk/internal/o9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/accounts/Account;

    iget-object v1, v1, Landroid/accounts/Account;->type:Ljava/lang/String;

    iget-object v2, p2, Lnet/bienvenido/mundo/sdk/internal/r9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/q9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    invoke-virtual {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bienvenido/mundo/sdk/internal/p9;

    if-nez v1, :cond_1a

    .line 38
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/p9;

    invoke-direct {v1, p0}, Lnet/bienvenido/mundo/sdk/internal/p9;-><init>(Lnet/bienvenido/mundo/sdk/internal/q9;)V

    .line 40
    :cond_1a
    iget-object v2, v1, Lnet/bienvenido/mundo/sdk/internal/p9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/q9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    invoke-virtual {v2, v0, v1}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/q9;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    iget-object v1, p1, Lnet/bienvenido/mundo/sdk/internal/o9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/accounts/Account;

    invoke-virtual {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/p9;

    if-nez v0, :cond_35

    .line 45
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/p9;

    invoke-direct {v0, p0}, Lnet/bienvenido/mundo/sdk/internal/p9;-><init>(Lnet/bienvenido/mundo/sdk/internal/q9;)V

    .line 47
    :cond_35
    iget-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/p9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/q9;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    iget-object v2, p1, Lnet/bienvenido/mundo/sdk/internal/o9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/accounts/Account;

    invoke-virtual {v1, v2, v0}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    invoke-virtual {p0, p1, p2}, Lnet/bienvenido/mundo/sdk/internal/q9;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
