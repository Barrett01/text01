package com.homework08;

public class HomeWork08 {
    public static void main(String[] args) {
        Color bule = Color.RED;
        bule.show();
        switch (bule){
            case RED:
                System.out.println("匹配到红色");
                break;
            case BULE:
                System.out.println("匹配到绿色");
                break;
            default:
                System.out.println("什么也没有");
        }
    }
    interface IMyInterface{
        public void show();
    }
    enum Color implements IMyInterface{
        RED(255,0,0),BULE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
        private int redValue;
        private int greenValue;
        private int blueValue;

        Color(int redValue, int greenValue, int blueValue) {
            this.redValue = redValue;
            this.greenValue = greenValue;
            this.blueValue = blueValue;
        }

        @Override
        public void show() {
            System.out.println(redValue+"\t"+greenValue+"\t"+blueValue);
        }
    }
}
