.class Ltop/bienvenido/date_24323/y6$1;
.super Ljava/lang/Object;
.source "y6.java"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/bienvenido/date_24323/y6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:Ljava/lang/String;

.field final synthetic this$0:Ltop/bienvenido/date_24323/y6;

.field final synthetic val$str:Ljava/lang/String;


# direct methods
.method constructor <init>(Ltop/bienvenido/date_24323/y6;Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 28
    iput-object p1, p0, Ltop/bienvenido/date_24323/y6$1;->this$0:Ltop/bienvenido/date_24323/y6;

    iput-object p2, p0, Ltop/bienvenido/date_24323/y6$1;->val$str:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p2, p0, Ltop/bienvenido/date_24323/y6$1;->f$0:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 36
    iget-object v0, p0, Ltop/bienvenido/date_24323/y6$1;->f$0:Ljava/lang/String;

    check-cast p1, Ltop/bienvenido/date_24323/m0;

    invoke-static {v0, p1}, Ltop/bienvenido/date_24323/y6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ltop/bienvenido/date_24323/m0;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
