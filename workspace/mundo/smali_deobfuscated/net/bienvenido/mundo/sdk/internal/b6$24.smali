.class Lnet/bienvenido/mundo/sdk/internal/b6$24;
.super Ljava/lang/Object;
.source "b6.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/os/IBinder;

.field public final f$1:Landroid/content/Intent;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;Landroid/os/IBinder;Landroid/content/Intent;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 818
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/b6$24;->this$0:Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/b6$24;->val$iBinder:Landroid/os/IBinder;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/b6$24;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 823
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/b6$24;->f$0:Landroid/os/IBinder;

    .line 824
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/b6$24;->f$1:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 829
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/b6$24;->f$0:Landroid/os/IBinder;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/b6$24;->f$1:Landroid/content/Intent;

    invoke-static {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/os/IBinder;Landroid/content/Intent;)V

    return-void
.end method
