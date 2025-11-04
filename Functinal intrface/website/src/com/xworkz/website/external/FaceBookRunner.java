package com.xworkz.website.external;

import com.xworkz.website.bridige.FaceBook;

public class FaceBookRunner {
    public static void main(String[] args) {


        FaceBook divission = (price1, price2) -> price1 / price2;
        long divi = divission.divi(2, 4);
        System.out.println("divission="+divi);
    }
}