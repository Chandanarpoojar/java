package com.xworkz.bucket.internal;

public class Cleaning {
    public int bathDuration;
    public String sopName;
    public Bucket bucket;
    public Cleaning cleaning;
    public Cleaning(int bathDuration,String sopName,Bucket bucket){
        this.bathDuration=bathDuration;
        this.sopName=sopName;
        this.bucket= bucket;
    }
    public  void displayBathing(){
        System.out.println("bathDuration="+bathDuration);
        System.out.println("sopName="+sopName);
        System.out.println(bucket.price);
        System.out.println(bucket.isBroken);
    }

}
