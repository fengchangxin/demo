package com.project.demo.method;

/**
 * @author: fcx
 * @date: 2019-11-19 21:56
 * @description:
 */

/**
 * 方法引用，也是lambda，只调用其他的一个方法时使用，需要返回类型和参数对应
 */
public class Main {
    public static void main(String[] args) {
        Study s1 = (name) -> new Student(name);

        //构造方法
        Study s2 = Student::new;

        //静态方法
        Study s3 = Student::create;

        //对象方法
        Student student = new Student();
        Study s4 = student::get;
    }
}
