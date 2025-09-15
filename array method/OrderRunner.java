class OrderRunner{
public static void main(String args[]){

Order order=new Order();
Zepto value=new Zepto(10,"onion");
Zepto num=new Zepto(9,"milk");
Zepto ammount=new Zepto(8,"cake");
Zepto[]zepto={value,num,ammount};
order.orderiteam(zepto);
}
}