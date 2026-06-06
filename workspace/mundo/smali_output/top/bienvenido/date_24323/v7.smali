.class public final Ltop/bienvenido/date_24323/v7;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "v7.java"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/v7;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 8
    new-instance v0, Ltop/bienvenido/date_24323/v7;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/v7;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/v7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/v7;

    return-void
.end method

.method public constructor <init>()V
    .registers 7

    const/4 v1, 0x2

    .line 11
    const-class v2, Ltop/bienvenido/date_24323/m0;

    const-string v3, "getProviderInfo"

    const-string v4, "getProviderInfo(Landroid/content/ComponentName;)Landroid/content/pm/ProviderInfo;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 15
    check-cast p1, Ltop/bienvenido/date_24323/m0;

    check-cast p2, Landroid/content/ComponentName;

    invoke-interface {p1, p2}, Ltop/bienvenido/date_24323/m0;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/content/ComponentName;)Landroid/content/pm/ProviderInfo;

    move-result-object p1

    return-object p1
.end method
