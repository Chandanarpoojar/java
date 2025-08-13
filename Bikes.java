class Bikes{
public static void main(String [] args){
short honda=17;
short pulsar=47;
short splendor=73;
short yamaha=35;
short activa=60;
short fz=44;
int [] bike={honda,pulsar,splendor,yamaha,activa,fz};
System.out.println(bike[3]);
int royalnfield=33;
bike[3]=royalnfield;
System.out.println(bike[3]);
System.out.println("mileage Of The Bike");
for(int mileage=0; mileage < bike.length; mileage++)
System.out.println(bike[mileage]);
}
}