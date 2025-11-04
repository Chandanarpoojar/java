package com.xworkz.website.external;

import com.xworkz.website.bridige.Instgram;

public class InstgramRunner {
    public static void main(String[] args) {


        Instgram madulo = (value1, value2) -> value1 - value2;
        int sub = madulo.sub(888, 666);
        System.out.println("substraction :" + sub);
    }
}