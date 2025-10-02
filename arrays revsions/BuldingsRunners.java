class BuldingsRunners{
public static void main(String args[]){
Buldings buliding = new Buldings();
Room[] roomsFloar1={ new Room("Fan","light","bed","mirior","mike")};
Room[] roomsFloar2={ new Room("cot","bedLamp","botte","coboard","jug")};
Room[] roomsFloar3={ new Room("chair","coomb","doar","casmeticsbox","dress")};
Room[] roomsFloar4={ new Room("ac","airdryer","table","book","cutter")};
Room[] roomsFloar5={ new Room("darsingtable","pens","Frames","wires","shelp")};
Room[] roomsFloar6={ new Room("phote","clock","fridge","lamp","bulb")};
Room[] roomsFloar7={ new Room("palte","stiker","pins","walpaper","frutirs")};
Room[] roomsFloar8={ new Room("spoones","sofa","ring","showpese","spect")};
Room[] roomsFloar9={ new Room("gas","fooditeam","fridge","switches","camara")};
Room[] roomsFloar10={ new Room("gold","clipborad","laptop","phone","keys")};

Floor firstFloor = new Floor ("SSG",101,roomsFloar1);
Floor secondFloor = new Floor ("DDg",102,roomsFloar2);
Floor thirdFloor = new Floor ("FFg",103,roomsFloar3);
Floor forthFloor = new Floor ("tSG",104,roomsFloar4);
Floor fivithFloor = new Floor ("tcv",105,roomsFloar5);
Floor sixthFloor = new Floor ("RRg",106,roomsFloar6);
Floor seventhFloor = new Floor ("SST",107,roomsFloar7);
Floor eigthFloor = new Floor ("SRT",108,roomsFloar8);
Floor ninthFloor = new Floor ("ASG",109,roomsFloar9);
Floor tenthFloor = new Floor ("SSG",110,roomsFloar10);

Floor []floors={firstFloor,secondFloor,thirdFloor,forthFloor,fivithFloor,sixthFloor,
                 seventhFloor,eigthFloor,ninthFloor,tenthFloor};
				 
				  buliding.displayBuliding(floors);
}
}
