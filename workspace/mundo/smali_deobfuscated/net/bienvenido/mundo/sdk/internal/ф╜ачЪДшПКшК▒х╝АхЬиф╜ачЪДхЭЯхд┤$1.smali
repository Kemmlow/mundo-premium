.class Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头$1;
.super Ljava/lang/Object;
.source "\u4f60\u7684\u83ca\u82b1\u5f00\u5728\u4f60\u7684\u575f\u5934.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/content/IIntentReceiver;

.field public final f$1:Landroid/content/IntentFilter;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头;

.field final synthetic val$iIntentReceiver:Landroid/content/IIntentReceiver;

.field final synthetic val$intentFilter:Landroid/content/IntentFilter;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头;Landroid/content/IIntentReceiver;Landroid/content/IntentFilter;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 38
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头$1;->this$0:Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头$1;->val$iIntentReceiver:Landroid/content/IIntentReceiver;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头$1;->val$intentFilter:Landroid/content/IntentFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头$1;->f$0:Landroid/content/IIntentReceiver;

    .line 40
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头$1;->f$1:Landroid/content/IntentFilter;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 44
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头$1;->f$0:Landroid/content/IIntentReceiver;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头$1;->f$1:Landroid/content/IntentFilter;

    invoke-static {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/你的菊花开在你的坟头;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/IIntentReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method
