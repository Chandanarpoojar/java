class ShowRoomRunner
{
public static void main(String args[])
{
ShowRoom showRoom= new ShowRoom();
Bike ammount=new Bike("honda",10000);
Bike value = new Bike("fz",20000);
Bike number = new Bike("glammer",60000);
Bike prices = new Bike("royalNfiled",100000);
  Bike[]bike={ammount,value,number,prices};
  showRoom.noOfBike(bike);
  }
  }