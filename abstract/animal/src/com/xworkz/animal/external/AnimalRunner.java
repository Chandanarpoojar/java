package com.xworkz.animal.external;

import com.xworkz.animal.internal.Animal;
import com.xworkz.animal.internal.AnimalInfo;
import com.xworkz.animal.internal.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog= new Dog(5,"germanshfried");
         Animal animal=new AnimalInfo(122,"hybried",dog);
        animal.displyAnimal();
    }
}
