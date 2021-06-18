package ex05method;

public class E02MethodType01 {
	
	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세요===");
		System.out.println("1. 열기 / 2. 계속하기 / 3. 종료");
		System.out.println("==================");
	}
	
	static void noParamNoReturn2() {
		// 경우에 따라 메소드는 실행부가 없을 수도 있음.
	}
	static void noParamNoReturn2(int a) {
		// 동일한 이름의 메소드가 정의됐으나
		// 매개변수의 갯수로 구분 가능하니 다른 함수임
	}
	// ---> 메소드 오버로딩
	
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[Return문 이전]");
		
		//return;
		// 위처럼 리턴문을 쓰면 함수는 즉시 종료되므로 아래문장은 쓰레기코드가 됌
		// 고로 중간에 쓰일 거면 반드시 조건문과 쓰여야 함
		// 단 마지막에는 홀로 쓰일 수 있음
		
		if(returnValue % 2 == 0) {
			System.out.println(returnValue + "는 짝수: ");
			return;
		}
		
		System.out.println(returnValue + "는 홀수");
		System.out.println("[return문 이후]");
	}

	public static void main(String[] args) {
		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
	}

}
