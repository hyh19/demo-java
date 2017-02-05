package v1ch04;

import java.text.DateFormatSymbols;
import java.util.*;


/**
 * 4-1
 * @author Yuhui Huang
 */
public class CalendarTestX {

	public static void main(String[] args) {
		
		GregorianCalendar d = new GregorianCalendar();
		System.out.println("object: " + d);
		System.out.println("day of month: " + d.get(Calendar.DAY_OF_MONTH));
		System.out.println("month: " + d.get(Calendar.MONTH));
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("day of month: " + d.get(Calendar.DAY_OF_MONTH));
		System.out.println("first day of week: " + d.getFirstDayOfWeek());
		
		d.add(Calendar.DAY_OF_MONTH, 2);
		System.out.println("day of month: " + d.get(Calendar.DAY_OF_MONTH));
		
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		for (String string : weekdayNames) {
			System.out.print(string + " ");
		}
	}

}
