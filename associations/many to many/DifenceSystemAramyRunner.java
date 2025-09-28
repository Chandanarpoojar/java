class DifenceSystemAramyRunner{
	public static void main(String [] args){
		
		
		Missile missile=new Missile("Brahmos Missile");
		Rifile rifile=new Rifile("INSAS rifile","AK-47/203");
		
		AirForce airForce=new AirForce(15,rifile,missile);
		Navay navay=new Navay(67,rifile,missile);
		
		
		airForce.displayAirForceDetails();
		navay.displayNavyDetails();
		
		
		
		
	}
}