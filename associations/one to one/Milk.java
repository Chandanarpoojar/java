class  Milk{
public int price;
public String brandName;
public Coffe coffe;

public Milk(int price,String brandName,Coffe coffe){
this.price=price;
this.brandName=brandName;
this.coffe=coffe;
}
public void displayMilk(){
System.out.println("price="+price);
System.out.println("brandName="+brandName);
}
}