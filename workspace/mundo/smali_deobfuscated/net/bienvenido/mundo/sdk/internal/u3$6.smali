.class Lnet/bienvenido/mundo/sdk/internal/u3$6;
.super Ljava/lang/Object;
.source "u3.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/os/IBinder;

.field public final f$1:Lnet/bienvenido/mundo/sdk/internal/u5;

.field public final f$2:Lkotlin/Pair;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

.field final synthetic val$iBinder:Landroid/os/IBinder;

.field final synthetic val$pair:Lkotlin/Pair;

.field final synthetic val$u5Var5:Lnet/bienvenido/mundo/sdk/internal/u5;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;Landroid/os/IBinder;Lnet/bienvenido/mundo/sdk/internal/u5;Lkotlin/Pair;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 384
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/u3$6;->this$0:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$6;->val$iBinder:Landroid/os/IBinder;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/u3$6;->val$u5Var5:Lnet/bienvenido/mundo/sdk/internal/u5;

    iput-object p4, p0, Lnet/bienvenido/mundo/sdk/internal/u3$6;->val$pair:Lkotlin/Pair;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 390
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$6;->f$0:Landroid/os/IBinder;

    .line 391
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/u3$6;->f$1:Lnet/bienvenido/mundo/sdk/internal/u5;

    .line 392
    iput-object p4, p0, Lnet/bienvenido/mundo/sdk/internal/u3$6;->f$2:Lkotlin/Pair;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 397
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/u3$6;->f$0:Landroid/os/IBinder;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/u3$6;->f$1:Lnet/bienvenido/mundo/sdk/internal/u5;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$6;->f$2:Lkotlin/Pair;

    invoke-static {v0, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/IBinder;Lnet/bienvenido/mundo/sdk/internal/u5;Lkotlin/Pair;)V

    return-void
.end method
