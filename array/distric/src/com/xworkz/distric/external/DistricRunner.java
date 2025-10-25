package com.xworkz.distric.external;

import com.xworkz.distric.internal.Distric;
import com.xworkz.distric.internal.House;
import com.xworkz.distric.internal.Village;

public class DistricRunner {
    public static void main(String[] args) {
        Distric distric = new Distric();
        House[] housenumber1 = {new House("Y", "X", "A", "B")};
        House[] housenumber2 = {new House("P", "Z", "r", "m")};
        House[] housenumber3 = {new House("C", "N", "K", "E")};
        House[] housenumber4 = {new House("D", "U", "V", "W")};

        Village firstVillage = new Village("ramagiri", 22, housenumber1);
        Village secondVillage = new Village("cchithradurga", 2000, housenumber2);
        Village thirdvillage = new Village("holkere", 300, housenumber3);
        Village fourthvillage = new Village("bangalore", 100000, housenumber4);
        Village[] villages = {firstVillage, secondVillage, thirdvillage, fourthvillage};
        distric.displayDistric(villages);
    }


    }

