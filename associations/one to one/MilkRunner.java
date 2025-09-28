class MilkRunner{
public static void main(String args[]){
Coffe coffe=new Coffe(20,"coffeday");
coffe.displayCoffe();
Milk milk =new Milk(24,"nandini",coffe);
milk.displayMilk();

}
}