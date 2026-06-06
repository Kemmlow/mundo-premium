.class public final Ltop/bienvenido/mundo/manifest/MundoIntermediary;
.super Landroid/app/Activity;
.source "MundoIntermediary.java"


# instance fields
.field public 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 34
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 35
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ltop/bienvenido/date_24323/i9;Ltop/bienvenido/mundo/manifest/MundoIntermediary;Landroid/content/Intent;Ljava/util/ArrayList;Landroid/content/pm/PackageManager;)Lkotlin/Unit;
    .registers 11

    const/high16 v0, 0x20000

    .line 217
    invoke-virtual {p5, p0, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 218
    :cond_a
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_4b

    .line 219
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroid/content/pm/ResolveInfo;

    iget-object p5, p5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 220
    iget-object v0, p1, Ltop/bienvenido/date_24323/i9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    iget v1, p1, Ltop/bienvenido/date_24323/i9;->要不要把你妈卵子扣出来给你做寿司吃:I

    new-instance v2, Landroid/content/ComponentName;

    iget-object v3, p5, Landroid/content/pm/ComponentInfo;->packageName:Ljava/lang/String;

    iget-object v4, p5, Landroid/content/pm/ComponentInfo;->name:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/content/ComponentName;->hashCode()I

    move-result v2

    invoke-static {v0, v1, v2}, Ltop/bienvenido/date_24323/你爹菊花被肛烂了生出你这么个辣鸡玩意儿;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([III)I

    move-result v0

    if-gez v0, :cond_a

    iget-object v0, p5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p2}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_47

    invoke-virtual {p3}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "fbconnect"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 221
    :cond_47
    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 224
    :cond_4b
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/app/AlertDialog$Builder;)V
    .registers 1

    .line 247
    :try_start_0
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/ArrayList;Ltop/bienvenido/mundo/manifest/MundoIntermediary;Landroid/content/Intent;Lkotlin/Pair;Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/DialogInterface;I)V
    .registers 14

    const-string p6, "[Intermediary] User selected app: "

    .line 229
    :try_start_2
    invoke-virtual {p0, p7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Landroid/content/pm/ActivityInfo;

    const-string p0, "Mundo_Log"

    .line 230
    new-instance p7, Ljava/lang/StringBuilder;

    invoke-direct {p7, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p6, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p7, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-static {p0, p6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 231
    sget-object p0, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/n5;

    iget-object p6, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p0, p6}, Ltop/bienvenido/date_24323/n5;->用搅拌机把你妈的阴扩一下(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2e

    invoke-virtual {p3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    goto :goto_2f

    :cond_2e
    const/4 p0, 0x0

    :goto_2f
    move-object v2, p0

    move-object v0, p1

    move-object v1, p2

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;Landroid/content/pm/ActivityInfo;Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_37
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_37} :catch_38

    goto :goto_3b

    .line 233
    :catch_38
    invoke-virtual {p1, p5}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    :goto_3b
    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/DialogInterface;)V
    .registers 3

    .line 242
    invoke-virtual {p0, p1}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/DialogInterface;I)V
    .registers 4

    .line 238
    invoke-virtual {p0, p1}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .registers 3

    .line 39
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "Mundo_Log"

    const-string v0, "[Intermediary] onCreate"

    .line 40
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    invoke-virtual {p0}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->getIntent()Landroid/content/Intent;

    move-result-object p1

    iget-object v0, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0, p1, v0}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .registers 4

    .line 46
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    const-string v0, "Mundo_Log"

    const-string v1, "[Intermediary] onNewIntent"

    .line 47
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    iget-object v0, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 50
    iput-object v0, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    invoke-virtual {p0, p1, v0}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void
.end method

