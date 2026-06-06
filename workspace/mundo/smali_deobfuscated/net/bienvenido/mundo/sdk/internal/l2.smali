.class public final Lnet/bienvenido/mundo/sdk/internal/l2;
.super Ljava/lang/Object;
.source "l2.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/l2;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 42
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/l2;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/l2;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/l2;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getFakeSignatures(Ljava/lang/String;)[Landroid/content/pm/Signature;
    .registers 5

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return-object v0

    :cond_4
    const-string v1, "tencent.ig"

    .line 49
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1a

    new-array p0, v3, [Landroid/content/pm/Signature;

    .line 50
    new-instance v0, Landroid/content/pm/Signature;

    const-string v1, "MIIDfTCCAmWgAwIBAgIEHc6GpDANBgkqhkiG9w0BAQsFADBuMQswCQYDVQQGEwI4NjETMBEGA1UECBMKR3VhbmcgRG9uZzESMBAGA1UEBxMJU2hlbiBaaGVuMRAwDgYDVQQKEwdUZW5jZW50MRAwDgYDVQQLEwdUZW5jZW50MRIwEAYDVQQDEwlIZWN0b3IgTHUwIBcNMTcxMjI4MTEzNzA3WhgPMjExNzEyMDQxMTM3MDdaMG4xCzAJBgNVBAYTAjg2MRMwEQYDVQQIEwpHdWFuZyBEb25nMRIwEAYDVQQHEwlTaGVuIFpoZW4xEDAOBgNVBAoTB1RlbmNlbnQxEDAOBgNVBAsTB1RlbmNlbnQxEjAQBgNVBAMTCUhlY3RvciBMdTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKC1JBKJInOVnZGqMWbMNZImMKnmurOU2DQav+sIceYVJfOdIWSnSAY/KD7cczUldjMrSiSaOoMR+qNTNVhbojF82gk7RChPE9sAEp8TNQSdcluyiGTDz2VRqLQHLHYWCw/Uca0dLeZA3nkV9pQVXDobKP4BlT97rrwdtutJqiJxq9Knw9O6SdqUzAKYh0QzHFEBLcjjjdnrEzx15TBO5n1ASLAA/VsDy2SjUAXJdkJH1oQI+dcWem6RsQUh18zmIXH7h2BpLe0l+uZhNU+TmodWWzdwFcqNXWoROW+xXXxM/da9AesNC3j/8lt0sL5wx+Ah2zAXpbD7rEfVdO7oTjUCAwEAAaMhMB8wHQYDVR0OBBYEFATh6+jvxg49CYBVas0cKGqGNwzCMA0GCSqGSIb3DQEBCwUAA4IBAQAIFfMgtDoXWA+PmJ03bcBZcm1d5gyjujQCDPi2rb3a1v6ld7NSDo71AafBJuiSK7xyE8ujcxj6yjzGF9oDAQ/P744xs0baUksyaG4jlljPt/htMJUxQc4Si0keYrZhpD+CS76uv/0m9JQxZyuGw4Z3zjI1XKsgCOhLPj4Tj8kVAzSxLvF446XCiM0r8m4+Sx0b3BFNio/Vh/Mc8xN0KB6cd+Y84XJ6bRKy89+l2ailroZzahLjIMiDdteMl8JShKz0SuWzmUa+nPd88cEG+nEmyla0WW6OR8xlhvMRD0mnmDGPK74orFz7ZZugE+4iZmBoaK9fZASEdByPVd589Ohb"

    invoke-direct {v0, v1}, Landroid/content/pm/Signature;-><init>(Ljava/lang/String;)V

    aput-object v0, p0, v2

    return-object p0

    :cond_1a
    const-string v1, "pubg.imobile"

    .line 53
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2e

    new-array p0, v3, [Landroid/content/pm/Signature;

    .line 54
    new-instance v0, Landroid/content/pm/Signature;

    const-string v1, "MIIDYTCCAkmgAwIBAgIEb0g5mDANBgkqhkiG9w0BAQsFADBhMQswCQYDVQQGEwJrcjEOMAwGA1UECBMFU2VvdWwxDjAMBgNVBAcTBVNlb3VsMQ0wCwYDVQQKEwRQVUJHMQ8wDQYDVQQLEwZLUiBCaXoxEjAQBgNVBAMTCUpzb24gQ2hvaTAeFw0yMDA4MDQwNDEzMDJaFw00NTA3MjkwNDEzMDJaMGExCzAJBgNVBAYTAmtyMQ4wDAYDVQQIEwVTZW91bDEOMAwGA1UEBxMFU2VvdWwxDTALBgNVBAoTBFBVQkcxDzANBgNVBAsTBktSIEJpejESMBAGA1UEAxMJSnNvbiBDaG9pMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA32rDfOoVXPzqxVJ69yOp1gTn9EeUEfEDN42Mq/b/ljqT8+k/T7B205zGl03GN1gwqEBosqCLqijAEJVD2hOjQx+xqDkzheruEjX9oUfE9Pi23Jec+tuQBXX+inC/TK96NxX6tzfppMDrJ5SaXtFnXm1Tky9fgg46aG4azImQZbFubpLpfj9fdt190abJUHt4bA/xP8HBCE80k6xPfSqnXik+dAEKrAqVOjNwaoHrYVe9J/oZZK8iUqkwD5V5QmQ96HzRZ9UkxcUbRktJbwOs+Ex2kGvfZjxWpXgcV+7TIvIisLSvMpzL1G17tXYei7pH6Oseix/CHYKEAaSCVb/jDQIDAQABoyEwHzAdBgNVHQ4EFgQU5UR67yHGHzWKUNUpVdyOet5lex4wDQYJKoZIhvcNAQELBQADggEBAIE7iHqyDIGvYco1l9apj4VM5fQWFGPKarav1+NHe3mFQZN6hRuBabCoN3SwVrpZey9quYaQn3nNNN54Sp8KYC02TkcTuCpcr2ghNfOs73y1cpDuqFhVyQsyVRjZzEnh9XDaa2THJjmadENDwdO06UH+cBKW/7oj9bazQIqJN5Ytv9xkAiIhMH1OxxY69rJ+BxZszyR1tqFceDOtS0ZuM6dxROveyVmfoh9qxs9Vw8oh1qtswKdorppAXyTf6hu3SOnxPeWhgZKi0EJxWyMKJ+QuozxVpKidhthBLGTU/p6MoMiZAycxZ67TFu6GADXK8VXcCDAxbayCLdo7flbmVSw="

    invoke-direct {v0, v1}, Landroid/content/pm/Signature;-><init>(Ljava/lang/String;)V

    aput-object v0, p0, v2

    return-object p0

    :cond_2e
    const-string v1, "pubg.krmobile"

    .line 75
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_42

    new-array p0, v3, [Landroid/content/pm/Signature;

    .line 76
    new-instance v0, Landroid/content/pm/Signature;

    const-string v1, "MIIDYTCCAkmgAwIBAgIERqxDeTANBgkqhkiG9w0BAQsFADBhMQswCQYDVQQGEwJrcjEOMAwGA1UECBMFU2VvdWwxDjAMBgNVBAcTBVNlb3VsMQ0wCwYDVQQKEwRQVUJHMQ8wDQYDVQQLEwZLUiBCaXoxEjAQBgNVBAMTCUpzb24gQ2hvaTAeFw0xODAzMzAwNTA5NTNaFw00MzAzMjQwNTA5NTNaMGExCzAJBgNVBAYTAmtyMQ4wDAYDVQQIEwVTZW91bDEOMAwGA1UEBxMFU2VvdWwxDTALBgNVBAoTBFBVQkcxDzANBgNVBAsTBktSIEJpejESMBAGA1UEAxMJSnNvbiBDaG9pMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn/fOxLXf34+wII3mdNNgYIRPSBH2mCr1Ivu0jfYwcl4eLo7bG/hkmpKE5d/ngzW2ek5C1YRy52m9oLXGCTLF95e8Xbc0Leq41HmZYarhh5SXdTSLjh6Ad50EudQ0AOBqrCsU/+RpvN1HYT70Oi89SM0yuZNRkaB7deht3plnuQID8iSWRvEZKuXdEh8hsEG3rh9SsgMHrOy/hP6gjaA5/HnedIsc1cdGLgp2y0qg6xmxiH1FTwHum9T2+1QSf69BYp/PtZsC7NcvltLgPKlRKg5t2Vs+Zeprie8Xkn4lkbffopgSvEvr54ttlQXKehcw0qST8SuCX8qr5D5SnTGacQIDAQABoyEwHzAdBgNVHQ4EFgQUTaEYbKkNXR2AgWupe1optszjj8UwDQYJKoZIhvcNAQELBQADggEBAFJxfFfcfIZ5asIE1c1zLdZp2z5W8bEshG8wwArhbMgEP1xqne8IVT6YhbmtJ5jrsnphqsztLjFCbDM2irRHQDUqxm90YojehrLRmNPjp3sV2aZUBHctg8RLO5OCETTloH1I4E0JMwPWhkUXg5txjDAgraNKK+NByzRszWnzUTT3725hQzd+D9/32qQFoM1HrMxA25I/So5D1pUjCX7XvMRsON5+vgIh1/oBWLJKyS1nvGxJd2CUX8ydt9PWtTnFohzLeltk+4a/McqKPuLIE8AKIlXPm0IkRS0QbszIOSRu44JI1s3JENqNPkUN3bKY8+rFoHzdLQlt+ICB8Jd6uEs="

    invoke-direct {v0, v1}, Landroid/content/pm/Signature;-><init>(Ljava/lang/String;)V

    aput-object v0, p0, v2

    return-object p0

    :cond_42
    const-string v1, "vng.pubgmobile"

    .line 79
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_56

    new-array p0, v3, [Landroid/content/pm/Signature;

    .line 80
    new-instance v0, Landroid/content/pm/Signature;

    const-string v1, "MIIDfTCCAmWgAwIBAgIEb5rakTANBgkqhkiG9w0BAQsFADBvMQswCQYDVQQGEwJWTjEUMBIGA1UECBMLSG8gQ2hpIE1pbmgxFDASBgNVBAcTC0hvIENoaSBNaW5oMRIwEAYDVQQKEwlWTkcgR2FtZXMxEjAQBgNVBAsTCVZORyBHYW1lczEMMAoGA1UEAxMDVk5HMB4XDTE0MTIyNDEzNDgxNFoXDTQyMDUxMTEzNDgxNFowbzELMAkGA1UEBhMCVk4xFDASBgNVBAgTC0hvIENoaSBNaW5oMRQwEgYDVQQHEwtIbyBDaGkgTWluaDESMBAGA1UEChMJVk5HIEdhbWVzMRIwEAYDVQQLEwlWTkcgR2FtZXMxDDAKBgNVBAMTA1ZORzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIpndgqwWdg5dukiA7FX6evLEn2TJsLG7g9VACD1YNVxoMUwwrh82XKfE+r3Q52lqU4895eb7OBzJOWVLdHo1TcvPFi1fM4huUbJ1FEti8NT0d3CzyO6ryvsfKyDaKkaYWENQFwCflMEaEfVaxJA/EsmY7LemoTxrdWS+Rq38xYipnBxoV0xy0mnNZxcMtSTBa+k308kNULsO3x9qAy/Nrd3ldTMkZnMYNa3hoYzz2VbuMbgiXUNXSh61j5IXOhpIqWlXNdp8D0V/O3zdi39Dsv+nOPIOEv4z99a7eWn5kH8zXAqFjP1872dAzcq92p/hFam6vZahNpI3nn1C1H2lUcCAwEAAaMhMB8wHQYDVR0OBBYEFEf9M3bvO9F23lDuKfKD9X0JM6hEMA0GCSqGSIb3DQEBCwUAA4IBAQB8hT7zuSixDMnfID3ilUapd+pHTHEcFgbeYprpVC0J818jFasgCunqGUsZObM4re8wZ034slbfNKDgbNjx8ekChxnOsEiJxhYPpZW6zF64Ce6OI/FyYdgechbGcz/LnuZ0D7EjkL5mrQ+svPypwZQJVe1RzFRQH7q8VyvDrA9sqq9FNsLvJNmsbvqqU1WoqOfrVw+MtMiDH1QYPuieSeP/29++NrRq66sLfYy7bSgZjuoIdUklJuaTV0Eg4ePYQzeeeTOCzFJWZBDfYfkosoOd0xQUIW0utaPq3mVckLfOCwEvM4SulL7Xjg1VsIh8/mnOIU2twPL/JVLvOK20VkLV"

    invoke-direct {v0, v1}, Landroid/content/pm/Signature;-><init>(Ljava/lang/String;)V

    aput-object v0, p0, v2

    return-object p0

    :cond_56
    const-string v1, "rekoo.pubgm"

    .line 83
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_6a

    new-array p0, v3, [Landroid/content/pm/Signature;

    .line 84
    new-instance v0, Landroid/content/pm/Signature;

    const-string v1, "MIIDfTCCAmWgAwIBAgIEd7BHgTANBgkqhkiG9w0BAQsFADBuMQswCQYDVQQGEwI4NjETMBEGA1UECBMKR3VhbmcgRG9uZzESMBAGA1UEBxMJU2hlbiBaaGVuMRAwDgYDVQQKEwdUZW5jZW50MRAwDgYDVQQLEwdUZW5jZW50MRIwEAYDVQQDEwlIZWN0b3IgTHUwIBcNMTkwMjE1MTMxOTA4WhgPMjI5MjExMjkxMzE5MDhaMG4xCzAJBgNVBAYTAjg2MRMwEQYDVQQIEwpHdWFuZyBEb25nMRIwEAYDVQQHEwlTaGVuIFpoZW4xEDAOBgNVBAoTB1RlbmNlbnQxEDAOBgNVBAsTB1RlbmNlbnQxEjAQBgNVBAMTCUhlY3RvciBMdTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKxj7MWZt9F8kk0XpvLIQ1zNTEpPtz1UPgcm2lxCEAGfSLoh5wq54n393/ywJeEziDPt8FDIBUF+D5pMdNBbpwXPgIsCGYu5XDD8ut2eueIJYBqJCiEJuKJ7xYYD8Q1DaqTXhLpjm4jMnEyK0NRuu9ZYvdfgW9C8nOaT+7WnIdzoEG5g8T+pADmCX9hG/6L5GkEsU/kOa3NQwUf48ODmuI4Diw3QnYZ+pUN5nPTYqg2FrwODBs+kE3YBR1JqAk8tnckXHOCr4D4B5xXczdmy7pz3t0DQs26aMw2N9Y5tDH6LfnBflR3KI1WtUie6AVlGY9DvLKzkS1FcHbEamxL0crECAwEAAaMhMB8wHQYDVR0OBBYEFPROW2496jHc9Pe+Byz7byndOjdhMA0GCSqGSIb3DQEBCwUAA4IBAQCnZW3B8Q8O8/jcYHqYgvtewCnN4SOox5pMtuXG4d8SwahqyjmDu2yodmMBMSGR8nnltmSkf/ZDXrONmKVWHcAZwhv9AZ781+bV3ZSpc1f7hxJI/Ni6NnoiAbRLLMw9JBJyX0tfu0x6CWhbzRX0y5s3R7DN22YS+9E+fWLT0FKC2uHZQTAEINIHOMfbWXUFpxYMm9Hu4N02uHDpFzyFAxK0EtMDAWNJ+YV7J8O9rw1YVtjWaK+cL+n0jS3SJjI0hZaPEZnQT6nPrKr1y5PBwoxpLrer3GV0etPS6X2LUB+U9W5DKnVLtT40ESx1hvI7E7bfzn3e8qXuzR7tZafR/76H"

    invoke-direct {v0, v1}, Landroid/content/pm/Signature;-><init>(Ljava/lang/String;)V

    aput-object v0, p0, v2

    return-object p0

    :cond_6a
    return-object v0
.end method

.method public static getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .registers 4

    const/4 v0, 0x0

    if-nez p0, :cond_4

    return-object v0

    .line 34
    :cond_4
    :try_start_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    const/4 v1, 0x1

    .line 35
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 36
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_14} :catch_15

    return-object p0

    :catch_15
    return-object v0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)I
    .registers 6

    .line 308
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_6
    if-ge v1, v0, :cond_17

    .line 311
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    mul-int/lit8 v3, v3, 0x1f

    mul-int/lit8 v4, v1, 0x1f

    add-int/2addr v3, v4

    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 313
    :cond_17
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result p0

    return p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ApplicationInfo;)V
    .registers 11

    .line 244
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:Z

    if-eqz v0, :cond_66

    .line 245
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Z

    const-string v1, "/system/framework/org.apache.http.legacy.jar"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_16

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    aput-object v1, v0, v2

    const-string v1, "/system/framework/android.test.base.jar"

    aput-object v1, v0, v3

    goto :goto_1a

    :cond_16
    new-array v0, v3, [Ljava/lang/String;

    aput-object v1, v0, v2

    .line 250
    :goto_1a
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/x8;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    .line 251
    iget-object v4, v1, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v4, p0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-nez v4, :cond_31

    .line 254
    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v0

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 255
    iget-object v1, v1, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v1, p0, v4}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    :cond_31
    array-length p0, v0

    const/4 v1, 0x0

    :goto_33
    if-ge v1, p0, :cond_66

    aget-object v5, v0, v1

    :try_start_37
    const-string v6, "sun.misc.Unsafe"

    .line 260
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-string v7, "allocateInstance"

    new-array v8, v3, [Ljava/lang/Class;

    const-class v9, Ljava/lang/Class;

    aput-object v9, v8, v2

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    sget-object v7, Lnet/bienvenido/mundo/sdk/internal/UnsafeAccess;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lsun/misc/Unsafe;

    new-array v8, v3, [Ljava/lang/Object;

    const-class v9, Landroid/content/pm/SharedLibraryInfo;

    aput-object v9, v8, v2

    invoke-virtual {v6, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/pm/SharedLibraryInfo;
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_37 .. :try_end_57} :catch_58

    goto :goto_59

    :catch_58
    const/4 v6, 0x0

    .line 262
    :goto_59
    sget-object v7, Lnet/bienvenido/mundo/sdk/internal/x8;->你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    iget-object v7, v7, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v7, v6, v5}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_33

    :cond_66
    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ApplicationInfo;Landroid/content/pm/ApplicationInfo;)V
    .registers 4

    .line 271
    :try_start_0
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 272
    iput-object v0, p0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 273
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Z

    if-eqz v1, :cond_f

    .line 274
    iput-object v0, p0, Landroid/content/pm/ApplicationInfo;->deviceProtectedDataDir:Ljava/lang/String;

    .line 275
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/x8;->虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v1, p0, v0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 277
    :cond_f
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Z

    if-eqz v0, :cond_17

    .line 278
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->splitNames:[Ljava/lang/String;

    iput-object v0, p0, Landroid/content/pm/ApplicationInfo;->splitNames:[Ljava/lang/String;

    .line 280
    :cond_17
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    if-eqz v0, :cond_2e

    iget v0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v1, 0x8000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_2e

    .line 281
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/x8;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 283
    :cond_2e
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;

    iput-object v0, p0, Landroid/content/pm/ApplicationInfo;->sharedLibraryFiles:[Ljava/lang/String;

    .line 284
    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ApplicationInfo;)V

    .line 285
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    if-eqz v0, :cond_42

    .line 286
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_42

    .line 287
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    goto :goto_44

    .line 289
    :cond_42
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 291
    :goto_44
    iput-object v0, p0, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 292
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    iput-object v0, p0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 293
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    iput-object v0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 294
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    iput-object v0, p0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 295
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/x8;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    .line 296
    iget-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p0, v0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 297
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/x8;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    .line 298
    iget-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p0, v0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 299
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/x8;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;

    .line 300
    iget-object v1, v0, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    iget-object v0, v0, Lnet/bienvenido/mundo/sdk/internal/NamedFieldAccessor;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    invoke-virtual {v0, p1}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p0, v0}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 301
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    iput-object v0, p0, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    .line 302
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->splitPublicSourceDirs:[Ljava/lang/String;

    iput-object p1, p0, Landroid/content/pm/ApplicationInfo;->splitPublicSourceDirs:[Ljava/lang/String;
    :try_end_81
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_81} :catch_81

    :catch_81
    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ComponentInfo;Landroid/content/pm/ApplicationInfo;)V
    .registers 4

    .line 317
    instance-of v0, p0, Landroid/content/pm/ServiceInfo;

    if-eqz v0, :cond_d

    .line 318
    move-object v0, p0

    check-cast v0, Landroid/content/pm/ServiceInfo;

    iget v1, v0, Landroid/content/pm/ServiceInfo;->flags:I

    and-int/lit8 v1, v1, -0x3

    iput v1, v0, Landroid/content/pm/ServiceInfo;->flags:I

    :cond_d
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/16 v1, 0xc9

    .line 322
    invoke-static {v1, v0}, Lnet/bienvenido/mundo/sdk/common/initialize/MNative;->invokeRouter(I[Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p0, :cond_43

    if-eqz p1, :cond_43

    .line 327
    iget-object v0, p0, Landroid/content/pm/ComponentInfo;->packageName:Ljava/lang/String;

    if-eqz v0, :cond_2d

    iget-object v0, p0, Landroid/content/pm/ComponentInfo;->packageName:Ljava/lang/String;

    const-string v1, "invalid.process.routing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 328
    :cond_2d
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iput-object v0, p0, Landroid/content/pm/ComponentInfo;->packageName:Ljava/lang/String;

    .line 330
    :cond_31
    iget-object v0, p0, Landroid/content/pm/ComponentInfo;->processName:Ljava/lang/String;

    if-eqz v0, :cond_3f

    iget-object v0, p0, Landroid/content/pm/ComponentInfo;->processName:Ljava/lang/String;

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_43

    .line 331
    :cond_3f
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    iput-object p1, p0, Landroid/content/pm/ComponentInfo;->processName:Ljava/lang/String;

    :cond_43
    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/AppWindowController;I)V
    .registers 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v2, ";"

    .line 94
    :try_start_6
    iget-object v3, v0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Landroid/content/pm/PackageInfo;

    .line 95
    new-instance v4, Landroid/content/pm/PackageParser;

    invoke-direct {v4}, Landroid/content/pm/PackageParser;-><init>()V

    new-instance v5, Ljava/io/File;

    iget-object v6, v0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Landroid/content/pm/ApplicationInfo;

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/pm/PackageParser;->parsePackage(Ljava/io/File;I)Landroid/content/pm/PackageParser$Package;

    move-result-object v4

    .line 96
    iget-object v5, v4, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v5, :cond_2b6

    .line 98
    iget-object v7, v0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Landroid/content/pm/ApplicationInfo;

    invoke-static {v5, v7}, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ApplicationInfo;Landroid/content/pm/ApplicationInfo;)V

    .line 99
    iget-object v7, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 100
    sget-object v8, Lnet/bienvenido/mundo/sdk/internal/k;->要不要把你妈卵子扣出来给你做寿司吃:[I

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v9

    invoke-static {v8, v9}, Lkotlin/collections/ArraysKt;->contains([II)Z

    move-result v8

    if-eqz v8, :cond_39

    const-string v7, "com.google"

    .line 101
    invoke-static {v7}, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)I

    move-result v7

    goto :goto_4d

    .line 103
    :cond_39
    iget-object v8, v3, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    if-eqz v8, :cond_49

    .line 104
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_44

    goto :goto_49

    :cond_44
    invoke-static {v8}, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)I

    move-result v7

    goto :goto_4d

    :cond_49
    :goto_49
    invoke-static {v7}, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)I

    move-result v7

    .line 106
    :goto_4d
    rem-int/lit16 v7, v7, 0x1b58

    add-int/lit16 v7, v7, 0x32c8

    iput v7, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    const/4 v7, 0x1

    .line 107
    iput-boolean v7, v5, Landroid/content/pm/ApplicationInfo;->enabled:Z

    const-string v8, "mAppMetaData"

    .line 108
    invoke-static {v4, v8}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/os/Bundle;

    if-eqz v8, :cond_63

    .line 110
    iput-object v8, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    goto :goto_6d

    .line 111
    :cond_63
    iget-object v8, v4, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v8, :cond_6d

    .line 112
    iget-object v8, v4, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v8, v8, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    iput-object v8, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 114
    :cond_6d
    :goto_6d
    iget v8, v5, Landroid/content/pm/ApplicationInfo;->flags:I

    const v9, 0x848044

    or-int/2addr v8, v9

    iput v8, v5, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 115
    iput-object v5, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 116
    iput-object v5, v0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Landroid/content/pm/ApplicationInfo;

    .line 117
    new-instance v8, Lnet/bienvenido/mundo/sdk/internal/l1;

    iget-object v9, v4, Landroid/content/pm/PackageParser$Package;->activities:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    iget-object v10, v4, Landroid/content/pm/PackageParser$Package;->receivers:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/2addr v9, v10

    iget-object v10, v4, Landroid/content/pm/PackageParser$Package;->services:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/2addr v9, v10

    iget-object v10, v4, Landroid/content/pm/PackageParser$Package;->providers:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/2addr v9, v10

    invoke-direct {v8, v9}, Lnet/bienvenido/mundo/sdk/internal/l1;-><init>(I)V

    .line 118
    iput-object v8, v0, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Lnet/bienvenido/mundo/sdk/internal/l1;

    .line 119
    iget-object v9, v4, Landroid/content/pm/PackageParser$Package;->activities:Ljava/util/ArrayList;

    new-instance v10, Lnet/bienvenido/mundo/sdk/internal/l2$1;

    invoke-direct {v10}, Lnet/bienvenido/mundo/sdk/internal/l2$1;-><init>()V

    sget-object v11, Lnet/bienvenido/mundo/sdk/internal/e2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/e2;

    invoke-static {v9, v8, v5, v10, v11}, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/ArrayList;Lnet/bienvenido/mundo/sdk/internal/l1;Landroid/content/pm/ApplicationInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)[Landroid/content/pm/ComponentInfo;

    move-result-object v9

    check-cast v9, [Landroid/content/pm/ActivityInfo;

    iput-object v9, v3, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    .line 124
    iget-object v9, v4, Landroid/content/pm/PackageParser$Package;->receivers:Ljava/util/ArrayList;

    new-instance v10, Lnet/bienvenido/mundo/sdk/internal/l2$2;

    invoke-direct {v10}, Lnet/bienvenido/mundo/sdk/internal/l2$2;-><init>()V

    sget-object v11, Lnet/bienvenido/mundo/sdk/internal/ComponentInfoHelper;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/ComponentInfoHelper;

    invoke-static {v9, v8, v5, v10, v11}, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/ArrayList;Lnet/bienvenido/mundo/sdk/internal/l1;Landroid/content/pm/ApplicationInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)[Landroid/content/pm/ComponentInfo;

    move-result-object v9

    check-cast v9, [Landroid/content/pm/ActivityInfo;

    iput-object v9, v3, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    .line 129
    iget-object v9, v4, Landroid/content/pm/PackageParser$Package;->services:Ljava/util/ArrayList;

    new-instance v10, Lnet/bienvenido/mundo/sdk/internal/l2$3;

    invoke-direct {v10}, Lnet/bienvenido/mundo/sdk/internal/l2$3;-><init>()V

    sget-object v11, Lnet/bienvenido/mundo/sdk/internal/i2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/i2;

    invoke-static {v9, v8, v5, v10, v11}, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/ArrayList;Lnet/bienvenido/mundo/sdk/internal/l1;Landroid/content/pm/ApplicationInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)[Landroid/content/pm/ComponentInfo;

    move-result-object v9

    check-cast v9, [Landroid/content/pm/ServiceInfo;

    iput-object v9, v3, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 134
    iget-object v9, v4, Landroid/content/pm/PackageParser$Package;->providers:Ljava/util/ArrayList;

    .line 135
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-nez v10, :cond_d9

    .line 136
    sget-object v10, Lnet/bienvenido/mundo/sdk/internal/g;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    goto :goto_db

    :cond_d9
    new-array v10, v10, [I

    .line 137
    :goto_db
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    .line 139
    :goto_e0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_183

    .line 140
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/pm/PackageParser$Provider;

    iget-object v13, v13, Landroid/content/pm/PackageParser$Provider;->info:Landroid/content/pm/ProviderInfo;

    .line 141
    iget-object v15, v13, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    if-eqz v15, :cond_177

    .line 143
    invoke-virtual {v15, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    .line 144
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v14

    invoke-direct {v7, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_107
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_15a

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, Ljava/lang/String;

    move-object/from16 v16, v11

    .line 146
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v11

    .line 147
    invoke-static {v10, v12, v11}, Lnet/bienvenido/mundo/sdk/internal/你爹菊花被肛烂了生出你这么个辣鸡玩意儿;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰([III)I

    move-result v17

    if-gez v17, :cond_148

    move-object/from16 v18, v14

    xor-int/lit8 v14, v17, -0x1

    add-int/lit8 v1, v12, 0x1

    .line 151
    array-length v0, v10

    if-gt v1, v0, :cond_133

    add-int/lit8 v0, v14, 0x1

    sub-int/2addr v12, v14

    .line 152
    invoke-static {v10, v14, v10, v0, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 153
    aput v11, v10, v14

    goto :goto_145

    :cond_133
    shl-int/lit8 v0, v1, 0x1

    .line 155
    new-array v0, v0, [I

    const/4 v12, 0x0

    .line 156
    invoke-static {v10, v12, v0, v12, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 157
    aput v11, v0, v14

    add-int/lit8 v11, v14, 0x1

    .line 158
    array-length v12, v10

    sub-int/2addr v12, v14

    invoke-static {v10, v14, v0, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v10, v0

    :goto_145
    move v12, v1

    const/4 v0, 0x1

    goto :goto_14b

    :cond_148
    move-object/from16 v18, v14

    const/4 v0, 0x0

    :goto_14b
    if-eqz v0, :cond_150

    .line 167
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_150
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v11, v16

    move-object/from16 v14, v18

    const/4 v6, 0x0

    goto :goto_107

    :cond_15a
    move-object/from16 v16, v11

    .line 170
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_166

    const/4 v0, 0x0

    .line 171
    iput-object v0, v13, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    goto :goto_179

    .line 172
    :cond_166
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_179

    .line 173
    invoke-static {v2, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    goto :goto_179

    :cond_177
    move-object/from16 v16, v11

    :cond_179
    :goto_179
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v11, v16

    const/4 v6, 0x0

    const/4 v7, 0x1

    goto/16 :goto_e0

    .line 177
    :cond_183
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 178
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/l2$4;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/l2$4;-><init>()V

    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/k2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/k2;

    invoke-static {v9, v8, v5, v0, v1}, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/ArrayList;Lnet/bienvenido/mundo/sdk/internal/l1;Landroid/content/pm/ApplicationInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)[Landroid/content/pm/ComponentInfo;

    move-result-object v0

    check-cast v0, [Landroid/content/pm/ProviderInfo;

    iput-object v0, v3, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    const-string v0, "requestedPermissions"

    .line 183
    invoke-static {v4, v0}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/g;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:[Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 184
    iput-object v0, v3, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 185
    array-length v0, v0

    .line 186
    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_1aa
    if-ge v2, v0, :cond_1b2

    const/4 v5, 0x3

    .line 188
    aput v5, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1aa

    .line 190
    :cond_1b2
    iput-object v1, v3, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    .line 191
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/g;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:[I

    .line 192
    iput-object v0, v3, Landroid/content/pm/PackageInfo;->gids:[I

    .line 193
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v1, :cond_1c9

    .line 194
    iget-object v1, v3, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    if-eqz v1, :cond_1c7

    .line 197
    array-length v2, v1

    if-nez v2, :cond_1c4

    goto :goto_1c7

    :cond_1c4
    array-length v0, v1

    new-array v0, v0, [I

    .line 199
    :cond_1c7
    :goto_1c7
    iput-object v0, v3, Landroid/content/pm/PackageInfo;->splitRevisionCodes:[I

    :cond_1c9
    const-string v0, "reqFeatures"

    .line 201
    invoke-static {v4, v0}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1dd

    const/4 v1, 0x0

    new-array v2, v1, [Landroid/content/pm/FeatureInfo;

    .line 202
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/pm/FeatureInfo;

    goto :goto_1de

    :cond_1dd
    const/4 v0, 0x0

    :goto_1de
    iput-object v0, v3, Landroid/content/pm/PackageInfo;->reqFeatures:[Landroid/content/pm/FeatureInfo;

    const-string v0, "configPreferences"

    .line 203
    invoke-static {v4, v0}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1f4

    const/4 v1, 0x0

    new-array v2, v1, [Landroid/content/pm/ConfigurationInfo;

    .line 204
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/pm/ConfigurationInfo;

    goto :goto_1f5

    :cond_1f4
    const/4 v0, 0x0

    :goto_1f5
    iput-object v0, v3, Landroid/content/pm/PackageInfo;->configPreferences:[Landroid/content/pm/ConfigurationInfo;

    const-string v0, "instrumentation"

    .line 205
    invoke-static {v4, v0}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 206
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    :try_end_204
    .catchall {:try_start_6 .. :try_end_204} :catchall_2b6

    const-string v2, "metaData"

    const-string v5, "info"

    if-eqz v0, :cond_22c

    .line 208
    :try_start_20a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_20e
    :goto_20e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_22c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 209
    invoke-static {v6, v5}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/pm/InstrumentationInfo;

    if-eqz v7, :cond_20e

    .line 211
    invoke-static {v6, v2}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/os/Bundle;

    iput-object v6, v7, Landroid/content/pm/InstrumentationInfo;->metaData:Landroid/os/Bundle;

    .line 212
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_20e

    :cond_22c
    const/4 v0, 0x0

    new-array v6, v0, [Landroid/content/pm/InstrumentationInfo;

    .line 216
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/pm/InstrumentationInfo;

    iput-object v0, v3, Landroid/content/pm/PackageInfo;->instrumentation:[Landroid/content/pm/InstrumentationInfo;

    const-string v0, "permissions"

    .line 217
    invoke-static {v4, v0}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 218
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_268

    .line 220
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_24a
    :goto_24a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_268

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 221
    invoke-static {v6, v5}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/pm/PermissionInfo;

    if-eqz v7, :cond_24a

    .line 223
    invoke-static {v6, v2}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/os/Bundle;

    iput-object v6, v7, Landroid/content/pm/PermissionInfo;->metaData:Landroid/os/Bundle;

    .line 224
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_24a

    :cond_268
    const/4 v0, 0x0

    new-array v2, v0, [Landroid/content/pm/PermissionInfo;

    .line 228
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/pm/PermissionInfo;

    iput-object v0, v3, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    const-string v0, "featureGroups"

    .line 229
    invoke-static {v4, v0}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_287

    const/4 v1, 0x0

    new-array v2, v1, [Landroid/content/pm/FeatureGroupInfo;

    .line 230
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/pm/FeatureGroupInfo;

    goto :goto_288

    :cond_287
    const/4 v0, 0x0

    :goto_288
    iput-object v0, v3, Landroid/content/pm/PackageInfo;->featureGroups:[Landroid/content/pm/FeatureGroupInfo;

    .line 231
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/y1;

    invoke-direct {v0, v4}, Lnet/bienvenido/mundo/sdk/internal/y1;-><init>(Landroid/content/pm/PackageParser$Package;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lnet/bienvenido/mundo/sdk/internal/AppWindowController;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Ltop/bienvenido/date_24323/i0;

    move/from16 v0, p1

    if-eqz v0, :cond_2b6

    .line 233
    new-instance v1, Landroid/content/Intent;

    const/4 v2, 0x1

    if-ne v0, v2, :cond_29f

    const-string v0, "android.intent.action.PACKAGE_ADDED"

    goto :goto_2a1

    :cond_29f
    const-string v0, "android.intent.action.PACKAGE_REPLACED"

    :goto_2a1
    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "package"

    .line 234
    iget-object v2, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v0, v2, v3}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 235
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->要不要把你妈卵子扣出来给你做寿司吃:Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lnet/bienvenido/mundo/sdk/internal/ActivityManagerServiceImpl;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Landroid/content/Intent;Ljava/lang/String;I)I
    :try_end_2b6
    .catchall {:try_start_20a .. :try_end_2b6} :catchall_2b6

    :catchall_2b6
    :cond_2b6
    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/util/ArrayList;Lnet/bienvenido/mundo/sdk/internal/l1;Landroid/content/pm/ApplicationInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)[Landroid/content/pm/ComponentInfo;
    .registers 9

    .line 337
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 340
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 342
    :try_start_11
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 343
    :goto_15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_41

    .line 344
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 345
    invoke-interface {p3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ComponentInfo;

    .line 346
    invoke-static {v2, p2}, Lnet/bienvenido/mundo/sdk/internal/l2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/ComponentInfo;Landroid/content/pm/ApplicationInfo;)V

    const-string v3, "metaData"

    .line 347
    invoke-static {v1, v3}, Lnet/bienvenido/mundo/sdk/internal/l2;->getReflectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    iput-object v1, v2, Landroid/content/pm/ComponentInfo;->metaData:Landroid/os/Bundle;

    .line 348
    iget-object v1, p1, Lnet/bienvenido/mundo/sdk/internal/l1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    iget-object v3, v2, Landroid/content/pm/ComponentInfo;->name:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-virtual {v1, v3, v2}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 349
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_40
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_40} :catch_41

    goto :goto_15

    .line 353
    :catch_41
    :cond_41
    invoke-interface {p4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Landroid/content/pm/ComponentInfo;

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/PackageInfo;I)Landroid/content/pm/PackageInfo;
    .registers 8

    .line 357
    new-instance v0, Landroid/content/pm/PackageInfo;

    invoke-direct {v0}, Landroid/content/pm/PackageInfo;-><init>()V

    .line 358
    iget-wide v1, p1, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    iput-wide v1, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 359
    iget-wide v1, p1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iput-wide v1, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 360
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->reqFeatures:[Landroid/content/pm/FeatureInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->reqFeatures:[Landroid/content/pm/FeatureInfo;

    .line 361
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->featureGroups:[Landroid/content/pm/FeatureGroupInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->featureGroups:[Landroid/content/pm/FeatureGroupInfo;

    .line 362
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 363
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    .line 364
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 365
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    .line 366
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 367
    iget v1, p1, Landroid/content/pm/PackageInfo;->sharedUserLabel:I

    iput v1, v0, Landroid/content/pm/PackageInfo;->sharedUserLabel:I

    .line 368
    iget v1, p1, Landroid/content/pm/PackageInfo;->installLocation:I

    iput v1, v0, Landroid/content/pm/PackageInfo;->installLocation:I

    .line 369
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    .line 370
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v1, :cond_3f

    .line 371
    iget v1, p1, Landroid/content/pm/PackageInfo;->baseRevisionCode:I

    iput v1, v0, Landroid/content/pm/PackageInfo;->baseRevisionCode:I

    .line 372
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->splitRevisionCodes:[I

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->splitRevisionCodes:[I

    .line 374
    :cond_3f
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    const/high16 v2, 0x8000000

    if-eqz v1, :cond_55

    .line 375
    invoke-virtual {p1}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageInfo;->setLongVersionCode(J)V

    and-int v1, p2, v2

    if-eqz v1, :cond_59

    .line 377
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->signingInfo:Landroid/content/pm/SigningInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->signingInfo:Landroid/content/pm/SigningInfo;

    goto :goto_59

    .line 380
    :cond_55
    iget v1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 382
    :cond_59
    :goto_59
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼:Z

    if-eqz v1, :cond_61

    .line 383
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->attributions:[Landroid/content/pm/Attribution;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->attributions:[Landroid/content/pm/Attribution;

    :cond_61
    and-int/lit8 v1, p2, 0x1

    if-eqz v1, :cond_69

    .line 386
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    :cond_69
    and-int/lit8 v1, p2, 0x2

    if-eqz v1, :cond_71

    .line 389
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    :cond_71
    and-int/lit8 v1, p2, 0x8

    if-eqz v1, :cond_79

    .line 392
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    :cond_79
    and-int/lit8 v1, p2, 0x4

    if-eqz v1, :cond_81

    .line 395
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    :cond_81
    and-int/lit16 v1, p2, 0x1000

    if-eqz v1, :cond_91

    .line 398
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    .line 399
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 400
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    :cond_91
    and-int/lit16 v1, p2, 0x4000

    if-eqz v1, :cond_99

    .line 403
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->configPreferences:[Landroid/content/pm/ConfigurationInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->configPreferences:[Landroid/content/pm/ConfigurationInfo;

    :cond_99
    and-int/lit8 v1, p2, 0x10

    if-eqz v1, :cond_a1

    .line 406
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->instrumentation:[Landroid/content/pm/InstrumentationInfo;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->instrumentation:[Landroid/content/pm/InstrumentationInfo;

    :cond_a1
    and-int/lit16 v1, p2, 0x100

    if-eqz v1, :cond_a9

    .line 409
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->gids:[I

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->gids:[I

    :cond_a9
    and-int/lit8 v1, p2, 0x40

    if-eqz v1, :cond_bc

    .line 414
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Lnet/bienvenido/mundo/sdk/internal/l2;->getFakeSignatures(Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object v1

    if-eqz v1, :cond_b8

    .line 416
    iput-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    goto :goto_bc

    .line 418
    :cond_b8
    iget-object v1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    iput-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 421
    :cond_bc
    :goto_bc
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟:Z

    if-eqz v1, :cond_102

    and-int/2addr p2, v2

    if-eqz p2, :cond_102

    .line 422
    iget-object p2, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-static {p2}, Lnet/bienvenido/mundo/sdk/internal/l2;->getFakeSignatures(Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object p2

    if-eqz p2, :cond_fe

    .line 426
    :try_start_cb
    sget-object p1, Landroid/content/pm/PackageParser$SigningDetails;->UNKNOWN:Landroid/content/pm/PackageParser$SigningDetails;

    .line 429
    const-class v1, Landroid/content/pm/PackageParser$SigningDetails;

    const-string v2, "signatures"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    .line 430
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 431
    invoke-virtual {v1, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 434
    const-class p2, Landroid/content/pm/SigningInfo;

    new-array v1, v2, [Ljava/lang/Class;

    const-class v3, Landroid/content/pm/PackageParser$SigningDetails;

    const/4 v4, 0x0

    aput-object v3, v1, v4

    invoke-virtual {p2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2

    .line 435
    invoke-virtual {p2, v2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p1, v1, v4

    .line 436
    invoke-virtual {p2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/SigningInfo;

    iput-object p1, v0, Landroid/content/pm/PackageInfo;->signingInfo:Landroid/content/pm/SigningInfo;
    :try_end_f8
    .catch Ljava/lang/Exception; {:try_start_cb .. :try_end_f8} :catch_f9

    goto :goto_102

    :catch_f9
    move-exception p1

    .line 438
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_102

    .line 441
    :cond_fe
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signingInfo:Landroid/content/pm/SigningInfo;

    iput-object p1, v0, Landroid/content/pm/PackageInfo;->signingInfo:Landroid/content/pm/SigningInfo;

    :cond_102
    :goto_102
    return-object v0
.end method
