class Ice
{
public Ice()
{
this(100);
}
public Ice(int price){
this(500,"gudbud");
System.out.println("the ice constructor with price ="+price);
}
public Ice(int ammount,String flavere){
this(60,"arun",5.5f);
System.out.println("this is arugmrntal constructorprice="+ammount);
System.out.println("this is arugmrntal constructor brandName="+flavere);
}
public Ice(int price, String brandName,float rateing ){
	this(true,6.6,'A',"choclate");
System.out.println("this is a constructor rateing="+rateing);
System.out.println("this is constructor price="+price);
System.out.println("this is constructor brandName="+brandName);
}
public Ice(boolean isGood,double reveiw,char grade,String flavere){
	System.out.println("this flvr is good="+isGood);
	System.out.println("fvlr is choclate flavere="+flavere);
}
}
