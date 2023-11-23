package com;

public class Movie {

	private String name;
	private int tickets;
	private int cost;
	public Movie(String name, int tickets, int cost) {
		super();
		this.name = name;
		this.tickets = tickets;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Name=" + name + ", Tickets=" + tickets + ", Cost=" + cost;
	}
	
	
}
