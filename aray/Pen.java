class Pen{
public static int [] price(int[]prices)
{
for (int ammount=0;ammount<prices.length;ammount++)
	{
System.out.println(prices[ammount]);
}
return prices;
}


public static long [] sellerPhoneNumer(long [] phoneNumber)
{
	for(int num=0;num<phoneNumber.length;num++)
	{
	System.out.println(phoneNumber[num]);
	}
	return phoneNumber;
}
public static String [] name(String [] penNames)
{
	for(int pens=0;pens<penNames.length;pens++)
	{
		System.out.println(penNames[pens]);
	}
	return penNames;
}
public static double []review(double[]penReview)
{
	for (int review =0; review<penReview.length;review++)
	{
		System.out.println(penReview[review]);
      }
	  return penReview;
	
	}
	
public static boolean[]good(boolean[]penQulity)
{
for (int qulity=0;qulity<penQulity.length;qulity++)
{
System.out.println(penQulity[qulity]);
}
return penQulity;
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