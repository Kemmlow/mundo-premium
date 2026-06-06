.class public final Lnet/bienvenido/mundo/sdk/internal/l5;
.super Lkotlin/jvm/internal/MutablePropertyReference1Impl;
.source "l5.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/l5;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 9
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/l5;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/l5;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/l5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/l5;

    return-void
.end method

.method public constructor <init>()V
    .registers 5

    .line 12
    const-class v0, Landroid/content/pm/ResolveInfo;

    const-string v1, "getServiceInfo()Landroid/content/pm/ServiceInfo;"

    const/4 v2, 0x0

    const-string v3, "serviceInfo"

    invoke-direct {p0, v0, v3, v1, v2}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 16
    check-cast p1, Landroid/content/pm/ResolveInfo;

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 20
    check-cast p1, Landroid/content/pm/ResolveInfo;

    check-cast p2, Landroid/content/pm/ServiceInfo;

    iput-object p2, p1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    return-void
.end method
