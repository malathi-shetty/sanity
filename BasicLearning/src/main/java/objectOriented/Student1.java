package objectOriented;

import java.util.Scanner;

public class Student1 {
	
	Scanner scan = new Scanner(System.in);
	
	String name ="";
	int marks = 0;
	
	public void get_details() {
		System.out.println("Enter Your Name: ");
		name = scan.nextLine();
		
		System.out.println("Enter Your Marks: ");
		marks = scan.nextInt();
	}
	
	public void show_details() {
		System.out.println("Name of the Student is: " + name);
		System.out.println("Marks obtained by the student are: " + marks);
	}

}
