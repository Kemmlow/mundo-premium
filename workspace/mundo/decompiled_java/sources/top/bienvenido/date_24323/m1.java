package top.bienvenido.date_24323;

import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import java.io.File;
import java.util.Arrays;
import kotlin.io.FilesKt;

/* loaded from: m1.class */
public final class m1 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final c2 f234;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final 你在这叭叭啥呢集众给你吗凑棺材钱 f235 = new 你在这叭叭啥呢集众给你吗凑棺材钱();

    public m1(c2 c2Var) {
        this.f234 = c2Var;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m343() {
        try {
            boolean z = z1.f436;
            File file = n1.m361(z1.f437, this.f234.f170, "components.bin");
            if (file.exists()) {
                byte[] bytes = FilesKt.readBytes(file);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bytes, 0, bytes.length);
                parcelObtain.setDataPosition(0);
                int i = parcelObtain.readInt();
                int[] iArr = new int[i];
                int[] iArr2 = new int[i];
                parcelObtain.readIntArray(iArr);
                parcelObtain.readIntArray(iArr2);
                parcelObtain.recycle();
                你在这叭叭啥呢集众给你吗凑棺材钱 r0 = this.f235;
                r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 = i;
                r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = iArr;
                r0.要不要把你妈卵子扣出来给你做寿司吃 = iArr2;
                ServiceInfo[] serviceInfoArr = this.f234.f98.services;
                if (serviceInfoArr != null) {
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        if (!((ComponentInfo) serviceInfo).enabled && m345(((ComponentInfo) serviceInfo).name) == 1) {
                            ((ComponentInfo) serviceInfo).enabled = true;
                        }
                    }
                }
                ActivityInfo[] activityInfoArr = this.f234.f98.activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (!((ComponentInfo) activityInfo).enabled && m345(((ComponentInfo) activityInfo).name) == 1) {
                            ((ComponentInfo) activityInfo).enabled = true;
                        }
                    }
                }
                ProviderInfo[] providerInfoArr = this.f234.f98.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        if (!((ComponentInfo) providerInfo).enabled && m345(((ComponentInfo) providerInfo).name) == 1) {
                            ((ComponentInfo) providerInfo).enabled = true;
                        }
                    }
                }
                ActivityInfo[] activityInfoArr2 = this.f234.f98.receivers;
                if (activityInfoArr2 != null) {
                    for (ActivityInfo activityInfo2 : activityInfoArr2) {
                        if (!((ComponentInfo) activityInfo2).enabled && m345(((ComponentInfo) activityInfo2).name) == 1) {
                            ((ComponentInfo) activityInfo2).enabled = true;
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void m344() {
        try {
            你在这叭叭啥呢集众给你吗凑棺材钱 r0 = this.f235;
            int i = r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈;
            int[] iArrCopyOf = Arrays.copyOf(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, i);
            int[] iArrCopyOf2 = Arrays.copyOf(this.f235.要不要把你妈卵子扣出来给你做寿司吃, i);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInt(i);
            parcelObtain.writeIntArray(iArrCopyOf);
            parcelObtain.writeIntArray(iArrCopyOf2);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            boolean z = z1.f436;
            FilesKt.writeBytes(n1.m361(z1.f437, this.f234.f170, "components.bin"), bArrMarshall);
        } catch (Exception e) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final int m345(String str) {
        try {
            你在这叭叭啥呢集众给你吗凑棺材钱 r0 = this.f235;
            int iHashCode = str.hashCode();
            int i = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, iHashCode);
            if (i < 0) {
                return 0;
            }
            return r0.要不要把你妈卵子扣出来给你做寿司吃[i];
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m346(String str, int i) {
        try {
            ComponentInfo componentInfo = (ComponentInfo) this.f234.f96.f223.m162(str.hashCode());
            if (componentInfo == null) {
                return;
            }
            if (i == 0) {
                你在这叭叭啥呢集众给你吗凑棺材钱 r0 = this.f235;
                int i2 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, str.hashCode());
                if (i2 >= 0) {
                    int[] iArr = r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                    int i3 = i2 + 1;
                    System.arraycopy(iArr, i3, iArr, i2, r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 - i3);
                    int[] iArr2 = r0.要不要把你妈卵子扣出来给你做寿司吃;
                    System.arraycopy(iArr2, i3, iArr2, i2, r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 - i3);
                    r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈--;
                }
                if (r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 == 0) {
                    r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 = 0;
                    int[] iArr3 = AbstractC0020g.f144;
                    r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = iArr3;
                    r0.要不要把你妈卵子扣出来给你做寿司吃 = iArr3;
                }
            } else {
                this.f235.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(str.hashCode(), i);
            }
            boolean z = false;
            if (i != 2) {
                z = false;
                if (i != 3) {
                    z = true;
                }
            }
            componentInfo.enabled = z;
        } catch (Exception e) {
        }
    }
}
