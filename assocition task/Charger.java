class Charger{
public int ammount;
public String name;
public boolean isWorking;
public float review;
public double rateing;
public char grade;
public long ownerNumber;
public Phone phone;
public Charger(int ammount,String name,boolean isWorking,float review,double rateing,char grade,long ownerNumber,Phone phone){
this.ammount=ammount;
this.name=name;
this.isWorking=isWorking;
this.review=review;
this.rateing=rateing;
this.grade=grade;
this.ownerNumber=ownerNumber;
this.phone=phone;
}
public void displayCharger(){
System.out.println("ammount="+ammount);
System.out.println("name="+name);
System.out.println("isWorking="+isWorking);
System.out.println("review="+review);
System.out.println("rateing="+rateing);
System.out.println("grade="+grade);
System.out.println("ownerNumber="+ownerNumber);
}
}
