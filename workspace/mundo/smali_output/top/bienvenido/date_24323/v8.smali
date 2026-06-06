.class public final Ltop/bienvenido/date_24323/v8;
.super Ljava/lang/Object;
.source "v8.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/n2;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/n2;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ltop/bienvenido/date_24323/n2;

    const-string v1, "mAllFields"

    invoke-direct {v0, v1}, Ltop/bienvenido/date_24323/n2;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ltop/bienvenido/date_24323/v8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/n2;

    .line 9
    new-instance v0, Ltop/bienvenido/date_24323/n2;

    const-string v1, "mReadableFieldsWithMaxTargetSdk"

    invoke-direct {v0, v1}, Ltop/bienvenido/date_24323/n2;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ltop/bienvenido/date_24323/v8;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/n2;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;)V
    .registers 5

    :try_start_0
    const-string v0, "sNameValueCache"

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    const/4 v0, 0x1

    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 17
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_28

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_28

    new-instance v0, Ltop/bienvenido/date_24323/q2;

    sget-object v1, Ltop/bienvenido/date_24323/t9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v1, p1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ltop/bienvenido/date_24323/q2;-><init>(J)V

    goto :goto_30

    :cond_28
    new-instance v0, Ltop/bienvenido/date_24323/p2;

    invoke-direct {v0, p1}, Ltop/bienvenido/date_24323/p2;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_2d} :catch_2e

    goto :goto_30

    .line 19
    :catch_2e
    :try_start_2e
    sget-object v0, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/s2;

    :goto_30
    const/4 p1, 0x0

    .line 21
    invoke-virtual {v0, p1}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_38

    return-void

    .line 25
    :cond_38
    iget-object v0, p0, Ltop/bienvenido/date_24323/v8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/n2;

    iget-object v0, v0, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    invoke-virtual {v0, p1}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-eqz v0, :cond_47

    .line 27
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 29
    :cond_47
    iget-object v0, p0, Ltop/bienvenido/date_24323/v8;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/n2;

    iget-object v0, v0, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    invoke-virtual {v0, p1}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_56

    .line 31
    invoke-interface {p1}, Ljava/util/Map;->clear()V
    :try_end_56
    .catch Ljava/lang/Exception; {:try_start_2e .. :try_end_56} :catch_56

    :catch_56
    :cond_56
    return-void
.end method
