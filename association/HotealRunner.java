class HotealRunner{
public static void main(String args[]){
Manger manger= new Manger("arun");
Hoteal hoteal =new Hoteal(manger);
System.out.println(hoteal.name);
hoteal.displayHoteal();
}
}