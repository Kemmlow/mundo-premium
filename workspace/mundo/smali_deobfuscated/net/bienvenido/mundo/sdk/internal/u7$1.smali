.class Lnet/bienvenido/mundo/sdk/internal/u7$1;
.super Ljava/lang/Object;
.source "u7.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/u7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:[Ljava/lang/Object;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/u7;

.field final synthetic val$objArr:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/u7;[Ljava/lang/Object;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 16
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/u7$1;->this$0:Lnet/bienvenido/mundo/sdk/internal/u7;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/u7$1;->val$objArr:[Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/u7$1;->f$0:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 24
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/u7$1;->f$0:[Ljava/lang/Object;

    check-cast p1, Ltop/bienvenido/date_24323/m0;

    invoke-static {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/u7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([Ljava/lang/Object;Ltop/bienvenido/date_24323/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
