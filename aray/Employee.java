class Employee
{

 public static int[] employeeId(int [] idNumber)
{

for(int num=0;num<idNumber.length;num++)
{
System.out.println(idNumber[num]);
}
return idNumber;
 
}
public static long[] employeeNumber(long [] cellNumber)
{
	for(int call=0;call<cellNumber.length;call++)
	{
	System.out.println(cellNumber[call]);
	}
	return cellNumber;
}
public static String []name(String [] names)
{
	for (int employeeNames=0;employeeNames<names.length; employeeNames++)
	{
		System.out.println(names[employeeNames]);
	}
	return names;
}
public static double []attdence(double[]attdence)
{
	for (int employeeAttdence=0; employeeAttdence<attdence.length;employeeAttdence++)
	{
		System.out.println(attdence[employeeAttdence]);
      }
	  return attdence;
	
	}
	
public static boolean[]good(boolean[]working)
{
for (int workingWay=0;workingWay<working.length;workingWay++)
{
System.out.println(working[workingWay]);
}
return working;
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
