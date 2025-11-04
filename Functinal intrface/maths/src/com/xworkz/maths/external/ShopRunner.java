package com.xworkz.maths.external;

import com.xworkz.maths.bridige.Shop;

public class ShopRunner {
    public static void main(String[] args) {
        Shop sub=(num1, num2) ->num1-num2;
        double minimize= sub.minize(22.2,222.2);
        System.out.println("substraction :"+minimize);
    }
}
