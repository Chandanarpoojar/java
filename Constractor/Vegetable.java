class Vegetable{
public Vegetable(){
System.out.println("this is default constrcter");
}
public Vegetable(int price){
System.out.println(price);
}
public Vegetable(long number,int ammount){
	System.out.println(number);
	System.out.println(ammount);
}
public Vegetable(String name, float rateing,boolean fresh){
System.out.println(name);
System.out.println(rateing);
System.out.println(fresh);
}
public Vegetable(double range,char grade,String colar,int num,String name){
	System.out.println(range);
	System.out.println(grade);
	System.out.println(colar);
	System.out.println(num);
	System.out.println(name);
}



}