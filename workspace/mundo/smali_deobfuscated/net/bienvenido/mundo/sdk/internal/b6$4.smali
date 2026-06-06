.class Lnet/bienvenido/mundo/sdk/internal/b6$4;
.super Ljava/lang/Object;
.source "b6.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/bienvenido/mundo/sdk/internal/MundoCoreReflection;->孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$r0:Lnet/bienvenido/mundo/sdk/external/狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;


# direct methods
.method constructor <init>(Lnet/bienvenido/mundo/sdk/external/狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 205
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/b6$4;->val$r0:Lnet/bienvenido/mundo/sdk/external/狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 5

    :try_start_0
    const-string v0, "Mundo_AntiBan"

    const-string v1, "18s passed. Injecting user libraries now!"

    .line 209
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/b6$4;->val$r0:Lnet/bienvenido/mundo/sdk/external/狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/external/狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet_62v/external/IMundoProcessCallback;

    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/String;

    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/AppVirtualEnv;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lnet_62v/external/IMundoProcessCallback;->onCreate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_0 .. :try_end_14} :catchall_15

    goto :goto_19

    :catchall_15
    move-exception v0

    .line 212
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_19
    return-void
.end method
