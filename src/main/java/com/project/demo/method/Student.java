package com.project.demo.method;

import java.util.function.Supplier;

/**
 * @author: fcx
 * @date: 2019-11-19 23:08
 * @description:
 */
public class Student {
    public static Student create(final Supplier<Student> supplier) {
        return supplier.get();
    }

    public Student() {
        System.out.println("无参构造方法");
    }

    public Student(String name) {
        System.out.println("有参构造方法：" + name);
    }

    public static void follow() {
        System.out.println("无参follow");
    }

    public static void follow(String name) {
        System.out.println("有参follow：" + name);
    }

    public static void follow(Student student) {
        System.out.println("有参follow：" + student);
    }

    public static void follow(String key, String value) {
        System.out.println("有参follow：" + key + ":" + value);
    }

    public void getName() {
        System.out.println("无参getName");
    }

    public void getName(String name) {
        System.out.println("有参getName：" + name);
    }

    public void getName(Student student) {
        System.out.println("有参getName：" + student);
    }
}
