class GemotryBoxRunner{
public static void main(String args[]){
Scale scale=new Scale(10,15.0f);
Pencial pencial=new Pencial(30,"dooms");
Compus compus=new Compus(20,false);
GemotryBox gemotrybox=new GemotryBox(50,'A',scale,pencial,compus);
gemotrybox.displayBox();
}
}