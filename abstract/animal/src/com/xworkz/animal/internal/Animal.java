package com.xworkz.animal.internal;

public class Animal {
    public int number;
    public String type;
    public  Dog dog;


    public  Animal(int number,String type,Dog dog){
        this.number=number;
        this.type=type;
        this.dog=dog;

    }
    public  void displyAnimal(){
        System.out.println("number="+number);
        System.out.println("type="+type);
        System.out.println("dog="+dog.age);
        System.out.println("dogtype="+dog.dogType);
    }

}
