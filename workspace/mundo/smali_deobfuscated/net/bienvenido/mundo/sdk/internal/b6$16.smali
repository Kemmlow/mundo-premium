.class Lnet/bienvenido/mundo/sdk/internal/b6$16;
.super Ljava/lang/Object;
.source "b6.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->我tm扯下你妈的灵堂白布给你献哈达()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Ljava/lang/String;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;

.field final synthetic val$str4:Ljava/lang/String;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 471
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/b6$16;->this$0:Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/b6$16;->val$str4:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 475
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/b6$16;->f$0:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 479
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/b6$16;->f$0:Ljava/lang/String;

    check-cast p1, Ltop/bienvenido/date_24323/m0;

    invoke-static {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ltop/bienvenido/date_24323/m0;)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1
.end method
