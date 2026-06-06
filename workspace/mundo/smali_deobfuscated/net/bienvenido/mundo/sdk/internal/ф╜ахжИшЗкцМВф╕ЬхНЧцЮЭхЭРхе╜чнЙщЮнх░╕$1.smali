.class Lnet/bienvenido/mundo/sdk/internal/你妈自挂东南枝坐好等鞭尸$1;
.super Ljava/lang/Object;
.source "\u4f60\u5988\u81ea\u6302\u4e1c\u5357\u679d\u5750\u597d\u7b49\u97ad\u5c38.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/你妈自挂东南枝坐好等鞭尸;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/content/Intent;

.field public final f$1:Ljava/lang/String;

.field public final f$2:I

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

    .line 77
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/你妈自挂东南枝坐好等鞭尸$1;->val$intent:Landroid/content/Intent;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/你妈自挂东南枝坐好等鞭尸$1;->val$str:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/你妈自挂东南枝坐好等鞭尸$1;->f$0:Landroid/content/Intent;

    .line 79
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/你妈自挂东南枝坐好等鞭尸$1;->f$1:Ljava/lang/String;

    const/16 p1, 0x80

    .line 80
    iput p1, p0, Lnet/bienvenido/mundo/sdk/internal/你妈自挂东南枝坐好等鞭尸$1;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 83
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/你妈自挂东南枝坐好等鞭尸$1;->f$0:Landroid/content/Intent;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/你妈自挂东南枝坐好等鞭尸$1;->f$1:Ljava/lang/String;

    const/16 v2, 0x80

    check-cast p1, Landroid/content/pm/PackageManager;

    invoke-static {v0, v1, v2, p1}, Lnet/bienvenido/mundo/sdk/internal/你妈自挂东南枝坐好等鞭尸;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;ILandroid/content/pm/PackageManager;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
