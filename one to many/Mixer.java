class Mixer{
public String brand;
public int price;
public Electrcity electrcity;

public Mixer(String brand,int price,Electrcity electrcity){
this.brand=brand;
this.price=price;
this.electrcity=electrcity;
}
public void displayMixer(){
System.out.println("brand="+brand);
System.out.println("price="+price);
System.out.println(electrcity.volt);
System.out.println(electrcity.capcity);
}
}
