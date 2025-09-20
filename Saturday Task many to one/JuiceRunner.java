class JuiceRunner{
public static void main(String args []){
Sugar sugar=new Sugar(100,false);
Frutes frutes=new Frutes("mango",20);
Falver falver=new Falver("venila",5.0);
Soda soda =new Soda("lemmeon",20);
Juice juice=new Juice("mango",40,sugar,frutes,falver,soda);
juice.displayJuice();
}
}