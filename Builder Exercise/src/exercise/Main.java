package exercise;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles", false).price(50).build();
		
		FlightLeg leg1 = new FlightLeg.FlightLegBuilder("Wroclaw", "Gdansk", true).price(10).build();
		
		FlightLeg leg2 = new FlightLeg.FlightLegBuilder("New York", "Warsaw", false).price(1000).build();
	    
		
		ArrayList <FlightLeg>flight  = new ArrayList<FlightLeg>();
		
		flight.add(leg); 
		flight.add(leg1); 
		flight.add(leg2);
		
		for(FlightLeg f: flight ) {
			System.out.println(f);
		}
	}

}
