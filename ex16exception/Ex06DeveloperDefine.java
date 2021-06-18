package ex16exception;

/*
 사용자정의 예외클래스:
 	1. Exception클래스를 상속받음
 	2. 생성자에서 예외 발생 시 출력할 메세지를 super()를 통해 입력
 	3. 예외 발생지점에서 if문으로 감지한 후 예외 객체를 생성 및 throw함
 	4. catch문에서 예외객체를 받아서 처리
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeErrorException extends Exception{
	public AgeErrorException() {
		super("나이 입력이 개잘못됐어요");
	}
}
public class Ex06DeveloperDefine {

	public static void main(String[] args) {
		
		System.out.print("나이를 입력하세요: ");
		try {
			/*
		 readAge()에서 예외 발생 후 던지면 main메소드에서 예외를 처리
			 */
			// 나이 입력 시 문자를 입력하는 경우의 예외는 여기서 처리
			int age = readAge();
			System.out.println("당신의 나이는 " + age + "입니다.");
			
		}
		catch(AgeErrorException e) {
			System.out.println("[예외발생]" + e.getMessage());
		}
	}
	
	public static int readAge() throws AgeErrorException{
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		try {
			inputAge = sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		// 나이가 음수값이 입력되면 개발자정의 에외객체를 생성한 후 throw
		if(inputAge < 0) {
			AgeErrorException ex = new AgeErrorException();
			throw ex; /* 
				throw하면 반드시 catch해야 함
				그렇지 않으면 프로그램 종료됌
			*/
		}
		return inputAge;
		
	}

}
