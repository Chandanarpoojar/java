class Cloth{

public static int price(String brand ,int value)
{

if (brand=="zara")
{
value=30;
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
}