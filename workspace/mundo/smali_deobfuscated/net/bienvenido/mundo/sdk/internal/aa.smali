.class public final Lnet/bienvenido/mundo/sdk/internal/aa;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "aa.java"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .registers 9

    const/4 v1, 0x2

    .line 11
    const-class v3, Lkotlin/reflect/KMutableProperty1;

    const-string v4, "set"

    const-string v5, "set(Ljava/lang/Object;Ljava/lang/Object;)V"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 15
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/internal/aa;->getBoundReceiver()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/KMutableProperty1;

    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/KMutableProperty1;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
