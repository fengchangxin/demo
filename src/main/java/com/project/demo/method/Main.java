package com.project.demo.method;

/**
 * @author: fcx
 * @date: 2019-11-19 21:56
 * @description:
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 方法引用，也是lambda，只调用其他的一个方法时使用，需要返回类型和参数对应
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "456", "789");
        Map<String, String> map = new HashMap<>(3);
        map.put("123", "123");
        map.put("456", "456");
        map.put("789", "789");
        List<Student> studentList = Arrays.asList(new Student(), new Student("fff"), new Student("dddd"));

        //构造方法，调用无参构造方法,Class::new
        Student s1 = Student.create(Student::new);

        //调用有参构造方法，参数与接口方法一致
        Study study = Student::new;
        study.study("e234");

        //静态方法调用，参数根据上下文确定，需要类型数量对应，Class::static_method
        //是lambad，原样
        list.forEach(s -> {
            Student.follow(s);
        });
        list.forEach(Student::follow);
        studentList.forEach(Student::follow);
        map.forEach(Student::follow);
        //System.out.println(Student::follow);

        //对象方法调用，Class::method，只接受无参方法
        //list.forEach(Student::getName);
        studentList.forEach(Student::getName);

        //对象方法调用，instant::method，参数类型对应
        list.forEach(s1::getName);
        studentList.forEach(s1::getName);
    }
}
