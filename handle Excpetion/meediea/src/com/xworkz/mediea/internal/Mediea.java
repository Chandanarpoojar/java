package com.xworkz.mediea.internal;

import com.xworkz.mediea.event.*;

public class Mediea {
    public int displayAge(int age) {
        if (age > 60) {
            try {
                throw new CheckAgeExcpetion();
            } catch (CheckAgeExcpetion checkAgeExcpetion) {
                checkAgeExcpetion.printStackTrace();
                System.out.println("less than 60");
            }
        } else {
            System.out.println("more than 60");
        }
        return age;
    }

    public double displayTrp(double trp) {
        if (trp > 9.9) {
            try {
                throw new CheckTrpExcpetion();
            } catch (CheckTrpExcpetion checkTrpExcpetion) {
                checkTrpExcpetion.printStackTrace();
                System.out.println("more than 8.0");
            }
        } else {
            System.out.println("less than 9.0");
        }
        return trp;
    }


    public  int displayEmplayee(int employee){
        if (employee>400){
            try {
                throw new CheckNumberOfEmployeeExcpetion();
            }catch (CheckNumberOfEmployeeExcpetion checkNumberOfEmployeeExcpetion){
                checkNumberOfEmployeeExcpetion.printStackTrace();
                System.out.println("number is currcet");
            }

        }else{
            System.out.println("number is in correct");
        }
        return  employee;
    }
    public  int displayChanal(int chanal) {
        if (chanal > 55) {
            try {
                throw new CheckNumberOfChannel();
            } catch (CheckNumberOfChannel checkNumberOfChannel) {
                checkNumberOfChannel.printStackTrace();
                System.out.println("number is currect");
            }
        }else{
            System.out.println("is wrong");
        }
        return  chanal;
    }

}
