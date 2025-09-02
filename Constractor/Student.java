class Student{
public Student(){
System.out.println ("its a defalt constrcutor");
}
public Student(int id){
System.out.println(id);
}
public Student(String name,float presentage){
System.out.println(name);
System.out.println(presentage);
}
public Student(double hight,char section,boolean tooper){
System.out.println(hight);
System.out.println(section);
System.out.println(tooper);
}
public Student(int regnum, String fatherName,char grade,float wight,long number){
System.out.println(regnum);
System.out.println(fatherName);
System.out.println(grade);
System.out.println(wight);
System.out.println(number);
}
}