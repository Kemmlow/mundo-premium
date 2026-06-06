.class Lnet/bienvenido/mundo/sdk/internal/u3$11;
.super Ljava/lang/Object;
.source "u3.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;Landroid/os/IBinder;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/os/IBinder;

.field public final f$1:Landroid/content/Intent;

.field public final f$2:Landroid/os/IBinder;

.field public final f$3:Landroid/os/IBinder;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$iBinder2:Landroid/os/IBinder;

.field final synthetic val$iBinder3:Landroid/os/IBinder;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;Landroid/os/IBinder;Landroid/content/Intent;Landroid/os/IBinder;Landroid/os/IBinder;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 769
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->this$0:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->val$iBinder:Landroid/os/IBinder;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->val$intent:Landroid/content/Intent;

    iput-object p4, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->val$iBinder2:Landroid/os/IBinder;

    iput-object p5, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->val$iBinder3:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 776
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->f$0:Landroid/os/IBinder;

    .line 777
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->f$1:Landroid/content/Intent;

    .line 778
    iput-object p4, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->f$2:Landroid/os/IBinder;

    .line 779
    iput-object p5, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->f$3:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 784
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->f$0:Landroid/os/IBinder;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->f$1:Landroid/content/Intent;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->f$2:Landroid/os/IBinder;

    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/u3$11;->f$3:Landroid/os/IBinder;

    invoke-static {v0, v1, v2, v3}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;Landroid/os/IBinder;Landroid/os/IBinder;)V

    return-void
.end method
