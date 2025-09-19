class WashinMashin{
public String name;
public int capcity;
public Electrcity electrcity;

public WashinMashin(String name,int capcity,Electrcity electrcity){
this.name=name;
this.capcity=capcity;
this.electrcity=electrcity;
}
public void displayMashin(){
System.out.println("name="+name);
System.out.println("capcity="+capcity);
System.out.println(electrcity.volt);
System.out.println(electrcity.capcity);
}
}
