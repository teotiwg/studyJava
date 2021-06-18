package ex16exception;

import java.io.IOException;
/*
 예외처리방법3:
 	예외가 발생한 위치에선 처리 않고 외부로 던짐
 	대신 함수를 호출한 지점에서 예외객체를 받은 후 처리
 	이때 예외발생과 상관없이 finally절은 실행
 */

public class Ex03ExceptionCase3 {
	
	static void compileFunc() throws IOException {
		try {
			System.out.println("하나의 문자를 입력하세요: ");
			int userChar = System.in.read();
			System.out.println("입력된 문자는: " + (char)userChar);
			int result = 10 / 0; /*
				해당 문장이 실행되면 ArithmeticException 발생
				따라서 main의 try문에선 해당 예외 처리 불가
				실행이 중간에 멈추게 됌
				이 경우 여러 개의 catch절 필요
			*/
		}
		finally {
			System.out.println("예외가 발생하든 말든 항상 실행");
		}
	}
	
	public static void main(String[] args) {
		try {
			compileFunc();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("===THE END===");	
	}
	
}
