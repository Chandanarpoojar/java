class EcommerceRunner
{
public static void main(String args[])
{
Ecommerce ecommerce =new Ecommerce();
Website name =new Website(5,"filpcart");
Website rate=new Website(6,"zepto");
Website review=new Website(7,"meesho");
Website value=new Website(8,"minthra");
Website num=new Website(9,"bilnkit");

Website[]website={name,rate,review,value,num};
ecommerce.noOfWebsite(website);
}
}