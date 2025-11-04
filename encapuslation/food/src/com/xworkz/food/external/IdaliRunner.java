package com.xworkz.food.external;

import com.xworkz.food.dto.Idali;

public class IdaliRunner {
    public static void main(String[] args) {
        Idali idali=new Idali();
        idali.setPrice(60);
        int ammount = idali.getPrice();
        System.out.println("ammount=" + ammount);
        idali.setName("UtharKarnataka");
        String name =idali.getName();
        System.out.println("name=" + name);
        idali.setReview(9.5f);
        float review =idali.getReview();
        idali.setRateing(6.7);
        double rate = idali.getGetRateing();
        System.out.println("rateing=" + rate);
        idali.setNumber(990088772);
        long num =idali.getNumber();
        System.out.println("num=" + num);
        idali.getNumber();
        idali.setQulity('A');
        char grade = idali.getQulity();
        idali.getQulity();
        System.out.println("grade=" + grade);
    }
}
