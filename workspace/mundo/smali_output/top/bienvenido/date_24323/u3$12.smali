.class Ltop/bienvenido/date_24323/u3$12;
.super Ljava/lang/Object;
.source "u3.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/date_24323/u3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;Ljava/lang/String;)Landroid/os/IBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/content/ComponentName;

.field final synthetic this$0:Ltop/bienvenido/date_24323/u3;

.field final synthetic val$componentName:Landroid/content/ComponentName;


# direct methods
.method constructor <init>(Ltop/bienvenido/date_24323/u3;Landroid/content/ComponentName;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 825
    iput-object p1, p0, Ltop/bienvenido/date_24323/u3$12;->this$0:Ltop/bienvenido/date_24323/u3;

    iput-object p2, p0, Ltop/bienvenido/date_24323/u3$12;->val$componentName:Landroid/content/ComponentName;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 829
    iput-object p2, p0, Ltop/bienvenido/date_24323/u3$12;->f$0:Landroid/content/ComponentName;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 833
    iget-object v0, p0, Ltop/bienvenido/date_24323/u3$12;->f$0:Landroid/content/ComponentName;

    check-cast p1, Landroid/content/pm/PackageManager;

    invoke-static {v0, p1}, Ltop/bienvenido/date_24323/u3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;Landroid/content/pm/PackageManager;)Landroid/content/pm/ServiceInfo;

    move-result-object p1

    return-object p1
.end method
