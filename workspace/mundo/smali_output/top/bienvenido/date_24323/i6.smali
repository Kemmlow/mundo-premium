.class public final Ltop/bienvenido/date_24323/i6;
.super Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;
.source "i6.java"


# static fields
.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/i6;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 7
    new-instance v0, Ltop/bienvenido/date_24323/i6;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/i6;-><init>()V

    sput-object v0, Ltop/bienvenido/date_24323/i6;->要不要把你妈卵子扣出来给你做寿司吃:Ltop/bienvenido/date_24323/i6;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 6
    invoke-direct {p0}, Ltop/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹;-><init>()V

    return-void
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 6

    .line 12
    sget-object v0, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    invoke-static {v0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    .line 17
    :cond_9
    :try_start_9
    const-class v1, Landroid/nfc/NfcAdapter;

    const-string v2, "sService"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 19
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v2

    and-int/lit8 v2, v2, 0x8

    if-nez v2, :cond_33

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_33

    new-instance v2, Ltop/bienvenido/date_24323/q2;

    sget-object v3, Ltop/bienvenido/date_24323/t9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v3, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, Ltop/bienvenido/date_24323/q2;-><init>(J)V

    goto :goto_3b

    :cond_33
    new-instance v2, Ltop/bienvenido/date_24323/p2;

    invoke-direct {v2, v1}, Ltop/bienvenido/date_24323/p2;-><init>(Ljava/lang/reflect/Field;)V
    :try_end_38
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_38} :catch_39

    goto :goto_3b

    .line 21
    :catch_39
    sget-object v2, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/s2;

    .line 23
    :goto_3b
    invoke-virtual {v2, v0}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_42

    return-void

    .line 27
    :cond_42
    sget-object v1, Ltop/bienvenido/date_24323/q4;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ltop/bienvenido/date_24323/b2;

    iput-object v1, p0, Ltop/bienvenido/date_24323/i6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ltop/bienvenido/date_24323/a2;

    const-string v1, "nfc"

    .line 28
    invoke-virtual {p0, v1, v0}, Ltop/bienvenido/date_24323/i6;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/Object;)Ltop/bienvenido/date_24323/a1;

    move-result-object v0

    if-nez v0, :cond_4f

    return-void

    :cond_4f
    const/4 v1, 0x0

    .line 32
    iget-object v0, v0, Ltop/bienvenido/date_24323/a1;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/Object;

    invoke-virtual {v2, v1, v0}, Ltop/bienvenido/date_24323/s2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
