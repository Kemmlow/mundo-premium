.class Ltop/bienvenido/mundo/manifest/MundoIntermediary$4;
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

.field final synthetic val$atomicBoolean:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 196
    iput-object p1, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$4;->this$0:Ltop/bienvenido/mundo/manifest/MundoIntermediary;

    iput-object p2, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$4;->val$atomicBoolean:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .registers 5

    .line 198
    iget-object v0, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$4;->this$0:Ltop/bienvenido/mundo/manifest/MundoIntermediary;

    iget-object v1, p0, Ltop/bienvenido/mundo/manifest/MundoIntermediary$4;->val$atomicBoolean:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v0, v1, p1, p2}, Ltop/bienvenido/mundo/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ltop/bienvenido/mundo/manifest/MundoIntermediary;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/DialogInterface;I)V

    return-void
.end method
