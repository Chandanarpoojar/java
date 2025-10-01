class Phone{
public int price;
public String name;
public boolean isWorking;
public float review;
public double rateing;
public char qulity;
public long ownerNumber;
public Phone(int price,String name,boolean isWorking,float review,double rateing,char qulity,long ownerNumber){
this.price=price;
this.name=name;
this.isWorking=isWorking;
this.review=review;
this.rateing=rateing;
this.qulity=qulity;
this.ownerNumber=ownerNumber;
}
public void displayPhone(){
System.out.println("price="+price);
System.out.println("name="+name);
System.out.println("isWorking="+isWorking);
System.out.println("review="+review);
System.out.println("rateing="+rateing);
System.out.println("grade="+qulity);
System.out.println("ownerNumber="+ownerNumber);
}
}