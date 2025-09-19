class Tea{
public int price;
public String shopName;
public Sugar sugar;
public Tea(int price,String shopName,Sugar sugar){
this.price=price;
this.shopName=shopName;
this.sugar=sugar;
}
public void displayTea(){
System.out.println("tea price="+price);
System.out.println("shopname="+shopName);
System.out.println(sugar.sugarprice);
System.out.println(sugar.isGood);
}
}