class Book{
public static int[] bookId(int [] idNumber)
{

for(int num=0;num<idNumber.length;num++)
{
System.out.println(idNumber[num]);
}
return idNumber;
 
}
public static long[] libarainNumber(long [] phoneNumber)
{
	for(int call=0;call<phoneNumber.length;call++)
	{
	System.out.println(phoneNumber[call]);
	}
	return phoneNumber;
}
public static String [] name(String [] bookNames)
{
	for(int book=0;book<bookNames.length; book++)
	{
		System.out.println(bookNames[book]);
	}
	return bookNames;
}
public static double []review(double[]bookReview)
{
	for (int review =0; review<bookReview.length;review++)
	{
		System.out.println(bookReview[review]);
      }
	  return bookReview;
	
	}
	
public static boolean[]good(boolean[]bookqulity)
{
for (int qulity=0;qulity<bookqulity.length;qulity++)
{
System.out.println(bookqulity[qulity]);
}
return bookqulity;
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