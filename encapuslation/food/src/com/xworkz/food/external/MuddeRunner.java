package com.xworkz.food.external;

import com.xworkz.food.dto.Muude;

public class MuddeRunner {
    public static void main(String[] args) {
        Muude muude =new Muude();
        muude.setPrice(60);
        int ammount = muude.getPrice();
        System.out.println("ammount=" + ammount);
        muude.setName("UtharKarnataka");
        String name = muude.getName();
        System.out.println("name=" + name);
        muude.setReview(9.5f);
        float review =muude.getReview();
        muude.setRateing(6.7);
        double rate = muude.getGetRateing();
        System.out.println("rateing=" + rate);
        muude.setNumber(990088772);
        long num =muude.getNumber();
        System.out.println("num=" + num);
        muude.getNumber();
        muude.setQulity('A');
        char grade = muude.getQulity();
        muude.getQulity();
        System.out.println("grade=" + grade);
    }
}
