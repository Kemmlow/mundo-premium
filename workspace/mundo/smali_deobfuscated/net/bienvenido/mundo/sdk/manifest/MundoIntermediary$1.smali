.class Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary$1;
.super Ljava/lang/Object;
.source "MundoIntermediary.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary;

.field final synthetic val$atomicBoolean:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary;Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 89
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary$1;->this$0:Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary$1;->val$intent:Landroid/content/Intent;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary$1;->val$atomicBoolean:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 92
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary$1;->this$0:Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary$1;->val$intent:Landroid/content/Intent;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary$1;->val$atomicBoolean:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1, v2}, Lnet/bienvenido/mundo/sdk/manifest/MundoIntermediary;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void
.end method
