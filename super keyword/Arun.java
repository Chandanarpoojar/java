class Arun extends Hero{
    public String filmIndustry;
	public int Age;
	public long Number;
	public float Height;
	public double movieTicket;
	public char Gender;
	public boolean ISGoodActor;
	public Arun(){
	System.out.println("this is a argumental constrctor");
	}
	public Arun(String filmIndustry,int Age,long Number,float Height,double movieTicke,char Gender,boolean ISGoodActor){
	this.filmIndustry=filmIndustry;
	this.Age=Age;
	this.Number=Number;
	this.Height=Height;
	this.movieTicket=movieTicket;
	this.Gender=Gender;
	this.ISGoodActor=ISGoodActor;
	}
	public void displyArun(){
  System.out.println("hero name=="+this.filmIndustry);
  System.out.println("hero age=="+this.Age);
  System.out.println("hero Number=="+this.Number);
  System.out.println("hero Height=="+this.Height);
  System.out.println("hero movieTicke=="+this.movieTicket);
  System.out.println("hero Gender=="+this.Gender);
  System.out.println("hero ISGoodActor=="+this.ISGoodActor);
  }
  }
  
  
	
	