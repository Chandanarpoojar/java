class Shop{
public String name;
public boolean isOpen;
public Market market;

public Shop(String name,boolean isOpen,Market market){
this.name=name;
this.isOpen=isOpen;
this.market=market;
}
public  void displyShop(){
System.out.println("name="+name);
System.out.println("isOpen="+isOpen);
System.out.println(market.distence);
System.out.println(market.marketName);

}
}