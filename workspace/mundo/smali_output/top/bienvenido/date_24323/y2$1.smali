.class Ltop/bienvenido/date_24323/y2$1;
.super Ljava/lang/Object;
.source "y2.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/date_24323/y2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Ltop/bienvenido/date_24323/s2;

.field final synthetic this$0:Ltop/bienvenido/date_24323/y2;

.field final synthetic val$s2Var:Ltop/bienvenido/date_24323/s2;


# direct methods
.method constructor <init>(Ltop/bienvenido/date_24323/y2;Ltop/bienvenido/date_24323/s2;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Ltop/bienvenido/date_24323/y2$1;->this$0:Ltop/bienvenido/date_24323/y2;

    iput-object p2, p0, Ltop/bienvenido/date_24323/y2$1;->val$s2Var:Ltop/bienvenido/date_24323/s2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p2, p0, Ltop/bienvenido/date_24323/y2$1;->f$0:Ltop/bienvenido/date_24323/s2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 40
    iget-object v0, p0, Ltop/bienvenido/date_24323/y2$1;->f$0:Ltop/bienvenido/date_24323/s2;

    check-cast p1, Landroid/media/session/MediaSession$Token;

    invoke-static {v0, p1}, Ltop/bienvenido/date_24323/y2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ltop/bienvenido/date_24323/s2;Landroid/media/session/MediaSession$Token;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
