class Telivission{
public String name;
public Chanael chanael;
public Telivission(Chanael chanael){

this.name=chanael.name;
this.chanael=chanael;
}
public void displayTv(){
chanael.displayChanael();
}
}