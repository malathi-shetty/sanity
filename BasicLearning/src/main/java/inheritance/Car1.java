package inheritance;

public class Car1 extends Vehicle1{
	
	String color = " ";
	int tyres = 0;
	
	public Car1(int c, int m, String col, int ty) {
		super(c, m);
		
		color  = col;
		tyres = ty;
		
	}
	
	public void show_car_details() {
		System.out.println("I am a car");
		System.out.println("Color of the car is: " + color);
		System.out.println("Number of the car tyre are: " + tyres);
	}

	
	

}
