class ChargerRunner{
public static void main(String args[]){
Phone phone = new Phone(20000,"nthg cmr",true,5.5f,10.7,'A',9988776655l);
phone.displayPhone();
Charger charger=new Charger(3000,"nthg",true,10.6f,5.7,'A',990088766544l,phone);
charger.displayCharger();
}
}