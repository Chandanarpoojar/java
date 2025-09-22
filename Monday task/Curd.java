class Curd{
public int price;
public boolean isFresh;
public Salt salt;
public Curd(int price,boolean isFresh,Salt salt){
this.price=price;
this.isFresh=isFresh;
this.salt=salt;
}
public void displayprice(){
System.out.println("price="+price);
System.out.println("isFresh="+isFresh);
System.out.println(salt.price);
System.out.println(salt.name);
}
}