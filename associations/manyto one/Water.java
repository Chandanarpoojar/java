class Water{
public String waterBottelName;
public boolean isGood;
public Washing washing;
public Cooking cooking;
public Water(String waterBottelName,boolean isGood,Washing washing,Cooking cooking){
this.waterBottelName=waterBottelName;
this.isGood=isGood;
this.washing=washing;
this.cooking=cooking;
}
public void displayWater(){
System.out.println("waterBottelName="+waterBottelName);
System.out.println("isGood="+isGood);
System.out.println(washing.isGood);
System.out.println(washing.grade);
System.out.println(cooking.iteamName + cooking.isGood);
}
}