package com.xworkz.food.dto;

public class NeeruDoose {
    private int price;
    private String placeName;
    private float review;
    private double rateing;
    private char grade;
    private long shopNumber;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setReview(float review) {
        this.review = review;
    }

    public float getReview() {
        return review;
    }

    public void setRateing(double rateing) {
        this.rateing = rateing;
    }


    public double getGetRateing() {
        return rateing;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public void setShopNumber(long shopNumber) {
        this.shopNumber = shopNumber;
    }

    public long getShopNumber() {
        return shopNumber;
    }
}
