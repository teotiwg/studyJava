package ex16exception;

import java.io.IOException;
/*
 예외처리방법1:
 	예외가 발생된 함수에서 호출됐던 지점으로 예외를 던지고,
 	메인함수에서도 프로그램 외부로 예외를 던짐
 	즉, 예외를 내부에서 처리 않고 무시하겠단 의미.
 	외부자원 사용 시 기본적으로 발생되는 예외는 이처럼 무시하는 게 가능
 */

public class Ex03ExceptionCase1 {
	
	static void complieFunc() throws IOException{
		System.out.println("하나의 문자를 입력하세요: ");
		int userChar = System.in.read();
		System.out.println("입력한 문자는: " + (char)userChar);
		
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
