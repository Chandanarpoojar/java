class Jucie{
	
public static int price;
public static String brand;
public static long num;
public static char grade;
public static float rateing;
public static double review;
public static boolean isGood;

public Jucie(int price,String brand,long num,char grade,float rateing,double review,boolean isGood){
System.out.println("inside  class:"+this.price);
System.out.println("inside  class:"+this.brand);
System.out.println("inside  class:"+this.num);
System.out.println("inside  class:"+this.grade);
System.out.println("inside  class:"+this.rateing);
System.out.println("inside  class:"+this.review);
System.out.println("inside  class:"+this.isGood);

this.price=price;
this.brand=brand;
this.num=num;
this.grade=grade;
this.rateing=rateing;
this.review=review;
this.isGood=isGood;

System.out.println("inside  class:"+this.price);
System.out.println("inside  class:"+this.brand);
System.out.println("inside  class:"+this.num);
System.out.println("inside  class:"+this.grade);
System.out.println("inside  class:"+this.rateing);
System.out.println("inside  class:"+this.review);
System.out.println("inside  class:"+this.isGood);
}
}