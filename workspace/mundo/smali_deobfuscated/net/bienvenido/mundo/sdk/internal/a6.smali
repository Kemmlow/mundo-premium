.class public final Lnet/bienvenido/mundo/sdk/internal/a6;
.super Ljava/lang/Object;
.source "a6.java"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 10
    check-cast p2, Landroid/content/pm/ProviderInfo;

    iget p2, p2, Landroid/content/pm/ProviderInfo;->initOrder:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Landroid/content/pm/ProviderInfo;

    iget p1, p1, Landroid/content/pm/ProviderInfo;->initOrder:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
