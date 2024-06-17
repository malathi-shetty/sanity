package inheritance;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter cost of the vehicle");
		int vehicle_cost = scan.nextInt();
		
		System.out.println("Enter mileage of vehicle");
		int vehicle_mileage = scan.nextInt();
		
		System.out.println("Enter color of car");
		String car_color = scan.next();
		
		System.out.println("Enter Number of tyres in Car");
		int car_tyres = scan.nextInt();

		Car1 obj = new Car1(vehicle_cost, vehicle_mileage, car_color, car_tyres);
		obj.show_car_details();
		obj.show_vehicle_details();

	}

}
