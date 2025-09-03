class BookRunner{
public static void main(String [] args){
int[]id={1,2,3,4,5};
int[]book=Book.bookId(id);
System.out.println("------------------");

long[]number={8899007755l,7760542326l,9008643508l,702607411l,744211578l};
long[]Number=Book.libarainNumber(number);
System.out.println("------------------");

String []bookName={"science","social","hindi","english","kannada"};
String[]BookNames=Book.name(bookName);
System.out.println("------------------");

double[] bookReview={66.1,88.99,77.9,55.9,89.0};
double[]reviews=Book.review(bookReview);
System.out.println("------------------");

boolean[]bookQulity={true,false,true,false,true};
boolean[]qulity=Book.good(bookQulity);
System.out.println("------------------");

char[]rateings={'A','B','A','B','A','B'};
char[]employeerRateing=Employee.grade(rateings);
System.out.println("------------------");

float[] percentages={88.9f,75.2f,98.9f,55.9f,95.0f,88.8f};
float[]employeePercentage=Employee.percentage( percentages);
System.out.println("------------------");
}
}