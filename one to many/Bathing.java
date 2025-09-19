class Bathing{
public String sopName;
public int bathDuration;
public Water water;

public Bathing(String sopName,int bathDuration,Water water){
this.sopName=sopName;
this.bathDuration=bathDuration;
this.water=water;
}
public void displaybath(){
System.out.println("name="+sopName);
System.out.println("bathDuration="+bathDuration);


}
}