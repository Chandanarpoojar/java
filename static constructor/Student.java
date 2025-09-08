class Student{
	
public static int id;
public static String brand;
public static long num;
public static char grade;
public static float rateing;
public static double review;
public static boolean isTopper;

public Student(int id,String brand,long num,char grade,float rateing,double review,boolean isTopper){
System.out.println("inside  class:"+this.id);
System.out.println("inside  class:"+this.brand);
System.out.println("inside  class:"+this.num);
System.out.println("inside  class:"+this.grade);
System.out.println("inside  class:"+this.rateing);
System.out.println("inside  class:"+this.review);
System.out.println("inside  class:"+this.isTopper);

this.id=id;
this.brand=brand;
this.num=num;
this.grade=grade;
this.rateing=rateing;
this.review=review;
this.isTopper=isTopper;

System.out.println("inside  class:"+this.id);
System.out.println("inside  class:"+this.brand);
System.out.println("inside  class:"+this.num);
System.out.println("inside  class:"+this.grade);
System.out.println("inside  class:"+this.rateing);
System.out.println("inside  class:"+this.review);
System.out.println("inside  class:"+this.isTopper);
}
}