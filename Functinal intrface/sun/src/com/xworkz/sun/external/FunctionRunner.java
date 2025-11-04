package com.xworkz.sun.external;


import com.xworkz.sun.bridige.Function;

public class FunctionRunner {
    public static void main(String[] args) {
        Function function=(value1, value2) -> value1+value2;
        long additions=function.additions(55,66);
        System.out.println("Function :"+additions);
    }
}
