package com.test.test2;

public class InnerClassExercise {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小猪猪该起床了");
            }
        });
    }
}
interface Bell{
    public void ring();
}
class Cellphone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
