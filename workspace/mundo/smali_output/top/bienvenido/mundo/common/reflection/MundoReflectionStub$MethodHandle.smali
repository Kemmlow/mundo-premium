.class public Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$MethodHandle;
.super Ljava/lang/Object;
.source "MundoReflectionStub$MethodHandle.java"


# instance fields
.field private final artFieldOrMethod:J

.field private final cachedSpreadInvoker:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$MethodHandle;

.field private final handleKind:I

.field private final nominalType:Ljava/lang/invoke/MethodType;

.field private final type:Ljava/lang/invoke/MethodType;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 6
    iput-wide v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$MethodHandle;->artFieldOrMethod:J

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$MethodHandle;->cachedSpreadInvoker:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$MethodHandle;

    const/4 v1, 0x0

    .line 8
    iput v1, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$MethodHandle;->handleKind:I

    .line 9
    iput-object v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$MethodHandle;->nominalType:Ljava/lang/invoke/MethodType;

    .line 10
    iput-object v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$MethodHandle;->type:Ljava/lang/invoke/MethodType;

    return-void
.end method


# virtual methods
.method public final getArtFieldOrMethod()J
    .registers 3

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getHandleKind()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method
