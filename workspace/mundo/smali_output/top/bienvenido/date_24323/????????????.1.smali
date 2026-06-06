.class public final Ltop/bienvenido/date_24323/在我今晚就把你妈墓碑掰弯;
.super Ltop/bienvenido/date_24323/a2;
.source "\u5728\u6211\u4eca\u665a\u5c31\u628a\u4f60\u5988\u5893\u7891\u63b0\u5f2f.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/obfclass2;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/a2;


# direct methods
.method public constructor <init>(Ltop/bienvenido/date_24323/obfclass2;Ltop/bienvenido/date_24323/a2;)V
    .registers 3

    .line 12
    invoke-direct {p0}, Ltop/bienvenido/date_24323/a2;-><init>()V

    .line 13
    iput-object p1, p0, Ltop/bienvenido/date_24323/在我今晚就把你妈墓碑掰弯;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/obfclass2;

    .line 14
    iput-object p2, p0, Ltop/bienvenido/date_24323/在我今晚就把你妈墓碑掰弯;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/a2;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    const/4 v0, 0x0

    .line 19
    aget-object v1, p3, v0

    .line 21
    :try_start_3
    instance-of v2, v1, Landroid/bluetooth/IBluetoothManagerCallback;

    if-eqz v2, :cond_22

    .line 22
    iget-object v2, p0, Ltop/bienvenido/date_24323/在我今晚就把你妈墓碑掰弯;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/obfclass2;

    invoke-virtual {v2, v1}, Ltop/bienvenido/date_24323/obfclass2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_20

    .line 25
    new-instance v2, Ltop/bienvenido/date_24323/扣你的卵子给你家哥哥做寿司吃去吧;

    move-object v3, v1

    check-cast v3, Landroid/bluetooth/IBluetoothManagerCallback;

    iget-object v4, p0, Ltop/bienvenido/date_24323/在我今晚就把你妈墓碑掰弯;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/a2;

    invoke-direct {v2, v3, v4}, Ltop/bienvenido/date_24323/扣你的卵子给你家哥哥做寿司吃去吧;-><init>(Landroid/bluetooth/IBluetoothManagerCallback;Ltop/bienvenido/date_24323/a2;)V

    .line 26
    iget-object v3, p0, Ltop/bienvenido/date_24323/在我今晚就把你妈墓碑掰弯;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/obfclass2;

    invoke-virtual {v3, v1, v2}, Ltop/bienvenido/date_24323/obfclass2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    :cond_20
    aput-object v2, p3, v0
    :try_end_22
    .catchall {:try_start_3 .. :try_end_22} :catchall_22

    :catchall_22
    :cond_22
    const/4 v0, 0x0

    .line 33
    :try_start_23
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_27} :catch_28

    goto :goto_2d

    :catch_28
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    move-object p1, v0

    :goto_2d
    if-nez p1, :cond_30

    return-object v0

    .line 37
    :cond_30
    iget-object p2, p0, Ltop/bienvenido/date_24323/在我今晚就把你妈墓碑掰弯;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/a2;

    invoke-static {p1, p2}, Ltop/bienvenido/date_24323/z0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ltop/bienvenido/date_24323/a2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
