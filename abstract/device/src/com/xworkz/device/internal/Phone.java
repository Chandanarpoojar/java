package com.xworkz.device.internal;

public class Phone {
    public int price;
    public String name;
    public Phone(int price,String name){
        this.price=price;
        this.name=name;
    }
    public void displyPhone(){
        System.out.println("ammount="+price);
        System.out.println("brandname="+name);
    }
}
