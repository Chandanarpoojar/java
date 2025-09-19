class WaterHeater{
public int price;
public char grade;
public Electrcity electrcity;

public WaterHeater(int price,char grade,Electrcity electrcity){
this.price=price;
this.grade=grade;
this.electrcity=electrcity;
}
public void disply(){
System.out.println("price="+price);
System.out.println("storage"+grade);
System.out.println(electrcity.volt);
System.out.println(electrcity.capcity);
}
}