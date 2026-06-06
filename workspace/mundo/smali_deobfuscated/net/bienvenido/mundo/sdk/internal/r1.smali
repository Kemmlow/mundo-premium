.class public final Lnet/bienvenido/mundo/sdk/internal/r1;
.super Lnet/bienvenido/mundo/sdk/internal/UriHook;
.source "r1.java"


# instance fields
.field public final 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:Lnet/bienvenido/mundo/sdk/internal/y1;


# direct methods
.method public constructor <init>(Lnet/bienvenido/mundo/sdk/internal/y1;Ljava/util/ArrayList;)V
    .registers 4

    .line 14
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/UriHook;-><init>()V

    .line 16
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/r1;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:Lnet/bienvenido/mundo/sdk/internal/y1;

    .line 17
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 18
    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_31

    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/pm/PackageParser$Activity;

    .line 20
    iget-object v0, p2, Landroid/content/pm/PackageParser$Activity;->info:Landroid/content/pm/ActivityInfo;

    if-eqz v0, :cond_9

    iget-object p2, p2, Landroid/content/pm/PackageParser$Activity;->intents:Ljava/util/ArrayList;

    if-eqz p2, :cond_9

    .line 21
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 22
    :goto_21
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 23
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/IntentFilter;

    invoke-virtual {p0, v0}, Lnet/bienvenido/mundo/sdk/internal/r1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/IntentFilter;)V

    goto :goto_21

    :cond_31
    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/IntentFilter;II)Ljava/lang/Object;
    .registers 14

    .line 31
    move-object v3, p1

    check-cast v3, Landroid/content/pm/PackageParser$ActivityIntentInfo;

    .line 32
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/r1;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:Lnet/bienvenido/mundo/sdk/internal/y1;

    iget-object p1, v3, Landroid/content/pm/PackageParser$ActivityIntentInfo;->activity:Landroid/content/pm/PackageParser$Activity;

    iget-object v1, p1, Landroid/content/pm/PackageParser$Activity;->info:Landroid/content/pm/ActivityInfo;

    new-instance v2, Lnet/bienvenido/mundo/sdk/internal/p1;

    new-instance p1, Lnet/bienvenido/mundo/sdk/internal/r1$1;

    const-class v6, Ljava/lang/Object;

    const-string v7, "dummy"

    const-string v8, "dummy"

    const/4 v9, 0x0

    move-object v4, p1

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Lnet/bienvenido/mundo/sdk/internal/r1$1;-><init>(Lnet/bienvenido/mundo/sdk/internal/r1;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-direct {v2, p1}, Lnet/bienvenido/mundo/sdk/internal/p1;-><init>(Ljava/lang/Object;)V

    move v4, p3

    move v5, p2

    invoke-static/range {v0 .. v5}, Lnet/bienvenido/mundo/sdk/internal/y1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/y1;Landroid/content/pm/ComponentInfo;Lkotlin/jvm/functions/Function2;Landroid/content/pm/PackageParser$IntentInfo;II)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    return-object p1
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/IntentFilter;)I
    .registers 3

    .line 45
    check-cast p1, Landroid/content/pm/PackageParser$ActivityIntentInfo;

    iget-object p1, p1, Landroid/content/pm/PackageParser$ActivityIntentInfo;->activity:Landroid/content/pm/PackageParser$Activity;

    iget-object p1, p1, Landroid/content/pm/PackageParser$Activity;->info:Landroid/content/pm/ActivityInfo;

    .line 46
    iget-object v0, p1, Landroid/content/pm/ActivityInfo;->targetActivity:Ljava/lang/String;

    if-nez v0, :cond_c

    .line 49
    iget-object v0, p1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 51
    :cond_c
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1
.end method
