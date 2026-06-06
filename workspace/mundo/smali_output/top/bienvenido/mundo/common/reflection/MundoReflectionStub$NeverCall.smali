.class public final Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall;
.super Ljava/lang/Object;
.source "MundoReflectionStub$NeverCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall$Companion;
    }
.end annotation


# static fields
.field public static final INSTANCE:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall$Companion;

.field public static s:I

.field public static t:I


# instance fields
.field private final i:I

.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 4
    new-instance v0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall$Companion;

    invoke-direct {v0}, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall$Companion;-><init>()V

    sput-object v0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall;->INSTANCE:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall$Companion;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall;->i:I

    .line 8
    iput v0, p0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall;->j:I

    return-void
.end method

.method public static final a()V
    .registers 1

    .line 20
    sget-object v0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall;->INSTANCE:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall$Companion;

    invoke-virtual {v0}, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall$Companion;->a()V

    return-void
.end method

.method public static final b()V
    .registers 1

    .line 24
    sget-object v0, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall;->INSTANCE:Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall$Companion;

    invoke-virtual {v0}, Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$NeverCall$Companion;->b()V

    return-void
.end method
