class GemotryBox{
public int price;
public char grade;
public Scale scale;
public Pencial pencial;
public Compus compus;
public GemotryBox(int price,char grade,Scale scale,Pencial pencial,Compus compus){
this.price=price;
this.grade=grade;
this.scale=scale;
this.pencial=pencial;
this.compus=compus;
}
public void displayBox(){
System.out.println("price="+price);
System.out.println("grade="+grade);
System.out.println("scale="+scale);
System.out.println("pencial="+pencial);
System.out.println("compus="+compus);
System.out.println(scale.price);
System.out.println(scale.length);
System.out.println(pencial.price);
System.out.println(pencial.name);
System.out.println(compus.meetr);
System.out.println(compus.isBroken);

}
}