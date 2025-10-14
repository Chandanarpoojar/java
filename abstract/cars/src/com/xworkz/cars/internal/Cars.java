package com.xworkz.cars.internal;

public abstract class Cars {
    public  int noOfStrocks;
    public String engineType;
    public  Engine engine;
    public  Cars(int noOfStrocks,String engineType,Engine engine){
        this.noOfStrocks=noOfStrocks;
        this.engineType=engineType;
        this.engine=engine;
    }
    public  void displayCar(){
        System.out.println("number of strocks="+noOfStrocks);
        System.out.println("engine type="+engineType);
        System.out.println("engine hors="+engine.horsePower);
        System.out.println("engine torquw="+engine.torque);
    }

}
