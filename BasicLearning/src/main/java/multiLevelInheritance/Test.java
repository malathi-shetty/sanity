package multiLevelInheritance;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String my_name=scan.next();
		
		System.out.println("Enter age");
		int my_age = scan.nextInt();
		
		System.out.println("Enter Gender");
		String my_gender = scan.next();
		
		
		GrandChild obj = new GrandChild("Anne", 25, "Female");
		
		obj.show_age();
		obj.show_gender();
		obj.show_name();

	}

}
