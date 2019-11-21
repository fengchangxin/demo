package com.project.demo.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: fengchangxin
 * @create: 2019-11-20 16:46
 */

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("fff", 12F);
        Student s2 = new Student("fff", 14F);
        Student s3 = new Student("aaa", 14F);
        Student s4 = new Student("aaa", 20F);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);


        Map<String, List<Student>> result = list.stream().collect(Collectors.groupingBy(Student::getName));
        for (String key : result.keySet()) {

            System.out.println(key + ":" + result.get(key).size());
        }
    }
}
