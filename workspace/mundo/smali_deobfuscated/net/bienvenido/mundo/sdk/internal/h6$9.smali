.class Lnet/bienvenido/mundo/sdk/internal/h6$9;
.super Ljava/lang/Object;
.source "h6.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 100
    check-cast p1, Landroid/os/IBinder;

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;->说话不过脑子直接从您屁眼里崩出来(Landroid/os/IBinder;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
