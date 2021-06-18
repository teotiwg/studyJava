package ex01start;

import java.util.Date;
import java.text.SimpleDateFormat;

public class E01JavaStruct {

	public static void main(String[] args) {
		Date toDayOfDate = new Date();
		System.out.println("오늘 날짜: " + toDayOfDate);
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String toDayString = simple.format(toDayOfDate);
		System.out.println("변형된 날짜: " + toDayString);

	}

}
