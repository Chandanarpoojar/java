class Teacher{
public String name;
public double salary;
public Section sectionName;

public Teacher(String name,double salary, Section sectionName){
this.name=name;
this.salary=salary;
this.sectionName=sectionName;
}
public void teacherDisplay(){
System.out.println("name="+name);
System.out.println("salary="+salary);
System.out.println("sectionName="+sectionName);
}
}