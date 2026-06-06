.class Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;
.super Ljava/lang/Object;
.source "MundoIntermediary.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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

.field final synthetic val$atomicBoolean:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic val$intent:Landroid/content/Intent;

.field final synthetic val$intent3:Landroid/content/Intent;

.field final synthetic val$pair2:Lkotlin/Pair;


# direct methods
.method constructor <init>(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Ljava/util/ArrayList;Landroid/content/Intent;Lkotlin/Pair;Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 191
    iput-object p1, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->this$0:Ltop/bienvenido/mundo/manifest/MundoIntermediary;

    iput-object p2, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->val$arrayList:Ljava/util/ArrayList;

    iput-object p3, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->val$intent3:Landroid/content/Intent;

    iput-object p4, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->val$pair2:Lkotlin/Pair;

    iput-object p5, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->val$intent:Landroid/content/Intent;

    iput-object p6, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->val$atomicBoolean:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .registers 11

    .line 193
    iget-object v0, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->val$arrayList:Ljava/util/ArrayList;

    iget-object v1, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->this$0:Ltop/bienvenido/mundo/manifest/MundoIntermediary;

    iget-object v2, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->val$intent3:Landroid/content/Intent;

    iget-object v3, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->val$pair2:Lkotlin/Pair;

    iget-object v4, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->val$intent:Landroid/content/Intent;

    iget-object v5, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$3;->val$atomicBoolean:Ljava/util/concurrent/atomic/AtomicBoolean;

    move-object v6, p1

    move v7, p2

    invoke-static/range {v0 .. v7}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/ArrayList;Ltop/bienvenido/mundo/manifest/MundoIntermediary;Landroid/content/Intent;Lkotlin/Pair;Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/DialogInterface;I)V

    return-void
.end method
