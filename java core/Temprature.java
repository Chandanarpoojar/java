class Temprature{
public static void main(String [] ref){
double chithradurga=22;
double chikkamangaluru=20;
double benglaore=24;
double ballari=38;
double kodagu=15;
double thumukur=23;
double[] district={chithradurga,chikkamangaluru,benglaore,ballari,kodagu,thumukur};
System.out.println(district[0]);
double davanagere=21;
district[0]=davanagere;
System.out.println(district[0]);
System.out.println("temprature Of The District");
for(int temprature=0; temprature < district.length; temprature++)
System.out.println(district[temprature]);
}
}