package com.xworkz.ticket.external;

import com.xworkz.ticket.internal.Ticket;

public class TicketRunner {
    public static void main(String[] args) {
        Ticket tickets=new Ticket();
        tickets.checkAge(60);
        tickets.checkAge(30);
//        tickets.checkName("Sushma");
        tickets.checkName("naik");
//          tickets.checkTicket(20);
        tickets.checkTicket(10);
//          tickets.seatBook(150);
        tickets.seatBook(90);
//          tickets.seatCancel("Arun");
        tickets.seatCancel("MMM");
    }
}
