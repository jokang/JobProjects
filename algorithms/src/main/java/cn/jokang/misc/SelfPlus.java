package cn.jokang.misc;

public class SelfPlus {
    private static void func(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static int dump(int arg) {
        System.out.println(arg + " is used.");
        return arg;
    }

    public static void main(String[] args) {
        // Calculate from left to right
        func(dump(0), dump(1));

        int i = 0;
        func(i++, i++); // 0, 1

        func(++i, ++i);
    }
}
