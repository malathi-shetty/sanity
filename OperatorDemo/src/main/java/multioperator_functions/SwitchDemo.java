package multioperator_functions;

public class SwitchDemo {
	public static void main (String[] args){
		String dayName = "MON";
		int dayNumber = -1;
		
		switch (dayName) {
		case "Monday":
		case "Mon":
		case "MON":
		case "MONDAY":
			dayNumber = 1;
			break;
		case "Tuesday":
			dayNumber = 2;
			break;
		case "Wednesday":
			dayNumber = 3;
			break;
		default:	
			dayNumber = -2;
			
			

		}
		System.out.println(dayName +":" +" " + dayNumber  );
	}

}
