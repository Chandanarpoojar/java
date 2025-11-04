package com.xworkz.maths.external;

import com.xworkz.maths.bridige.Machin;

public class MAchinRunner {
    public static void main(String[] args) {
        Machin function=(value1, value2) -> value1+value2;
        long additions=function.additions(55,66);
        System.out.println("Function :"+additions);

    }
}
