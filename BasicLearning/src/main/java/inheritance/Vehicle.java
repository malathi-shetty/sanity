package inheritance;

public class Vehicle { // parent
	
	int cost = 234; // // attribute
	int mileage = 35;
	
	public void show_vehicle_details() { 
		System.out.println("I am a vehicle");
		System.out.println("Cost of the vehicle is " + cost);
		System.out.println("Mileage of the vehicle is " + mileage);
	}

}
