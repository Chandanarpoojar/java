class Game{
public String name;
public float rateing;
public Player player;
 public Game(String name,float rateing,Player player){
 this.name=name;
 this.rateing=rateing;
 this.player=player;
 }
 public void displayGame(){
 System.out.println("name="+name);
 System.out.println("rateing="+rateing);
 System.out.println("player="+player);
 }
}