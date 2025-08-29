class Clothes
{
	public static int price(String name,int number)
	{
		if(name == "top" && number == 30)
		{
			number = 44;
			System.out.println("clothe price");
		
		}else
		{
			number= 99;
			System.out.println("no price");
		
		}
		return number;
	}
	public static int clotheColor(String color,int code)
	{
		if(color == "black" && code ==  90)
		{
			System.out.println("clothe color and code");
		
		}else
		{
			System.out.println("no clothe Color and code");
		
		}
		return code;
	}
	public static int fabricNumber(String name,int number)
	{
		if(name == "cotton" && number == 55  )
		{
			System.out.println("clothes fabricNumber and name of fabric");
		
		}else
		{
			System.out.println("no clothe fabric name and number");
		
		}
		return number;
    }
	
	public static int clotheSize(String color,int size)
	{
		if(color == "green" && size == 85)
		{
			System.out.println("clothe color and size");
		
		}else
		{
			System.out.println("no clothe Color and size");
		
		}
		return size;
		
	}
	public static int clotheStock(String name,int stock)
	{
		if(name == "top" && stock == 100)
		{
			System.out.println("clothes stock");
		
		}else
		{
			System.out.println("no clothes stock are there");
		
		}
		return stock;
	}
	
	public static int discount(String type,int amount)
	{
		if(type == "fullDress" && amount == 1500)
		{
			System.out.println("clothes discount");
		
		}else
		{
			System.out.println("no clothes discount");
		
		}
		return amount;
	}
	public static int season(String name,int month)
	{
		if(name == "summer" && month == 4)
		{
			System.out.println("clothes in summer");
		
		}else
		{
			System.out.println("no clothes in summer");
		
		}
		return month;
	}
	public static int washingType(String name,int code)
	{
		if(name == "jeans" && code == 10)
		{
			System.out.println("jeans washing type");
		
		}else
		{
			System.out.println("no washing type");
		
		}
		return code;
	}
	public static int trend(String name,int year)
	{
		if(name == "jeans" && year == 2025)
		{
			System.out.println("jeans trending ");
		
		}else
		{
			System.out.println("There is no trending year");
		
		}
		return year;
	}
	public static int gender(String name,int gender)
	{
		if(name == "jeans" && gender == 'M')
		{
			System.out.println("jeans for Mens");
		
		}else
		{
			System.out.println("jeans for Female");
		
		}
		return gender;
	}
}