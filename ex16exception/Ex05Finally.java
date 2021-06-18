package ex16exception;

/*
 finally절:
 	예외발생과 상관 없이 try문에 진입했을 때 반드시 실행해야 할 코드가 있는 경우 기술하는 불럭
 	즉, try문으로 진입되지 않는다면 finally절은 실행되지 않음
 	
 	1) try~catch: 예외를 직접 처리할 때
 	2) try~catch~finally: 예외를 직접 처리 후 실행할 문장이 있을 때
 	3) try~finally: 예외는 외부로 던지고 예외발생과 상관 없이 실행할 문장이 있을 때
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05Finally {
	
	// 런타임 예외 발생하는 메소드(예외 발생 시 무시하기 위해 예외던지기 함)
	static void runtime() throws NumberFormatException{
		Integer.parseInt("백");
	}
	
	static void tryCatchFinally() {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = Integer.MAX_VALUE;
		try {
			age = scan.nextInt();
			System.out.println("당신은 5년 후 " + (age + 5) + "살입니다.");
			return; // try구문에서 return을 만나도 finally구문은 실행됌
		}
		catch(InputMismatchException e) {
			System.out.println("나이는 숫자만 쓰세요.");
		}
		finally {
			System.out.println("항상 실행되는 finally절입니다.");
			/*
			 try문 안에서 exit(0)이 실행되면 프로그램 자체가 종료되므로
			 finally구문은 실행되지 않음
			 */
			System.exit(0); // 프로그램 자체를 종료하고 싶을 때 사용
		}
	}
	
	public static void main(String[] args) {
		try {
			runtime();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		tryCatchFinally();
		/*
		 finally절에서 exit(0)을 실행하므로 아래 문장은 실행되지 않음
		 */
		System.out.println("메인메소드 끝");
		
	}

}
