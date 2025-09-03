class AddsRunner{
public static void main(String args[]){
int price=Adds.addPrice(444);
System.out.println(price);

String name=Adds.addName("phone");
System.out.println(name);

float range= Adds.addRange(5.5f);
System.out.println(range);

double review=Adds.addReview(66.7);
System.out.println(review);

boolean good=Adds.addIsGood(true);
System.out.println(good);

char grade=Adds.grade('5');
System.out.println(grade);

long number=Adds.ownerNumber(66778855);
System.out.println(number);
}
}
