class Animal{
public static void main(String [] args){
byte dog=11;
byte cat=15;
byte cow=20;
byte rabbit=8;
byte mouse=2;
byte tiger=14;
int []animal={dog,cat,cow,rabbit,mouse,tiger};
System.out.println(animal[5]);
int elephant=50;
animal[5]=elephant;
System.out.println(animal[5]);
System.out.println(" age Of The Aniamls");
for (int age=0; age < animal.length; age++)
System.out.println(animal[age]);
}
}