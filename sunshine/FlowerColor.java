class FlowerColor{
public static void main(String args[]){

String lilly="white";
String hybiscues="red";
String rose="pink";
String sunFlower="yellow";
String Rose="orange";
String [] flower={lilly,hybiscues,rose,sunFlower,Rose};
System.out.println(flower[2]);
flowerNames(flower);
}
public static void  flowerNames(String[]flower){

for (int colore=0;colore<flower.length;colore++){
System.out.println(flower[colore]);

}

}
}