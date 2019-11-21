package com.project.demo.method;

/**
 * @author: fcx
 * @date: 2019-11-19 23:08
 * @description:
 */
public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    /**
     * 静态方法
     *
     * @param name
     * @return
     */
    public static Student create(String name) {
        return new Student(name);
    }

    /**
     * 对象方法
     *
     * @param s
     * @return
     */
    public Student get(String s) {
        return new Student(s);
    }
}
