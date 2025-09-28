class TvRunner
{
	public static void main(String [] ref)
	{
		Tv tv = new Tv();
		tv.displayTv(1500);
		tv.displayTv(1500,"samsang");
		tv.displayTv(29.9f,true,"led");
		tv.displayTv(1223,60.5f,5.5,true);
		tv.displayTv(290000,"lg",'A',true,66778899l);
		tv.displayTv(30000003,60.7f,8.9,9900887722l,'B',true);
		}
		}