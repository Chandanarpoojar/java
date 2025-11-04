package com.xworkz.sun.external;

import com.xworkz.sun.bridige.Sub;

public class SubRunner {
    public static void main(String[] args) {
        Sub sub=(num1, num2) ->num1-num2;
        double minimize= sub.minize(22.2,222.2);
        System.out.println("substraction :"+minimize);
    }
}
