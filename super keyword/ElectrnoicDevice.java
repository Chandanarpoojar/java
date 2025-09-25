class ElectrnoicDevice extends Device{
public String name;
public int price;
public long idNum;
public float rateing;
public double review;
public char grade;
public boolean isWorking;
public ElectrnoicDevice(){
System.out.println("this is argumental constrctor");
}
public ElectrnoicDevice(String name,int price,long idNum,float rateing,double review,char grade,boolean isWorking){
super();
this.name=name;
this.price=price;
this.idNum=idNum;
this.rateing=rateing;
this.review=review;
this.grade=grade;
this.isWorking=isWorking;
}
public void displayElectronics(){
System.out.println("Electrnoic name=="+this.name);
System.out.println("Electrnoic name=="+ super.name);
System.out.println("Electrnoic price=="+this.price);
System.out.println("Electrnoic price==" +super.price);
System.out.println("Electrnoic number=="+this.idNum);
System.out.println("Electrnoic number==" +super.idNum);
System.out.println("Electrnoic rateing=="+this.rateing);
System.out.println("Electrnoic rateing==" +super.rateing);
System.out.println("Electrnoic review=="+this.review);
System.out.println("Electrnoic review==" +super.review);
System.out.println("Electrnoic grade=="+this.grade);
System.out.println("Electrnoic grade=="+ super.grade);
System.out.println("Electrnoic is active=="+this.isWorking);
System.out.println("Electrnoic is working=="+ super.isWorking);
}
}

