class ApartmentRunner{
public static void main(String args[]){
Apartment apartment = new Apartment();
Floors name =new Floors("FirstFloor",1);
Floors num =new Floors("SecondFloor",2);
Floors number= new Floors("ThirdFloors",3);
Floors[]floor={name,num,number};
apartment.noOfFloors(floor);
}
}
