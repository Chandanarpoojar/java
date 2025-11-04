package com.xworkz.maths.external;

import com.xworkz.maths.bridige.Calcte;

public class CalcateRunner {
    public static void main(String[] args) {
        Calcte calcte=(num1, num2) -> num1+num2;
            int add= calcte.add(66,99);
            System.out.println("addition:"+add);
    }
}
