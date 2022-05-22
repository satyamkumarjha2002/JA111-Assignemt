package com.masai;

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;
    
	public void setTicketId( int ticketId) {
		this.ticketid=ticketId;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setAvailableTicket(int availableTicket) {
		if(availableTicket<=0) {
			System.out.println("Error");
		}else {
			this.availableTickets=availableTicket;
		}
	}
	public int calculateTicketCost(int nooftickets) {
		if(nooftickets<=availableTickets) {
			availableTickets=availableTickets-nooftickets;
			int totalPrice=nooftickets*this.price;
			return totalPrice;
		}else {
			return -1;
		}
	}
	
	public int getNumberOfTicketAfterBooking() {
		return this.availableTickets;
	}
}
