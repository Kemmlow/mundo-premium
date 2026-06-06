.class Lnet/bienvenido/mundo/sdk/internal/i1$1;
.super Ljava/lang/Object;
.source "i1.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/io/File;Z)Lkotlin/Pair;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Ljava/io/File;

.field public final f$1:I

.field final synthetic val$file:Ljava/io/File;


# direct methods
.method constructor <init>(Ljava/io/File;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 61
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/i1$1;->val$file:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/i1$1;->f$0:Ljava/io/File;

    const p1, -0x7fffff40

    .line 67
    iput p1, p0, Lnet/bienvenido/mundo/sdk/internal/i1$1;->f$1:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 71
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/i1$1;->f$0:Ljava/io/File;

    iget v1, p0, Lnet/bienvenido/mundo/sdk/internal/i1$1;->f$1:I

    check-cast p1, Landroid/content/pm/PackageManager;

    invoke-static {v0, v1, p1}, Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;ILandroid/content/pm/PackageManager;)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1
.end method
