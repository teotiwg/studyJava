package ex04ControlStatement;

import java.io.IOException;

public class E01If01 {

	public static void main(String[] args)throws IOException { 
		int num = 10;
		
		// 아래 식은 조건식이 아닌 산술식이므로 에러 발생
		//if(num%2) {
		//	System.out.println("잘못된 조건식입니다.");
		//}
		//if(num) {
		//	System.out.println("이것도 잘못된 조건식입니다.");
		//}
		
		if(num % 2 == 0) {
			System.out.printf("%d는 짝수입니다.", num);
		}
		if(num % 2 == 0 && num >= 10) {
			System.out.printf("%n%d는 짝수이고, 10보다 크거나 같다. %n", num);
		}
		
		// 경우에 따라서 무조건 실행되는 조건문도 필요
		if(true) {
			System.out.println("무조건 실행되는 if문입니다.");
		}
		
		if(num % 2 != 0) {
			System.out.printf("%d는 홀수입니다.", num);
		}
		
		// 조건문의 실행문장이 하나일 땐 중괄호 생략 가능
		if( num % 2 == 0) {
			System.out.println("\n" + num + "은 짝수입니다.");
		}
		if( num % 2 != 0) {
			System.out.println("num은 " + num + "입니다.");
			System.out.println(num + "은 홀수입니다.");
		}
		
		//System.out.print("하나의 문자를 입력하세요.");
		//int asciiCode = System.in.read();
		//System.out.println("입력한 문자: " + asciiCode);
		//System.out.println("입력한 문자: " + (char)asciiCode);
		
		
		/*
		 *숫자의 구간을 정할 때는 반드시 논리AND를 사용
		아스키값을 알고 있을 때 구현방법
		0 -> 48
		9 -> 57 이므로 해당 구간 안에 있다면 숫자로 판단 가능
		 */
		
		System.out.print("하나의 문자를 입력하세요.");
		int asciiCode = System.in.read();
		if(asciiCode >= 48 && asciiCode <= 57) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		
		// 아스키코드를 모를 때 구현방법
		boolean isNumber = (asciiCode >= '0' && asciiCode <= '9');
		if(isNumber == true) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		
	}

}
