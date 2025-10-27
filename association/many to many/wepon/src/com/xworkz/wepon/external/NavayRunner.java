package com.xworkz.wepon.external;

import com.xworkz.wepon.internal.Missile;
import com.xworkz.wepon.internal.Navay;
import com.xworkz.wepon.internal.Refile;

public class NavayRunner {
    public static void main(String [] args){


        Missile missile=new Missile("Brahmos Missile");
        Refile rifile=new Refile("INSAS rifile","AK-47/203");


        Navay navay=new Navay(67,rifile,missile);


        
        navay.displayNavyDetails();




    }

}
