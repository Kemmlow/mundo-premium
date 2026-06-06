.class public final Lnet/bienvenido/mundo/sdk/internal/MultiUserService;
.super Lkotlin/jvm/internal/MutablePropertyReference1Impl;
.source "ba.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MultiUserService;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 7
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/MultiUserService;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/MultiUserService;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/MultiUserService;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/MultiUserService;

    return-void
.end method

.method public constructor <init>()V
    .registers 5

    .line 10
    const-class v0, Landroid/view/WindowManager$LayoutParams;

    const-string v1, "getPackageName()Ljava/lang/String;"

    const/4 v2, 0x0

    const-string v3, "packageName"

    invoke-direct {p0, v0, v3, v1, v2}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 14
    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    iget-object p1, p1, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 18
    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    check-cast p2, Ljava/lang/String;

    iput-object p2, p1, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    return-void
.end method
