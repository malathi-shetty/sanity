package objectOriented;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String my_name = scan.nextLine();
		
		System.out.println("Enter your marks: ");
		int my_marks = scan.nextInt();
		
		
		Student2 obj = new Student2(my_name, my_marks);
		obj.show_details();
		

	}

}
