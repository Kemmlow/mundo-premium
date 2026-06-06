.class Lnet/bienvenido/mundo/sdk/internal/p5$1;
.super Ljava/lang/Object;
.source "p5.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/ActivityRecord;->binderDied()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/os/IBinder;

.field public final f$1:Lnet/bienvenido/mundo/sdk/internal/ActivityRecord;

.field public final f$2:Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/ActivityRecord;

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$o5Var:Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/ActivityRecord;Landroid/os/IBinder;Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 28
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/p5$1;->this$0:Lnet/bienvenido/mundo/sdk/internal/ActivityRecord;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/p5$1;->val$iBinder:Landroid/os/IBinder;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/p5$1;->val$o5Var:Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/p5$1;->f$0:Landroid/os/IBinder;

    .line 35
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/p5$1;->f$1:Lnet/bienvenido/mundo/sdk/internal/ActivityRecord;

    .line 36
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/p5$1;->f$2:Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 41
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/p5$1;->f$0:Landroid/os/IBinder;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/p5$1;->f$1:Lnet/bienvenido/mundo/sdk/internal/ActivityRecord;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/p5$1;->f$2:Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

    invoke-static {v0, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/ActivityRecord;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Lnet/bienvenido/mundo/sdk/internal/ActivityRecord;Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;)V

    return-void
.end method
