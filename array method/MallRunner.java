class MallRunner
{
public static void main(String args[])
{
Mall mall = new Mall();
Shop id= new Shop("zodio",1);
Shop num=new Shop("trendes",2);
Shop numbers=new Shop("bigBazer",3);
Shop value=new Shop("pizaHut",4);

Shop []shop={id,num,numbers,value};
mall.noOfShop(shop);
}
}