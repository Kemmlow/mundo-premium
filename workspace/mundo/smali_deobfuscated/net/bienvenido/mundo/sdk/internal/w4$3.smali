.class Lnet/bienvenido/mundo/sdk/internal/w4$3;
.super Ljava/lang/Object;
.source "w4.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/w4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/content/Intent;

.field public final f$1:Ljava/lang/String;

.field final synthetic val$intent:Landroid/content/Intent;

.field final synthetic val$str:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Intent;Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 94
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/w4$3;->val$intent:Landroid/content/Intent;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/w4$3;->val$str:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/w4$3;->f$0:Landroid/content/Intent;

    .line 100
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/w4$3;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 105
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/w4$3;->f$0:Landroid/content/Intent;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/w4$3;->f$1:Ljava/lang/String;

    invoke-static {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/w4;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method
