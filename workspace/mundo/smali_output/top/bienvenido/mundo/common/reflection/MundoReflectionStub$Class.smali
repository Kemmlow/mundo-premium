.class public final Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;
.super Ljava/lang/Object;
.source "MundoReflectionStub$Class.java"


# instance fields
.field private final transient accessFlags:I

.field private final transient classFlags:I

.field private final transient classLoader:Ljava/lang/ClassLoader;

.field private final transient classSize:I

.field private final transient clinitThreadId:I

.field private final transient componentType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final transient copiedMethodsOffset:S

.field private final transient dexCache:Ljava/lang/Object;

.field private final transient dexClassDefIndex:I

.field private final transient dexTypeIndex:I

.field private final transient extData:Ljava/lang/Object;

.field private final transient iFields:J

.field private final transient ifTable:[Ljava/lang/Object;

.field private final transient methods:J

.field private final transient name:Ljava/lang/String;

.field private final transient numReferenceInstanceFields:I

.field private final transient numReferenceStaticFields:I

.field private final transient objectSize:I

.field private final transient objectSizeAllocFastPath:I

.field private final transient primitiveType:I

.field private final transient referenceInstanceOffsets:I

.field private final transient sFields:J

.field private final transient status:I

.field private final transient superClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final transient virtualMethodsOffset:S

.field private final transient vtable:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .registers 5

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->accessFlags:I

    .line 5
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->classFlags:I

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->classLoader:Ljava/lang/ClassLoader;

    .line 7
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->classSize:I

    .line 8
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->clinitThreadId:I

    .line 9
    iput-object v1, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->componentType:Ljava/lang/Class;

    .line 10
    iput-short v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->copiedMethodsOffset:S

    .line 11
    iput-object v1, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->dexCache:Ljava/lang/Object;

    .line 12
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->dexClassDefIndex:I

    .line 13
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->dexTypeIndex:I

    .line 14
    iput-object v1, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->extData:Ljava/lang/Object;

    const-wide/16 v2, 0x0

    .line 15
    iput-wide v2, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->iFields:J

    .line 16
    iput-object v1, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->ifTable:[Ljava/lang/Object;

    .line 17
    iput-wide v2, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->methods:J

    .line 18
    iput-object v1, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->name:Ljava/lang/String;

    .line 19
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->numReferenceInstanceFields:I

    .line 20
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->numReferenceStaticFields:I

    .line 21
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->objectSize:I

    .line 22
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->objectSizeAllocFastPath:I

    .line 23
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->primitiveType:I

    .line 24
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->referenceInstanceOffsets:I

    .line 25
    iput-wide v2, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->sFields:J

    .line 26
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->status:I

    .line 27
    iput-object v1, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->superClass:Ljava/lang/Class;

    .line 28
    iput-short v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->virtualMethodsOffset:S

    .line 29
    iput-object v1, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;->vtable:Ljava/lang/Object;

    return-void
.end method
