class MilkShake{
public String name;
public int price;
public Sugar sugar;
public Frutes frutes;
public IceCream icecream;
public Milk milk;
public DryFrutes dryfruites;
public MilkShake(String name,int price,Sugar sugar,Frutes frutes,IceCream icecream,Milk milk,DryFrutes dryfruites){
this.name=name;
this.price=price;
this.sugar=sugar;
this.frutes=frutes;
this.icecream=icecream;
this.milk=milk;
this.dryfruites=dryfruites;
}
public void displayMilkShake(){
System.out.println("name="+name);
System.out.println("price="+price);
System.out.println("sugar="+sugar);
System.out.println("frutes="+frutes);
System.out.println("icecream="+icecream);
System.out.println("milk="+milk);
System.out.println("dryfruites="+dryfruites);

System.out.println(sugar.price);
System.out.println(sugar.isSugarLess);
System.out.println(frutes.name);
System.out.println(frutes.price);
System.out.println(icecream.flaver +icecream.price);
System.out.println(milk.price + milk.brand);
System.out.println(dryfruites.price + dryfruites.name);

}
}