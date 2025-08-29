class Cloth{

public static int price(String brand ,int value)
{

if (brand=="zara")
{
value=55;
}
else if(value==45)
{
System.out.println("this brand is not there");
}
else
{
System.out.println("outOf stock");
}
return value;
}
public static int size(String name,int number)
{
	if name=="t top")
	{
		number=2;
	}
	else if (number==200)
	{
		System.out.println("t top is avilbale");
	}
	