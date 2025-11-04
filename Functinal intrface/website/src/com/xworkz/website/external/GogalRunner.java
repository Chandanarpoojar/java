package com.xworkz.website.external;

import com.xworkz.website.bridige.Gogal;

public class GogalRunner {
    public static void main(String[] args) {
        Gogal function=(value1, value2) -> value1+value2;
        long additions=function.additions(55,66);
        System.out.println("Function :"+additions);
    }
}
