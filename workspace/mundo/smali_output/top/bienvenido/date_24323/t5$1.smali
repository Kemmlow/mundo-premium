.class Ltop/bienvenido/date_24323/t5$1;
.super Ljava/lang/Object;
.source "t5.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/date_24323/t5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/app/job/JobParameters;)Landroid/app/job/JobService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Landroid/content/ComponentName;

.field final synthetic this$0:Ltop/bienvenido/date_24323/t5;

.field final synthetic val$componentNameUnflattenFromString:Landroid/content/ComponentName;


# direct methods
.method constructor <init>(Ltop/bienvenido/date_24323/t5;Landroid/content/ComponentName;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 113
    iput-object p1, p0, Ltop/bienvenido/date_24323/t5$1;->this$0:Ltop/bienvenido/date_24323/t5;

    iput-object p2, p0, Ltop/bienvenido/date_24323/t5$1;->val$componentNameUnflattenFromString:Landroid/content/ComponentName;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object p2, p0, Ltop/bienvenido/date_24323/t5$1;->f$0:Landroid/content/ComponentName;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 121
    iget-object v0, p0, Ltop/bienvenido/date_24323/t5$1;->f$0:Landroid/content/ComponentName;

    check-cast p1, Ltop/bienvenido/date_24323/c0;

    invoke-static {v0, p1}, Ltop/bienvenido/date_24323/t5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/ComponentName;Ltop/bienvenido/date_24323/c0;)Landroid/app/job/JobService;

    move-result-object p1

    return-object p1
.end method
