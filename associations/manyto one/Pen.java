class Pen{
public int price;
public String brandName;
public Pen(int price,String brandName){
this.price=price;
this.brandName=brandName;
}
public void display(){
	System.out.println("price="+price);
	System.out.println("brandname="+brandName);
}
}