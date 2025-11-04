package com.xworkz.phones.external;

import com.xworkz.phone.dto.Phone;

import java.io.PrintStream;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setPrice(10000);
        int ammount = phone.getPrice();
        System.out.println("ammount=" + ammount);
        phone.setName("samsang");
        String name = phone.getName();
        System.out.println("name=" + name);
        phone.setReview(9.9f);
        float reviews=phone.getReview();
        System.out.println("review="+reviews);
        phone.setRateing(6.9);
        double rate= phone.getGetRateing();
        System.out.println("rateing="+rate);
        phone.setQulity('A');
        char grade=phone.getQulity();
        System.out.println("qulity="+grade);
        phone.setNumber(990099008);
        long num=phone.getNumber();
        System.out.println("number="+num);

    }
}