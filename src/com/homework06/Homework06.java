package com.homework06;

public class Homework06 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,8);
    }
}

interface ICalculate{
    public double work(double n1,double n2);
}
class Cellphone{
    public void testWork(ICalculate iCalculate,double n1,double n2){
        double work = iCalculate.work(n1, n2);
        System.out.println(work);
    }
}
