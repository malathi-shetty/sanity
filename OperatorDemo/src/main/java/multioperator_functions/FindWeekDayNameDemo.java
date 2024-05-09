package multioperator_functions;

public class FindWeekDayNameDemo {

	public static void main(String[] args) {
		// Monday = 1,
		// Tuesday = 2
		// Wednesday = 3
		
		String dayName = "Sunday";
		int dayNumber = -1;
		if(dayName.equals("Monday")) {
			dayNumber = 1;
		}else if(dayName.equals("Tuesday")) {
			dayNumber = 2;
		}else if(dayName.equals("Wednesday")) {
			dayNumber = 3;
		}else if(dayName.equals("Thursday")) {
			dayNumber = 4;
		}else if(dayName.equals("Friday")) {
			dayNumber = 5;
		}else if(dayName.equals("Saturday")) {
			dayNumber = 6;
		}else if(dayName.equals("Sunday")) {
			dayNumber = 7;
		}
		System.out.println(dayName + " - " + dayNumber);
	}

}
