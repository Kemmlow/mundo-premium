.class public final Ltop/bienvenido/date_24323/f5;
.super Lkotlin/jvm/internal/MutablePropertyReference1Impl;
.source "f5.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/f5;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 9
    new-instance v0, Ltop/bienvenido/date_24323/f5;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/f5;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/f5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/f5;

    return-void
.end method

.method public constructor <init>()V
    .registers 5

    .line 12
    const-class v0, Landroid/content/pm/ResolveInfo;

    const-string v1, "getProviderInfo()Landroid/content/pm/ProviderInfo;"

    const/4 v2, 0x0

    const-string v3, "providerInfo"

    invoke-direct {p0, v0, v3, v1, v2}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 16
    check-cast p1, Landroid/content/pm/ResolveInfo;

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 20
    check-cast p1, Landroid/content/pm/ResolveInfo;

    check-cast p2, Landroid/content/pm/ProviderInfo;

    iput-object p2, p1, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    return-void
.end method
