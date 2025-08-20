class Teacher
{

 public static int[] numberOfTeachers(int [] number)
{

for(int num=0;num<number.length;num++)
{
System.out.println(number[num]);
}
return number;
 
}
public static long[] phoneNumber(long [] cellNumber)
{
	for(int cell=0;cell<cellNumber.length;cell++)
	{
	System.out.println(cellNumber[cell]);
	}
	return cellNumber;
}
public static String []name(String [] names)
{
	for (int teacherNames=0;teacherNames<names.length; teacherNames++)
	{
		System.out.println(names[teacherNames]);
	}
	return names;
}
public static double []attdence(double[]attdence)
{
	for (int teachersAttdence=0; teachersAttdence<attdence.length;teachersAttdence++)
	{
		System.out.println(attdence[teachersAttdence]);
      }
	  return attdence;
	
	}
	
public static boolean[]good(boolean[]teaching)
{
for (int teacgingWay=0;teacgingWay<teaching.length;teacgingWay++)
{
System.out.println(teaching[teacgingWay]);
}
return teaching;
}

public static char[] grade(char[]rateing)
{
	for(int rate=0;rate<rateing.length;rate++)
	{
		System.out.println(rateing[rate]);
	}
return rateing;
}


public static float[]percentage(float[]percent)
{
	for(int percents=0;percents<percent.length;percents++)
	{
		System.out.println(percent[percents]);
	}
	return percent;
}





}	
