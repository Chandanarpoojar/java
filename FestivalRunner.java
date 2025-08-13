class FestivalRunner{
public static void main (String [] args){

int days=Festival.festivalDays(11);
System.out.println(days);

String name=Festival.festivalName("navarathri");
System.out.println(name);


float rateing=Festival.rateing(8444.6f);
System.out.println(rateing);

double expencive=Festival.festivalExpencive(3.3);
System.out.println(expencive);

char grade=Festival.festivalGrade('A');
System.out.println(grade);

boolean status=Festival.festivalStatus(true);
System.out.println(status);

long crowd =Festival.festivalCrowd(12345661);
System.out.println(crowd);
}
}
