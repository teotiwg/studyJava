package ex16exception;

/*
 예외처리를 할 때 필요에 따라 여러 개의 catch블록 사용 가능
 이 경우 반드시 자식 예외클래스부터 catch블록을 사용해야 함
 Exception클래스는 모든 예외를 catch하기 때문에 반드시 마지막 블록 사용해야 함
 특정 클래스의 상속구조를 보고 싶을 땐 선택 후 ctrl + t 로 확인 가능
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04MultiCatch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[3];
		
		try {
			for(int i = 0; i < array.length; i++) {
				System.out.println("array[" + i + "]에 저장할 숫자 입력: ");
				array[i] = Integer.parseInt(scanner.nextLine());
			}
			System.out.println("배열에 저장된 두 숫자 나누기: " + array[0]/array[1]);
			System.out.println("나이를 입력하세요: ");
			int age = scanner.nextInt();
			System.out.println("당신의 나이는: " + age);
			
			array[3] = age; // 배열의 인덱스 초과
		}
		catch(InputMismatchException e) {
			System.out.println("숫자로만 입력해야 합니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("산술연산이 불가능합니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자 형태의 문자만 입력 가능합니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 초과했습니다.");
		}
		catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("========끝========");
	}

}
