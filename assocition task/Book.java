class Book {
public int price;
public String name;
public boolean isGood;
public float reveiew;
public double rateing;
public char  qulity;
public long number;
public Book(int price,String name,boolean isGood,float reveiew,double rateing,char qulity,long number){
this.price=price;
this.name=name;
this.reveiew=reveiew;
this.rateing=rateing;
this.qulity=qulity;
this.number=number;
}
public void displayBook(){
System.out.println("price="+price);
System.out.println("name="+name);
System.out.println("isGood="+isGood);
System.out.println("review="+reveiew);
System.out.println("rateing="+rateing);
System.out.println("grade="+qulity);
System.out.println("Number="+number);
}
}
