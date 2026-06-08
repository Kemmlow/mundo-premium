package top.bienvenido.date_24323;

public abstract class e9 {
   public static int[] ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      int[] iArr, int i, int i2, int i3
   ) {
      int i4 = i + 1;
      if (i4 <= iArr.length) {
         System.arraycopy(iArr, i2, iArr, i2 + 1, i - i2);
         iArr[i2] = i3;
         return iArr;
      } else {
         int[] iArr2 = new int[i4 << 1];
         System.arraycopy(iArr, 0, iArr2, 0, i2);
         iArr2[i2] = i3;
         System.arraycopy(iArr, i2, iArr2, i2 + 1, iArr.length - i2);
         return iArr2;
      }
   }
}
