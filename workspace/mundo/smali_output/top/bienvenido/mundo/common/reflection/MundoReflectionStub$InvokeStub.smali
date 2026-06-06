.class public final Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub;
.super Ljava/lang/Object;
.source "MundoReflectionStub$InvokeStub.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub$Companion;
    }
.end annotation


# static fields
.field public static final INSTANCE:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub$Companion;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 4
    new-instance v0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub$Companion;

    invoke-direct {v0}, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub$Companion;-><init>()V

    sput-object v0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub;->INSTANCE:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub$Companion;

    return-void
.end method

.method private varargs constructor <init>([Ljava/lang/Object;)V
    .registers 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final varargs invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 18
    sget-object v0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub;->INSTANCE:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub$Companion;

    invoke-virtual {v0, p0}, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub$Companion;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
