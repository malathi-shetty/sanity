package inheritance;

public class Car extends Vehicle { // child class
	
	String color = "blue";
	int tyres = 4;
	
	public void show_car_details() {
		System.out.println("I am a Car");
		System.out.println("Color of car is: " + color);
		System.out.println("Number of tyres in Car: " + tyres);
	}

}
