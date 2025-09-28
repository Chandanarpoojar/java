class School{
public String name;
public int fees;
public long number;
public float review;
public double rateing;
public char qulity;
public boolean isGood;
public Principal principal;

public School(String name,int fees,long number,float review,double rateing,char qulity,boolean isGood, Principal principal){
this.name=name;
this.fees=fees;
this.number=number;
this.review=review;
this.rateing=rateing;
this.qulity=qulity;
this.isGood=isGood;
this.principal=principal;
}
public void displaySchool(){
System.out.println("name="+name);
System.out.println("fees="+fees);
System.out.println("number="+number);
System.out.println("review="+review);
System.out.println("rateing="+rateing);
System.out.println("qulity="+qulity);
System.out.println("isGood="+isGood);
}
}


