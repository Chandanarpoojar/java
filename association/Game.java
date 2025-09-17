class Game{
public String name;
public Cricakte cricakte;
public Game(Cricakte cricakte){
this.name=cricakte.playerName;
this.cricakte=cricakte;
}
public void displayGame(){
	cricakte.displayCricate();
}
}

