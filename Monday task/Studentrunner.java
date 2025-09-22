class Studentrunner{
public static void main (String args[]){
 Web web = new Web(20);
 Java java =new Java(30);
 DBMS dbms=new DBMS(40);
 
 Chandana chandana=new Chandana(1,true,web,dbms,java);
 Chethu chethu =new Chethu(2,false,web,dbms,java);
 Mansi mansi =new Mansi(3,true,web,dbms,java);
 
 chandana.displyChandana();
 chethu.displyChethu();
 mansi.displymansi();
 }
 }