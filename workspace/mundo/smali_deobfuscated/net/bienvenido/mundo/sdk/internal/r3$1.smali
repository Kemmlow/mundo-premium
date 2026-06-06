.class Lnet/bienvenido/mundo/sdk/internal/r3$1;
.super Ljava/lang/Object;
.source "r3.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/PackageParser;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;)Landroid/content/pm/ActivityInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/content/Intent;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Landroid/content/Intent;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 23
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/r3$1;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/r3$1;->f$0:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 31
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/r3$1;->f$0:Landroid/content/Intent;

    check-cast p1, Ltop/bienvenido/date_24323/m0;

    invoke-static {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/PackageParser;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ltop/bienvenido/date_24323/m0;)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    return-object p1
.end method
