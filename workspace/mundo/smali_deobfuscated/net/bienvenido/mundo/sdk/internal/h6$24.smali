.class Lnet/bienvenido/mundo/sdk/internal/h6$24;
.super Ljava/lang/Object;
.source "h6.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ActivityInfo;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/content/pm/ActivityInfo;

.field public final f$1:Ljava/lang/String;

.field public final f$2:Ljava/lang/String;

.field final synthetic val$activityInfo:Landroid/content/pm/ActivityInfo;

.field final synthetic val$str:Ljava/lang/String;

.field final synthetic val$str2:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/pm/ActivityInfo;Ljava/lang/String;Ljava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1176
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/h6$24;->val$activityInfo:Landroid/content/pm/ActivityInfo;

    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/h6$24;->val$str:Ljava/lang/String;

    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/h6$24;->val$str2:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1182
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/h6$24;->f$0:Landroid/content/pm/ActivityInfo;

    .line 1183
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/h6$24;->f$1:Ljava/lang/String;

    .line 1184
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/h6$24;->f$2:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1189
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/h6$24;->f$0:Landroid/content/pm/ActivityInfo;

    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/h6$24;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/h6$24;->f$2:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lnet/bienvenido/mundo/sdk/internal/WindowManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/pm/ActivityInfo;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
