package net_62v.external;

public interface IMundoProcessCallback {
   default void onCreate(String str, String str2) {
   }

   default void onInitialized() {
   }

   default void onCreate(String str, String str2, String str3) {
      this.onCreate(str, str2);
   }
}
