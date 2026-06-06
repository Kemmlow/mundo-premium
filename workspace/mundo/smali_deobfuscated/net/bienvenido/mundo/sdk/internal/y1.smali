.class public final Lnet/bienvenido/mundo/sdk/internal/y1;
.super Ljava/lang/Object;
.source "y1.java"

# interfaces
.implements Ltop/bienvenido/date_24323/i0;


# instance fields
.field public final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Lnet/bienvenido/mundo/sdk/internal/u1;

.field public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/x1;

.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/r1;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/r1;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageParser$Package;)V
    .registers 4

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/r1;

    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->activities:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lnet/bienvenido/mundo/sdk/internal/r1;-><init>(Lnet/bienvenido/mundo/sdk/internal/y1;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/y1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/r1;

    .line 18
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/r1;

    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->receivers:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lnet/bienvenido/mundo/sdk/internal/r1;-><init>(Lnet/bienvenido/mundo/sdk/internal/y1;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/y1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/r1;

    .line 19
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/x1;

    iget-object v1, p1, Landroid/content/pm/PackageParser$Package;->services:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lnet/bienvenido/mundo/sdk/internal/x1;-><init>(Lnet/bienvenido/mundo/sdk/internal/y1;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/y1;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/x1;

    .line 20
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/u1;

    iget-object p1, p1, Landroid/content/pm/PackageParser$Package;->providers:Ljava/util/ArrayList;

    invoke-direct {v0, p0, p1}, Lnet/bienvenido/mundo/sdk/internal/u1;-><init>(Lnet/bienvenido/mundo/sdk/internal/y1;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/y1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Lnet/bienvenido/mundo/sdk/internal/u1;

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/y1;Landroid/content/pm/ComponentInfo;Lkotlin/jvm/functions/Function2;Landroid/content/pm/PackageParser$IntentInfo;II)Landroid/content/pm/ResolveInfo;
    .registers 6

    .line 52
    iget-boolean p0, p1, Landroid/content/pm/ComponentInfo;->enabled:Z

    if-nez p0, :cond_a

    and-int/lit16 p0, p4, 0x200

    if-nez p0, :cond_a

    const/4 p0, 0x0

    return-object p0

    .line 55
    :cond_a
    new-instance p0, Landroid/content/pm/ResolveInfo;

    invoke-direct {p0}, Landroid/content/pm/ResolveInfo;-><init>()V

    and-int/lit8 p4, p4, 0x40

    if-eqz p4, :cond_15

    .line 57
    iput-object p3, p0, Landroid/content/pm/ResolveInfo;->filter:Landroid/content/IntentFilter;

    .line 59
    :cond_15
    iput p5, p0, Landroid/content/pm/ResolveInfo;->match:I

    .line 60
    iget-object p4, p3, Landroid/content/pm/PackageParser$IntentInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    iput-object p4, p0, Landroid/content/pm/ResolveInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 61
    invoke-virtual {p3}, Landroid/content/pm/PackageParser$IntentInfo;->getPriority()I

    move-result p4

    iput p4, p0, Landroid/content/pm/ResolveInfo;->priority:I

    .line 62
    iget p4, p3, Landroid/content/pm/PackageParser$IntentInfo;->icon:I

    iput p4, p0, Landroid/content/pm/ResolveInfo;->icon:I

    .line 63
    iget p4, p3, Landroid/content/pm/PackageParser$IntentInfo;->labelRes:I

    iput p4, p0, Landroid/content/pm/ResolveInfo;->labelRes:I

    .line 64
    iget-boolean p3, p3, Landroid/content/pm/PackageParser$IntentInfo;->hasDefault:Z

    iput-boolean p3, p0, Landroid/content/pm/ResolveInfo;->isDefault:Z

    .line 65
    invoke-interface {p2, p0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;
    .registers 6

    .line 25
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/y1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Lnet/bienvenido/mundo/sdk/internal/u1;

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v1, 0x10000

    and-int/2addr v1, p3

    if-eqz v1, :cond_c

    const/4 v1, 0x1

    goto :goto_d

    :cond_c
    const/4 v1, 0x0

    .line 27
    :goto_d
    invoke-virtual {v0, p1, p2, v1, p3}, Lnet/bienvenido/mundo/sdk/internal/u1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;ZI)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;
    .registers 6

    .line 32
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/y1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/r1;

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v1, 0x10000

    and-int/2addr v1, p3

    if-eqz v1, :cond_c

    const/4 v1, 0x1

    goto :goto_d

    :cond_c
    const/4 v1, 0x0

    .line 34
    :goto_d
    invoke-virtual {v0, p1, p2, v1, p3}, Lnet/bienvenido/mundo/sdk/internal/r1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;ZI)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;
    .registers 6

    .line 39
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/y1;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/r1;

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v1, 0x10000

    and-int/2addr v1, p3

    if-eqz v1, :cond_c

    const/4 v1, 0x1

    goto :goto_d

    :cond_c
    const/4 v1, 0x0

    .line 41
    :goto_d
    invoke-virtual {v0, p1, p2, v1, p3}, Lnet/bienvenido/mundo/sdk/internal/r1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;ZI)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;
    .registers 6

    .line 46
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/y1;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/x1;

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v1, 0x10000

    and-int/2addr v1, p3

    if-eqz v1, :cond_c

    const/4 v1, 0x1

    goto :goto_d

    :cond_c
    const/4 v1, 0x0

    .line 48
    :goto_d
    invoke-virtual {v0, p1, p2, v1, p3}, Lnet/bienvenido/mundo/sdk/internal/x1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;ZI)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
