class MobielRateing {
public static void main(String [] args){
char appel='8';
char oneplus='7';
char poco='3';
char samasang='4';
char redmi='5';
char vivo='6';
int [] mobiel={appel,oneplus,poco,samasang,redmi,vivo};
System.out.println(mobiel[2]);
int ntg='9';
mobiel[2]=ntg;
System.out.println(mobiel[2]);
System.out.println("rateing For The mobiel");
for (int rateing=0; rateing < mobiel.length; rateing++)
System.out.println(mobiel[rateing]);
}
}  

