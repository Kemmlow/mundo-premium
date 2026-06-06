.class public final Ltop/bienvenido/date_24323/e7;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "e7.java"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/e7;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 8
    new-instance v0, Ltop/bienvenido/date_24323/e7;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/e7;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/e7;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/e7;

    return-void
.end method

.method public constructor <init>()V
    .registers 7

    const/4 v1, 0x4

    .line 11
    const-class v2, Ltop/bienvenido/date_24323/m0;

    const-string v3, "resolveService"

    const-string v4, "resolveService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;"

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

    invoke-interface {p1, p2, p3, p4}, Ltop/bienvenido/date_24323/m0;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    return-object p1
.end method
