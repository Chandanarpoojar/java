package com.xworkz.wepon.internal;

public class Navay {
    public int approximateSoldiersCount;
    public Refile rifile;
    public Missile missile;


    public Navay(int approximateSoldiersCount,Refile rifile,Missile missile){
        this.approximateSoldiersCount=approximateSoldiersCount;
        this.rifile=rifile;
        this.missile=missile;

    }

    public void displayNavyDetails(){
        System.out.println("Approximate Active soldiers Count in Thousends=="+approximateSoldiersCount);
        System.out.println("Common useing Rifiles=="+rifile.firstRifileName);
        System.out.println("Common using missile=="+missile.missileName);

    }

}
