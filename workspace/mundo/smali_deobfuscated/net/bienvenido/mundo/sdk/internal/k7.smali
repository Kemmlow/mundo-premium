.class public final Lnet/bienvenido/mundo/sdk/internal/k7;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "k7.java"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/k7;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 8
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/k7;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/k7;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/k7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/k7;

    return-void
.end method

.method public constructor <init>()V
    .registers 7

    const/4 v1, 0x4

    .line 11
    const-class v2, Ltop/bienvenido/date_24323/m0;

    const-string v3, "resolveIntent"

    const-string v4, "resolveIntent(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 15
    check-cast p1, Ltop/bienvenido/date_24323/m0;

    check-cast p2, Landroid/content/Intent;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-interface {p1, p2, p3, p4}, Ltop/bienvenido/date_24323/m0;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    return-object p1
.end method
