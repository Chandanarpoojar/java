class Athour{
public int age;
public String name;
public boolean isGood;
public float reveiew;
public double rateing;
public char  grade;
public long number;
public Book book;
public  Athour(int age,String name,boolean isGood,float reveiew,double rateing,char grade,long number,Book book){
this.age=age;
this.name=name;
this.isGood=isGood;
this.reveiew=reveiew;
this.rateing=rateing;
this.grade=grade;
this.number=number;
}
public void displyAthour(){
System.out.println("age="+age);
System.out.println("name="+name);
System.out.println("isGood="+isGood);
System.out.println("reveiew="+reveiew);
System.out.println("rateing="+rateing);
System.out.println("grade="+grade);
System.out.println("number="+number);
System.out.println("book="+book);
}
}