 class Laptops
{
public static String laptopsName(int number)
{
	String name = "";
	 if(number == 60)
	 {
		 System.out.println("laptop name ");
		 name = "Dell";
		 return name;
	 }
	 if(number == 62)
	 {
		 System.out.println("laptop name");
		 name = "Hp";
		 return name;
	 }
	 if(number == 63)
	 {
		 System.out.println("laptop name ");
		 name = "Lenova";
		 return name;
	 }
	 if(number == 64)
	 {
		 System.out.println("laptop name");
		 name = "Apple";
		 return name;
		 
	 }
	 if(number == 65)
	 {
		 System.out.println("laptop name");
		 name = "LG";
		 return name;
	 }
	 if(number == 66)
	 {
		 System.out.println("laptop name");
		 name = "Acer";
		 return name;
		 
	 }
	 return name;
}
}
[4:49 pm, 18/08/2025] Chandu1: class LaptopsRunner
{
	public static void main(String [] ref)
	{
		String name;
		name = Laptops.laptopsName(60);
		System.out.println(name);
		
		name = Laptops.laptopsName(62);
		System.out.println(name);
		
		name = Laptops.laptopsName(63);
		System.out.println(name);
		
		name = Laptops.laptopsName(64);
		System.out.println(name);
		
		name = Laptops.laptopsName(65);
		System.out.println(name);
		
		name = Laptops.laptopsName(66);
		System.out.println(name);
		
		
		
	}
}