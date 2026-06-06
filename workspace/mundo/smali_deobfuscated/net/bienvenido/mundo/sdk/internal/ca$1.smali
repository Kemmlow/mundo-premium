.class Lnet/bienvenido/mundo/sdk/internal/ca$1;
.super Ljava/lang/Object;
.source "ca.java"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/AppVirtualBroadcast;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/AppVirtualBroadcast;

.field final synthetic val$i9Var:Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/AppVirtualBroadcast;Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 34
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/ca$1;->this$0:Lnet/bienvenido/mundo/sdk/internal/AppVirtualBroadcast;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/ca$1;->val$i9Var:Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/ca$1;->f$0:Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 42
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ca$1;->f$0:Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;

    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, p1, p2}, Lnet/bienvenido/mundo/sdk/internal/AppVirtualBroadcast;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/BinarySearchHelper;Landroid/view/WindowManager$LayoutParams;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
