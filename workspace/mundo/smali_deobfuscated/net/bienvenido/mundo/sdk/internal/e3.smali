.class public final Lnet/bienvenido/mundo/sdk/internal/e3;
.super Lnet/bienvenido/mundo/sdk/internal/u8;
.source "e3.java"


# instance fields
.field private final mResponse:Landroid/accounts/IAccountManagerResponse;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLandroid/accounts/IAccountManagerResponse;)V
    .registers 12

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p3

    move-object v2, p1

    move v3, p2

    .line 11
    invoke-direct/range {v0 .. v7}, Lnet/bienvenido/mundo/sdk/internal/u8;-><init>(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;ZZLjava/lang/String;ZZ)V

    .line 12
    iput-object p3, p0, Lnet/bienvenido/mundo/sdk/internal/e3;->mResponse:Landroid/accounts/IAccountManagerResponse;

    return-void
.end method


# virtual methods
.method public final 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度()V
    .registers 4

    .line 17
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/e3;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Landroid/accounts/IAccountAuthenticator;

    if-eqz v0, :cond_b

    .line 20
    iget-object v1, p0, Lnet/bienvenido/mundo/sdk/internal/e3;->mResponse:Landroid/accounts/IAccountManagerResponse;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/e3;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/accounts/IAccountAuthenticator;->editProperties(Landroid/accounts/IAccountManagerResponse;Ljava/lang/String;)V

    :cond_b
    return-void
.end method
