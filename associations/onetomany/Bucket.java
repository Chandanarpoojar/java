class Bucket{
public int price;
public boolean isBroken;
public Bucket(int price,boolean isBroken){
this.price=price;
this.isBroken=isBroken;
}
public void displayBucket(){
System.out.println("price="+price);
System.out.println("isBroken="+isBroken);
}
}
