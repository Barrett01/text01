package com.extend;

public class Student extends Person {
    private String id;
    private int score;

    public Student(String name, int age, String id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public String say(){
//        System.out.println(super.say()+" id:"+id +" score:" +score);
        return super.say()+" id:"+id +" score:" +score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
