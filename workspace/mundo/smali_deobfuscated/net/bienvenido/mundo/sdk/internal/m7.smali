.class public final Lnet/bienvenido/mundo/sdk/internal/m7;
.super Lkotlin/jvm/internal/MutablePropertyReference1Impl;
.source "m7.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/m7;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 8
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/m7;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/m7;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/m7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/m7;

    return-void
.end method

.method public constructor <init>()V
    .registers 5

    .line 11
    const-class v0, Landroid/content/pm/ResolveInfo;

    const-string v1, "getActivityInfo()Landroid/content/pm/ActivityInfo;"

    const/4 v2, 0x0

    const-string v3, "activityInfo"

    invoke-direct {p0, v0, v3, v1, v2}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 15
    check-cast p1, Landroid/content/pm/ResolveInfo;

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 19
    check-cast p1, Landroid/content/pm/ResolveInfo;

    check-cast p2, Landroid/content/pm/ActivityInfo;

    iput-object p2, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    return-void
.end method
