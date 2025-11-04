package com.xworkz.sun.external;

import com.xworkz.sun.bridige.Multipilication;

public class MultiPlicationRunner {
    public static void main(String[] args) {
        Multipilication multipilication=(value1, value2) ->value1*value2;
        float multi=multipilication.multi(55.7f,77.7f);
        System.out.println("multiplication :"+multi);
    }
}
