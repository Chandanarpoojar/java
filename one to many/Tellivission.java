class Tellivission{
public String tvName;
public float range;
public Electrcity electrcity;

public Tellivission(String tvName,float range,Electrcity electrcity){
this.tvName=tvName;
this.range=range;
this.electrcity=electrcity;
}
public void displayTv(){
System.out.println("tvName="+tvName);
System.out.println("range="+range);
System.out.println(electrcity.volt);
System.out.println(electrcity.capcity);
}
}