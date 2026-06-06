.class Lnet/bienvenido/mundo/sdk/internal/b6$2;
.super Ljava/lang/Object;
.source "b6.java"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    .line 118
    :try_start_0
    invoke-static {}, Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->你这种烂货完全是当今社会的毒瘤老子要在你狗脑子上面安一个定时炸弹3次密码不对马上爆炸正好为社会除害()Landroid/app/LoadedApk;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_4} :catch_5

    return-object v0

    :catch_5
    const/4 v0, 0x0

    return-object v0
.end method
