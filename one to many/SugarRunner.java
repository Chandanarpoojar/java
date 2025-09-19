class SugarRunner{
public static void main(String args[]){

Sugar sugar=new Sugar(30,true);
sugar.sugarDisplay();
Tea tea =new Tea(10,"veenastore",sugar);
Coffe coffe=new Coffe(20,false,sugar);
Boost boost=new Boost(40,'A',sugar);
Coffe coffe1=new Coffe(30,true,sugar);
GreenTee greenTee=new GreenTee(100,true,sugar);
greenTee.greentee();
tea.displayTea();
coffe.displayCoffe();
boost.display();
coffe1.displayCoffe();
}
}