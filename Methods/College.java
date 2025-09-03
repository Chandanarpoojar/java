class College{
public static String name;
public static int fees;
public static long number;
public static char grade ;
public static float distence;
public static boolean isPrivite;

public static void colleges()
{
System.out.println("before college name=" +name);
name = "Govt college";
System.out.println("after college name=" +name);
System.out.println("----------------------");

System.out.println("before college fees=" +fees);
fees = 60000;
System.out.println("after college fees=" +fees);
System.out.println("---------------------");

System.out.println("before college number=" +number);
number=889977665531l;
System.out.println("after college number=" +number);
System.out.println("----------------------");

System.out.println("before college grade=" +grade);
grade= 'A';
System.out.println("after college grade=" +grade);
System.out.println("----------------------");

System.out.println("before college distence=" +distence);
distence = 6.99f;
System.out.println("after college distence=" +distence);
System.out.println("----------------------");

System.out.println("before college isPrivite=" +isPrivite);
isPrivite=true;
System.out.println("after college isPrivite=" +isPrivite);
System.out.println("----------------------");
}
}

