class TelliVission{
	
public static int id;
public static String brand;
public static long num;
public static char grade;
public static float rateing;
public static double review;
public static boolean isWorking;

public TelliVission(int id,String brand,long num,char grade,float rateing,double review,boolean isWorking){
System.out.println("inside  class:"+this.id);
System.out.println("inside  class:"+this.brand);
System.out.println("inside  class:"+this.num);
System.out.println("inside  class:"+this.grade);
System.out.println("inside  class:"+this.rateing);
System.out.println("inside  class:"+this.review);
System.out.println("inside  class:"+this.isWorking);

this.id=id;
this.brand=brand;
this.num=num;
this.grade=grade;
this.rateing=rateing;
this.review=review;
this.isWorking=isWorking;

System.out.println("inside  class:"+this.id);
System.out.println("inside  class:"+this.brand);
System.out.println("inside  class:"+this.num);
System.out.println("inside  class:"+this.grade);
System.out.println("inside  class:"+this.rateing);
System.out.println("inside  class:"+this.review);
System.out.println("inside  class:"+this.isWorking);
}
}