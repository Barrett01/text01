package com.extend;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("zhangsan",24);
        System.out.println(person.say());
        Student student = new Student("zhangsan",20,"2644312",99);
        System.out.println(student.say());
    }
}
