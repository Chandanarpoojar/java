class Country{
public int population;
public State state;
public Distic distic;
public Country(int population,State state,Distic distic){
this.population=population;
this.state=state;
this.distic=distic;
}
public void displayCountry(){
System.out.println("poplation of the country="+country);
System.out.println("number of state int coutry="+state);
System.out.println("number of distritc="+distic);
}
}