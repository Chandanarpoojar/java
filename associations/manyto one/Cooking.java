class  Cooking{
public String iteamName;
public boolean isGood;
public Cooking(String iteamName,boolean isGood){
this.iteamName=iteamName;
this.isGood=isGood;
}
public void displayCooking(){
System.out.println("iteam="+iteamName);
System.out.println("isGood="+isGood);
}
}