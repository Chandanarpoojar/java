class BagRunner{
public static void main(String args[]){
Pen pen =new Pen(10,"dooms");
Books book=new Books(30,"classmate");
Bag bag =new Bag("northzone",2000,pen,book);
bag.displayBag();
}
}