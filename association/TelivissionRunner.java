class TelivissionRunner{
public static void main(String args[]){
Chanael chanael= new Chanael("ZKannada");
Telivission telivission =new Telivission(chanael);
System.out.println(chanael.name);
telivission.displayTv();
}
}