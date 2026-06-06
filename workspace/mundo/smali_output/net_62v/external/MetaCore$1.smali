.class Lnet_62v/external/MetaCore$1;
.super Ljava/lang/Object;
.source "MetaCore.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet_62v/external/MetaCore;->addServiceInterpreter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/reflect/InvocationHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$a2Var3:Ltop/bienvenido/date_24323/a2;


# direct methods
.method constructor <init>(Ltop/bienvenido/date_24323/a2;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 29
    iput-object p1, p0, Lnet_62v/external/MetaCore$1;->val$a2Var3:Ltop/bienvenido/date_24323/a2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lnet_62v/external/MetaCore$1;->val$a2Var3:Ltop/bienvenido/date_24323/a2;

    invoke-virtual {v0, p1, p2, p3}, Ltop/bienvenido/date_24323/a2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
