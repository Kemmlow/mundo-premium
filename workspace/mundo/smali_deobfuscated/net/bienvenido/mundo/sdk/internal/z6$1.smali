.class Lnet/bienvenido/mundo/sdk/internal/z6$1;
.super Ljava/lang/Object;
.source "z6.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/z6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Ljava/util/List;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/z6;

.field final synthetic val$list:Ljava/util/List;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/z6;Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 15
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z6$1;->this$0:Lnet/bienvenido/mundo/sdk/internal/z6;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/z6$1;->val$list:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/z6$1;->f$0:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 23
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/z6$1;->f$0:Ljava/util/List;

    check-cast p1, Ltop/bienvenido/date_24323/m0;

    invoke-static {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/z6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/List;Ltop/bienvenido/date_24323/m0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
