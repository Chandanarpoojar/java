class Employee{
public static String name;
public static int salry;
public static long number;
public static char grade ;
public static float distence;
public static boolean isWorking;

public static void employees()
{
System.out.println("before Employee name=" +name);
name = "rachana";
System.out.println("after Employee name=" +name);
System.out.println("----------------------");

System.out.println("before Employee salry=" +salry);
salry= 60000;
System.out.println("after Employee salary=" +salry);
System.out.println("---------------------");

System.out.println("before Employee number=" +number);
number=88997766099654l;
System.out.println("after Employee number=" +number);
System.out.println("----------------------");

System.out.println("before Employee grade=" +grade);
grade= 'A';
System.out.println("after Employee grade=" +grade);
System.out.println("----------------------");

System.out.println("before Employee distence=" +distence);
distence = 9.99f;
System.out.println("after Employee distence=" +distence);
System.out.println("----------------------");

System.out.println("before Employee isWorking=" +isWorking);
isWorking=false;
System.out.println("after Employee isWorking=" +isWorking);
System.out.println("----------------------");
}
}

