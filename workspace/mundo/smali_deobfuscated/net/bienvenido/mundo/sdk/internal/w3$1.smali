.class Lnet/bienvenido/mundo/sdk/internal/w3$1;
.super Ljava/lang/Object;
.source "w3.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/w3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final f$1:[Landroid/content/Intent;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/w3;

.field final synthetic val$intentArr:[Landroid/content/Intent;

.field final synthetic val$objectRef:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/w3;Lkotlin/jvm/internal/Ref$ObjectRef;[Landroid/content/Intent;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 35
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/w3$1;->this$0:Lnet/bienvenido/mundo/sdk/internal/w3;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/w3$1;->val$objectRef:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/w3$1;->val$intentArr:[Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/w3$1;->f$0:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 41
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/w3$1;->f$1:[Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 45
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/w3$1;->f$0:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/w3$1;->f$1:[Landroid/content/Intent;

    check-cast p1, Ltop/bienvenido/date_24323/p0;

    invoke-static {v0, v1, p1}, Lnet/bienvenido/mundo/sdk/internal/w3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/internal/Ref$ObjectRef;[Landroid/content/Intent;Ltop/bienvenido/date_24323/p0;)[Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
