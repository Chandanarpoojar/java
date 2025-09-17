class GameRunner{
public static void main (String args[]){
Cricakte cricakte=new Cricakte("viratkholi");
Game game=new Game(cricakte);
System.out.println(cricakte.playerName);
game.displayGame();
}
}