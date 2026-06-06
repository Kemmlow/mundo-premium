.class Lnet/bienvenido/mundo/sdk/internal/n5$18;
.super Ljava/lang/Object;
.source "n5.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

.field public final f$1:Landroid/content/ComponentName;

.field public final f$2:I

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

.field final synthetic val$c2Var:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

.field final synthetic val$componentName:Landroid/content/ComponentName;

.field final synthetic val$i:I


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;Lnet/bienvenido/mundo/sdk/internal/AppWindowController;Landroid/content/ComponentName;I)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1053
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/n5$18;->this$0:Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/n5$18;->val$c2Var:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/n5$18;->val$componentName:Landroid/content/ComponentName;

    iput p4, p0, Lnet/bienvenido/mundo/sdk/internal/n5$18;->val$i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1059
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/n5$18;->f$0:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    .line 1060
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/n5$18;->f$1:Landroid/content/ComponentName;

    .line 1061
    iput p4, p0, Lnet/bienvenido/mundo/sdk/internal/n5$18;->f$2:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1066
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/n5$18;->f$0:Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/n5$18;->f$1:Landroid/content/ComponentName;

    iget v2, p0, Lnet/bienvenido/mundo/sdk/internal/n5$18;->f$2:I

    invoke-static {v0, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/AppWindowController;Landroid/content/ComponentName;I)V

    return-void
.end method
