.class Lnet/bienvenido/mundo/sdk/internal/b6$25;
.super Ljava/lang/Object;
.source "b6.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/os/IBinder;

.field public final f$1:Landroid/content/Intent;

.field public final f$2:I

.field final synthetic val$i:I

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Landroid/os/IBinder;Landroid/content/Intent;I)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 839
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/b6$25;->val$iBinder:Landroid/os/IBinder;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/b6$25;->val$intent:Landroid/content/Intent;

    iput p3, p0, Lnet/bienvenido/mundo/sdk/internal/b6$25;->val$i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 845
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/b6$25;->f$0:Landroid/os/IBinder;

    .line 846
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/b6$25;->f$1:Landroid/content/Intent;

    .line 847
    iput p3, p0, Lnet/bienvenido/mundo/sdk/internal/b6$25;->f$2:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 852
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/b6$25;->f$0:Landroid/os/IBinder;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/b6$25;->f$1:Landroid/content/Intent;

    iget v2, p0, Lnet/bienvenido/mundo/sdk/internal/b6$25;->f$2:I

    invoke-static {v0, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/os/IBinder;Landroid/content/Intent;I)V

    return-void
.end method
