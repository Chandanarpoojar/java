class Vegetable{
public String name;
public int price;
public Market market;

public Vegetable(String name,int price,Market market){
this.name=name;
this.price=price;
this.market=market;
}
public void shopDisplay(){
System.out.println("name="+name);
System.out.println("price"+price);
System.out.println(market.distence);
System.out.println(market.marketName);
}
}