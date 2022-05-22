package com.masai;

import java.util.Scanner;

public class MainClassOfTicket {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Ticket person1=new Ticket();
		System.out.println("Enter Available TIckets -");
		int at=input.nextInt();
		person1.setAvailableTicket(at);
		if(at>0) {
		System.out.println("Enter TicketId -");
		person1.setTicketId(input.nextInt());
		System.out.println("Enter Price -");
		person1.setPrice(input.nextInt());
		System.out.println("Enter Number Of Ticket -");
		int totalAmount= person1.calculateTicketCost(input.nextInt());
		int AfterBooking=person1.getNumberOfTicketAfterBooking();
	    System.out.println("Total Amount : "+totalAmount);
	    System.out.println("Available ticket after booking : "+AfterBooking);
		}
	}

}
