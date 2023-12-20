package com.homework05;

public abstract class Animal {
    abstract void shout();

}
class Cat extends Animal{
    @Override
    void shout() {
        System.out.println("猫喵喵的叫");
    }
}

class Dog extends Animal{
    @Override
    void shout() {
        System.out.println("狗旺旺的叫");
    }
}


