class Shiva  extends God
{
	public Shiva()
	{
		System.out.println("Shiva class  no-argument const");
	}
	 Shiva( String godName,int devatees,char symbol,float height,double powerLevel,long idols,boolean isWorshipped)
	{
		this.godName=godName;
		this.devatees=devatees;
		this.symbol=symbol;
		this.height=height;
		this.powerLevel=powerLevel;
		this.idols=idols;
		this.isWorshipped=isWorshipped;
	}
	public void displayShiva()
	{
	System.out.println(this.godName);
	System.out.println(this.devatees);
	System.out.println(this.idols);
	System.out.println(this.powerLevel);
	System.out.println(this.isWorshipped);
	System.out.println(this.height);
	System.out.println(this.symbol);
	}
}