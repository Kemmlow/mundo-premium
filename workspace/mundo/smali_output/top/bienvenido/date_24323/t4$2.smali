.class Ltop/bienvenido/date_24323/t4$2;
.super Ljava/lang/Object;
.source "t4.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/date_24323/t4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Z)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$str:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 61
    iput-object p1, p0, Ltop/bienvenido/date_24323/t4$2;->val$str:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 64
    iget-object v0, p0, Ltop/bienvenido/date_24323/t4$2;->val$str:Ljava/lang/String;

    check-cast p1, Landroid/content/pm/PackageManager;

    invoke-static {v0, p1}, Ltop/bienvenido/date_24323/t4;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Landroid/content/pm/PackageManager;)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    return-object p1
.end method
