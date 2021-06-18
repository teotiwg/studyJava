package ex05method;

// 메소드의 규칙:
// - JAVA에서는 main메소드는 무조건 public static void로 선언하기로 약속 
// - static으로 선언된 메소드는 static으로 선언된 메소드만 호출 가능
// - 메소드 호출 후 반환값은 항상 호출한 위치로 반환.이 때 메소드는 메모리에서 소멸
// - 반환값이 없는 void형 메소드도 실행이 완료되면 호출한 위치로 실행의 흐름이 돌아옴
// 

import java.util.Scanner;

public class E01MethodBasic {
	
	// 메소드 정의1 : 반환형O, 매개변수O 형태로 정의
	//	-> 두 개의 정수를 전달받아 합의 결과를 반환
	
	public static int simpleFunc(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	// 메소드 정의2 : 반환형X, 매개변수X 형태로정의
	//	-> 전달되는 값 없이 이름을 입력한 후 namePrint()메소드를 호출. 반환값이 없는 경우엔 void 명시 필수
	
	public static void menuPrint() {
		System.out.println("이름이 무엇인가요?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine(); 
		
		namePrint(name);
	}
	
	// 메소드 정의3 : 반환형X, 매개변수O 형태로 정의
	//	-> 반환값이 없는 경우 실행이 종료되면 호출됐던 지점으로 다시 돌아감
	
	public static void namePrint(String n) {
		System.out.println("제 이름은 " + n + "입니다.");
	}

	public static void main(String[] args) { 
		// 메소드를 호출할 땐 함수의 원형을 그대로 기술하면 됌
		// 매개변수가 있다면 갯수만큼 포함시켜주면 된다.
		// 매개변수의 갯수가 다르면 호출되지 않고 에러 발생
		// 또한 매개변수의 타입이 맞지 않아도 에러 발생
		
		int result = simpleFunc(1, 2); // result = 3
		System.out.println("1과 2를 전달한 결과: " + result);
		System.out.println("10과 20을 전달한 결과: " + simpleFunc(10,20));
		
		menuPrint();
	}

}
