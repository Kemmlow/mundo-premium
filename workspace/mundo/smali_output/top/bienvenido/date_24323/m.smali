.class public final Ltop/bienvenido/date_24323/m;
.super Ltop/bienvenido/date_24323/a2;
.source "m.java"


# instance fields
.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/h8;


# direct methods
.method public constructor <init>(Ltop/bienvenido/date_24323/h8;)V
    .registers 2

    .line 15
    invoke-direct {p0}, Ltop/bienvenido/date_24323/a2;-><init>()V

    .line 16
    iput-object p1, p0, Ltop/bienvenido/date_24323/m;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/h8;

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    .line 21
    iget-object v0, p0, Ltop/bienvenido/date_24323/m;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/h8;

    invoke-virtual {v0, p1, p2, p3}, Ltop/bienvenido/date_24323/h8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 23
    :try_start_6
    instance-of p2, p1, Landroid/content/pm/ApplicationInfo;

    if-eqz p2, :cond_7f

    move-object p2, p1

    check-cast p2, Landroid/content/pm/ApplicationInfo;

    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    sget-object p3, Ltop/bienvenido/date_24323/c4;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7f

    sget-boolean p2, Ltop/bienvenido/date_24323/c4;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    if-nez p2, :cond_7f

    .line 24
    sget-object p2, Ltop/bienvenido/date_24323/x8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/n2;

    iget-object p2, p2, Ltop/bienvenido/date_24323/n2;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/s2;

    invoke-virtual {p2, p1}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-eqz p2, :cond_47

    .line 26
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 27
    :cond_2b
    :goto_2b
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_47

    const-string p3, "com.huawei.easygo"

    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/SharedLibraryInfo;

    invoke-virtual {v0}, Landroid/content/pm/SharedLibraryInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2b

    .line 29
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    goto :goto_2b

    .line 33
    :cond_47
    move-object p2, p1

    check-cast p2, Landroid/content/pm/ApplicationInfo;

    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;

    if-eqz p2, :cond_7f

    .line 34
    array-length p3, p2

    if-eqz p3, :cond_7f

    .line 35
    new-instance p3, Ljava/util/ArrayList;

    array-length v0, p2

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    array-length v0, p2

    const/4 v1, 0x0

    :goto_59
    if-ge v1, v0, :cond_6b

    aget-object v2, p2, v1

    const-string v3, "HwEasyGo.apk"

    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_68

    .line 38
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_68
    add-int/lit8 v1, v1, 0x1

    goto :goto_59

    .line 41
    :cond_6b
    array-length p2, p2

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eq p2, v0, :cond_7f

    .line 42
    move-object p2, p1

    check-cast p2, Landroid/content/pm/ApplicationInfo;

    sget-object v0, Ltop/bienvenido/date_24323/g;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:[Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/String;

    iput-object p3, p2, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;
    :try_end_7f
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_7f} :catch_7f

    :catch_7f
    :cond_7f
    return-object p1
.end method
