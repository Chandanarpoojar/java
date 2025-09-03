class SolarSystem{
public SolarSystem(){
System.out.println("solarsystem");
}
public SolarSystem(int number){
	System.out.println(number);
}
public SolarSystem(String name, long num,float hight){
	System.out.println(name);
	System.out.println(num);
	System.out.println(hight);
}
public SolarSystem(double distence,char grade,boolean presence,String plantnames){
	System.out.println(distence);
	System.out.println(grade);
	System.out.println(presence);
	System.out.println(plantnames);
}
public SolarSystem(String plantname,int plantnumber,float plantdistence,boolean present,double hight){
	System.out.println(plantname);
	System.out.println(plantnumber);
	System.out.println(plantdistence);
	System.out.println(present);
	System.out.println(hight);
}
}