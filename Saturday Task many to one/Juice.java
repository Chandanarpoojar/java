class Juice{
public String name;
public int price;
public Sugar sugar;
public Frutes frutes;
public Falver falver;
public Soda soda;
public Juice(String name,int price,Sugar sugar,Frutes frutes,Falver falver,Soda soda){
this.name=name;
this.price=price;
this.sugar=sugar;
this.frutes=frutes;
this.falver=falver;
this.soda=soda;
}
public void displayJuice(){
System.out.println("name="+name);
System.out.println("price="+price);
System.out.println("sugar="+sugar);
System.out.println("frutes="+frutes);
System.out.println("falver="+falver);
System.out.println("soda="+soda);
System.out.println(sugar.price);
System.out.println(sugar.isSugarLess);
System.out.println(frutes.name);
System.out.println(frutes.price);
System.out.println(falver.name);
System.out.println(falver.qunitiy);
System.out.println(soda.name + soda.price);
}
}