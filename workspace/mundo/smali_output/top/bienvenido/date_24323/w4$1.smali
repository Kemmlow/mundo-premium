.class Ltop/bienvenido/date_24323/w4$1;
.super Ljava/lang/Object;
.source "w4.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/date_24323/w4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/os/IBinder;

.field public final f$1:Landroid/content/Intent;

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Landroid/os/IBinder;Landroid/content/Intent;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 23
    iput-object p1, p0, Ltop/bienvenido/date_24323/w4$1;->val$iBinder:Landroid/os/IBinder;

    iput-object p2, p0, Ltop/bienvenido/date_24323/w4$1;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Ltop/bienvenido/date_24323/w4$1;->f$0:Landroid/os/IBinder;

    .line 29
    iput-object p2, p0, Ltop/bienvenido/date_24323/w4$1;->f$1:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 34
    iget-object v0, p0, Ltop/bienvenido/date_24323/w4$1;->f$0:Landroid/os/IBinder;

    iget-object v1, p0, Ltop/bienvenido/date_24323/w4$1;->f$1:Landroid/content/Intent;

    invoke-static {v0, v1}, Ltop/bienvenido/date_24323/w4;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/os/IBinder;Landroid/content/Intent;)V

    return-void
.end method
