package multioperator_functions;

public class SwitchDemo2 {

	public static void main(String[] args) {
		int dayNumber = 8;
		String dayName = "";
		String dayName1  ="";
		// equality
		switch (dayNumber) {
		case 1:
		case 8:
			dayName = "Monday";
			dayName1 = "Sunday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "wed";
			break;
		case 4:
			dayName = "thu";
			break;
		case 5:
			dayName = "fri";
			break;
		case 6:
			dayName = "sat";
			break;
		case 7:
			dayName = "sun";
			break;
		default:
			dayName = "No-match";
			break;
		}
		System.out.println(dayName);
		System.out.println(dayName1);

	}

}
