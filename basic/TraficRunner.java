class TraficRunner{
public static void main (String args[]){

int fine=Trafic.fine(1000);
System.out.println(fine);

String name=Trafic.areaName("yeshwanthpura");
System.out.println(name);

float range=Trafic.traficRange(44.4f);
System.out.println(range);

boolean high=Trafic.traficHigh(true);
System.out.println(high);

double time=Trafic.traficTime(15);
System.out.println(time);

char grade=Trafic.grade('A');
System.out.println(grade);

long number=Trafic.traficPoliceNumber(889911001);
System.out.println(number);
}
}