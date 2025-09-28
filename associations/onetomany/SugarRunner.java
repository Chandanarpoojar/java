class SugarRunner{
public static void main(String args[]){
Sugar sugar =new Sugar(200,true);
sugar.displaySugar();
Milk milk=new Milk(20,true,sugar);
Coffe coffe =new Coffe(10,true,sugar);
milk.displayCoffe();
coffe.displayCoffe();
}
}