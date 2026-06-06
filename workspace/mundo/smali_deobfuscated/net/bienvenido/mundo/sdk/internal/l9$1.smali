.class Lnet/bienvenido/mundo/sdk/internal/l9$1;
.super Lkotlin/jvm/internal/MutablePropertyReference1Impl;
.source "l9.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/l9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bienvenido/mundo/sdk/internal/l9;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/internal/l9;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .registers 6

    .line 45
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/l9$1;->this$0:Lnet/bienvenido/mundo/sdk/internal/l9;

    invoke-direct {p0, p2, p3, p4, p5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 47
    check-cast p1, Landroid/content/res/ObbInfo;

    iget-object p1, p1, Landroid/content/res/ObbInfo;->packageName:Ljava/lang/String;

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 51
    check-cast p1, Landroid/content/res/ObbInfo;

    check-cast p2, Ljava/lang/String;

    iput-object p2, p1, Landroid/content/res/ObbInfo;->packageName:Ljava/lang/String;

    return-void
.end method
