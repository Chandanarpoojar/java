class Employee{
public String employeeName;
public int idOfEmployee;

public Employee(String employeeName,int idOfEmployee){
this.employeeName = employeeName;
this.idOfEmployee = idOfEmployee;
}

public void detilesOfEmployee(){

System.out.println("employeeName="+employeeName);
System.out.println("idfEmployee="+idOfEmployee);
}

}