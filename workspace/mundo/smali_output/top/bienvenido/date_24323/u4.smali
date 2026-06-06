.class public final Ltop/bienvenido/date_24323/u4;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "u4.java"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Ltop/bienvenido/date_24323/n2;)V
    .registers 9

    const/4 v1, 0x2

    .line 9
    const-class v3, Ltop/bienvenido/date_24323/s2;

    const-string v4, "set"

    const-string v5, "set(Ljava/lang/Object;Ljava/lang/Object;)V"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 13
    invoke-virtual {p0}, Ltop/bienvenido/date_24323/u4;->getBoundReceiver()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/bienvenido/date_24323/s2;

    invoke-virtual {v0, p1, p2}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
