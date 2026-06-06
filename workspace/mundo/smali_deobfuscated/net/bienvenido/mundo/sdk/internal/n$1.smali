.class Lnet/bienvenido/mundo/sdk/internal/n$1;
.super Ljava/lang/Object;
.source "n.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/n;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILnet/bienvenido/mundo/sdk/internal/MethodHookBase;)Lnet/bienvenido/mundo/sdk/internal/AppVirtualSensor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:I

.field public final f$1:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

.field final synthetic val$a2Var:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

.field final synthetic val$i:I


# direct methods
.method constructor <init>(ILnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 8
    iput p1, p0, Lnet/bienvenido/mundo/sdk/internal/n$1;->val$i:I

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/n$1;->val$a2Var:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lnet/bienvenido/mundo/sdk/internal/n$1;->f$0:I

    .line 14
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/n$1;->f$1:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 18
    iget v0, p0, Lnet/bienvenido/mundo/sdk/internal/n$1;->f$0:I

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/n$1;->f$1:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    invoke-static {v0, v1, p1}, Lnet/bienvenido/mundo/sdk/internal/n;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
