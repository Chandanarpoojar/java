class MilkShakeRunner{
public static void main(String args[]){
Sugar sugar=new Sugar(100,false);
Frutes frutes=new Frutes("mango",20);
IceCream icecream=new IceCream("venila",50);
Milk milk=new Milk(24,"nandini");
DryFrutes dryfrutes=new DryFrutes(500,"pistha");
MilkShake milkshake=new MilkShake("mango",40,sugar,frutes,icecream,milk,dryfrutes);
milkshake.displayMilkShake();
}
}