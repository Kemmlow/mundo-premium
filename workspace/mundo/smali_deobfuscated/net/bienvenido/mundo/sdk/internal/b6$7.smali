.class Lnet/bienvenido/mundo/sdk/internal/b6$7;
.super Ljava/lang/Object;
.source "b6.java"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->用搅拌机把你妈的阴扩一下()Lkotlin/Unit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 305
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    .line 307
    :try_start_0
    invoke-static {}, Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度()Lkotlin/Unit;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_4} :catch_5

    return-object v0

    :catch_5
    const/4 v0, 0x0

    return-object v0
.end method
