.class public final Ltop/bienvenido/date_24323/obfclass6;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "obfclass6.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>()V
    .registers 8

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 9
    const-class v3, Ltop/bienvenido/date_24323/n1;

    const-string v4, "returnThisFunction"

    const-string v5, "returnThisFunction(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;"

    const/4 v6, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 14
    iget-object p1, p0, Ltop/bienvenido/date_24323/obfclass6;->receiver:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    return-object p1
.end method
