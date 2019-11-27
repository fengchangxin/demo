package com.project.demo.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//        返回类型不是Stream的都属于终止操作，终止后不能再操作流，流里面的操作对原数据不影响
//        Stream<Student> stream = list.stream();
//        stream.forEach(System.out::println);
//        System.out.println(stream.distinct().count());

//        System.out.println(list.stream().findAny().get().getScore());
//        System.out.println(list.stream().max(Comparator.comparing(Student::getScore)).get().getScore());

//        分组
//        Map<String, List<Student>> result = list.stream().collect(Collectors.groupingBy(Student::getName));
//        for (String key : result.keySet()) {
//
//            System.out.println(key + ":" + result.get(key).size());
//        }

        //分区
//        Map<Boolean,List<Student>> result = list.stream().collect(Collectors.partitioningBy(s->s.getScore()>10));
//        for (Boolean key : result.keySet()) {
//
//            System.out.println(key + ":" + result.get(key).size());
//        }

        System.out.println(list.stream().map(Student::getName).collect(Collectors.joining(",")));


    }
}
