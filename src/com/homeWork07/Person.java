package com.homeWork07;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, com.homeWork07.Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver(){
        if (!(vehicles instanceof Boat)){
            vehicles = GC.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if (!(vehicles instanceof Horse)){
            vehicles = GC.getHorse();
        }
        vehicles.work();
    }
}
