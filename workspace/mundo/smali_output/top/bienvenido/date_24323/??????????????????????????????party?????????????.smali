.class public final Ltop/bienvenido/date_24323/亲亲这边建议您先把你妈杀了然后你个孤儿自己钻灵车里办个入坟头party然后我们给你吹一曲百鸟朝凤;
.super Ltop/bienvenido/date_24323/b2;
.source "\u4eb2\u4eb2\u8fd9\u8fb9\u5efa\u8bae\u60a8\u5148\u628a\u4f60\u5988\u6740\u4e86\u7136\u540e\u4f60\u4e2a\u5b64\u513f\u81ea\u5df1\u94bb\u7075\u8f66\u91cc\u529e\u4e2a\u5165\u575f\u5934party\u7136\u540e\u6211\u4eec\u7ed9\u4f60\u5439\u4e00\u66f2\u767e\u9e1f\u671d\u51e4.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ltop/bienvenido/date_24323/b2;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    .line 10
    invoke-super {p0, p1, p2, p3}, Ltop/bienvenido/date_24323/b2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_32

    const/4 p1, 0x0

    :try_start_7
    const-string p2, "sun.misc.Unsafe"

    .line 15
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    const-string p3, "theUnsafe"

    .line 16
    invoke-virtual {p2, p3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p3

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p3, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 18
    invoke-virtual {p3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    const-string v1, "allocateInstance"

    new-array v2, v0, [Ljava/lang/Class;

    .line 20
    const-class v3, Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p2, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    new-array v0, v0, [Ljava/lang/Object;

    .line 21
    const-class v1, Landroid/app/usage/StorageStats;

    aput-object v1, v0, v4

    invoke-virtual {p2, p3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_32
    .catchall {:try_start_7 .. :try_end_32} :catchall_32

    :catchall_32
    :cond_32
    return-object p1
.end method
