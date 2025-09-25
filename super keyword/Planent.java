class Planent extends Earth{
public String name;
public int Contry;
public long Population;
public float distence;
public double area;
public char grade;
public boolean haslife;
public Planent(){
System.out.println("argumental constrctor");
}
public Planent(String name,int Contry,long Population,float distence,double area,char grade,boolean haslife){
super();
this.name=name;
this.Contry=Contry;
this.Population=Population;
this.distence=distence;
this.area=area;
this.grade=grade;
this.haslife=haslife;
}
public void displayPlante(){
System.out.println("plante name=="+this.name);
System.out.println("plante name=="+ super.name);
System.out.println("plante Contry=="+this.Contry);
System.out.println("plante Contry==" +super.Contry);
System.out.println("plante Population=="+this.Population);
System.out.println("plante Population==" +super.Population);
System.out.println("plante distence=="+this.distence);
System.out.println("plante distence==" +super.distence);
System.out.println("plante area=="+this.area);
System.out.println("plante area==" +super.area);
System.out.println("plante grade=="+this.grade);
System.out.println("plante grade=="+ super.grade);
System.out.println("plante is active=="+this.haslife);
System.out.println("plante is life=="+ super.haslife);
}
}


