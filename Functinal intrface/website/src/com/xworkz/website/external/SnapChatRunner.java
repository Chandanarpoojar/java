package com.xworkz.website.external;

import com.xworkz.website.bridige.Snapchat;

public class SnapChatRunner {
    public static void main(String[] args) {
        Snapchat multipilication=(value1, value2) ->value1*value2;
        long multi=multipilication.multi(5567777,9990000);
        System.out.println("multiplication :"+multi);
    }
}
