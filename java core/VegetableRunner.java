class VegetableRunner{
public static void main (String args[])
{
int number = Vegetable.numberOfVegetable(44);
System.out.println(number);

String name = Vegetable.vegetableName("onion");
System.out.println(name);

boolean bad = Vegetable.vegetableIsBad(false);
System.out.println(bad);

char grade = Vegetable.vegetableGrade('4');
System.out.println(grade);

double cost = Vegetable.vegetableCost(60);
System.out.println(cost);

long phoneNumber = Vegetable.sellerPhoneNumber(90088002);
System.out.println(phoneNumber);

float rateing = Vegetable.vegetableRateing(33.3f);
System.out.println(rateing);
}
}





