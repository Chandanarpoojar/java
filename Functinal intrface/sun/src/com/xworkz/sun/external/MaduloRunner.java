package com.xworkz.sun.external;

import com.xworkz.sun.bridige.Madulo;

public class MaduloRunner {
    public static void main(String[] args) {
        Madulo madulo=(value1, value2) -> value1-value2;
        int sub=madulo.sub(888,666);
        System.out.println("substraction :"+sub);
    }
}
