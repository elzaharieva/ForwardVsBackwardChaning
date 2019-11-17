package fmi.kre.hom1.TravelAgency;

import java.util.Scanner;

public class UserInterface {
	private static Scanner scan = new Scanner(System.in);
	
	public static Continent whereTo() {
		Continent continent = null;
		while(continent == null) {
			System.out.println("Which continent do you want to visit? We currently have trips to Africa, Europe, Asia, South America and North America.");
				String answer = scan.nextLine();
				//OMG I AM ACTUALLY WRITING SWITCH STATEMENT
				 switch (answer.toLowerCase()) {
		         case "africa":
		             continent = Continent.AFRICA;
		             break;
		         case "asia":
		        	 continent = Continent.ASIA;
		             break;
		         case "europe":
		        	 continent = Continent.EUROPE;
		             break;
		         case "south america":
		        	 continent = Continent.SOUTH_AMERICA;
		             break;
		         case "north america":
		        	 continent = Continent.NORTH_AMERICA;
		             break;
		         default:
		             System.out.println("Invalid input: " + answer);
		     }
		}
		return continent;
	}
	
	public static Transportation travelBy() {
		Transportation transportation = null;
		while(transportation == null) {
			System.out.println("How do you prefer to travel? By bus or by plane?");
				String answer = scan.nextLine();
				//OMG I AM ACTUALLY WRITING SWITCH STATEMENT
				 switch (answer.toLowerCase()) {
		         case "plane":
		             transportation = Transportation.PLANE;
		             break;
		         case "bus":
		        	 transportation = Transportation.BUS;
		             break;
		         default:
		             System.out.println("Invalid input: " + answer);
		     }
		}
		return transportation;
	}

	public static Duration travelFor() {
		Duration duration = null;
		while(duration == null) {
			System.out.println("How much time do you have? We currently have excursions for a week or for a month.");
				String answer = scan.nextLine();
				//OMG I AM ACTUALLY WRITING SWITCH STATEMENT
				 switch (answer.toLowerCase()) {
		         case "week":
		             duration = Duration.WEEK;
		             break;
		         case "month":
		        	 duration = Duration.MONTH;
		             break;
		         default:
		             System.out.println("Invalid input: " + answer);
		     }
		}
		return duration;
	}
	
	public static Interest interestedIn() {
		Interest interest = null;
		while(interest == null) {
			System.out.println("What are you most interested in - history, nature, urbanism?");
				String answer = scan.nextLine();
				//OMG I AM ACTUALLY WRITING SWITCH STATEMENT
				 switch (answer.toLowerCase()) {
		         case "history":
		        	 interest = Interest.HISTORY;
		             break;
		         case "urbanism":
		        	 interest = Interest.URBANISM;
		             break;
		         case "nature":
		        	 interest = Interest.NATURE;
		             break;
		         default:
		             System.out.println("Invalid input: " + answer);
		     }
		}
		return interest;
	}
}
