package com.xworkz.website.internal;

import com.xworkz.website.event.CheckWebsiedname;
import com.xworkz.website.event.CheckWebsiteId;
import com.xworkz.website.event.CheckedWebsiteReview;
import com.xworkz.website.event.Checkwebsitenum;

public class Website {
    public float displayreview(float review) {
        if (review < 3.5f) {
            try {
                throw new CheckedWebsiteReview();
            } catch (CheckedWebsiteReview checkedWebsiteReview) {
                checkedWebsiteReview.printStackTrace();
                System.out.println("is it false");
            }
        } else {
            System.out.println("it is true");
        }
        return review;
    }

    public String displaySchoolName(String name) {
        if (name == "Bapuji") {
            try {
                throw new CheckWebsiedname();

            } catch (CheckWebsiedname nameException) {
                nameException.printStackTrace();
                System.out.println("  name is correct ");
            }
        } else {
            System.out.println(" name is incorrect");
        }
        return name;
    }
    public int displaynum(int num){
        if(num<100){
            try {
                throw new Checkwebsitenum();
            }catch (Checkwebsitenum checkwebsitenum){
                checkwebsitenum.printStackTrace();
                System.out.println("is correct");
            }
        }else {
            System.out.println("is wrong");
        }
        return num;
    }
    public int displayid(int id){
        if (id<400){
            try {
                throw new CheckWebsiteId();
            }catch (CheckWebsiteId checkWebsiteId){
                checkWebsiteId.printStackTrace();
                System.out.println("true");
            }
        }else {
            System.out.println("false");
        }
        return id;
    }
}
