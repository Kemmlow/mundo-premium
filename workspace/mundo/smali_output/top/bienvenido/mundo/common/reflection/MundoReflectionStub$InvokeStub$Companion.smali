.class public final Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub$Companion;
.super Ljava/lang/Object;
.source "MundoReflectionStub$InvokeStub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/bienvenido/mundo/common/reflection/MundoReflectionStub$InvokeStub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final varargs invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    const/4 p1, 0x0

    return-object p1
.end method
