package com.xworkz.bulding.external;

import com.xworkz.bulding.internal.Bulding;
import com.xworkz.bulding.internal.Floor;
import com.xworkz.bulding.internal.Rooms;

public class BuldingRunner {
    public static void main(String[] args) {
        Bulding bulding = new Bulding();
        Rooms[] roomsFloors1 = {new Rooms("Fan", "Light", "lamp", "bed")};
        Rooms[] roomsFloors2 = {new Rooms("cot", "Ac", "Bottel", "Pen")};
        Rooms[] roomsFloors3 = {new Rooms("Cup", "vase", "flower", "table")};
        Rooms[] roomsFloors4 = {new Rooms("book", "bedspread", "phote", "charger")};
        Rooms[] roomsFloors5 = {new Rooms("phone", "Laptop", "tab", "textbook")};
        Rooms[] roomsFloors6 = {new Rooms("window", "water", "fruties", "knief")};
        Rooms[] roomsFloors7 = {new Rooms("frame", "dress", "dore", "box")};
        Rooms[] roomsFloors8 = {new Rooms("Fan", "remote", "tv", "wires")};
        Rooms[] roomsFloors9 = {new Rooms("bulb", "coile", "switchs", "keysbunches")};
        Rooms[] roomsFloors10 = {new Rooms("doll", "heater", "socks", "keys")};

        Floor firstFloor = new Floor("rama", 1, 'A', roomsFloors1);
        Floor secondFloor = new Floor("ravana", 2, 'B', roomsFloors2);
        Floor thirdFloor = new Floor("sitha", 3, 'A', roomsFloors3);
        Floor fourthFloor = new Floor("shivaji", 4, 'A', roomsFloors4);
        Floor fifthFloor = new Floor("ganaga", 5, 'B', roomsFloors5);
        Floor sixthFloor = new Floor("thunga", 6, 'C', roomsFloors6);
        Floor seventhFloor = new Floor("yamuna", 7, 'B', roomsFloors7);
        Floor eightFloor = new Floor("kaviere", 8, 'A', roomsFloors8);
        Floor ninethFloor = new Floor("sagara", 9, 'B', roomsFloors9);
        Floor tenthFloor = new Floor("rama", 10, 'A', roomsFloors10);

        Floor[] floors = {firstFloor, secondFloor, thirdFloor, fourthFloor, fifthFloor, sixthFloor, seventhFloor, eightFloor, ninethFloor, tenthFloor};
        bulding.displayBuldings(floors);

    }
}


















