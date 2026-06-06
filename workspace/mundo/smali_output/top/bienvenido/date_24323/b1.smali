.class public final Ltop/bienvenido/date_24323/b1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "b1.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/b1;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 8
    new-instance v0, Ltop/bienvenido/date_24323/b1;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/b1;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/b1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/b1;

    return-void
.end method

.method public constructor <init>()V
    .registers 7

    const/4 v1, 0x1

    .line 11
    const-class v2, Landroid/content/pm/ParceledListSlice;

    const-string v3, "getList"

    const-string v4, "getList()Ljava/util/List;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 15
    check-cast p1, Landroid/content/pm/ParceledListSlice;

    invoke-virtual {p1}, Landroid/content/pm/ParceledListSlice;->getList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
