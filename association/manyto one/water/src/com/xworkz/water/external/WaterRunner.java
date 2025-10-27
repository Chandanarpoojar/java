package com.xworkz.water.external;

import com.xworkz.water.internal.Cooking;
import com.xworkz.water.internal.Washing;
import com.xworkz.water.internal.Water;

public class WaterRunner {
    public static void main(String args[]){
        Washing washing =new Washing(true,'A');
        Cooking cooking =new Cooking("palav",true);
        Water water=new Water("bisilre",true,washing,cooking);
        water.displayWater();
    }

}
