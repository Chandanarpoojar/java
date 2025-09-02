class Employee{
public Employee(){
System.out.println ("its a defalt constrcutor");
}
public Employee(int id){
System.out.println(id);
}
public Employee(String name,float presentage){
System.out.println(name);
System.out.println(presentage);
}
public Employee(double hight,char department,boolean working){
System.out.println(hight);
System.out.println(department);
System.out.println(working);
}
public Employee(int regnum, String fatherName,char grade,float wight,long number){
System.out.println(regnum);
System.out.println(fatherName);
System.out.println(grade);
System.out.println(wight);
System.out.println(number);
}
}