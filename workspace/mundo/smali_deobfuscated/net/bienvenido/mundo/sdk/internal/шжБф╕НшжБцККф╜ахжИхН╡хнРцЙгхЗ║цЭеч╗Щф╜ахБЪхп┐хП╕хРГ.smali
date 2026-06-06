.class public final Lnet/bienvenido/mundo/sdk/internal/要不要把你妈卵子扣出来给你做寿司吃;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>()V
    .registers 8

    const/4 v1, 0x1

    .line 8
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-class v3, Lnet/bienvenido/mundo/sdk/internal/CollectionUtils;

    const-string v4, "returnThisFunction"

    const-string v5, "returnThisFunction(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;"

    const/4 v6, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 12
    invoke-virtual {p0}, Lkotlin/jvm/internal/CallableReference;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method
