class Food{
public String name;
public int price;

public Food( String name,int price){
this.name=name;
this.price=price;
}
public void foodInfo(){
System.out.println("name="+name);
System.out.println("price="+price);
}
}