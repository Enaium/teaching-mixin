package cn.enaium.learn.mixin.program;

/**
 * Project: Mixin
 * Author: Enaium
 */
public class Program {
    private final String name = "Enaium";

    private void hello() {
        System.out.println("HELLO WORLD!");
    }

    //
// @Invoker principle:
//    public void cHello() {
//        hello();
//    }
}
