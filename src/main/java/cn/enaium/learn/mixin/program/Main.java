package cn.enaium.learn.mixin.program;

/**
 * Project: Mixin
 * Author: Enaium
 */
public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        System.out.println(program.get());
        System.out.println(program.g());
        System.out.println(program.get());
    }
}
