package com.hh.encap;

public class Account {
    String name = "";
    private  double money;
    private String  password;

    public Account() {
    }
    public Account(String name,double money,String password){
        this.setName(name);
        this.setMoney(money);
        this.setPassword(password);
    }

    public void setName(String name) {
        if (name.length()>1 && name.length()<5){
            this.name = name;
        }else {
            System.out.println("没有这个人");
            this.name = null;
        }
    }

    public void setMoney(double money) {
        if (money>20){
            this.money = money;
        }else {
            System.out.println("不合程序");
            this.money = 0;
        }

    }

    public void setPassword(String password) {
        if (password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密码应该为6个字符");
            this.password = null;
        }
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public String getPassword() {
        return password;
    }
    public void showInfo(){
        System.out.println("账号信息 name =" + name +  "\t" + "余额"+money + "密码" + password);
//        if (){
//            System.out.println("账号信息 name =" + name + "余额"+money + "密码" + password);
//        }else {
//            System.out.println("无权查看");
//        }
    }
}
