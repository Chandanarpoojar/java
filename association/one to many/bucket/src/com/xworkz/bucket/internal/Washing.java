package com.xworkz.bucket.internal;

public class Washing {
    public int time;
    public boolean isClean;
    public Bucket bucket;
    public Washing(int time,boolean isClean,Bucket bucket){
        this.time=time;
        this.isClean=isClean;
        this.bucket=bucket;
    }
    public void displayWashing(){
        System.out.println("time="+time);
        System.out.println("isClean="+isClean);
    }

}
