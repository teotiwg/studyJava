package ex02variable;

public class E05ConstantVar {

	public static void main(String[] args) {
		
		/*
		 상수: 저장된 값이 변치 않는 메모리의 한 종류
		 선언방법 : final 자료형 상수명 = 초기값;
		 - 상수는 딱 한번 만 초기화되고, 중간에 값을 변경하려면 에러 발생
		   상수는 초기화 한 번 하면 변경 불가.
		   상수는 초기화되지 않은 상태에서 출력하면 에러 발생
		 - 선언 시 전체를 대문자로 선언하고, 연결되는 단어가 있는 경우 _(언더바) 사용 
		 - 주로 프로그램에서 코드의 가독성을 높이기 위해 활용
		 */
		
		final double PI = 3.14;
		System.out.println("PI(원주율) = " + PI);
		
		//PI = 3.141592;
		
		final String NICKNAME;
		//System.out.println("우리는 " + NICKNAME);
		NICKNAME = "코스모 82기";
		System.out.println("우리는 "+ NICKNAME);
		
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		int computer, user;
		
		// 1과 3은 개발자 본인만 알 수 있는, 가독성 구린 코드
		
		computer = 1;
		user = 3;
		System.out.println("컴퓨터가 이겼습니다.");
		
		// 누구라도 이해 가능한 직관적이고 가독성 높은 코드가 명시적 코드 
		
		computer = SCISSOR;
		user = PAPER;
		System.out.println("Computer Win");
	}

}
