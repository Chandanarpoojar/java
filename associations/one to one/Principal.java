class Principal{
public String principalName;
public int salary;
public long number;
public float review;
public double rateing;
public char qulity;
public boolean isGood;
public Principal(String PrincipalName,int salary,long number,float review,double rateing,char qulity,boolean isGood){
this.principalName=principalName;
this.salary=salary;
this.number=number;
this.review=review;
this.rateing=rateing;
this.qulity=qulity;
this.isGood=isGood;
}
public void displayPrincipal(){
System.out.println("name="+principalName);
System.out.println("salary="+salary);
System.out.println("number="+number);
System.out.println("review="+review);
System.out.println("rateing="+rateing);
System.out.println("qulity="+qulity);
System.out.println("isGood="+isGood);
}
}



