package ex03operator;

public class E05ShortCircuitEvaluation {

	public static void main(String[] args) {
		
		// SCE(Short Circiut Evaluation):
		//   하나의 조건검사만으로 결과를 알 수 있는 경우, 자바 컴파일러는 뒤 조건을 수행 않고 건너뜀
		// 이 경우, 변수의 값이 변경되는 코드가 있다면 실행되지 않으니 주의 필요
		
		int num1 = 0, num2 = 0;
		boolean result;
		
		// 논리and(&&)의 경우,둘 중 하나만 false면 false를 반환하므로
		// 첫 조건이 false면 두번째 조건을 실행(검사) 않음
		
		result = (num1 += 10) < 0 && (num2 += 10) > 0;
		System.out.println("result = "+ result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		// 논리or(||)의 경우 둘 중 하나만 true여도 true를 반환하므로
		// 첫 조건이 true면 두번째 문장은 실행 않음
		
		result = (num1 += 10) > 0 || (num2 += 10) > 0;
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		// num2는 초기값이 0을 유지
		// 만일 num2의 값이 프로그램에 영향을 미치게 된다면, 이 부분을 주의해야함.
	}

}
