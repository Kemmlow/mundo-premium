.class Lnet/bienvenido/mundo/sdk/internal/u3$3;
.super Ljava/lang/Object;
.source "u3.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/os/IBinder;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Lnet/bienvenido/mundo/sdk/internal/u5;

.field public final f$1:Landroid/os/IBinder;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$u5Var:Lnet/bienvenido/mundo/sdk/internal/u5;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;Lnet/bienvenido/mundo/sdk/internal/u5;Landroid/os/IBinder;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 234
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/u3$3;->this$0:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$3;->val$u5Var:Lnet/bienvenido/mundo/sdk/internal/u5;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/u3$3;->val$iBinder:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$3;->f$0:Lnet/bienvenido/mundo/sdk/internal/u5;

    .line 240
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/u3$3;->f$1:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 245
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/u3$3;->f$0:Lnet/bienvenido/mundo/sdk/internal/u5;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/u3$3;->f$1:Landroid/os/IBinder;

    invoke-static {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/u5;Landroid/os/IBinder;)V

    return-void
.end method
