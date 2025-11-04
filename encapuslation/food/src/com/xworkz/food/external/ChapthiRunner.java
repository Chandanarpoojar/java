package com.xworkz.food.external;

import com.xworkz.food.dto.Chapthi;

public class ChapthiRunner {
    public static void main(String[] args) {
        Chapthi chapthi=new Chapthi();
        chapthi.setPrice(60);
        int ammount = chapthi.getPrice();
        System.out.println("ammount=" + ammount);
        chapthi.setName("UtharKarnataka");
        String name = chapthi.getName();
        System.out.println("name=" + name);
        chapthi.setReview(9.5f);
        float review =chapthi.getReview();
        chapthi.setRateing(6.7);
        double rate = chapthi.getGetRateing();
        System.out.println("rateing=" + rate);
        chapthi.setNumber(990088772);
        long num =chapthi.getNumber();
        System.out.println("num=" + num);
        chapthi.getNumber();
        chapthi.setQulity('A');
        char grade = chapthi.getQulity();
        chapthi.getQulity();
        System.out.println("grade=" + grade);

    }
}
