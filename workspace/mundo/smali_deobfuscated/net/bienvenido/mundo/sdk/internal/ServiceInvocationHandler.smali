.class public final Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;
.super Ljava/lang/Object;
.source "a1.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# static fields
.field public static final 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;


# instance fields
.field public final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

.field public final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 9
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V
    .registers 5

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;-><init>(I)V

    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    .line 16
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    .line 17
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Object;

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 20
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;-><init>(I)V

    .line 21
    invoke-static {p1, v0}, Lnet/bienvenido/mundo/sdk/internal/InterfaceTypeCollector;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;)V

    .line 22
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/g;->要不要把你妈卵子扣出来给你做寿司吃:[Ljava/lang/Class;

    invoke-virtual {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Class;

    invoke-static {p2, p1, p0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 28
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getClass"

    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 31
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :cond_13
    const-string v0, "toString"

    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_47

    .line 34
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, "@"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 39
    :cond_47
    :try_start_47
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    if-nez p1, :cond_5b

    .line 43
    iget-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    .line 45
    :cond_5b
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/Object;

    if-nez p3, :cond_61

    .line 48
    sget-object p3, Lnet/bienvenido/mundo/sdk/internal/g;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:[Ljava/lang/Object;

    .line 50
    :cond_61
    invoke-virtual {p1, v0, p2, p3}, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_65
    .catchall {:try_start_47 .. :try_end_65} :catchall_66

    return-object p1

    :catchall_66
    move-exception p1

    .line 52
    instance-of p2, p1, Ljava/lang/reflect/InvocationTargetException;

    if-eqz p2, :cond_72

    .line 53
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_72

    .line 55
    throw p2

    .line 58
    :cond_72
    throw p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([ILnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V
    .registers 7

    .line 63
    array-length v0, p1

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_e

    aget v2, p1, v1

    .line 64
    iget-object v3, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {v3, v2, p2}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_e
    return-void
.end method
