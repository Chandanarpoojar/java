class Liqued extends Water{
public int waterBottelPrice;
public String waterBottelName;
public boolean isGood;
public Liqued(){

System.out.println("this is a argumental const");
}
public Liqued(int waterBottelPrice,String waterBottelName,boolean isGood ){
	super();
this.waterBottelPrice=waterBottelPrice;
 this.waterBottelName=waterBottelName;
 this.isGood=isGood;

}
public void displayLiqued(){
System.out.println("number=="+this.waterBottelPrice);
System.out.println("number=="+super.waterBottelPrice);
System.out.println(" name=="+this.waterBottelName);
System.out.println(" name=="+super.waterBottelName);
System.out.println("isGood=="+this.isGood);
System.out.println("isGood=="+super.isGood);

}
}