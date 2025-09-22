class Chatnuy{
public String name;
public int price;
public Salt salt;

public Chatnuy(String name,int price,Salt salt)
{
this.name=name;
this.price=price;
this.salt=salt;
}
public void displayChatnuy(){
System.out.println("name="+name);
System.out.println("price="+price);
System.out.println(salt.price);
System.out.println(salt.name);
}
}

