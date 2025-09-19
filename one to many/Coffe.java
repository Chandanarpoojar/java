class Coffe{
public int price;
public boolean isTasty;
public Sugar sugar;

public Coffe(int price,boolean isTasty,Sugar sugar){
this.price=price;
this.isTasty=isTasty;
this.sugar=sugar;
}
public  void displayCoffe(){
System.out.println("price="+price);
System.out.println("isTasty="+isTasty);
System.out.println(sugar.sugarprice);
System.out.println(sugar.isGood);
}
}