package _01_PracticeConcept;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class _28_date_and_time {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis()/  1000  /  60    /  60    /  24   / 365);
				//					   millisecond	/ second / minute /  hour  /  day  /  year 
		
		
		
	Date d=new Date();
	System.out.println(d);
	System.out.println(System.currentTimeMillis());
	System.out.println(Long.MAX_VALUE);
	
	
	System.out.println(d.getTime());
	System.out.println(d.getYear());
	System.out.println(d.hashCode());
	d.setDate(23);
	System.out.println(d);
	
	Calendar c= Calendar.getInstance();
	//calender class
	System.out.println();
	
	System.out.println(c.get(Calendar.YEAR));
	System.out.println(c.get(Calendar.MONTH));
	System.out.println(c.getCalendarType());
	
	LocalDateTime dt=LocalDateTime.now();
	System.out.println(dt);
	System.out.println(dt);
	System.out.println(dt);
	
	DateTimeFormatter df=DateTimeFormatter.ISO_LOCAL_DATE;
	System.out.println(dt.format(df));
	
	
		
		
		
		
		
		
		
		

	}

}
