package com.project.demo.lambda;

/**
 * @author: fcx
 * @date: 2019-11-19 21:57
 * @description:
 */

/**
 * 此注解修饰接口，函数式接口（只有一个抽象方法的接口）
 */
@FunctionalInterface
public interface IMath {
    int hand(int a, int b);

    /**
     * 接口默认继承Object ，重写Object的方法不算抽象方法
     *
     * @param obj
     * @return
     */
    @Override
    boolean equals(Object obj);

    /**
     * default 修饰实现，不算抽象方法
     *
     * @param a
     */
    default void add(int a) {
    }

    /**
     * 静态方法
     *
     * @param a
     * @param b
     */
    public static void add(int a, int b) {

    }
}
