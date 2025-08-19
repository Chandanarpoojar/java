class ChanalName{
public static void main(String args[]){

String serials="colorsKannada";
String showes="zeeThelagu";
String news="publicTv";
String musiec="publicMusiec";
String comedy="udayaComedey";
String [] chanalas={serials,showes,news,musiec,comedy};
System.out.println(chanalas[2]);
ChanalNames(chanalas);
}
public static void  ChanalNames(String[]chanalas){

for (int chanal=0;chanal<chanalas.length;chanal++){
System.out.println(chanalas[chanal]);



}
}
}