package com.xworkz.website.external;

import com.xworkz.website.bridige.Youtube;

public class YoutubeRunner {
    public static void main(String[] args) {
        Youtube multipilication=(value1, value2) ->value1*value2;
        double multi=multipilication.minize(55.7,77.7);
        System.out.println("multiplication :"+multi);
    }
}
