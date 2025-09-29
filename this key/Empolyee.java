class Employee{
public Employee(){
this(10000);
System.out.println("this is no argumnental constrcter");
}
public Employee(int salary){
this(2000,"raju");
System.out.println("sallary="+salary);
}
public Employee(int ammount,String name){
this(20000,true,"arun");
System.out.println("ammount="+ammount);
System.out.println("name="+name);
}
public Employee(int salary,boolean isGood,String name){
	this(5.5,66.8f,9988776655l,88);
	System.out.println("salary="+salary);
	System.out.println("isGood="+isGood);
	System.out.println("name="+name);
	
}
public Employee(double hight,float wight,long number,int employeeid){
	this(81,3.3f,'A',true,"rajajinagr");
	System.out.println("hight="+hight);
	System.out.println("wight="+wight);
	System.out.println("number="+number);
	System.out.println("employeeid="+employeeid);
}
public Employee(int id,float distence,char grade,boolean isGood,String area){
	this(99,6.8f,'A',7.9,"anjan",false,9900887766l);
	System.out.println("id="+id);
	System.out.println("distence="+distence);
	System.out.println("grade="+grade);
	System.out.println("isGood="+isGood);
	System.out.println("area="+area);
}
public Employee(int numid,float hights,char grade,double distence,String name,boolean isBad,long number){
	System.out.println("id="+numid);
	System.out.println("hight="+hights);
	System.out.println("grade="+grade);
	System.out.println("distence="+distence);
	System.out.println("isBad="+isBad);
	System.out.println("number="+number);
}
	
	
}