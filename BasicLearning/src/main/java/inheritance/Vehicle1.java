package inheritance;

public class Vehicle1 {
	
	int cost = 0;
	int mileage =0;
	
	public Vehicle1(int c, int m) {
		cost = c;
		mileage = m;
	}
	
	public void show_vehicle_details() {
		System.out.println("I am a Vehicle");
		System.out.println("Cost of Vehicle is: " + cost);
		System.out.println("Mileage of Vehicle is: " + mileage);
	}

}
