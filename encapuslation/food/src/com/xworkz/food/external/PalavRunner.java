package com.xworkz.food.external;

import com.xworkz.food.dto.Palav;

public class PalavRunner {
    public static void main(String[] args) {
        Palav palav=new Palav();
        palav.setPrice(50);
        int ammount = palav.getPrice();
        System.out.println("ammount=" + ammount);
        palav.setName("anmuthpalav");
        String name = palav.getName();
        System.out.println("name=" + name);
        palav.setReview(9.5f);
        float review = palav.getReview();
        palav.setRateing(6.7);
        double rate = palav.getGetRateing();
        System.out.println("rateing=" + rate);
        palav.setNumber(990088772);
        long num = palav.getNumber();
        System.out.println("num=" + num);
        palav.getNumber();
        palav.setQulity('A');
        char grade = palav.getQulity();
        palav.getQulity();
        System.out.println("grade=" + grade);
    }
}
