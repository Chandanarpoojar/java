class Bathing
{
public int bathDuration;
public String sopName;
public Bucket bucket;
public Bathing bathing;
public Bathing(int bathDuration,String sopName,Bucket bucket){
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