class StudentMarks{
public static void main(String [] ref){
int dhanu=30;
int mala=40;
int manu=50;
int mhoith=60;
int thanu=78;
int navya=88;
int [] student={dhanu,mala,manu,mhoith,thanu,navya};
System.out.println(student[4]);
int manaya=55;
student[4]=manaya;
System.out.println(student[4]);
System.out.println("list Of The Student Score The Marks");
    for(int marks=0; marks < student.length; marks++)
	System.out.println(student[marks]);
}
}