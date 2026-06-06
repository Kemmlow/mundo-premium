.class public final Lnet/bienvenido/mundo/sdk/internal/AppVirtualActivity;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "c8.java"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppVirtualActivity;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 7
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualActivity;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/AppVirtualActivity;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/AppVirtualActivity;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/AppVirtualActivity;

    return-void
.end method

.method public constructor <init>()V
    .registers 7

    const/4 v1, 0x3

    .line 10
    const-class v2, Ltop/bienvenido/date_24323/m0;

    const-string v3, "getPackageInfo"

    const-string v4, "getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 14
    check-cast p1, Ltop/bienvenido/date_24323/m0;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-interface {p1, p2, p3}, Ltop/bienvenido/date_24323/m0;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1
.end method
