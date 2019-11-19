package com.project.demo.lambda;

/**
 * @author: fcx
 * @date: 2019-11-19 21:57
 * @description:
 */
public class Main {
    private int c = 3;

    public static void main(String[] args) {
        int a = 10, b = 20;
        div(a, b);
        System.out.println("dddddd");
        a = 2;
    }

    public static void add(int a, int b) {
        IMath m1 = new Math();
        System.out.println("m1结果：" + m1.hand(a, b));

        IMath m2 = new IMath() {
            @Override
            public int hand(int a, int b) {
                return a + b;
            }
        };
        System.out.println("m2结果：" + m2.hand(a, b));

        //  (param1,param2...)-> 表达式;
        //  (param1,param2...)_> { 表达式; };
        IMath m3 = (s1, s2) -> s1 + s2;
        System.out.println("m3结果：" + m3.hand(a, b));

        Runnable runnable = () -> {
            System.out.print("dfdf");
        };
    }

    public static void sub(int a, int b) {
        IMath m1 = (s1, s2) -> {
            System.out.print("dfdfdfd");
            return s1 - s2;
        };
    }

    /**
     * 变量的作用域，参数不是闭包里面的变量时，变量有作为常亮的性质,
     * 如果合理在多线程下不是原子性，不安全，发生不可预知问题
     *
     * @param a
     * @param b
     */
    public static void div(int a, int b) {
        Runnable runnable = () -> {
            System.out.println("========");
            //a++;
            System.out.println(a + b);
        };
        //a = 23;
        new Thread(runnable).start();
    }
}
