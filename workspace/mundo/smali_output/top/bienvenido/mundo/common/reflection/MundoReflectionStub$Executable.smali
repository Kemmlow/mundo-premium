.class public final Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Executable;
.super Ljava/lang/reflect/AccessibleObject;
.source "MundoReflectionStub$Executable.java"


# instance fields
.field private final accessFlags:I

.field private final artMethod:J

.field private final declaringClass:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;

.field private final declaringClassOfOverriddenMethod:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;

.field private final parameters:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 5
    invoke-direct {p0}, Ljava/lang/reflect/AccessibleObject;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Executable;->accessFlags:I

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Executable;->artMethod:J

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Executable;->declaringClass:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;

    .line 9
    iput-object v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Executable;->declaringClassOfOverriddenMethod:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Class;

    .line 10
    iput-object v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$Executable;->parameters:[Ljava/lang/Object;

    return-void
.end method
