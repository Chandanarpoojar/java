package com.xworkz.device.internal;

public abstract class Device {
    public String phoneType;
    public double review;
    public Phone phone;
    public  Device(String phoneType,double review,Phone phone){
        this.phoneType=phoneType;
        this.review=review;
        this.phone=phone;

    }
    public void displayDevice(){
        System.out.println("phone Type="+phoneType);
        System.out.println("review="+review);
        System.out.println("price of the phone="+phone.price);
        System.out.println("name of phone="+phone.name);
    }

}
