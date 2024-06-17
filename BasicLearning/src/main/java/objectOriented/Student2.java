package objectOriented;

public class Student2 {
	
	String s_name="";
	int s_marks =0;
	
	public Student2(String name, int marks) {
		s_name = name;
		s_marks = marks;
	}
	
	public void show_details() {
		System.out.println("Name of the student is: " + s_name);
		System.out.println("Marks of the student are: " + s_marks);
	}

}
