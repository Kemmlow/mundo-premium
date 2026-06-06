.class public final Lnet/bienvenido/mundo/sdk/internal/k2;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "k2.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/k2;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 10
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/k2;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/k2;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/k2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/k2;

    return-void
.end method

.method public constructor <init>()V
    .registers 7

    const/4 v1, 0x1

    .line 13
    const-class v2, Lkotlin/collections/ArraysKt;

    const-string v3, "toTypedArray"

    const-string v4, "toTypedArray(Ljava/util/Collection;)[Ljava/lang/Object;"

    const/4 v5, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 17
    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/content/pm/ProviderInfo;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/content/pm/ProviderInfo;

    return-object p1
.end method
