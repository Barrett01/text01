package com.test;

public class Test01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        System.out.println(circle.calArea());
    }
}
class Circle{
    private double radius;
    private final double PI;//= 3.14;
    public Circle(double radius){
        this.radius = radius;
        //PI = 3.14;
    }
    {
        PI = 3.14;
    }
    public double calArea(){
        return radius*radius*PI;
    }

}
