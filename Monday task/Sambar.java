class Sambar{
public String samabrName;
public int price;
public Salt salt;

public Sambar(String samabarName,int price,Salt salt){
this.samabrName=samabrName;
this.price=price;
this.salt=salt;
}
public void displaySamabr(){
System.out.println("samabarName="+samabrName);
System.out.println("price="+price);
System.out.println(salt.price);
System.out.println(salt.name);
}
}