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

class AgeErrorException2 extends Exception{
	public AgeErrorException2() {
		super("나이 입력이 개잘못됐어요");
	}
}
public class Ex06DeveloperDefine2 {

	public static void main(String[] args) {
		
		System.out.print("나이를 입력하세요: ");
		int age = readAge();
		System.out.println("당신의 나이는 " + age + "입니다.");
			
	}
	public static int readAge() {
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		try {
			inputAge = sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		try {
		// 나이가 음수값이 입력되면 개발자정의 에외객체를 생성한 후 throw
			if(inputAge < 0) {
				AgeErrorException2 ex = new AgeErrorException2();
				throw ex; /* 
					throw하면 반드시 catch해야 함
					그렇지 않으면 프로그램 종료됌
				*/
			}
		}
		catch(AgeErrorException2 e) {
			System.out.println(e.getMessage());
		}
		
		return inputAge;
		
	}

}
