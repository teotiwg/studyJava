package ex03operator;

public class E02BokhapOperator {

	public static void main(String[] args) {
		
		// 복합대입연산자는 문법구조상 항상 현재 타입을 유지하는 특성 지님
		
		double e = 3.1;
		e += 2.1; 
		e *= 2;
		e = e + e;
		System.out.println("e의 결과값 : " + e);
		
		int n = 5;
		// n = n * 2.7; 
		// 연산 결과는 double인데, 좌측항은 int이므로 대입 불가능
		n = (int)(n * 2.7); // 명시적 형변환 후 int형 변수에 대입 
		n *= 2.7; 
		//정상실행. 복합대입연산자의 기존 자료형을 그대로 유지하는 특성 보유
		// 따라서 결과는 정수 35, 소수 이하는 자동으로 버려짐
		System.out.println("n의 결과값:" + n);
	}

}
