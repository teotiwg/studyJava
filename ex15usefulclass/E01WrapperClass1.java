package ex15usefulclass;

/*
 Wrapper 클래스: 
 기본자료형의 데이터를 인스턴스화 할 때 사용하는 클래스
-오토박싱: 기본자료셩이 자동으로 객체화되는 것
-오토언박싱: 객체가 자동으로 기본자료형으로 변경되는 것
(JDK1.5이상에서 지원)
 */

public class E01WrapperClass1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println("result = " + result);
		
		/*
		 기본자료형을 박싱 처리한 객체에 대한 산술연산으로
		 언박싱하기 위해 intValue()와 같은 메소드를 통해 값을 꺼내옴
		 */
		Integer n10Obj = new Integer(10);
		Integer n20Obj = new Integer(num2);
		int result2 = n10Obj.intValue() + n20Obj.intValue();
		System.out.println("result2 = " + result2);
		
		Integer resultObj = new Integer(result2);
		System.out.println("결과값을 byte형 값으로 변경: " + resultObj.byteValue());
		System.out.println("결과값을 이진수로 변경: " + Integer.toBinaryString(result2));
		
		Integer numObj1 = 100; // 오토박싱
		Integer numObj2 = 200;
		int num3 = numObj1; // 오토언박싱
		int result3 =  numObj1 - numObj2;
		System.out.println("오토언박싱 이후 연산결과: " + result3);
		
		/*
		 Wrapper클래스 사용의 이점:
 		Wrapper클래스에 정의된 많은 메소드들 사용 가능
 		int형의 최대, 최소값 혹은 진법 변환 등의 기능 보유
		 */
		System.out.println("int형 최대값: " + Integer.MAX_VALUE);
		System.out.println("int형 최소값: " + Integer.MIN_VALUE);
		System.out.println("10을 2진수로: " + Integer.toBinaryString(10));
		System.out.println("10을 8진수로: " + Integer.toOctalString(10));
		System.out.println("10을 16진수로: " + Integer.toHexString(10));
		
		/*
		 자바의 모든 클래스는 Object클래스를 상속받음
			그러므로 아래의 메소드 사용 가능

		toString(): 인스턴스 변수 출력시 참조값이 아니라 실제 저장된 값을 문자열 형태로 반환
		hashCode(): 객체를 구별하기 위해 참조값을 고유한 정수값으로 반환

		 */
		Integer numObj = new Integer(99);
		System.out.println("numObj = " + numObj);
		System.out.println("numObj.toString() = " + numObj.toString());
		System.out.println("numObj.hashCode = " + numObj.hashCode());
		System.out.println(numObj + 1);
		System.out.println(numObj.toString() + 1);
		
	}

}
