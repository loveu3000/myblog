package com.tangsir.test.streamtest;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Start {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students. add(new Student().setName("栋1").setScore(20));
        students. add(new Student().setName("栋1").setScore(20));
        students. add(new Student().setName("林1").setScore(20));
        students. add(new Student().setName("林2").setScore(20));
        students. add(new Student(). setName("林3"). setScore(30));
        Map<String, Long> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getName,Collectors.summingLong(Student::getScore)));
        System.out.println(collect);
    }
}


