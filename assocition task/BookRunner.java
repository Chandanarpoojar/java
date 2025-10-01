class BookRunner{
public static void main(String args[]){
	Book book = new Book(100,"mukajiyaKansugalu",true,6.9f,8.9,'A',320928970898l);
book.displayBook();
Title title=new Title(20,"janaptha",true,5.5f,5.55,'A',99008877666l,book);
title.displayTitle();
Athour athour = new Athour(90,"shivarmakarath",true,5.5f,6.89,'A',677499003l,book);
athour.displyAthour();
}
}