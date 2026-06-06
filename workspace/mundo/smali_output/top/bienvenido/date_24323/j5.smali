.class public final Ltop/bienvenido/date_24323/j5;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "j5.java"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/j5;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 8
    new-instance v0, Ltop/bienvenido/date_24323/j5;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/j5;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/j5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/j5;

    return-void
.end method

.method public constructor <init>()V
    .registers 7

    const/4 v1, 0x4

    .line 11
    const-class v2, Ltop/bienvenido/date_24323/i0;

    const-string v3, "queryIntentReceivers"

    const-string v4, "queryIntentReceivers(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 15
    check-cast p1, Ltop/bienvenido/date_24323/i0;

    check-cast p2, Landroid/content/Intent;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-interface {p1, p2, p3, p4}, Ltop/bienvenido/date_24323/i0;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
