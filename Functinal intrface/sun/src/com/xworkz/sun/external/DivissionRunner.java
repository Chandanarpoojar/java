package com.xworkz.sun.external;

import com.xworkz.sun.bridige.Addititon;
import com.xworkz.sun.bridige.Divission;

public class DivissionRunner {
    public static void main(String[] args) {
        Divission divission=(price1, price2) ->price1/price2;
        long  divi=divission.divi(2,4);
        System.out.println("divission :"+divi);

    }
}
