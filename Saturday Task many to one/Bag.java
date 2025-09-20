class Bag{
public String brand;
public int price;
public Pen pen;
public Book book;
public Bottel bottel;
public Box box;
public Scale scale;
public Bag(String brand,int price,Pen pen,Book book,Bottel bottel,Box box,Scale scale){
this.brand=brand;
this.price=price;
this.pen=pen;
this.book=book;
this.bottel=bottel;
this.box=box;
this.scale=scale;
}
public void displayBag(){
System.out.println("brand="+brand);
System.out.println("price="+price);
System.out.println("pen="+pen);
System.out.println("book="+book);
System.out.println("bottel="+bottel);
System.out.println("box="+box);
System.out.println("scale="+scale);
System.out.println(pen.price + pen.brandName);
System.out.println(book.price + book.brandName);
System.out.println(bottel.price + bottel.grade);
System.out.println(box.price);
System.out.println(box.isBoxIsOpen);
System.out.println(scale.name);
System.out.println(scale.length);
}
}
