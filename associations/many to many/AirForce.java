class AirForce{
	public int approximateSoldiersCount;
	public Rifile rifile;
	public Missile missile;
	public AirForce(int approximateSoldiersCount,Rifile rifile,Missile missile){
		this.approximateSoldiersCount=approximateSoldiersCount;
		this.rifile=rifile;
		this.missile=missile;
	}	
		
		public void displayAirForceDetails(){
		System.out.println("Approximate Active soldiers Count in Lakhs=="+approximateSoldiersCount);
		System.out.println("Common useing Rifiles=="+rifile.firstRifileName);
		System.out.println("Common using missile=="+missile.missileName);
		
	}
}