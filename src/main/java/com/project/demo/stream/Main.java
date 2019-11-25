package com.project.demo.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
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
        Student s2 = new Student("fff", 5F);
        Student s3 = new Student("aaa", 16F);
        Student s4 = new Student("aaa", 10F);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);


//        Map<String, List<Student>> result = list.stream().collect(Collectors.groupingBy(Student::getName));
//        for (String key : result.keySet()) {
//
//            System.out.println(key + ":" + result.get(key).size());
//        }

        System.out.println(LocalTime.now());
    }
}
