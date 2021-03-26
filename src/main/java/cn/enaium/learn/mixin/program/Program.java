package cn.enaium.learn.mixin.program;

/**
 * Project: Mixin
 * Author: Enaium
 */
public class Program {
    public Program() {
        Head();
        Head("Head");
        Return();
        Return(1);
        Tail();
        Invoke();
        InvokeAssign();
        Field();
        New();
    }

    public void Head() {

    }

    public void Head(String name) {

    }

    public void Return() {
        System.out.println("===RETURN===");
    }

    public void Return(int index) {
        System.out.println("===RETURN===");
        switch (index) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
        }
    }

    public void Tail() {
        System.out.println("===TAIL===");
    }

    public void Invoke() {
        System.out.println("===INVOKE===");
        System.out.println("println 0");
        System.out.println("println 1");
    }

    public void InvokeAssign() {
        System.out.println("===INVOKE_ASSIGN===");
        "".isEmpty();
    }

    public static String field = "FIELD";

    public void Field() {
        System.out.println("===FIELD===");
        System.out.println(field);
    }

    public void New() {
        System.out.println("===NEW===");
        new String();
    }
}
