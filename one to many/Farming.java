class Farming{
public char gradeOFCrop;
public float distence;
public Water water;
public Farming(char gradeOFCrop,float distence,Water water){
this.gradeOFCrop=gradeOFCrop;
this.distence=distence;
this.water=water;
}
public  void formingDisplay(){
System.out.println("gradeOFCrop="+gradeOFCrop);
System.out.println("distence="+distence);
}
}