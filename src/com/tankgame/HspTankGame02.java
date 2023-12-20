package com.tankgame;

import javax.swing.*;

public class HspTankGame02 extends JFrame {

    //定义MyPanel
    Mypanel mp = null;
    public static void main(String[] args) {

        HspTankGame02 hspTankGame01 = new HspTankGame02();
    }

    public HspTankGame02() {
        mp = new Mypanel();
        this.add(mp);//把面板(就是游戏的绘图区域)
        this.setSize(1000, 750);
        // 一个接口的引用可以指向实现该接口的对象(mp实现了该接口) this.addKeyListener(KeyListener I);
        this.addKeyListener(mp); //让JFrame 监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}