package com.xworkz.phone.internal;

import com.xworkz.phone.event.*;

public class Phone {
    public int displayPrise(int Prize){
        if(Prize<50000){
            try {
                throw new CheckPhoneprize();
            }catch (CheckPhoneprize checkAmmountExcpetion){
                checkAmmountExcpetion.printStackTrace();
                System.out.println("ammount is wrong");
            }
        }else {
            System.out.println("ammount is rigt");
        }
        return Prize;
    }
    public float displayqulity(float qulity){
        if(qulity<5.5) {
            try {
                throw new CheckPhoneQulity();
            } catch (CheckPhoneQulity checkPhoneQulity) {
                checkPhoneQulity.printStackTrace();
                System.out.println("qulty is good");
            }
        }else{
            System.out.println("qulity is not good");
        }
        return qulity;
    }
    public float displayqunity(float qutity){
        if(qutity<5.8f){
            try {
                throw new CheckPhoneQunitity();
            }catch (CheckPhoneQunitity checkQulitypageExcpetion){
                checkQulitypageExcpetion.printStackTrace();
                System.out.println("is wrong");
            }

        }else {
            System.out.println("is right");
        }
        return qutity;
    }
    public int displarateing(int rateing){
        if(rateing<7){
            try {
                throw new CheckRateingPhone();
            }catch (CheckRateingPhone checkRateingPhone){
                checkRateingPhone.printStackTrace();
                System.out.println("number image is wright");
            }
        }else {
            System.out.println("is wrong");
        }
        return rateing;
    }
    public int displayreveiw(int pages) {
        if (pages <50) {
            try {
                throw new CheckReviewPhone();
            } catch (CheckReviewPhone checkNumberPagesExcpetion) {
                checkNumberPagesExcpetion.printStackTrace();
                System.out.println("number of wrong");
            }
        } else {
            System.out.println("is right");

        }
        return pages;
    }
}



