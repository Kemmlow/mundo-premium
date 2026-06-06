.class public abstract Ltop/bienvenido/date_24323/i4;
.super Ljava/lang/Object;
.source "i4.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V
    .registers 5

    :try_start_0
    const-string v0, "CREATOR"

    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_28

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_28

    new-instance v0, Ltop/bienvenido/date_24323/q2;

    sget-object v1, Ltop/bienvenido/date_24323/t9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v1, p0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ltop/bienvenido/date_24323/q2;-><init>(J)V

    goto :goto_30

    :cond_28
    new-instance v0, Ltop/bienvenido/date_24323/p2;

    invoke-direct {v0, p0}, Ltop/bienvenido/date_24323/p2;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_2d} :catch_2e

    goto :goto_30

    .line 15
    :catch_2e
    sget-object v0, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/s2;

    .line 17
    :goto_30
    new-instance p0, Ltop/bienvenido/date_24323/j4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable$Creator;

    invoke-direct {p0, v2, p1}, Ltop/bienvenido/date_24323/j4;-><init>(Landroid/os/Parcelable$Creator;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, p0}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
