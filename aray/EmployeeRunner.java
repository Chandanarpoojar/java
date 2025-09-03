class EmployeeRunner{
public static void main(String [] args){
int[]total={1,2,3,4,5};
int[]employees=Employee.employeeId(total);
System.out.println("------------------");

long[]number={9900556677l,7760542326l,9008643508l,7338295321l,744211578l};
long[]employeeNumber=Employee.employeeNumber(number);
System.out.println("------------------");

String []names={"anajli","vinay","chandana","pavithra","anikitha"};
String[]employeeNames=Employee.name(names);
System.out.println("------------------");

double[] attdences={66.1,88.99,77.9,55.9,89.0};
double[]employeeAttdence=Employee.attdence(attdences);
System.out.println("------------------");

boolean[]work={true,false,true,false,true};
boolean[]employeework=Employee.good(work);
System.out.println("------------------");

char[]rateings={'A','A','A','B','B','B'};
char[]employeerRateing=Employee.grade(rateings);
System.out.println("------------------");

float[] percentages={88.9f,75.2f,98.9f,55.9f,95.0f,88.8f};
float[]employeePercentage=Employee.percentage( percentages);
System.out.println("------------------");
}
}