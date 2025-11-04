package com.xworkz.sun.external;

import com.xworkz.sun.bridige.Sum;

public class SumRunner {
    public static void main(String[] args) {
        Sum sum=(num1, num2) -> num1+num2;
        int add= sum.add(66,99);
        System.out.println("addition:"+add);

    }
}
