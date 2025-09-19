class Boost{
public int price;
public char grade;
public Sugar sugar;

public Boost(int price,char grade,Sugar sugar){
this.price=price;
this.grade=grade;
this.sugar=sugar;
}
public void display(){
System.out.println("price="+price);
System.out.println("grade="+grade);
System.out.println(sugar.sugarprice);
System.out.println(sugar.isGood);
}
}