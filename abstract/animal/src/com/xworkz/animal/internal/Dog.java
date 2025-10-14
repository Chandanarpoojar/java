package com.xworkz.animal.internal;

public class Dog {
    public int age;
    public String dogType;


    public Dog(int age,String dogType){
        this.age=age;
        this.dogType=dogType;

    }
    public void displayDog(){
        System.out.println("age of the dog="+age);
        System.out.println("name of the dog="+dogType);
    }
}