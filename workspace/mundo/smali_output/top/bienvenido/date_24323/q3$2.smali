.class Ltop/bienvenido/date_24323/q3$2;
.super Ljava/lang/Object;
.source "q3.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/date_24323/q3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/os/IBinder;

.field public final f$1:Landroid/os/IBinder;

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$iBinder2:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;Landroid/os/IBinder;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 107
    iput-object p1, p0, Ltop/bienvenido/date_24323/q3$2;->val$iBinder:Landroid/os/IBinder;

    iput-object p2, p0, Ltop/bienvenido/date_24323/q3$2;->val$iBinder2:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p1, p0, Ltop/bienvenido/date_24323/q3$2;->f$0:Landroid/os/IBinder;

    .line 113
    iput-object p2, p0, Ltop/bienvenido/date_24323/q3$2;->f$1:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 117
    iget-object v0, p0, Ltop/bienvenido/date_24323/q3$2;->f$0:Landroid/os/IBinder;

    iget-object v1, p0, Ltop/bienvenido/date_24323/q3$2;->f$1:Landroid/os/IBinder;

    check-cast p1, Ltop/bienvenido/date_24323/p0;

    invoke-static {v0, v1, p1}, Ltop/bienvenido/date_24323/q3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/os/IBinder;Ltop/bienvenido/date_24323/p0;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