.method public final onPause()V
    .registers 1

    .line 56
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 57
    invoke-virtual {p0}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->finish()V

    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;Landroid/content/pm/ActivityInfo;Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .registers 11

    const-string v0, "Mundo_Log"

    const-string v1, "[Intermediary] Starting activity with flags: "

    .line 63
    :try_start_4
    new-instance v2, Landroid/content/ComponentName;

    iget-object v3, p3, Landroid/content/pm/ComponentInfo;->packageName:Ljava/lang/String;

    iget-object v4, p3, Landroid/content/pm/ComponentInfo;->name:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    if-eqz p2, :cond_20

    .line 65
    sget-object v2, Ltop/bienvenido/date_24323/h6;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/h6;

    .line 66
    invoke-static {p4, p1}, Ltop/bienvenido/date_24323/x0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p4

    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    invoke-static {p1, p2, p4, p3}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Landroid/content/pm/ActivityInfo;)Landroid/content/Intent;

    move-result-object p2

    goto :goto_21

    :cond_20
    const/4 p2, 0x0

    :goto_21
    if-eqz p2, :cond_24

    move-object p1, p2

    .line 75
    :cond_24
    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    move-result p2

    const/high16 p3, 0x10000000

    invoke-static {p2, p3}, Ltop/bienvenido/date_24323/n1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(II)Z

    move-result p2

    if-nez p2, :cond_35

    const/high16 p2, 0x2000000

    .line 76
    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 78
    :cond_35
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    invoke-virtual {p0, p1}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->startActivity(Landroid/content/Intent;)V

    .line 80
    invoke-virtual {p0, p5}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    :try_end_4f
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4f} :catch_50

    goto :goto_6a

    :catch_50
    move-exception p1

    .line 82
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "[Intermediary] Crash in routing: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    invoke-virtual {p0, p5}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    :goto_6a
    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .registers 20

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-object/from16 v9, p2

    const-string v10, "Mundo_Log"

    const-string v1, "[Intermediary] INCOMING INTENT! Scheme: "

    .line 109
    :try_start_a
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object v7

    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Action: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Data: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_3a} :catch_1fa

    const-string v1, "0"

    const-string v11, "fb"

    const-string v12, "fbconnect"

    const/4 v13, 0x0

    if-eqz v7, :cond_71

    .line 112
    :try_start_43
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4f

    invoke-virtual {v7, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_71

    :cond_4f
    const-string v2, "[Intermediary] Detected Facebook Callback!"

    .line 113
    invoke-static {v10, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    invoke-virtual {v0, v13}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 119
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getFlags()I

    move-result v2

    const v3, -0x10000001

    and-int/2addr v2, v3

    const/high16 v3, 0x24000000

    or-int/2addr v2, v3

    .line 122
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v2, "[Intermediary] Fixed intent flags to prevent new STUB creation."

    .line 123
    invoke-static {v10, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    new-instance v2, Lkotlin/Pair;

    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6f
    .catch Ljava/lang/Exception; {:try_start_43 .. :try_end_6f} :catch_1fa

    move-object v14, v2

    goto :goto_a0

    .line 128
    :cond_71
    :try_start_71
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2
    :try_end_75
    .catch Ljava/lang/Exception; {:try_start_71 .. :try_end_75} :catch_76

    goto :goto_78

    :catch_76
    nop

    move-object v2, v13

    :goto_78
    if-eqz v2, :cond_98

    :try_start_7a
    const-string v3, "android.intent.extra.INTENT"

    .line 131
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/content/Intent;

    if-nez v3, :cond_85

    goto :goto_98

    .line 134
    :cond_85
    const-class v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 135
    new-instance v4, Lkotlin/Pair;

    if-eqz v2, :cond_94

    move-object v1, v2

    :cond_94
    invoke-direct {v4, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_99

    :cond_98
    :goto_98
    move-object v4, v13

    :goto_99
    if-nez v4, :cond_9f

    .line 138
    invoke-virtual {v8, v9}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void

    :cond_9f
    move-object v14, v4

    .line 142
    :goto_a0
    invoke-virtual {v14}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Landroid/content/Intent;

    .line 143
    sget-object v1, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/n5;

    const/4 v6, 0x0

    invoke-virtual {v1, v15, v13, v6}, Ltop/bienvenido/date_24323/n5;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    .line 144
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 145
    new-instance v4, Ltop/bienvenido/date_24323/i9;

    const/16 v2, 0x8

    invoke-direct {v4, v2}, Ltop/bienvenido/date_24323/i9;-><init>(I)V

    .line 146
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e8

    .line 147
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 148
    :goto_c4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e8

    .line 149
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 150
    new-instance v3, Landroid/content/ComponentName;

    iget-object v6, v2, Landroid/content/pm/ComponentInfo;->packageName:Ljava/lang/String;

    iget-object v13, v2, Landroid/content/pm/ComponentInfo;->name:Ljava/lang/String;

    invoke-direct {v3, v6, v13}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/content/ComponentName;->hashCode()I

    move-result v3

    invoke-virtual {v4, v3}, Ltop/bienvenido/date_24323/i9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Z

    .line 151
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    const/4 v13, 0x0

    goto :goto_c4

    .line 154
    :cond_e8
    sget-object v1, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 155
    new-instance v13, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;

    move-object v1, v13

    move-object/from16 v2, p0

    move-object v3, v15

    move-object/from16 v16, v5

    move-object/from16 v5, p1

    const/4 v0, 0x0

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;-><init>(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Landroid/content/Intent;Ltop/bienvenido/date_24323/i9;Landroid/content/Intent;Ljava/util/ArrayList;)V

    invoke-static {v13}, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 161
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_10c

    const-string v0, "[Intermediary] No target activity found!"

    .line 162
    invoke-static {v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    invoke-virtual {v8, v9}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void

    .line 166
    :cond_10c
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_18c

    move-object/from16 v3, v16

    .line 167
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/content/pm/ActivityInfo;

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Intermediary] Target Activity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v4, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v7, :cond_16e

    .line 170
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14e

    invoke-virtual {v7, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16e

    .line 171
    :cond_14e
    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v2, v4, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v15, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v0, "[Intermediary] Routing Facebook callback directly to Virtual AMS (h6.java)..."

    .line 172
    invoke-static {v10, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    sget-object v0, Ltop/bienvenido/date_24323/h6;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/h6;

    invoke-virtual {v14}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v15, v1}, Ltop/bienvenido/date_24323/h6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;)V

    .line 174
    invoke-virtual {v8, v9}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void

    .line 177
    :cond_16e
    sget-object v0, Ltop/bienvenido/date_24323/n5;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/n5;

    iget-object v1, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ltop/bienvenido/date_24323/n5;->用搅拌机把你妈的阴扩一下(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_17a

    const/4 v3, 0x0

    goto :goto_181

    :cond_17a
    invoke-virtual {v14}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v3, v0

    :goto_181
    move-object/from16 v1, p0

    move-object v2, v15

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    invoke-virtual/range {v1 .. v6}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;Landroid/content/pm/ActivityInfo;Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void

    :cond_18c
    move-object/from16 v3, v16

    .line 182
    invoke-virtual/range {p0 .. p0}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 183
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 184
    new-array v11, v2, [Ljava/lang/String;

    const/4 v6, 0x0

    :goto_199
    if-ge v6, v2, :cond_1c9

    .line 186
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ActivityInfo;

    .line 187
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Landroid/content/pm/ActivityInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ")"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v11, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_199

    .line 189
    :cond_1c9
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, v8}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 191
    new-instance v12, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;

    move-object v1, v12

    move-object/from16 v2, p0

    move-object v4, v15

    move-object v5, v14

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    invoke-direct/range {v1 .. v7}, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;-><init>(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Ljava/util/ArrayList;Landroid/content/Intent;Lkotlin/Pair;Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-virtual {v0, v11, v12}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const-string v1, "X"

    .line 196
    new-instance v2, Ltop/bienvenido/mundo/manifest/MundoIntermediary$4;

    invoke-direct {v2, v8, v9}, Ltop/bienvenido/mundo/manifest/MundoIntermediary$4;-><init>(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 201
    new-instance v1, Ltop/bienvenido/mundo/manifest/MundoIntermediary$5;

    invoke-direct {v1, v8, v9}, Ltop/bienvenido/mundo/manifest/MundoIntermediary$5;-><init>(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    .line 206
    new-instance v1, Ltop/bienvenido/mundo/manifest/MundoIntermediary$6;

    invoke-direct {v1, v8, v0}, Ltop/bienvenido/mundo/manifest/MundoIntermediary$6;-><init>(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Landroid/app/AlertDialog$Builder;)V

    invoke-virtual {v8, v1}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_1f9
    .catch Ljava/lang/Exception; {:try_start_7a .. :try_end_1f9} :catch_1fa

    goto :goto_211

    :catch_1fa
    move-exception v0

    .line 212
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[Intermediary] Fatal error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_211
    return-void
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .registers 2

    .line 98
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {p0}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->isFinishing()Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_10

    .line 101
    :cond_d
    invoke-virtual {p0}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->finish()V

    :cond_10
    :goto_10
    return-void
.end method

.method public final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .registers 5

    .line 88
    sget-object v0, Ltop/bienvenido/date_24323/你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/concurrent/ExecutorService;

    .line 89
    sget-object v0, Ltop/bienvenido/date_24323/你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ltop/bienvenido/mundo/manifest/MundoIntermediary$1;

    invoke-direct {v1, p0, p1, p2}, Ltop/bienvenido/mundo/manifest/MundoIntermediary$1;-><init>(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
