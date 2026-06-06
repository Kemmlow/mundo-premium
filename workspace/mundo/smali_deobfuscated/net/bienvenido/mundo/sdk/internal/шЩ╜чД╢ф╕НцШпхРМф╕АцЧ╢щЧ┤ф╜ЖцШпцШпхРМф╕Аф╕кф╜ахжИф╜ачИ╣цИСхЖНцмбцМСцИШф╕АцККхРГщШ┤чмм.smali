.class public final Lnet/bienvenido/mundo/sdk/internal/虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>()V
    .registers 8

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 8
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

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
