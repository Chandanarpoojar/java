class India extends Country{
public String name;
public int state;
public long population;

public India(){

System.out.println("this is a argumental const");
}
public India( String name, int state, long population){
	super();
this.name=name;
this.state=state;
this.population=population;

}
public void displayCountry(){
System.out.println("country name=="+this.name);
System.out.println("country name=="+super.name);
System.out.println("country state=="+this.state);
System.out.println("Country state=="+super.state);
System.out.println("Country population=="+this.population);
System.out.println("Country population=="+super.population);

}
}