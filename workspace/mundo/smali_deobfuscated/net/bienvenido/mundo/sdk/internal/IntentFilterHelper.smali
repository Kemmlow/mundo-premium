.class public abstract Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;
.super Ljava/lang/Object;
.source "i1.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;Z)Lkotlin/Pair;
    .registers 2

    .line 30
    :try_start_0
    invoke-static {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/io/File;Z)Lkotlin/Pair;

    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    if-nez p1, :cond_d

    return-object p0

    .line 35
    :cond_d
    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/AppWindowController;)V

    const/4 p0, 0x1

    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_19} :catch_1a

    return-object p0

    :catch_1a
    const/4 p0, -0x1

    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;Ljava/io/File;)I
    .registers 5

    const/4 v0, 0x0

    .line 141
    :try_start_1
    invoke-static {p0}, Lcom/android/internal/content/NativeLibraryHelper$Handle;->create(Ljava/io/File;)Lcom/android/internal/content/NativeLibraryHelper$Handle;

    move-result-object p0

    .line 142
    invoke-static {}, Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()[Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/android/internal/content/NativeLibraryHelper;->findSupportedAbi(Lcom/android/internal/content/NativeLibraryHelper$Handle;[Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_10

    return v0

    .line 146
    :cond_10
    invoke-static {}, Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v1

    invoke-static {p0, p1, v2}, Lcom/android/internal/content/NativeLibraryHelper;->copyNativeBinaries(Lcom/android/internal/content/NativeLibraryHelper$Handle;Ljava/io/File;Ljava/lang/String;)I
    :try_end_19
    .catchall {:try_start_1 .. :try_end_19} :catchall_1a

    return v1

    :catchall_1a
    return v0
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;ILandroid/content/pm/PackageManager;)Landroid/content/pm/PackageInfo;
    .registers 4

    .line 154
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    .line 155
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    .line 157
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    if-eqz v0, :cond_d

    const/high16 v0, 0x8000000

    or-int/2addr p1, v0

    .line 160
    :cond_d
    invoke-virtual {p2, p0, p1}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    return-object p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;Z)Lkotlin/Pair;
    .registers 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 179
    :try_start_2
    new-instance v2, Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    invoke-direct {v2, v1}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;-><init>(I)V

    .line 180
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v3
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_b} :catch_1d8
    .catchall {:try_start_2 .. :try_end_b} :catchall_1cd

    const-string v4, ".apk"

    const/4 v5, 0x1

    if-eqz v3, :cond_49

    .line 181
    :try_start_10
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    if-nez p0, :cond_29

    const/4 p0, -0x3

    .line 183
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_1f} :catch_1d8
    .catchall {:try_start_10 .. :try_end_1f} :catchall_1cd

    .line 185
    :try_start_1f
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 186
    invoke-static {v1}, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Z)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_28} :catch_28
    .catchall {:try_start_1f .. :try_end_28} :catchall_1cd

    :catch_28
    return-object p0

    .line 192
    :cond_29
    :try_start_29
    array-length v3, p0

    const/4 v6, 0x0

    :goto_2b
    if-ge v6, v3, :cond_a9

    aget-object v7, p0, v6

    .line 193
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8
    :try_end_37
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_37} :catch_1d8
    .catchall {:try_start_29 .. :try_end_37} :catchall_1cd

    if-eqz v8, :cond_46

    .line 195
    :try_start_39
    invoke-static {v7, v1}, Landroid/content/pm/PackageParser;->parseApkLite(Ljava/io/File;I)Landroid/content/pm/PackageParser$ApkLite;

    move-result-object v8

    .line 196
    iget-object v9, v8, Landroid/content/pm/PackageParser$ApkLite;->splitName:Ljava/lang/String;

    invoke-static {v7, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    invoke-virtual {v2, v9, v7}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_46
    .catchall {:try_start_39 .. :try_end_46} :catchall_46

    :catchall_46
    :cond_46
    add-int/lit8 v6, v6, 0x1

    goto :goto_2b

    .line 202
    :cond_49
    :try_start_49
    invoke-static {v5}, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Z)Ljava/io/File;

    move-result-object p1

    .line 203
    sget-object v3, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 204
    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/i;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/io/File;)V

    .line 205
    new-instance v3, Ljava/util/zip/ZipFile;

    invoke-direct {v3, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    .line 208
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object p0

    .line 209
    :catch_5b
    :cond_5b
    :goto_5b
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v6

    if-eqz v6, :cond_a0

    .line 210
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/zip/ZipEntry;

    .line 211
    invoke-virtual {v6}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v7

    .line 212
    invoke-virtual {v7, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5b

    .line 213
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, p1, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 214
    invoke-virtual {v3, v6}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v6

    if-eqz v6, :cond_5b

    .line 217
    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v9, 0x2000

    .line 219
    invoke-static {v6, v7, v9}, Lkotlin/io/ByteStreamsKt;->copyTo(Ljava/io/InputStream;Ljava/io/OutputStream;I)J

    .line 220
    move-object v9, v0

    check-cast v9, Ljava/lang/Throwable;

    invoke-static {v7, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 221
    move-object v7, v0

    check-cast v7, Ljava/lang/Throwable;

    invoke-static {v6, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_92
    .catch Ljava/lang/Exception; {:try_start_49 .. :try_end_92} :catch_1d8
    .catchall {:try_start_49 .. :try_end_92} :catchall_1cd

    .line 223
    :try_start_92
    invoke-static {v8, v1}, Landroid/content/pm/PackageParser;->parseApkLite(Ljava/io/File;I)Landroid/content/pm/PackageParser$ApkLite;

    move-result-object v6

    .line 224
    iget-object v7, v6, Landroid/content/pm/PackageParser$ApkLite;->splitName:Ljava/lang/String;

    invoke-static {v8, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    invoke-virtual {v2, v7, v6}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9f
    .catch Ljava/lang/Exception; {:try_start_92 .. :try_end_9f} :catch_5b
    .catchall {:try_start_92 .. :try_end_9f} :catchall_1cd

    goto :goto_5b

    .line 236
    :cond_a0
    :try_start_a0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 237
    move-object p0, v0

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {v3, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    .line 242
    :cond_a9
    invoke-virtual {v2, v0}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    if-nez p0, :cond_c4

    const/4 p0, -0x4

    .line 244
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0
    :try_end_ba
    .catch Ljava/lang/Exception; {:try_start_a0 .. :try_end_ba} :catch_1d8
    .catchall {:try_start_a0 .. :try_end_ba} :catchall_1cd

    .line 246
    :try_start_ba
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 247
    invoke-static {v1}, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Z)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z
    :try_end_c3
    .catch Ljava/lang/Exception; {:try_start_ba .. :try_end_c3} :catch_c3
    .catchall {:try_start_ba .. :try_end_c3} :catchall_1cd

    :catch_c3
    return-object p0

    .line 252
    :cond_c4
    :try_start_c4
    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/io/File;

    invoke-static {p0, p1}, Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/io/File;Z)Lkotlin/Pair;

    move-result-object p0

    .line 253
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;
    :try_end_d4
    .catch Ljava/lang/Exception; {:try_start_c4 .. :try_end_d4} :catch_1d8
    .catchall {:try_start_c4 .. :try_end_d4} :catchall_1cd

    if-nez v3, :cond_e0

    .line 256
    :try_start_d6
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 257
    invoke-static {v1}, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Z)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z
    :try_end_df
    .catch Ljava/lang/Exception; {:try_start_d6 .. :try_end_df} :catch_df
    .catchall {:try_start_d6 .. :try_end_df} :catchall_1cd

    :catch_df
    return-object p0

    .line 262
    :cond_e0
    :try_start_e0
    iget-object p0, v3, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Landroid/content/pm/ApplicationInfo;

    .line 263
    new-instance v6, Ljava/io/File;

    iget-object v7, p0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 264
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 265
    invoke-virtual {v2}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->values()Ljava/util/Collection;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_f6
    :goto_f6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_166

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lkotlin/Pair;

    .line 266
    sget-boolean v10, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    .line 267
    iget-object v10, v3, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    .line 268
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "split_"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v9}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/content/pm/PackageParser$ApkLite;

    iget-object v12, v12, Landroid/content/pm/PackageParser$ApkLite;->splitName:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 269
    new-instance v12, Ljava/io/File;

    sget-object v13, Lnet/bienvenido/mundo/sdk/internal/z1;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/io/File;

    invoke-direct {v12, v13, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 270
    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z

    .line 271
    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v12, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 272
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    invoke-virtual {v9}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/io/File;

    .line 274
    invoke-static {v9, v6}, Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;Ljava/io/File;)I

    if-eqz p1, :cond_14c

    .line 275
    invoke-virtual {v9, v10}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v11

    if-nez v11, :cond_15e

    .line 277
    :cond_14c
    invoke-virtual {v9}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v3

    invoke-virtual {v10}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v9

    new-array v11, v5, [Ljava/nio/file/CopyOption;

    sget-object v12, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    aput-object v12, v11, v1

    invoke-static {v3, v9, v11}, Ljava/nio/file/Files;->copy(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    move-object v3, v0

    .line 279
    :cond_15e
    sget-boolean v9, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->用搅拌机把你妈的阴扩一下:Z

    if-eqz v9, :cond_f6

    .line 280
    invoke-virtual {v10}, Ljava/io/File;->setReadOnly()Z

    goto :goto_f6

    .line 283
    :cond_166
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/g;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:[Ljava/lang/String;

    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 284
    iput-object p1, p0, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    .line 285
    iput-object p1, p0, Landroid/content/pm/ApplicationInfo;->splitPublicSourceDirs:[Ljava/lang/String;

    .line 286
    iget-object p1, v3, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/content/pm/PackageInfo;

    invoke-virtual {v2}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->keySet()Ljava/util/Set;

    move-result-object v4

    new-array v6, v1, [Ljava/lang/String;

    invoke-interface {v4, v6}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/String;

    iput-object v4, p1, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    .line 287
    sget-boolean p1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz p1, :cond_1ae

    .line 288
    iget-object p1, v3, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/content/pm/PackageInfo;

    .line 289
    iget-object v4, p1, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    .line 290
    array-length v6, v4

    .line 291
    new-array v7, v6, [I

    const/4 v8, 0x0

    :goto_18e
    if-ge v8, v6, :cond_1ac

    .line 293
    aget-object v9, v4, v8

    invoke-virtual {v2, v9}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lkotlin/Pair;

    if-eqz v9, :cond_1a6

    .line 294
    invoke-virtual {v9}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/pm/PackageParser$ApkLite;

    if-nez v9, :cond_1a3

    goto :goto_1a6

    :cond_1a3
    iget v9, v9, Landroid/content/pm/PackageParser$ApkLite;->revisionCode:I

    goto :goto_1a7

    :cond_1a6
    :goto_1a6
    const/4 v9, 0x0

    :goto_1a7
    aput v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_18e

    .line 296
    :cond_1ac
    iput-object v7, p1, Landroid/content/pm/PackageInfo;->splitRevisionCodes:[I

    .line 298
    :cond_1ae
    sget-boolean p1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Z

    if-eqz p1, :cond_1b8

    .line 299
    iget-object p1, v3, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/content/pm/PackageInfo;

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    iput-object p1, p0, Landroid/content/pm/ApplicationInfo;->splitNames:[Ljava/lang/String;

    .line 301
    :cond_1b8
    invoke-static {v3}, Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/AppWindowController;)V

    .line 302
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0
    :try_end_1c3
    .catch Ljava/lang/Exception; {:try_start_e0 .. :try_end_1c3} :catch_1d8
    .catchall {:try_start_e0 .. :try_end_1c3} :catchall_1cd

    .line 304
    :try_start_1c3
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 305
    invoke-static {v1}, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Z)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z
    :try_end_1cc
    .catch Ljava/lang/Exception; {:try_start_1c3 .. :try_end_1cc} :catch_1cc
    .catchall {:try_start_1c3 .. :try_end_1cc} :catchall_1cd

    :catch_1cc
    return-object p0

    :catchall_1cd
    move-exception p0

    .line 318
    :try_start_1ce
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 319
    invoke-static {v1}, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Z)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z
    :try_end_1d7
    .catch Ljava/lang/Exception; {:try_start_1ce .. :try_end_1d7} :catch_1d7

    .line 322
    :catch_1d7
    throw p0

    .line 311
    :catch_1d8
    :try_start_1d8
    sget-object p0, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 312
    invoke-static {v1}, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Z)Ljava/io/File;

    move-result-object p0

    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z
    :try_end_1e1
    .catch Ljava/lang/Exception; {:try_start_1d8 .. :try_end_1e1} :catch_1e1

    :catch_1e1
    const/4 p0, -0x1

    .line 315
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/AppWindowController;)V
    .registers 6

    .line 165
    :try_start_0
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    .line 166
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/z1;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/io/File;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, p0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "installation.bin"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/CollectionUtils;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 167
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 168
    iget-object p0, p0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/content/pm/PackageInfo;

    invoke-virtual {v1, p0, v3}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 169
    invoke-virtual {v1}, Landroid/os/Parcel;->marshall()[B

    move-result-object p0

    .line 170
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 171
    invoke-static {v0, p0}, Lkotlin/io/FilesKt;->writeBytes(Ljava/io/File;[B)V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_28} :catch_28

    :catch_28
    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()[Ljava/lang/String;
    .registers 3

    .line 43
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v0, :cond_7

    .line 44
    sget-object v0, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    return-object v0

    .line 46
    :cond_7
    sget-object v0, Landroid/os/Build;->SUPPORTED_32_BIT_ABIS:[Ljava/lang/String;

    .line 48
    array-length v1, v0

    if-nez v1, :cond_19

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "armeabi-v7a"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "armeabi"

    aput-object v2, v0, v1

    :cond_19
    return-object v0
.end method

.method public static 要不要把你妈卵子扣出来给你做寿司吃(Ljava/io/File;Z)Lkotlin/Pair;
    .registers 12

    const/4 v0, 0x0

    .line 56
    :try_start_1
    invoke-static {}, Lnet/bienvenido/mundo/sdk/internal/n3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Z

    move-result v1

    if-nez v1, :cond_11

    const/4 p0, -0x3

    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0

    .line 59
    :cond_11
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 61
    new-instance v2, Lnet/bienvenido/mundo/sdk/internal/i1$1;

    invoke-direct {v2, p0}, Lnet/bienvenido/mundo/sdk/internal/i1$1;-><init>(Ljava/io/File;)V

    invoke-static {v2}, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/PackageInfo;

    if-nez v2, :cond_2e

    .line 77
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    :cond_2e
    if-nez v2, :cond_3a

    const/4 p0, -0x2

    .line 80
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0

    .line 82
    :cond_3a
    iget-object v1, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-nez v1, :cond_48

    const/4 p0, -0x5

    .line 84
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0

    .line 86
    :cond_48
    iget-object v3, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 87
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v3, v0}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    invoke-virtual {v4, v3}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    if-eqz v4, :cond_63

    move-object v5, v4

    goto :goto_6b

    .line 90
    :cond_63
    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/PackageManagerServiceImpl;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Lnet/bienvenido/mundo/sdk/internal/obfclass2;

    invoke-virtual {v5, v3}, Lnet/bienvenido/mundo/sdk/internal/obfclass2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/bienvenido/mundo/sdk/internal/h4;

    :goto_6b
    if-eqz v5, :cond_70

    .line 91
    iget-object v5, v5, Lnet/bienvenido/mundo/sdk/internal/h4;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;

    goto :goto_77

    :cond_70
    new-instance v5, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;

    const-string v6, "0"

    invoke-direct {v5, v6}, Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    :goto_77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 93
    iput-wide v6, v2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    if-eqz v4, :cond_86

    .line 95
    iget-object v4, v4, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/content/pm/PackageInfo;

    iget-wide v6, v4, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iput-wide v6, v2, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    goto :goto_88

    .line 97
    :cond_86
    iput-wide v6, v2, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 99
    :goto_88
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/g;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:[Ljava/lang/String;

    iput-object v4, v2, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    .line 100
    sget-boolean v4, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    .line 101
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 102
    sget-object v4, Lnet/bienvenido/mundo/sdk/internal/z1;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/io/File;

    .line 103
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v4, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z

    .line 104
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v4, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 105
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 106
    new-instance v4, Ljava/io/File;

    const-string v7, "base.apk"

    invoke-direct {v4, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz p1, :cond_b3

    .line 107
    invoke-virtual {p0, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-nez p1, :cond_c4

    .line 108
    :cond_b3
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object p0

    invoke-virtual {v4}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object p1

    new-array v8, v6, [Ljava/nio/file/CopyOption;

    sget-object v9, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    aput-object v9, v8, v7

    invoke-static {p0, p1, v8}, Ljava/nio/file/Files;->copy(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    .line 110
    :cond_c4
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p0

    .line 111
    const-class p1, Landroid/content/pm/ApplicationInfo;

    const-string v8, "7e622b707e3e72723f69530857507865772779697d7c3d3e54530b557f6c2f73"

    invoke-static {v8}, Lnet/bienvenido/mundo/sdk/internal/n3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {p1, v8}, Lnet/bienvenido/mundo/sdk/internal/MundoReflection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    move-result-object p1

    invoke-virtual {p1, v1, p0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    const-class p1, Landroid/content/pm/ApplicationInfo;

    const-string v8, "7e367d7c7f3a7b213f6d06510b5728367e70296c7d723b3c5051500f7a347e75"

    invoke-static {v8}, Lnet/bienvenido/mundo/sdk/internal/n3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {p1, v8}, Lnet/bienvenido/mundo/sdk/internal/MundoReflection;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Class;Ljava/lang/String;)Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    move-result-object p1

    invoke-virtual {p1, v1, p0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p0, "/dev/null"

    .line 113
    iput-object p0, v1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 114
    new-instance p0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;

    invoke-direct {p0, v2, v1, v5}, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;-><init>(Landroid/content/pm/PackageInfo;Landroid/content/pm/ApplicationInfo;Lnet/bienvenido/mundo/sdk/internal/TypeArrayBuilder;)V

    .line 115
    sget-boolean p1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    if-eqz p1, :cond_11c

    .line 116
    sget-boolean p1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Z
    :try_end_fd
    .catchall {:try_start_1 .. :try_end_fd} :catchall_15f

    const-string v2, "/system/framework/org.apache.http.legacy.jar"

    if-eqz p1, :cond_10b

    const/4 p1, 0x2

    :try_start_102
    new-array p1, p1, [Ljava/lang/String;

    aput-object v2, p1, v7

    const-string v2, "/system/framework/android.test.base.jar"

    aput-object v2, p1, v6

    goto :goto_11a

    :cond_10b
    sget-boolean p1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:Z

    if-eqz p1, :cond_114

    new-array p1, v6, [Ljava/lang/String;

    aput-object v2, p1, v7

    goto :goto_11a

    :cond_114
    new-array p1, v6, [Ljava/lang/String;

    const-string v2, "/system/framework/org.apache.http.legacy.boot.jar"

    aput-object v2, p1, v7

    :goto_11a
    iput-object p1, v1, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;

    .line 118
    :cond_11c
    invoke-static {v3}, Lnet/bienvenido/mundo/sdk/internal/z1;->要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 119
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 120
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/x8;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    .line 121
    invoke-virtual {v4}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_130

    const-string v3, "/"

    .line 126
    :cond_130
    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/x8;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    iget-object v5, v5, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v5, v1, v3}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 128
    iget-object v2, v2, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v2, v1, v3}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    sget-boolean v2, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->用搅拌机把你妈的阴扩一下:Z

    if-eqz v2, :cond_145

    .line 130
    invoke-virtual {v4}, Ljava/io/File;->setReadOnly()Z

    .line 132
    :cond_145
    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/x8;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    iget-object v2, v2, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-static {}, Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, p1}, Lnet/bienvenido/mundo/sdk/internal/IntentFilterHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;Ljava/io/File;)I

    move-result p1

    aget-object p1, v3, p1

    invoke-virtual {v2, v1, p1}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0
    :try_end_15e
    .catchall {:try_start_102 .. :try_end_15e} :catchall_15f

    return-object p0

    :catchall_15f
    const/4 p0, -0x1

    .line 135
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method
