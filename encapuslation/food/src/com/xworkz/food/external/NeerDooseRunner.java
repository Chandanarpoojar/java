package com.xworkz.food.external;

import com.xworkz.food.dto.NeeruDoose;

public class NeerDooseRunner {
    public static void main(String[] args) {
        NeeruDoose neeruDoose=new NeeruDoose();
        neeruDoose.setPrice(50);
        int ammount = neeruDoose.getPrice();
        System.out.println("ammount=" + ammount);
        neeruDoose.setPlaceName("dakshin kannada");
        String name = neeruDoose.getPlaceName();
        System.out.println("name=" + name);
        neeruDoose.setReview(9.5f);
        float review = neeruDoose.getReview();
        neeruDoose.setRateing(6.7);
        double rate = neeruDoose.getGetRateing();
        System.out.println("rateing=" + rate);
        neeruDoose.setShopNumber(990088772);
        long num = neeruDoose.getShopNumber();
        System.out.println("num=" + num);
        neeruDoose.getShopNumber();
        neeruDoose.setGrade('A');
        char grade = neeruDoose.getGrade();
        neeruDoose.getGrade();
        System.out.println("grade=" + grade);
    }
}
