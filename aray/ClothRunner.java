class ClothRunner{
public static void main(String [] args){
int[]prices={100,200,300,400,500};
int[]cloths=Cloth.price(prices);
System.out.println("------------------");

long[]number={7700881122l,9960582425l,9008557744l,912607411l,74422578l};
long[]Number=Cloth.sellerPhoneNumer(number);
System.out.println("------------------");

String []brandName={"nika","zara","zodio","adidas","trndes"};
String[]brandNames=Cloth.name(brandName);
System.out.println("------------------");

double[]codeNumber={177.1,177.2,177.3,177.4,177.5};
double[]codes=Cloth.code(codeNumber);
System.out.println("------------------");

boolean[]Qulity={true,,true,false,true};
boolean[]qulity=Cloth.good(Qulity);
System.out.println("------------------");

char[]rateings={'A','B','A','B','A','B'};
char[]penRateing=Pen.grade(rateings);
System.out.println("------------------");

float[] revies={5.9f,4.2f,6.9f,7.9f,7.0f,7.8f};
float[]reviese=Cloth.review( revies);
System.out.println("------------------");
}
}