.class Lnet/bienvenido/mundo/sdk/internal/u3$2;
.super Ljava/lang/Object;
.source "u3.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Landroid/content/Intent;Ljava/lang/String;)Landroid/content/ComponentName;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

.field public final f$1:Landroid/content/pm/ServiceInfo;

.field public final f$2:Landroid/content/Intent;

.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

.field final synthetic val$intent:Landroid/content/Intent;

.field final synthetic val$o5Var:Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

.field final synthetic val$serviceInfo:Landroid/content/pm/ServiceInfo;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;Landroid/content/pm/ServiceInfo;Landroid/content/Intent;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 204
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/u3$2;->this$0:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$2;->val$o5Var:Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/u3$2;->val$serviceInfo:Landroid/content/pm/ServiceInfo;

    iput-object p4, p0, Lnet/bienvenido/mundo/sdk/internal/u3$2;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$2;->f$0:Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

    .line 211
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/u3$2;->f$1:Landroid/content/pm/ServiceInfo;

    .line 212
    iput-object p4, p0, Lnet/bienvenido/mundo/sdk/internal/u3$2;->f$2:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 217
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/u3$2;->f$0:Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/u3$2;->f$1:Landroid/content/pm/ServiceInfo;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/u3$2;->f$2:Landroid/content/Intent;

    invoke-static {v0, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/WindowManagerHookImpl;Landroid/content/pm/ServiceInfo;Landroid/content/Intent;)V

    return-void
.end method
