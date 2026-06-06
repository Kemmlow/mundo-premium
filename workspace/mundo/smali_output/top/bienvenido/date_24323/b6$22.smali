.class Ltop/bienvenido/date_24323/b6$22;
.super Ljava/lang/Object;
.source "b6.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/date_24323/b6;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/os/IBinder;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/os/IBinder;

.field public final f$1:Landroid/content/Intent;

.field final synthetic this$0:Ltop/bienvenido/date_24323/b6;

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Ltop/bienvenido/date_24323/b6;Landroid/os/IBinder;Landroid/content/Intent;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 656
    iput-object p1, p0, Ltop/bienvenido/date_24323/b6$22;->this$0:Ltop/bienvenido/date_24323/b6;

    iput-object p2, p0, Ltop/bienvenido/date_24323/b6$22;->val$iBinder:Landroid/os/IBinder;

    iput-object p3, p0, Ltop/bienvenido/date_24323/b6$22;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 661
    iput-object p2, p0, Ltop/bienvenido/date_24323/b6$22;->f$0:Landroid/os/IBinder;

    .line 662
    iput-object p3, p0, Ltop/bienvenido/date_24323/b6$22;->f$1:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 667
    iget-object v0, p0, Ltop/bienvenido/date_24323/b6$22;->f$0:Landroid/os/IBinder;

    iget-object v1, p0, Ltop/bienvenido/date_24323/b6$22;->f$1:Landroid/content/Intent;

    invoke-static {v0, v1}, Ltop/bienvenido/date_24323/b6;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/os/IBinder;Landroid/content/Intent;)V

    return-void
.end method
