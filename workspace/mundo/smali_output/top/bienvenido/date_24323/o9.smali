.class public final Ltop/bienvenido/date_24323/o9;
.super Ljava/lang/Object;
.source "o9.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/accounts/Account;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/accounts/Account;Ljava/lang/String;)V
    .registers 3

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ltop/bienvenido/date_24323/o9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/accounts/Account;

    .line 12
    iput-object p2, p0, Ltop/bienvenido/date_24323/o9;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    .line 16
    instance-of v0, p1, Ltop/bienvenido/date_24323/o9;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 19
    :cond_6
    check-cast p1, Ltop/bienvenido/date_24323/o9;

    .line 20
    iget-object v0, p0, Ltop/bienvenido/date_24323/o9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/accounts/Account;

    iget-object v2, p1, Ltop/bienvenido/date_24323/o9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/accounts/Account;

    invoke-static {v0, v2}, Ltop/bienvenido/date_24323/o9$$ExternalSyntheticBackport0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    iget-object v0, p0, Ltop/bienvenido/date_24323/o9;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    iget-object p1, p1, Ltop/bienvenido/date_24323/o9;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    invoke-static {v0, p1}, Ltop/bienvenido/date_24323/o9$$ExternalSyntheticBackport0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1d

    const/4 v1, 0x1

    :cond_1d
    return v1
.end method

.method public final hashCode()I
    .registers 3

    .line 24
    iget-object v0, p0, Ltop/bienvenido/date_24323/o9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/accounts/Account;

    invoke-virtual {v0}, Landroid/accounts/Account;->hashCode()I

    move-result v0

    iget-object v1, p0, Ltop/bienvenido/date_24323/o9;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
