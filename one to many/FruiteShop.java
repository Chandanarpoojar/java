class FruiteShop{
public double distence;
public char grade;
public Market market;

public FruiteShop(double distence,char grade,Market market){
this.distence=distence;
this.grade=grade;
this.market=market;
}
public void disply(){
System.out.println("distence="+distence);
System.out.println("grade="+grade);
System.out.println(market.distence);
System.out.println(market.marketName);
}
}