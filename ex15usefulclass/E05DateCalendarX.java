package ex15usefulclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E05DateCalendarX {
	
	static Date date;
	
	static String myDateFormat(Calendar cal) {
		date = cal.getTime();
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println("현재날짜: " + myDateFormat(cal));
		
		cal.add(Calendar.DATE, 1);
		System.out.println("내일날짜: " + myDateFormat(cal));
		
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.MONDAY, 1);
		System.out.println("월요일에 하룰 더해? 뭐지?: " + myDateFormat(cal2));
		
		System.out.println("JANUARY는 1월인데..: " + Calendar.JANUARY);
		System.out.println("DECEMBER가 11월이었나?: " + Calendar.DECEMBER);
	}

}
