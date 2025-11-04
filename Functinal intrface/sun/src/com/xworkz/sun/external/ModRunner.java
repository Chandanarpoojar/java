package com.xworkz.sun.external;

import com.xworkz.sun.bridige.Mod;

public class ModRunner {
    public static void main(String[] args) {
        Mod mod=(num1, num2) ->num1*num2;
        long multi= mod.multi(66,88);
        System.out.println("mulitication:"+multi);
    }
}
