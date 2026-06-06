.class Lnet/bienvenido/mundo/sdk/internal/n5$15;
.super Ljava/lang/Object;
.source "n5.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;I)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

.field public final f$1:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

.field final synthetic val$c2Var:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

.field final synthetic val$c2Var2:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;Lnet/bienvenido/mundo/sdk/internal/AppWindowController;Lnet/bienvenido/mundo/sdk/internal/AppWindowController;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 768
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/n5$15;->this$0:Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/n5$15;->val$c2Var:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/n5$15;->val$c2Var2:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 773
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/n5$15;->f$0:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    .line 774
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/n5$15;->f$1:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 779
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/n5$15;->f$0:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/n5$15;->f$1:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    invoke-static {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/AppWindowController;Lnet/bienvenido/mundo/sdk/internal/AppWindowController;)V

    return-void
.end method
