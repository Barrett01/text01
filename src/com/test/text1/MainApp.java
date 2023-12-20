package com.test.text1;

public class MainApp {
    public static void main(String[] args) {
        Manager manager = new Manager("ll", 25, 5000.0, 1000.0, "打工人");
        String work = manager.work();
        System.out.println(work);
    }
}
