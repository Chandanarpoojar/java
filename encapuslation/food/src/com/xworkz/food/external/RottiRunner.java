package com.xworkz.food.external;

import com.xworkz.food.dto.Palav;
import com.xworkz.food.dto.Rooti;

public class RottiRunner {
    public static void main(String[] args) {
        Rooti rooti=new Rooti();
        rooti.setPrice(60);
        int ammount = rooti.getPrice();
        System.out.println("ammount=" + ammount);
        rooti.setName("UtharKarnataka");
        String name = rooti.getName();
        System.out.println("name=" + name);
        rooti.setReview(9.5f);
        float review = rooti.getReview();
        rooti.setRateing(6.7);
        double rate = rooti.getGetRateing();
        System.out.println("rateing=" + rate);
        rooti.setNumber(990088772);
        long num =rooti.getNumber();
        System.out.println("num=" + num);
        rooti.getNumber();
        rooti.setQulity('A');
        char grade = rooti.getQulity();
        rooti.getQulity();
        System.out.println("grade=" + grade);

    }
}
