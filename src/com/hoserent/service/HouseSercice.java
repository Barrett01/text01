package com.hoserent.service;

import com.hoserent.domain.Houses;

public class HouseSercice {
    private Houses[] houses;
    private int houseNums = 1;//记录当前有多少房屋信息
    private int idCounter = 1;//记录id增长到那个值了；
    public HouseSercice(int size){
        houses = new Houses[size];
        houses[0] = new Houses(1, "jack", "112", "haidingqu", 1000, "f");
    }
    public Houses[] list(){
        return houses;
    }
    public boolean add(Houses newHouse){
        //暂时不考虑数组扩容
        if (houseNums == houses.length){
            System.out.println("已满，不能添加");
            return false;
        }
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }
    public boolean del(int delId){
        //寻找要删除房屋信息对应的下标
        int index = -1;
        for (int i = 0 ; i<houseNums;i++){
            if (delId == houses[i].getId()){
                index = i;//使用index记录i
            }
        }
        if (index == -1){
            return false;
        }
        for (int i = index;i<houseNums-1;i++){
            houses[i] = houses[i+1];
        }houses[--houseNums] =null;
        return true;
    }
    public Houses find(int findId){
        for (int i = 0;i<houseNums;i++){
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }return null;
    }

}
