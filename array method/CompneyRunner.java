class CompneyRunner
{
public static void main(String args[])
{
Compney compney	= new Compney();
	
Employee name =new Employee("manju",1);
Employee id =new Employee("ranjan",2);
Employee names =new Employee("anitha",3);
Employee num =new Employee("rama",4);
Employee number =new Employee("ramu",5);
Employee[]employee={name,id,names,num,number};
compney.noOfEmployee(employee);
}
}