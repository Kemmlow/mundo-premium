.class Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;
.super Ljava/lang/Object;
.source "MundoIntermediary.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/bienvenido/mundo/manifest/MundoIntermediary;

.field final synthetic val$arrayList:Ljava/util/ArrayList;

.field final synthetic val$i9Var:Ltop/bienvenido/date_24323/i9;

.field final synthetic val$intent:Landroid/content/Intent;

.field final synthetic val$intent3:Landroid/content/Intent;


# direct methods
.method constructor <init>(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Landroid/content/Intent;Ltop/bienvenido/date_24323/i9;Landroid/content/Intent;Ljava/util/ArrayList;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 155
    iput-object p1, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;->this$0:Ltop/bienvenido/mundo/manifest/MundoIntermediary;

    iput-object p2, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;->val$intent3:Landroid/content/Intent;

    iput-object p3, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;->val$i9Var:Ltop/bienvenido/date_24323/i9;

    iput-object p4, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;->val$intent:Landroid/content/Intent;

    iput-object p5, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;->val$arrayList:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    .line 157
    iget-object v0, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;->val$intent3:Landroid/content/Intent;

    iget-object v1, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;->val$i9Var:Ltop/bienvenido/date_24323/i9;

    iget-object v2, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;->this$0:Ltop/bienvenido/mundo/manifest/MundoIntermediary;

    iget-object v3, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;->val$intent:Landroid/content/Intent;

    iget-object v4, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$2;->val$arrayList:Ljava/util/ArrayList;

    move-object v5, p1

    check-cast v5, Landroid/content/pm/PackageManager;

    invoke-static/range {v0 .. v5}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ltop/bienvenido/date_24323/i9;Ltop/bienvenido/mundo/manifest/MundoIntermediary;Landroid/content/Intent;Ljava/util/ArrayList;Landroid/content/pm/PackageManager;)Lkotlin/Unit;

    .line 158
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
