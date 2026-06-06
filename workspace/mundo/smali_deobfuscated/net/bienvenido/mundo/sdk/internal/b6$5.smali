.class Lnet/bienvenido/mundo/sdk/internal/b6$5;
.super Ljava/lang/Object;
.source "b6.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/os/IBinder;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/os/IBinder;

.field public final f$1:Landroid/content/Intent;

.field public final f$2:Landroid/os/IBinder;

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$iBinderOnBind:Landroid/os/IBinder;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Landroid/os/IBinder;Landroid/content/Intent;Landroid/os/IBinder;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 244
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/b6$5;->val$iBinder:Landroid/os/IBinder;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/b6$5;->val$intent:Landroid/content/Intent;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/b6$5;->val$iBinderOnBind:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 250
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/b6$5;->f$0:Landroid/os/IBinder;

    .line 251
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/b6$5;->f$1:Landroid/content/Intent;

    .line 252
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/b6$5;->f$2:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 256
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/b6$5;->f$0:Landroid/os/IBinder;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/b6$5;->f$1:Landroid/content/Intent;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/b6$5;->f$2:Landroid/os/IBinder;

    check-cast p1, Ltop/bienvenido/date_24323/c0;

    invoke-static {v0, v1, v2, p1}, Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Landroid/content/Intent;Landroid/os/IBinder;Ltop/bienvenido/date_24323/c0;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
