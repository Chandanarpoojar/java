class HolidayRunner{
public static void main (String args[]){

int number= Holiday.numberOfHoliday(55);
System.out.println(number);

String name=Holiday.nameOfHoliday("summer holiday");
System.out.println(name);



char grade=Holiday.grade('c');
System.out.println(grade);

float rate=Holiday.rateForHoliday(5.5f);
System.out.println(rate);

boolean conform=Holiday.holidayIsConform(true);
System.out.println(conform);

double time=Holiday.holidaySpendingTime(22.22);
System.out.println(time);
}
}