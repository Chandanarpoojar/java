class Hotel{
public Hotel()
{
this(100);
}
public Hotel(int price){
this(50,"spciy");
System.out.println("the ice constructor with price ="+price);
}
public Hotel(int ammount,String flavere){
this(60,"uddupi",5.5f);
System.out.println("this is arugmrntal constructorprice="+ammount);
System.out.println("this is arugmrntal constructor flavere="+flavere);
}
public Hotel(int price, String hotelName,float rateing ){
	this(true,6.6,'A',"chithrana");
System.out.println("this is a constructor rateing="+rateing);
System.out.println("this is constructor price="+price);
System.out.println("this is constructor hotelName="+hotelName);
}
public Hotel(boolean isGood,double reveiw,char grade,String fooditeam){
	this(40,4.6f,false,'B',"tajaupahara",6.6,9988776655l);
	System.out.println("this flvr is good="+isGood);
	System.out.println("fvlr is choclate flavere="+fooditeam);
	System.out.println("this is icecream grade="+grade);

}
public Hotel(int ammount,float reveiw,boolean isBad,char grade,String hotelName,double rateing,long number){
	System.out.println("ammount="+ammount);
	System.out.println("reveiw="+reveiw);
	System.out.println("isBad="+isBad);
	System.out.println("grade="+grade);
	System.out.println("flavere="+hotelName);
	System.out.println("rateing="+rateing);
	System.out.println("number="+number);
}
}

	
