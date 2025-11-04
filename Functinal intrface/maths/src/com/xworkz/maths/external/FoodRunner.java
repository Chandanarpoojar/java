package com.xworkz.maths.external;

import com.xworkz.maths.bridige.Food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food =(grade1, grade2) -> grade1-grade2;
        int sub=food.sub(222,877);
        System.out.println("substraction="+sub);
    }
}
