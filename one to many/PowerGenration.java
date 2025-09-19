class PowerGenration{
public float volts;
public String waterPowerGenrationPlace;
public Water water;
public PowerGenration(float volts,String waterPowerGenrationPlace, Water water){
this.volts=volts;
this.waterPowerGenrationPlace=waterPowerGenrationPlace;
this.water=water;
}
public void displyPower(){
System.out.println("volts="+volts);
System.out.println("waterPowerGenrationPlace="+waterPowerGenrationPlace);


}
}