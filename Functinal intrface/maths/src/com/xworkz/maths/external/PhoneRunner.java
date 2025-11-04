package com.xworkz.maths.external;

import com.xworkz.maths.bridige.Phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone mod=(num1, num2) ->num1*num2;
        long multi= mod.add(66,88);
        System.out.println("mulitication:"+multi);
    }
}
