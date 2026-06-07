package dev.knoxy.core.fake;

import top.knoxy.jnihook.ReflectCore;

/**
 * Created by Milk on 2021/5/7.
 * * ∧＿∧
 * (`･ω･∥
 * 丶　つ０
 * しーＪ
 * 此处无Bug
 */
public class FakeCore {
    public static void init() {
        ReflectCore.set(android.app.ActivityThread.class);
    }
}
