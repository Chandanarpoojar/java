class GreenTee{
public int price;
public boolean isHealthy;
public Sugar sugar;

public GreenTee(int price,boolean isHealthy,Sugar sugar){
this.price=price;
this.isHealthy=isHealthy;
this.sugar=sugar;
}
public void greentee(){
System.out.println("price="+price);
System.out.println("isHealthy="+isHealthy);
System.out.println(sugar.sugarprice);
System.out.println(sugar.isGood);
}
}