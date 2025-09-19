class IronBox{
public int price;
public boolean isWorking;
public Electrcity electrcity;
public IronBox(int price,boolean isWorking,Electrcity electrcity){
this.price=price;
this.isWorking=isWorking;
this.electrcity=electrcity;
}
public void ironBox(){
System.out.println("price="+price);
System.out.println("isWorking="+isWorking);
System.out.println(electrcity.volt);
System.out.println(electrcity.capcity);
}
}