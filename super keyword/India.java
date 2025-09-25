class India extends Country{
public String name;
public int state;
public long population;
public float distence;
public double area;
public char grade;
public boolean isContry;
public India(){

System.out.println("this is a argumental const");
}
public India( String name, int state, long population, float distence,double area, char grade, boolean isContry){
	super();
this.name=name;
this.state=state;
this.population=population;
this.distence=distence;
this.area=area;
this.grade=grade;
this.isContry=isContry;
}
public void displayCountry(){
System.out.println("country name=="+this.name);
System.out.println("country name=="+super.name);
System.out.println("country state=="+this.state);
System.out.println("Country state=="+super.state);
System.out.println("Country population=="+this.population);
System.out.println("Country population=="+super.population);
System.out.println("Country area=="+this.area);
System.out.println("Country area=="+super.area);
System.out.println("Country grade=="+this.grade);
System.out.println("Country grade=="+super.grade);
System.out.println("Country isContry=="+this.isContry);
System.out.println("Country isContry=="+super.isContry);
}
}