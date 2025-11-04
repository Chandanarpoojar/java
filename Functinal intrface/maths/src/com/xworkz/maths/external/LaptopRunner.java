package com.xworkz.maths.external;

import com.xworkz.maths.bridige.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=(price1, price2) ->price1/price2;
        long  divi=laptop.divi(2,4);
        System.out.println("divission :"+divi);

    }
}
