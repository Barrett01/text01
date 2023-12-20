package com.homeWork07;

public class GC {
//    public void boat(Boat boat){
//        boat.work();
//    }
//    public void horse(Horse horse){
//        horse.work();
//    }
    //码始终都是一匹
    private static Horse  horse=  new Horse();
    private GC(){
    }
    //将方法加入static方便调用
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
