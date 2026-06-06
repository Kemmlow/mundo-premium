.class public final Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;
.super Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;
.source "q2.java"


# instance fields
.field public final 要不要把你妈卵子扣出来给你做寿司吃:J


# direct methods
.method public constructor <init>(J)V
    .registers 3

    .line 6
    invoke-direct {p0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;-><init>()V

    .line 7
    iput-wide p1, p0, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:J

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 12
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    iget-wide v1, p0, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:J

    invoke-virtual {v0, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 6

    .line 17
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    iget-wide v1, p0, Lnet/bienvenido/mundo/sdk/internal/InstanceFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:J

    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method
