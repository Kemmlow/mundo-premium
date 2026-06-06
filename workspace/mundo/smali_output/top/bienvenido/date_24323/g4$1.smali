.class Ltop/bienvenido/date_24323/g4$1;
.super Ljava/lang/Object;
.source "g4.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/date_24323/g4;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/bienvenido/date_24323/g4;


# direct methods
.method constructor <init>(Ltop/bienvenido/date_24323/g4;)V
    .registers 2

    .line 25
    iput-object p1, p0, Ltop/bienvenido/date_24323/g4$1;->this$0:Ltop/bienvenido/date_24323/g4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 29
    :try_start_0
    iget-object v0, p0, Ltop/bienvenido/date_24323/g4$1;->this$0:Ltop/bienvenido/date_24323/g4;

    check-cast p1, Landroid/os/Bundle;

    invoke-static {v0, p1}, Ltop/bienvenido/date_24323/g4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ltop/bienvenido/date_24323/g4;Landroid/os/Bundle;)Lkotlin/Unit;

    move-result-object p1
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_8} :catch_9

    return-object p1

    :catch_9
    const/4 p1, 0x0

    return-object p1
.end method
