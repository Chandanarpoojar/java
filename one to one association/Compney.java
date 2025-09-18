class Compney{
public String name;
public boolean isGood;
public Department departmentName;

public Compney(String name,boolean isGood,Department departmentName){
this.name=name;
this.isGood=isGood;
this.departmentName=departmentName;
}
public void displayCompney(){
System.out.println("name="+name);
System.out.println("isGood="+isGood);
}
}