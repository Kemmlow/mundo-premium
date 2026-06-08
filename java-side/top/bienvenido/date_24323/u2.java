package top.bienvenido.date_24323;

import java.util.Iterator;
import java.util.Map.Entry;

public final class u2 implements Iterator, Entry {
   public final v2 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈;
   public final int 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
   public int 要不要把你妈卵子扣出来给你做寿司吃 = -1;

   public u2(v2 v2Var) {
      this.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 = v2Var;
      this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = ((obfclass1)v2Var).要不要把你妈卵子扣出来给你做寿司吃.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 - 1;
   }

   @Override
   public final Object getKey() {
      return ((obfclass1)this.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈).要不要把你妈卵子扣出来给你做寿司吃.要不要把你妈卵子扣出来给你做寿司吃[this.要不要把你妈卵子扣出来给你做寿司吃 << 1];
   }

   @Override
   public final Object getValue() {
      return ((obfclass1)this.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈).要不要把你妈卵子扣出来给你做寿司吃.要不要把你妈卵子扣出来给你做寿司吃[(this.要不要把你妈卵子扣出来给你做寿司吃 << 1) + 1];
   }

   @Override
   public final boolean hasNext() {
      return this.要不要把你妈卵子扣出来给你做寿司吃 < this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
   }

   @Override
   public final Object next() {
      this.要不要把你妈卵子扣出来给你做寿司吃++;
      return this;
   }

   @Override
   public final Object setValue(Object obj) {
      v2 v2Var = this.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈;
      int i = this.要不要把你妈卵子扣出来给你做寿司吃;
      obfclass2 r0 = ((obfclass1)v2Var).要不要把你妈卵子扣出来给你做寿司吃;
      int i2 = (i << 1) + 1;
      Object[] objArr = r0.要不要把你妈卵子扣出来给你做寿司吃;
      Object obj2 = objArr[i2];
      objArr[i2] = obj;
      return obj2;
   }
}
