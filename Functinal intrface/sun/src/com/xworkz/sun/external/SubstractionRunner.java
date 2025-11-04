package com.xworkz.sun.external;

import com.xworkz.sun.bridige.Substraction;

public class SubstractionRunner {
    public static void main(String[] args) {
        Substraction substraction=(grade1, grade2) -> grade1-grade2;
        int sub=substraction.sub(222,877);
        System.out.println("substraction="+sub);
    }
}
