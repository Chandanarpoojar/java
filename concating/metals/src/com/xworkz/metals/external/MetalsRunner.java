package com.xworkz.metals.external;

import com.xworkz.metals.internal.Metals;
import com.xworkz.metals.internal.Silver;

public class MetalsRunner {
    public static void main(String[] args) {
        Metals metals= new Silver();
        metals.displayametal();
        Silver silver=(Silver)metals;
        silver.displaysilver();
    }
}
