package com.masai;

public class Ticket {
	private int ticketid;
	private int price;
	private int total_price;
	private static int available_tickets = 1000;

	public int get() {
		return total_price;
	}
    public int getAvailableTickets() {
    	return this.available_tickets;
    }
	public void Setprice(int pric) {
		this.price = pric;
	}

	public void SetId(int Id) {
		this.ticketid = Id;
	}

	public int calculateTicketCost(int nooftickets) {
		int check = available_tickets - nooftickets;
		if (available_tickets > 0 && check > 0) {
			total_price = price * nooftickets;
			available_tickets = check;
			return price;
		}
		return -1;
	}
}
