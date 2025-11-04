package com.xworkz.phones.external;

import com.xworkz.phone.dto.Tellivission;
import com.xworkz.phone.dto.WashinMashin;

public class TelivissionRunner {
    public static void main(String[] args) {
        Tellivission tellivission =new Tellivission();
        tellivission.setPrice(60000);
        int ammount = tellivission.getPrice();
        System.out.println("ammount=" + ammount);
        tellivission.setName("sonay");
        String name =tellivission.getName();
        System.out.println("name=" + name);
        tellivission.setReview(9.5f);
        float review =tellivission.getReview();
        tellivission.setRateing(6.7);
        double rate = tellivission.getGetRateing();
        System.out.println("rateing=" + rate);
        tellivission.setNumber(990088772);
        long num =tellivission.getNumber();
        System.out.println("num=" + num);

        tellivission.setQulity('A');
        char grade = tellivission.getQulity();
        tellivission.getQulity();
        System.out.println("grade=" + grade);
    }
}
