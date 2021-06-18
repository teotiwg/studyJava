package ex02variable;

public class E04StringType {

	public static void main(String[] args) {
		
		// String 타입 :  기본자료형이 아닌 참조형 변수/
		// 문자열을 저장 가능한 자료형으로 실제론 클래스임
		// 자바에서는 문자열을 표현할 땐 ""로 감싸고, 연결 시엔 + 기호를 사용.
		
		
		int number;
		number = 99;
		
		//int stringNum1 = 100; //(int)"100";
		//String stringNum2= "100"; // (String)100;
		
		// 참조형 변수와 기본 자료형 변수 사이에선 형변환이 불가능
		// 서로 사용하는 메모리 공간이 다르기 때문
		// - 기본자료형 -> 스택 사용
		// - 참조형(클래스)변수 -> 힙 사용
		
		// 문자열 + 정수 -> 문자열
		// 문자역에 정수가 연결된 형태로 출력
		
		String strNum = "100";
		System.out.println(strNum + number);
		
		// String은 클래스이므로 new 키워드를 이용해서 인스턴스(객체)를 생성한 후 문자열 참조
		
		String newStr = new String("new 키워드 사용");
		System.out.println(newStr);
		
		// 문자열 + 문자열 => 문자열(연결된)
		
		String strBasic = "클래스지만";
		String plusStr = "기본자료형처럼 사용";
		System.out.println(strBasic + " " + plusStr);
		
		// 문자열 + 숫자 -> 우선순위가 없다면 일반적으로 문자열로 출력
		// 단, 산술연산의 결과를 출력하고 싶다면 아래로 같이 소괄호로 묶어서 우선순위에 변화를 줄 
		
		int kor = 100, eng = 99, math = 98;
		System.out.println("총점: " + kor + eng + math);
		System.out.println("총점: " +(kor + eng + math));
	}

}
