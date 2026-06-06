.class public final Lnet/bienvenido/mundo/sdk/internal/i3;
.super Ljava/lang/Object;
.source "i3.java"


# instance fields
.field public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/s9;

.field public 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/ArrayList;

.field public 要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/i3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/util/ArrayList;

    .line 9
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/i3;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/util/Map;

    .line 10
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/s9;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/s9;-><init>()V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/i3;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/s9;

    return-void
.end method
