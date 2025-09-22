class Chethu{
public int regNo;
public boolean isTopper;
public Web web;
public DBMS dbms;
public Java java;
public Chethu(int regNo,boolean isTopper,Web web,DBMS dbms,Java java){
this.regNo=regNo;
this.isTopper=isTopper;
this.web=web;
this.dbms=dbms;
this.java=java;
}
public void displyChethu(){
System.out.println("regNo="+regNo);
System.out.println("isTopper="+isTopper);
System.out.println("web="+web.TotalMarks);
System.out.println(java.TotalMarks);
System.out.println(dbms.TotalMarks);
}
}