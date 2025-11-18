package com.xworkz.school.internal;

import com.xworkz.school.event.NumberOfTeacher;
import com.xworkz.school.event.SchollReveiew;
import com.xworkz.school.event.SchoolID;
import com.xworkz.school.event.StudentID;

public class Scholl {
    public int displaynumber(int number){
        if(number<200){
            try {
                throw new NumberOfTeacher();
                }catch (NumberOfTeacher numberOfTeacher){
                numberOfTeacher.printStackTrace();
                System.out.println("is false");
            }
        }else {
            System.out.println("is true");
        }
        return number;
    }
    public double displayReview(double review){
        if(review<5.65f){
            try {
                throw new SchollReveiew();
            }catch (SchollReveiew schollReveiew){
                schollReveiew.printStackTrace();
                System.out.println("false");
            }
        }else {
            System.out.println("true");
        }
        return  review;
    }
    public int displayId(int id){
        if(id<200){
            try {
                throw new SchoolID();
            }catch (SchoolID schoolID){
                schoolID.printStackTrace();
                System.out.println("is false");
            }
        }else {
            System.out.println("is true");
        }
        return id;
    }
    public int displaystudent(int number){
        if(number<101){
            try {
                throw new StudentID();
            }catch (StudentID studentID){
                studentID.printStackTrace();
                System.out.println("is false");
            }
        }else {
            System.out.println("is true");
        }
        return number;
    }
    public double displayQulity(double qulity){
        if(qulity<5.65){
            try {
                throw new SchollReveiew();
            }catch (SchollReveiew schollReveiew){
                schollReveiew.printStackTrace();
                System.out.println("false");
            }
        }else {
            System.out.println("true");
        }
        return  qulity;
    }
}
