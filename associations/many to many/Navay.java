class Navay{
	public int approximateSoldiersCount;
	public Rifile rifile;
	public Missile missile;
	
	
	public Navay(int approximateSoldiersCount,Rifile rifile,Missile missile){
		this.approximateSoldiersCount=approximateSoldiersCount;
		this.rifile=rifile;
		this.missile=missile;
		
	}
	
	public void displayNavyDetails(){
		System.out.println("Approximate Active soldiers Count in Thousends=="+approximateSoldiersCount);
		System.out.println("Common useing Rifiles=="+rifile.firstRifileName);
		System.out.println("Common using missile=="+missile.missileName);
		
	}
	
}