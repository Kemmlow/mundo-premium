.class Lnet/bienvenido/mundo/sdk/internal/w0$1;
.super Ljava/lang/Object;
.source "w0.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/w0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:I

.field public final f$1:Landroid/content/Intent;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/w0;

.field final synthetic val$iIntValue:I

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/w0;ILandroid/content/Intent;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 23
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/w0$1;->this$0:Lnet/bienvenido/mundo/sdk/internal/w0;

    iput p2, p0, Lnet/bienvenido/mundo/sdk/internal/w0$1;->val$iIntValue:I

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/w0$1;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput p2, p0, Lnet/bienvenido/mundo/sdk/internal/w0$1;->f$0:I

    .line 29
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/w0$1;->f$1:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 33
    iget v0, p0, Lnet/bienvenido/mundo/sdk/internal/w0$1;->f$0:I

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/w0$1;->f$1:Landroid/content/Intent;

    check-cast p1, Ltop/bienvenido/date_24323/p0;

    invoke-static {v0, v1, p1}, Lnet/bienvenido/mundo/sdk/internal/w0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILandroid/content/Intent;Ltop/bienvenido/date_24323/p0;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
