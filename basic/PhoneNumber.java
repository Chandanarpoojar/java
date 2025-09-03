class PhoneNumber{
public static void main(String []args){
long chetu=733829410l;
long divya=744211572l;
long raju=9008642509l;
long jaya=7026048233l;
long teju=9900884839l;
long ruhi=70260481244l;
long[]person={chetu,divya,raju,jaya,teju,ruhi};
System.out.println(person[4]);
long chandu=7760582321l;
person[4]=chandu;
System.out.println(person[4]);
System.out.println("phone Number of The Person");
for(int phoneNumber=0;phoneNumber<person.length;phoneNumber++)
System.out.println(person[phoneNumber]);
}
}