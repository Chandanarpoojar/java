class MarketRunner{
public static void main(String args[]){
Market market=new Market(5.5f,"krmarket");
market.displayMarket();
Vegetable vegetable=new Vegetable("tamto",30,market);
FruiteShop fruiteShop=new FruiteShop(6.6,'A',market);
Shop shop=new Shop("garsriShop",true,market);
Shop shop1=new Shop("binduStore",false,market);

vegetable.shopDisplay();
fruiteShop.disply();
shop.displyShop();
}
}