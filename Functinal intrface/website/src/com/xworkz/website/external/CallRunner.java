package com.xworkz.website.external;

import com.xworkz.website.bridige.Call;

import java.util.Calendar;

public class CallRunner {
    public static void main(String[] args) {
        Call addititon=(num1, num2) -> num1+num2;
        long add=addititon.add(998877666,88997755);
        System.out.println("Addition :"+add);

    }
}
