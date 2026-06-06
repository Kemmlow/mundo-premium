.class Lnet/bienvenido/mundo/sdk/internal/h6$2;
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

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 68
    check-cast p1, Landroid/os/IBinder;

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;->用搅拌机把你妈的阴扩一下(Landroid/os/IBinder;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
