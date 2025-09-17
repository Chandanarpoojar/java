class Hoteal{
public String name;
public Manger manger;
public Hoteal(Manger manger){

this.name=manger.name;
this.manger=manger;
}
public void displayHoteal(){
manger.displayManger();
}
}