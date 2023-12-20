package com.test.text1;

public class Manager extends Employee{
    private double bonus;
    private String jor;

    public Manager(String name, int age, double salary, double bonus, String jor) {
        super(name, age, salary);
        this.bonus = bonus;
        this.jor = jor;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getJor() {
        return jor;
    }

    public void setJor(String jor) {
        this.jor = jor;
    }

    @Override
    public String work() {
        return jor+ this.getName()+"\t年龄："+this.getAge()+"\t在工作中";
    }
}
