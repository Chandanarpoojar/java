package com.xworkz.food.external;

import com.xworkz.food.dto.Coffe;

public class CoffeRunner {
    public static void main(String[] args) {
        Coffe coffe=new Coffe();
        coffe.setPrice(60);
        int ammount = coffe.getPrice();
        System.out.println("ammount=" + ammount);
        coffe.setName("UtharKarnataka");
        String name = coffe.getName();
        System.out.println("name=" + name);
        coffe.setReview(9.5f);
        float review =coffe.getReview();
        coffe.setRateing(6.7);
        double rate = coffe.getGetRateing();
        System.out.println("rateing=" + rate);
        coffe.setNumber(990088772);
        long num =coffe.getNumber();
        System.out.println("num=" + num);
        coffe.getNumber();
        coffe.setQulity('A');
        char grade = coffe.getQulity();
        coffe.getQulity();
        System.out.println("grade=" + grade);

    }
}
