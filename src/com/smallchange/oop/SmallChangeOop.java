package com.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOop {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "=======================零钱通明细oop================";

    //定义新的变量
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化

    String note ="";
    public void mainMenu(){
        do {
            System.out.println("================零钱通opp===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退    出");

            System.out.println("请选择(1_4): ");
            key = scanner.next();
            //分支控制
            switch (key){
                case "1":
                    this.datail();
                    break;
                case "2":
                   this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break ;
                default:
                    System.out.println("选择有误，请重现选择");
            }

        }while (loop);
    }
    public void datail(){
        System.out.println(details);
    }
    //收入入账
    public void income(){
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        //要合理 控制
        if (money<=0){
            System.out.println("输入金额要大于零");
            return;
        }
        balance += money;
        date  = new Date();
        details += "\n收益入账\t"+ money + "\t"+sdf.format(date)+"\t"+balance ;
        System.out.println(details);
    }
    public void pay(){
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        //校验金额是否合理
        if (money<=0 || money>balance){
            System.out.println("不可行,你的余额还有："+ balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
        date  = new Date();
        details += "\n" + note +"\t"+ money + "\t"+sdf.format(date)+"\t"+balance ;
        System.out.println(details);
    }
    public void exit(){
        String choice = "";
        while (true){
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)){
                break;
            }
            System.out.println("请输入合理请求");
        }
        if (choice.equals("y")){
            loop = false;
        }
    }
}
