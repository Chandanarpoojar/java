class Dog extends Animal{
public String Name;
public int Age;
public long number;
public float Hight;

public Dog(){
System.out.println("this is non argumental constrctor");
}
public Dog(String Name,int Age,long Number,float Hight)
{
	super();
this.Name=Name;
this.Age=Age;
this.number=number;
this.Hight=Hight;

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

}
}


