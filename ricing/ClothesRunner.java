class ClothesRunner
{
	public static void main(String [] ref)
	{
		int number = Clothes.price("top",11);
		System.out.println(number);
		
		
		
		int code = Clothes.clotheColor("black",90);
		System.out.println(code);
		
		
		int num = Clothes.fabricNumber("cotton",90);
		System.out.println(num);
		
				
		int size = Clothes.clotheSize("green",85);
		System.out.println(size);
		
		int stock = Clothes.clotheStock("top",100);
		System.out.println(stock);
		
		int numbers = Clothes.discount("fullDress",1500);
		System.out.println(numbers);
		System.out.println("---------------");
		
		int month = Clothes.season("summer",4);
		System.out.println(month);
		
		int codes = Clothes.washingType("Jeans",10);
		System.out.println(codes);
		
		
		int year = Clothes.trend("jeans",2024);
		System.out.println(year);
		
		int  gender = Clothes.gender("jeans",'M');
		System.out.println(gender);
		}
		}