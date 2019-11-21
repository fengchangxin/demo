package com.project.demo.stream;

/**
 * @description:
 * @author: fengchangxin
 * @create: 2019-11-20 16:52
 */

public class Student {
    private String name;

    private Float score;

    public Student(String name, Float score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
