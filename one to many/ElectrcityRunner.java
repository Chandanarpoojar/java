class ElectrcityRunner{
public static void main(String args[]){
Electrcity electrcity=new Electrcity(200,666);
electrcity.displayElectrical();
Tellivission tellivission=new Tellivission("sony",6.6f,electrcity);
Mixer mixer=new Mixer("butterfly",3000,electrcity);
WashinMashin washinmashin=new WashinMashin("lg",8,electrcity);
WaterHeater waterheater=new WaterHeater(100000,'A',electrcity);
IronBox ironbox= new IronBox(100,true,electrcity);
IronBox ironbox1=new IronBox(200,false,electrcity);
tellivission.displayTv();
mixer.displayMixer();
washinmashin.displayMashin();
ironbox.ironBox();
ironbox1.ironBox();
}
}