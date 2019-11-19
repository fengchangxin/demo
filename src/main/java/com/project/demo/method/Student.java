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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void show(Student student) {
        System.out.println(student.getName());
    }
}
