package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookMyShowImpl implements BookMyShow {

	Scanner sc = new Scanner(System.in);

	Map<Integer, Movie> db = new LinkedHashMap<Integer, Movie>();

	int totalCost = 0;

	@Override
	public void addMovie() {
		db.put(1, new Movie("KGF 2", 250, 550));
		db.put(2, new Movie("Kantara", 25, 550));
		db.put(3, new Movie("Bahubali 2", 20, 450));
		db.put(4, new Movie("Games Of Thrown", 15, 650));
	}

	@Override
	public void displayMovie() {

		Set<Integer> keys = db.keySet();

		for (int key : keys) {
			Movie m = db.get(key);
			System.out.println("Enter " + key + " to Book Ticket for " + m.getName());
			System.out.println("Available TIckets: " + m.getTickets());
			System.out.println("Cost: Rs." + m.getCost());
			System.out.println("-----------------------------------");
		}
	}

	@Override
	public void bookMovie() {
		System.out.println("Enter Choice: ");
		int choice = sc.nextInt();

		Movie movie = db.get(choice);

		if (movie != null) {
			System.out.println("Selected Movie is " + movie.getName());
			System.out.println("Enter Number of Tickets:");
			int ticket = sc.nextInt();

			if (ticket <= movie.getTickets()) {
				System.out.println("Tickets Available");

				// Calculating Current Ticket Cost
				int currentCost = ticket * movie.getCost();

				// Updating New Tickets Available
				movie.setTickets(movie.getTickets() - ticket);

				// Adding Current Cost to Total Cost
				totalCost += currentCost;
				
				System.out.println("Booking Successful");
				System.out.println("*****************");
				System.out.println("Movie Name: "+movie.getName());
				System.out.println("No of Tickets Booked: "+ticket);
				System.out.println("Movie Ticket Cost: "+currentCost);
				System.out.println("Movie Ticket Total Cost: "+totalCost);

				System.out.println("*****************");

			} else {
				System.out.println("Tickets Not Available");
			}
		} else {
			System.out.println("Invaluid choice");
		}

	}

	@Override
	public void checkout() {

		System.out.println("Total Tickets Cost: Rs." + totalCost);
	}

}
