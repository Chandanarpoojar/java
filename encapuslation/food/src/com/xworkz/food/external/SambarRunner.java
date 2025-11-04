package com.xworkz.food.external;

import com.xworkz.food.dto.Smbar;

public class SambarRunner {
    public static void main(String[] args) {
        Smbar smbar=new Smbar();smbar.setPrice(60);
        int ammount = smbar.getPrice();
        System.out.println("ammount=" + ammount);
        smbar.setName("UtharKarnataka");
        String name = smbar.getName();
        System.out.println("name=" + name);
        smbar.setReview(9.5f);
        float review = smbar.getReview();
        smbar.setRateing(6.7);
        double rate = smbar.getGetRateing();
        System.out.println("rateing=" + rate);
        smbar.setNumber(990088772);
        long num =smbar.getNumber();
        System.out.println("num=" + num);
        smbar.getNumber();
        smbar.setQulity('A');
        char grade =smbar.getQulity();
        smbar.getQulity();
        System.out.println("grade=" + grade);

    }
}
