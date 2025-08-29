class GaneshaIdolRunner
{
	public static void main(String [] ref)
	{
		int amount = GaneshaIdol.price("oneInch",1000);
		System.out.println(amount);
		
		int price =GaneshaIdol.amount("twoInc",3000);
		System.out.println(price);
		
		
		int stock = GaneshaIdol.idolAvailability("ganes",10);
		System.out.println(stock);
		
		   int num = GaneshaIdol.delivery(44.56,6);
		   System.out.println(num);
		  
		  int hours = GaneshaIdol.transport("bik",3);
		  System.out.println(hours);
		  
		  
		  int ligth = GaneshaIdol.numberOfLigth("red",1);
		  System.out.println(ligth);
		  
		  int idol = GaneshaIdol.numberOfIdol("Gold",35);
		  System.out.println(idol);
		  
		  int heigth = GaneshaIdol.idolHeigth("smallGwori",2);
		  System.out.println(heigth);
		  
		  int code = GaneshaIdol.material("clay",200);
		  System.out.println(code);
		  
		 int code = GaneshaIdol.color("whit",8);
		  System.out.println(code);
		  
		 int amount = GaneshaIdol.discount("smallGanesha",1000);
		  System.out.println(amount);
		  
		 int distance = GaneshaIdol.shipping("bangalore",30);
		  System.out.println(distance);
		  
		  int code = GaneshaIdol.idolTypes("sitting",1000);
		  System.out.println(code);
		  
		 int month = GaneshaIdol.festival("ganesha",9);
		  System.out.println(month);
		  
		 int amount = GaneshaIdol.payment("UPi",700);
		  System.out.println(amount);
		  
		  int rate = GaneshaIdol.rating("UPi",5);
		  System.out.println(rate);
		  
		  int weight = GaneshaIdol.export("idol",33);
		  System.out.println(weight);
		  
		  
		   int choice = GaneshaIdol.customization("unique",2);
		  System.out.println(choice);
		  
		   int policy= GaneshaIdol.returnPolicy("Gwor",2);
		   System.out.println(policy);
		  
		   int number = GaneshaIdol.packageNumber("Gwori",91);
		  System.out.println(number);
		  
		
	}
}