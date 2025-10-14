package com.xworkz.cars.internal;

public class Engine {
    public  int horsePower;
    public double torque;


public Engine(int horsePower,double torque){
this.horsePower=horsePower;
this.torque=torque;
}
public void displayEngine(){
    System.out.println("engine power="+horsePower);
    System.out.println("torque="+torque);
}
}