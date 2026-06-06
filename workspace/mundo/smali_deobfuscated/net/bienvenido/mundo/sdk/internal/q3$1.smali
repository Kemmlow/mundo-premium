.class Lnet/bienvenido/mundo/sdk/internal/q3$1;
.super Ljava/lang/Object;
.source "q3.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/q3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/os/IBinder;

.field public final f$1:Landroid/os/IBinder;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/q3;

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$iBinder2:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/q3;Landroid/os/IBinder;Landroid/os/IBinder;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 87
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/q3$1;->this$0:Lnet/bienvenido/mundo/sdk/internal/q3;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/q3$1;->val$iBinder:Landroid/os/IBinder;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/q3$1;->val$iBinder2:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/q3$1;->f$0:Landroid/os/IBinder;

    .line 93
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/q3$1;->f$1:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 98
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/q3$1;->f$0:Landroid/os/IBinder;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/q3$1;->f$1:Landroid/os/IBinder;

    invoke-static {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/q3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/os/IBinder;)V

    return-void
.end method
