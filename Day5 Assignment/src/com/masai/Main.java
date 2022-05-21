package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Ticket person1 = new Ticket();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Ticket Id");
		person1.SetId(input.nextInt());
		System.out.println("Enter Price");
		person1.Setprice(input.nextInt());
		System.out.println("Enter Number of Tickets");
		int clc = person1.calculateTicketCost(input.nextInt());
		if (clc != -1) {
			System.out.println("Total Price " + person1.get());
			System.out.println("Available Ticket After Booking " + person1.getAvailableTickets());
		}else {
			System.out.println("Only "+person1.getAvailableTickets()+" Left");
		}
	}

}
