package com.xworkz.animals.external;

import com.xworkz.animals.internal.Animals;
import com.xworkz.animals.internal.Dog;

public class AnimalsRunner {
    public static void main(String[] args) {
        Animals animals=new Dog();
        animals.displayanimal();
        Dog dog = (Dog) animals;
        dog.displayDog();
    }
}
