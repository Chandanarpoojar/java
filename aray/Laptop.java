class Laptop{
public static int [] priceOfLaptop(int[]prices)
{
for (int ammount=0;ammount<prices.length;ammount++)
	{
System.out.println(prices[ammount]);
}
return prices;
}


public static long [] seriesNumer(long [] sNumber)
{
	for(int number=0;number<sNumber.length;number++)
	{
	System.out.println(sNumber[number]);
	}
	return sNumber;
}
public static String [] name(String [] brandNames)
{
	for(int brand=0;brand<brandNames.length;brand++)
	{
		System.out.println(brandNames[brand]);
	}
	return brandNames;
}
public static double []code(double[]laptopCode)
{
	for (int codes=0; codes<laptopCode.length;codes++)
	{
		System.out.println(laptopCode[codes]);
      }
	  return laptopCode;
	
	}
	
public static boolean[]good(boolean[]Qulity)
{
for (int qulity=0;qulity<Qulity.length;qulity++)
{
System.out.println(Qulity[qulity]);
}
return Qulity;
}

public static char[] grade(char[]rateing)
{
	for(int rate=0;rate<rateing.length;rate++)
	{
		System.out.println(rateing[rate]);
	}
return rateing;
}


public static float[]size(float[]screenSize)
{
	for(int sizes=0;sizes<screenSize.length;sizes++)
	{
		System.out.println(screenSize[sizes]);
	}
	return screenSize;
}





}