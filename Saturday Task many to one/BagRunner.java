class BagRunner{
public static void main(String args[]){
Pen pen =new Pen(10,"dooms");
Book book=new Book(30,"classmate");
Bottel bottel =new Bottel(50,'A');
Box box =new Box(100,true);
Scale scale=new Scale("apzara",15.0f);
Bag bag =new Bag("northzone",2000,pen,book,bottel,box,scale);
bag.displayBag();
}
}