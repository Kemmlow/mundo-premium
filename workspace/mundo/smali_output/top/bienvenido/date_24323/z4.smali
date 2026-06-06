.class public final Ltop/bienvenido/date_24323/z4;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "z4.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/z4;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 9
    new-instance v0, Ltop/bienvenido/date_24323/z4;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/z4;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/z4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/z4;

    return-void
.end method

.method public constructor <init>()V
    .registers 7

    const/4 v1, 0x1

    .line 12
    const-class v2, Ltop/bienvenido/date_24323/k0;

    const-string v3, "asInterface"

    const-string v4, "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoPackageManagerService;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 16
    check-cast p1, Landroid/os/IBinder;

    if-nez p1, :cond_6

    const/4 p1, 0x0

    return-object p1

    :cond_6
    const-string v0, "MundoPackageManagerService"

    .line 21
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 22
    instance-of v1, v0, Ltop/bienvenido/date_24323/m0;

    if-nez v1, :cond_13

    goto :goto_16

    :cond_13
    check-cast v0, Ltop/bienvenido/date_24323/m0;

    goto :goto_1b

    :cond_16
    :goto_16
    new-instance v0, Ltop/bienvenido/date_24323/j0;

    invoke-direct {v0, p1}, Ltop/bienvenido/date_24323/j0;-><init>(Landroid/os/IBinder;)V

    :goto_1b
    return-object v0
.end method
