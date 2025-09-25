class Person extends Doctor{
public String doctorName;
public int doctorAge;
public long doctorPhoneNo;
public float doctorHight;
public double doctorwight;
public char doctorGender;
public boolean isGovt;
public Person(){
System.out.println("this is non argumental constrctor");
}
public Person(String doctorName,int doctorAge,long doctorPhoneNo,float doctorHight,
double doctorwight,char doctorGender,boolean isGovt){
	super();
this.doctorName=doctorName;
this.doctorAge=doctorAge;
this.doctorPhoneNo=doctorPhoneNo;
this.doctorHight=doctorHight;
this.doctorwight=doctorwight;
this.doctorGender=doctorGender;
this.isGovt=isGovt;
}
public void displayPerson(){
System.out.println("doctor name=="+this.doctorName);
System.out.println("doctor name=="+ super.doctorName);
System.out.println("doctor age=="+this.doctorAge);
System.out.println("doctor age==" +super.doctorAge);
System.out.println("doctor number=="+this.doctorPhoneNo);
System.out.println("doctor phone nu==" +super.doctorPhoneNo);
System.out.println("doctor hight=="+this.doctorHight);
System.out.println("doctor hight==" +super.doctorHight);
System.out.println("doctor wight=="+this.doctorwight);
System.out.println("doctor wight==" +super.doctorwight);
System.out.println("doctor gender=="+this.doctorGender);
System.out.println("doctor gender=="+ super.doctorGender);
System.out.println("doctor is govt=="+this.isGovt);
System.out.println("doctor isGovt=="+ super.isGovt);
}
}


