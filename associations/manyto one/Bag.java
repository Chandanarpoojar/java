class Bag{
public String brand;
public int price;
public Pen pen;
public Book book;
public Bag(String brand,int price,Pen pen,Book book){
this.brand=brand;
this.price=price;
this.pen=pen;
this.book=book;

}
public void displayBag(){
System.out.println("brand="+brand);
System.out.println("price="+price);
System.out.println("pen="+pen);
System.out.println("book="+book);

System.out.println(pen.price + pen.brandName);
System.out.println(book.price + book.brandName);
}
}