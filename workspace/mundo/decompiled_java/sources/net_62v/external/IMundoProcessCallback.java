package net_62v.external;

/* loaded from: IMundoProcessCallback.class */
public interface IMundoProcessCallback {
    default void onCreate(String str, String str2) {
    }

    default void onInitialized() {
    }

    default void onCreate(String str, String str2, String str3) {
        onCreate(str, str2);
    }
}
