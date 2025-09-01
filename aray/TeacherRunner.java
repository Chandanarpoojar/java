class TeacherRunner{
public static void main(String [] args){
int[]total={5,8,3,1,6,};
int[]teachers=Teacher.numberOfTeachers(total);
System.out.println("------------------");

long[]number={9900884411l,8866998844l,7760582326l,7026048124l,7338295218l};
long[]teachersNumber=Teacher.phoneNumber(number);
System.out.println("------------------");

String []names={"mala","vidiya","chandan","pavi","anikitha"};
String[]teachersNames=Teacher.name(names);
System.out.println("------------------");

double[] attdences={75.1,88.99,55.9,99.9,98.0};
double[]teachersAttdence=Teacher.attdence(attdences);
System.out.println("------------------");

boolean[]style={true,false,true,false,true};
boolean[]teachingStyle=Teacher.good(style);
System.out.println("------------------");

char[]rateings={'A','A','B','B','B','A'};
char[]teacherRateing=Teacher.grade(rateings);
System.out.println("------------------");

float[] percentages={88.9f,75.2f,98.9f,55.9f,95.0f,88.8f};
float[]teacherPercentage=Teacher.percentage( percentages);
System.out.println("------------------");
}
}