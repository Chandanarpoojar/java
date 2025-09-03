class PenRunner{
public static void main(String [] args){
int[]prices={10,20,30,40,50};
int[]pens=Pen.price(prices);
System.out.println("------------------");

long[]number={9900881122l,7760582425l,9008642508l,912607411l,74422578l};
long[]Number=Pen.sellerPhoneNumer(number);
System.out.println("------------------");

String []penName={"cello","dooms","ranlds","apzara","santhro"};
String[]penNames=Pen.name(penName);
System.out.println("------------------");

double[] penReview={66.1,88.99,77.9,55.9,89.0};
double[]reviews=Pen.review(penReview);
System.out.println("------------------");

boolean[]penQulity={true,false,true,false,true};
boolean[]qulity=Pen.good(penQulity);
System.out.println("------------------");

char[]rateings={'A','B','A','B','A','B'};
char[]penRateing=Pen.grade(rateings);
System.out.println("------------------");

float[] percentages={5.9f,4.2f,6.9f,7.9f,7.0f,7.8f};
float[]penPercentage=Pen.percentage( percentages);
System.out.println("------------------");
}
}