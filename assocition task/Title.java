class Title{
public int noOFPages;
public String name;
public boolean isNice;
public float pagesnumber;
public double rateing;
public char grade;
public long number;
public Book book;
public Title( int noOFPages,String name,boolean isNice,float pagesnumber,double rateing,char grade,long number,Book book){
this.noOFPages=noOFPages;
this.name=name;
this.isNice=isNice;
this.pagesnumber=pagesnumber;
this.rateing=rateing;
this.grade=grade;
this.number=number;
this.book=book;
}
public void displayTitle(){
System.out.println("noOFPages="+noOFPages);
System.out.println("name="+name);
System.out.println("isNice="+isNice);
System.out.println("pagesnumber="+pagesnumber);
System.out.println("rateing="+rateing);
System.out.println("grade="+grade);
System.out.println("number="+number);
System.out.println("book="+book);
}
}