package com.xworkz.website.external;

import com.xworkz.website.bridige.Whatsup;

public class WhatsupRunner {
    public static void main(String[] args) {


        Whatsup multipilication = (value1, value2) -> value1 * value2;
        double multi = multipilication.minize(55.7, 77.7);
        System.out.println("multiplication :" + multi);
    }
}