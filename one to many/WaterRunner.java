class WaterRunner{
public static void main(String args[]){
Water water=new Water(20,true);
water.displayWater();
PowerGenration powerGenration=new PowerGenration(20,"shivanasamadura",water);
Farming farming=new Farming('A',5.5f,water);
Cooking cooking=new Cooking("palav",true,water);
Cooking cooking1=new Cooking("idali",false,water);
Drinking drinking=new Drinking(1,true,water);
Washing washing=new Washing(5,false,water);
Bathing bathing=new Bathing("santhore",20,water);
bathing.displaybath();
washing.displyWash();
drinking.displyDrinking();
cooking.disply();
farming.formingDisplay();
powerGenration.displyPower();
}
}



