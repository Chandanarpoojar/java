class School{
public static String name;
public static int fees;
public static long number;
public static char grade ;
public static float distence;
public static boolean isPrivite;

public static void colleges()
{
System.out.println("before School name=" +name);
name = "Govt School";
System.out.println("after School name=" +name);
System.out.println("----------------------");

System.out.println("before School fees=" +fees);
fees = 60000;
System.out.println("after School fees=" +fees);
System.out.println("---------------------");

System.out.println("before School number=" +number);
number=889977665531l;
System.out.println("after School number=" +number);
System.out.println("----------------------");

System.out.println("before School grade=" +grade);
grade= 'A';
System.out.println("after School grade=" +grade);
System.out.println("----------------------");

System.out.println("before School distence=" +distence);
distence = 6.99f;
System.out.println("after School distence=" +distence);
System.out.println("----------------------");

System.out.println("before School isPrivite=" +isPrivite);
isPrivite=true;
System.out.println("after School isPrivite=" +isPrivite);
System.out.println("----------------------");
}
}

