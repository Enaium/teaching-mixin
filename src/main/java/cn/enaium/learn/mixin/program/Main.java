package cn.enaium.learn.mixin.program;

import cn.enaium.learn.mixin.mixin.IProgramMixin;

/**
 * Project: Mixin
 * Author: Enaium
 */
public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        IProgramMixin program1 = (IProgramMixin) program;
        program1.setName("HELLO");
        System.out.println(program1.getName());
        program1.cHello();
    }
}
