.class public abstract Lnet/bienvenido/mundo/sdk/internal/HiddenApiBypass;
.super Ljava/lang/Object;
.source "s5.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 16

    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_c4

    .line 12
    :try_start_6
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;

    const-string v1, "dalvik.system.VMRuntime"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;-><init>(Ljava/lang/Class;)V

    .line 13
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/g;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:[Ljava/lang/Object;

    .line 14
    iget v2, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I
    :try_end_15
    .catchall {:try_start_6 .. :try_end_15} :catchall_c4

    const/4 v3, 0x2

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 19
    :try_start_1a
    sget-object v8, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    const-string v9, "putLong"

    new-array v10, v4, [Ljava/lang/Class;

    const-class v11, Ljava/lang/Object;

    aput-object v11, v10, v6

    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v11, v10, v7

    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v11, v10, v3

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_34} :catch_3a
    .catchall {:try_start_1a .. :try_end_34} :catchall_c4

    .line 20
    :try_start_34
    invoke-virtual {v8, v7}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_37
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_37} :catch_38
    .catchall {:try_start_34 .. :try_end_37} :catchall_c4

    goto :goto_3c

    :catch_38
    nop

    goto :goto_3c

    :catch_3a
    nop

    move-object v8, v5

    :goto_3c
    const/4 v9, 0x0

    :goto_3d
    if-lt v9, v2, :cond_40

    goto :goto_77

    :cond_40
    int-to-long v10, v9

    .line 30
    :try_start_41
    iget-wide v12, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->要不要把你妈卵子扣出来给你做寿司吃:J

    mul-long v10, v10, v12

    iget-wide v12, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:J

    add-long/2addr v10, v12

    if-eqz v8, :cond_63

    .line 33
    sget-object v12, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    new-array v13, v4, [Ljava/lang/Object;

    iget-object v14, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/reflect/Method;

    aput-object v14, v13, v6

    iget-wide v14, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:J

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    aput-object v14, v13, v7

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v13, v3

    invoke-virtual {v8, v12, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_63
    const-string v10, "getRuntime"

    .line 36
    iget-object v11, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/reflect/Method;

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c0

    .line 37
    iget-object v2, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/reflect/Method;

    invoke-virtual {v2, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :goto_77
    new-array v1, v7, [Ljava/lang/String;

    const-string v2, "L"

    aput-object v2, v1, v6

    .line 44
    iget v2, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:I

    const/4 v9, 0x0

    :goto_80
    if-ge v9, v2, :cond_c4

    int-to-long v10, v9

    .line 46
    iget-wide v12, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->要不要把你妈卵子扣出来给你做寿司吃:J

    mul-long v10, v10, v12

    iget-wide v12, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:J

    add-long/2addr v10, v12

    if-eqz v8, :cond_a5

    .line 49
    sget-object v12, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    new-array v13, v4, [Ljava/lang/Object;

    iget-object v14, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/reflect/Method;

    aput-object v14, v13, v6

    iget-wide v14, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:J

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    aput-object v14, v13, v7

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v13, v3

    invoke-virtual {v8, v12, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a5
    const-string v10, "setHiddenApiExemptions"

    .line 52
    iget-object v11, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/reflect/Method;

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_bd

    .line 53
    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/ArtMethodInspector;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/lang/reflect/Method;

    new-array v2, v7, [Ljava/lang/Object;

    aput-object v1, v2, v6

    invoke-virtual {v0, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_bc
    .catchall {:try_start_41 .. :try_end_bc} :catchall_c4

    return-void

    :cond_bd
    add-int/lit8 v9, v9, 0x1

    goto :goto_80

    :cond_c0
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_3d

    :catchall_c4
    :cond_c4
    return-void
.end method
