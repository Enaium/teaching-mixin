package cn.enaium.learn.mixin.program;

/**
 * Project: Mixin
 * Author: Enaium
 */
public class Program {
    public int get() {
        return 888;
    }

    public int g() {
        return get();
    }
}
