.class Lnet/bienvenido/mundo/sdk/internal/b$1;
.super Ljava/lang/Object;
.source "b.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/b;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/net/Uri;

.field public final f$1:Landroid/database/IContentObserver;

.field public final f$2:Z

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/b;

.field final synthetic val$iContentObserver:Landroid/database/IContentObserver;

.field final synthetic val$uri:Landroid/net/Uri;

.field final synthetic val$zBooleanValue:Z


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/b;Landroid/net/Uri;Landroid/database/IContentObserver;Z)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/b$1;->this$0:Lnet/bienvenido/mundo/sdk/internal/b;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/b$1;->val$uri:Landroid/net/Uri;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/b$1;->val$iContentObserver:Landroid/database/IContentObserver;

    iput-boolean p4, p0, Lnet/bienvenido/mundo/sdk/internal/b$1;->val$zBooleanValue:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/b$1;->f$0:Landroid/net/Uri;

    .line 34
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/b$1;->f$1:Landroid/database/IContentObserver;

    .line 35
    iput-boolean p4, p0, Lnet/bienvenido/mundo/sdk/internal/b$1;->f$2:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 39
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/b$1;->f$0:Landroid/net/Uri;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/b$1;->f$1:Landroid/database/IContentObserver;

    iget-boolean v2, p0, Lnet/bienvenido/mundo/sdk/internal/b$1;->f$2:Z

    check-cast p1, Ltop/bienvenido/date_24323/f0;

    invoke-static {v0, v1, v2, p1}, Lnet/bienvenido/mundo/sdk/internal/b;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/net/Uri;Landroid/database/IContentObserver;ZLtop/bienvenido/date_24323/f0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
