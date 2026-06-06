.class Lnet/bienvenido/mundo/sdk/internal/z0$1;
.super Ljava/lang/Object;
.source "z0.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

.field public final f$1:Ljava/lang/Object;

.field final synthetic val$a2Var:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

.field final synthetic val$obj:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/Object;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 21
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z0$1;->val$a2Var:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/z0$1;->val$obj:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/z0$1;->f$0:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    .line 27
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/z0$1;->f$1:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    .line 32
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/z0$1;->f$0:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/z0$1;->f$1:Ljava/lang/Object;

    invoke-static {v0, v1, p1, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
