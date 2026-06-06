.class Lnet/bienvenido/mundo/sdk/internal/q5$2;
.super Ljava/lang/Object;
.source "q5.java"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/TaskRecord;->要不要把你妈卵子扣出来给你做寿司吃(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public final f$0:I

.field final synthetic val$i:I


# direct methods
.method constructor <init>(I)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 128
    iput p1, p0, Lnet/bienvenido/mundo/sdk/internal/q5$2;->val$i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput p1, p0, Lnet/bienvenido/mundo/sdk/internal/q5$2;->f$0:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 136
    iget v0, p0, Lnet/bienvenido/mundo/sdk/internal/q5$2;->f$0:I

    check-cast p1, Ltop/bienvenido/date_24323/r;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lnet/bienvenido/mundo/sdk/internal/TaskRecord;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILtop/bienvenido/date_24323/r;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
