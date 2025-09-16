class InstagramRunner{
public static void main(String args[]){
	Instgram instagram=new Instgram();
Application value=new Application(10,"Story");
Application num=new Application(9,"Post");
Application ammount=new Application(8,"reels");
Application[]application={value,num,ammount};
instagram.instgramdetiles(application);
}
}