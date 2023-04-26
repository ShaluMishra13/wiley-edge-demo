package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate myDate=LocalDate.now();
		System.out.println(myDate);
		
		LocalTime myTime=LocalTime.now();
		System.out.println(myTime);
		
		LocalDateTime myDateTime=LocalDateTime.now();
		System.out.println("before formating:"+myDateTime);
		
		DateTimeFormatter myDateFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String modDT= myDateTime.format(myDateFormat);
		System.out.println("after formatting:"+modDT);
		
		DateTimeFormatter myDateFormat1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String modDT1= myDateTime.format(myDateFormat1);
		System.out.println("after formatting:"+modDT1);
		
		DateTimeFormatter myDateFormat2=DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		String modDT2= myDateTime.format(myDateFormat2);
		System.out.println("after formatting:"+modDT2);
		
		DateTimeFormatter myDateFormat3=DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		String modDT3= myDateTime.format(myDateFormat3);
		System.out.println("after formatting:"+modDT3);
		
		
		
		

	}

}
