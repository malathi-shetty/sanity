package multioperator_functions;

public class IFELSE_FindWeekDyName2 {

	public static void main(String[] args) {
		// day number , provide day name
		
		int dayNumber = 2;
		String dayName = "";
		if(dayNumber ==  1) {
			dayName = "Monday";
		}else if(dayNumber ==  2) {
			dayName = "Tuesday";
		}else if(dayNumber ==  3) {
			dayName = "wed";
		}else if(dayNumber ==  2) {
			dayName = "thu";
		}else if(dayNumber ==  5) {
			dayName = "fri";
		}else if(dayNumber ==  6) {
			dayName = "sat";
		}else if(dayNumber ==  7) {
			dayName = "sun";
		}
		System.out.println(dayName);
		
//		The code checks the value of dayNumber against each possible day number using if and else if statements.
//		If dayNumber matches a specific day number, the corresponding dayName is assigned to the variable dayName.
//		Note that there is a redundant condition where dayNumber is checked against 2 twice. 
//		This second condition for 2 (Thursday) is unnecessary because it will never be executed due to the earlier 
//		else if condition that assigns "Tuesday" to dayName when dayNumber is 2.
//		After evaluating the conditions, the day name stored in dayName is printed to the console.
//		In this specific case, since dayNumber is 2, the variable dayName will be assigned the value "Tuesday", 
//		and the output of the code will be: Tuesday

	}

}
