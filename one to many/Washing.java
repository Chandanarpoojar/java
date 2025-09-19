class Washing{
public int time;
public boolean isGood;
public Water water;
public Washing(int time,boolean isGood,Water water){
this.time=time;
this.isGood=isGood;
this.water=water;
}
public void displyWash(){
System.out.println("this is time="+time);
System.out.println("water="+water);


}
}