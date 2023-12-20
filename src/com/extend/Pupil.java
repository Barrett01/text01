package com.extend;

public class Pupil {
    private String cpu;
    private  int memory;
    private int disk;

//    public Pupil() {
//    }

    public Pupil(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    public String getDetailes(){
        return "cpu=" + cpu + "  memory=" + memory + "  disk=" + disk;
    }
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}

class pc extends Pupil{
    private String brand;
    //继承的设计思想，父类的构造器完成父类的初始化，子类的构造器完成子类的初始化
    public pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("pc的信息：");
        System.out.println(getDetailes()+"  brand="+brand);
    }
}

