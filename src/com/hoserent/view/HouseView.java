package com.hoserent.view;

import com.hoserent.domain.Houses;
import com.hoserent.service.HouseSercice;
import com.hoserent.utility.Utility;

public class HouseView {
    public boolean loop = true;
    private char key = ' ';
    private HouseSercice houseSercice =  new HouseSercice(3);
    //显示房屋信息
    public void listHouses(){
        System.out.println("============房屋列表============");
        System.out.println("编号\t\t房主\t\t\t电话\t\t地址\t\t\t\t月租\t\t状态(未出组/已出租)");
        Houses[] houses = houseSercice.list();
        for (int i = 0;i<houses.length;i++){//坑
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("============房屋信息展示完毕=============");
    }
    //添加
    public  void addHouses(){//接受输入创建house对象
        System.out.println("============添加房屋============");
        System.out.print("房主姓名：");
        String name = Utility.readString(8);
        System.out.print("电话号码：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(20);
        System.out.print("房屋租金：");
        int rent = Utility.readInt();
        System.out.print("房屋状态：");
        String state = Utility.readString(3);
        Houses house = new Houses(0, name, phone, address, rent, state);//注意id是分配的，用户不能输入；
        if (houseSercice.add(house)){
            System.out.println("成功");
        }else System.out.println("失败");
    }
//删除
    public void delHouse(){
        System.out.println("===============删除房屋===============");
        System.out.println("请选择要删除的房屋编号（-1退出）");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("==============放弃删除房屋==============");
            return;
        }
        char choice=  Utility.readConfirmSelection();
        if (choice == 'Y'){
            if (houseSercice.del(delId)){
                System.out.println("成功");
            }else {
                System.out.println("编号不存在");
            }
        }else {
            System.out.println("==============放弃删除房屋==============");
        }
    }
    //退出方法
    public void exit(){
        char e = Utility.readConfirmSelection();
        if (e == 'Y'){
            loop = false;
        }
    }
    //查找，接受用户输入
    public void findHouse(){
        System.out.println("----------------查找房屋---------------");
        System.out.print("请输入你要查找的房屋编号：");
        int findID = Utility.readInt();
        System.out.println("编号\t房主\t电话\t\t地址\t\t月租\t\t状态(未出组/已出租)");
        Houses houses = houseSercice.find(findID);
        if (houses!= null){
            System.out.println(houses);
        }else {
            System.out.println("------未查找到房屋信息-----");
        }
    }
    //修改信息界面，接受用户输入
    public void updateHouse(){
        System.out.println("-----------------修改房屋信息-----------------");
        System.out.print("请输入你要查找的房屋编号（-1退出）：");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("--------------放弃修改房屋信息--------------");
            return;
        }
        //查找对象
        Houses house = houseSercice.find(updateId);
        if (house!=null){
            System.out.print("姓名(" + house.getName() + "):");
            String name = Utility.readString(8, "");
            if ( !"".equals(name)){
                house.setName(name);
            }
            System.out.print("电话(" + house.getPhone() + "):");
            String phone = Utility.readString(12, "");
            if (!"".equals(phone)){
                house.setPhone(phone);
            }
            System.out.print("地址(" + house.getAddress() + "):");
            String address = Utility.readString(10, "");
            if (!"".equals(address)){
                house.setAddress(address);
            }
            System.out.print("月租(" + house.getRent() + "):");
            int rent = Utility.readInt(-1);
            if (rent != -1){
                house.setRent(rent);
            }
            System.out.print("状态(" + house.getState() + "):");
            String state = Utility.readString(3, "");
            if (!"".equals(state)){
                house.setState(state);
            }
            System.out.println("---------------修改房屋信息完成-----------------");
        }else {
            System.out.println("-------------未查找到房屋信息------------");
        }
    }
    public void mainHouse(){
        do {
            System.out.println("================房租出租系统=================");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房源信息");
            System.out.println("\t\t\t4 修改房源信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退    出");
            System.out.println("请输入你的选择（1-6）：");
            key= Utility.readChar();
            switch (key){
                case '1':
                    addHouses();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while(loop);
    }
}
