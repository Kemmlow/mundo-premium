package top.bienvenido.date_24323;

public final class i9 {
   public int[] 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
   public int 要不要把你妈卵子扣出来给你做寿司吃;

   public i9(int i) {
      if (i == 0) {
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = g.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
      } else {
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = new int[i];
      }

      this.要不要把你妈卵子扣出来给你做寿司吃 = 0;
   }

   public final boolean ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(int i) {
      int i2 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, this.要不要把你妈卵子扣出来给你做寿司吃, i
      );
      if (i2 >= 0) {
         return false;
      }

      int i3 = this.要不要把你妈卵子扣出来给你做寿司吃;
      int[] iArr = this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
      int i4 = ~i2;
      int i5 = i3 + 1;
      if (i5 <= iArr.length) {
         System.arraycopy(iArr, i4, iArr, i4 + 1, i3 - i4);
         iArr[i4] = i;
      } else {
         int[] iArr2 = new int[i5 << 1];
         System.arraycopy(iArr, 0, iArr2, 0, i4);
         iArr2[i4] = i;
         System.arraycopy(iArr, i4, iArr2, i4 + 1, iArr.length - i4);
         iArr = iArr2;
      }

      this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = iArr;
      this.要不要把你妈卵子扣出来给你做寿司吃 = i5;
      return true;
   }
}
