package ex15usefulclass;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class E05LocalDateTimeO {

	public static void main(String[] args) {
		
		Instant start = Instant.now();
		
		LocalDate nowDate = LocalDate.now();
		System.out.println("오늘날짜: " + nowDate);
		
		LocalDate ofDate = LocalDate.of(2012, 4, 3);
		System.out.println("생년월일: " + ofDate);
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println("지금 이순간: " + nowDateTime);
		
		LocalDateTime ofDateTime = LocalDateTime.of(2012, 4, 3, 4, 58, 32);
		System.out.println("생년월일과 시간: " + ofDateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm;ss.SSS");
		String dateStr = LocalDate.now().atStartOfDay().format(formatter);
		System.out.println("금일자정: " + dateStr);
		
		LocalDateTime tomorrow = nowDateTime.plusDays(1);
		System.out.println("내일: " + tomorrow);
		
		LocalDateTime day3Later = LocalDateTime.now().plusDays(3).with(LocalTime.NOON);
		System.out.println("3일 후 12시: " + day3Later);
		
		System.out.println("2시간 10분 후");
		nowDateTime.plusHours(2).plusMinutes(10);
	}

}
