class Dog extends Animal{
public String Name;
public int Age;
public long number;
public float Hight;
public double wight;
public char Gender;
public boolean isActive;
public Dog(){
System.out.println("this is non argumental constrctor");
}
public Dog(String Name,int Age,long Number,float Hight,
double wight,char Gender,boolean isActive){
	super();
this.Name=Name;
this.Age=Age;
this.number=number;
this.Hight=Hight;
this.wight=wight;
this.Gender=Gender;
this.isActive=isActive;
}
public void displayAnimal(){
System.out.println("Animal name=="+this.Name);
System.out.println("Animal name=="+ super.Name);
System.out.println("Animal age=="+this.Age);
System.out.println("Animal age==" +super.Age);
System.out.println("Animal number=="+this.number);
System.out.println("Animal number==" +super.number);
System.out.println("Animal hight=="+this.Hight);
System.out.println("Animal hight==" +super.Hight);
System.out.println("Animal wight=="+this.wight);
System.out.println("Animal wight==" +super.wight);
System.out.println("Animal gender=="+this.Gender);
System.out.println("Animal gender=="+ super.Gender);
System.out.println("Animal is active=="+this.isActive);
System.out.println("Animal is active=="+ super.isActive);
}
}


