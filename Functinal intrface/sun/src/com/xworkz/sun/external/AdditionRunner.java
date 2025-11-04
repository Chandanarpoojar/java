package com.xworkz.sun.external;

import com.xworkz.sun.bridige.Addititon;

public class AdditionRunner {
    public static void main(String[] args) {
        Addititon addititon=(num1, num2) -> num1+num2;
        long add=addititon.add(998877666,88997755);
        System.out.println("Addition :"+add);

    }
}
