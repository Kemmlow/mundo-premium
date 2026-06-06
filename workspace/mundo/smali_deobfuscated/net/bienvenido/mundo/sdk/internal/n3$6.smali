.class Lnet/bienvenido/mundo/sdk/internal/n3$6;
.super Ljava/lang/Object;
.source "n3.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/n3;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;)V
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

    .line 158
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/n3$6;->val$str:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 160
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/n3$6;->val$str:Ljava/lang/String;

    invoke-static {v0}, Lnet/bienvenido/mundo/sdk/internal/n3;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;)V

    return-void
.end method
