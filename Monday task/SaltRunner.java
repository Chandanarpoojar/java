class SaltRunner{
public static void main(String args[]){
Salt salt=new Salt(20,"tata");
salt.displaySalt();
 Sambar sambar=new Sambar("kayiSamabr",20,salt);
 Chatnuy chatnuy=new Chatnuy("karaChatnuy",40,salt);
 Curd curd=new Curd(26,true,salt);
 sambar.displaySamabr();
 chatnuy.displayChatnuy();
 curd.displayprice();
 }
 }