package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	public static String getTodayDate() { // getTodayDate is aaj ka date alag se object nai banana padta hai
		return new Date().toString(); // date ko return kar diya
	}
	
	// overloadded method formatting
	
	public static String getTodayDate(String format) { 
		SimpleDateFormat format1 = new SimpleDateFormat(format);
		return format1.format(new Date()); // date ko return kar diya
	}
	
	public static Date getFutureDate(int addDays) {
	//	FutureDateFormat format2 = new FutureDateFormat(addDays);
		return new Date();
	}

}
