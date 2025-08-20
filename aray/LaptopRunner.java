class LaptopRunner{
public static void main(String [] args){
int[]prices={2000,8000,6000,42200,5100};
int[]ammount=Laptop.priceOfLaptop(prices);
System.out.println("------------------");

long[]number={123456789l,234567801l,89006151l,912607411l,74422578l};
long[]Number=Laptop.seriesNumer(number);
System.out.println("------------------");

String []brandName={"hp","lenova","appel","dell","lg"};
String[]brandNames=Laptop.name(brandName);
System.out.println("------------------");

double[]codeNumber={177.1,177.2,177.3,177.4,177.5};
double[]codes=Laptop.code(codeNumber);
System.out.println("------------------");

boolean[]Qulity={true,true,true,false,true};
boolean[]qulity=Laptop.good(Qulity);
System.out.println("------------------");

char[]rateings={'A','B','A','B','A','B'};
char[]penRateing=Pen.grade(rateings);
System.out.println("------------------");

float[] sizes={5.9f,4.2f,6.9f,7.9f,7.0f,7.8f};
float[]screenSize=Laptop.size( sizes);
System.out.println("------------------");
}
}