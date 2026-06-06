.class Ltop/bienvenido/date_24323/b6$19;
.super Ljava/lang/Object;
.source "b6.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/date_24323/b6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Ljava/lang/String;

.field public final f$1:Landroid/content/Intent;

.field public final f$2:Landroid/os/IBinder;

.field public final f$3:I

.field final synthetic this$0:Ltop/bienvenido/date_24323/b6;

.field final synthetic val$i:I

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$intent:Landroid/content/Intent;

.field final synthetic val$str:Ljava/lang/String;


# direct methods
.method constructor <init>(Ltop/bienvenido/date_24323/b6;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;I)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 574
    iput-object p1, p0, Ltop/bienvenido/date_24323/b6$19;->this$0:Ltop/bienvenido/date_24323/b6;

    iput-object p2, p0, Ltop/bienvenido/date_24323/b6$19;->val$str:Ljava/lang/String;

    iput-object p3, p0, Ltop/bienvenido/date_24323/b6$19;->val$intent:Landroid/content/Intent;

    iput-object p4, p0, Ltop/bienvenido/date_24323/b6$19;->val$iBinder:Landroid/os/IBinder;

    iput p5, p0, Ltop/bienvenido/date_24323/b6$19;->val$i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 581
    iput-object p2, p0, Ltop/bienvenido/date_24323/b6$19;->f$0:Ljava/lang/String;

    .line 582
    iput-object p3, p0, Ltop/bienvenido/date_24323/b6$19;->f$1:Landroid/content/Intent;

    .line 583
    iput-object p4, p0, Ltop/bienvenido/date_24323/b6$19;->f$2:Landroid/os/IBinder;

    .line 584
    iput p5, p0, Ltop/bienvenido/date_24323/b6$19;->f$3:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 589
    iget-object v0, p0, Ltop/bienvenido/date_24323/b6$19;->f$0:Ljava/lang/String;

    iget-object v1, p0, Ltop/bienvenido/date_24323/b6$19;->f$1:Landroid/content/Intent;

    iget-object v2, p0, Ltop/bienvenido/date_24323/b6$19;->f$2:Landroid/os/IBinder;

    iget v3, p0, Ltop/bienvenido/date_24323/b6$19;->f$3:I

    invoke-static {v0, v1, v2, v3}, Ltop/bienvenido/date_24323/b6;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;I)V

    return-void
.end method
