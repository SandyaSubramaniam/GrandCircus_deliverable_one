package prework;

import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String eventType = "";
		int partySize = 0;
		String result = "";
		String mealSuggestion = "";
		String prepSuggestion = "";

		System.out.println("Please enter an event type from the following choices: casual, semi-formal, formal.");
		eventType = scnr.next();
		System.out.println("Please enter your party size.");
		partySize = scnr.nextInt();

		if (eventType.equalsIgnoreCase("casual")) {
			mealSuggestion = "sandwiches";
		} else if (eventType.equalsIgnoreCase("semi-formal") || eventType.equalsIgnoreCase("semi formal")
				|| eventType.equalsIgnoreCase("semiformal")) {
			mealSuggestion = "fried chicken";
		} else if (eventType.equalsIgnoreCase("formal")) {
			mealSuggestion = "chicken parmesan";
		} else {
			System.out.println("Please enter a valid event type");
			return;
		}

		if (partySize <= 0) {
			System.out.println("Please enter a valid number for party size");
			return;
		} else if (partySize == 1) {
			prepSuggestion = "in the microwave";
		} else if (partySize <= 12) {
			prepSuggestion = "in your kitchen";
		} else {
			prepSuggestion = "by a caterer";
		}

		result = "Since you're hosting a " + eventType + " event for " + partySize + " participants, you should serve "
				+ mealSuggestion + " prepared " + prepSuggestion + ".";

		System.out.println(result);
	}
}
