package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {
		
		// 자동형변환 : 작은 상자의 데이터를 큰 상자에 대입할 때 자동으로 형변환 발생.
		
		byte b1 = 65;
		short s1;
		s1 = b1;
		System.out.printf("b1은 %d, s1은 %d%n", b1, s1);
		
		// 자동형변환은 아니고
		// CPU가 int보다 작은 자료형을 int로 간주하고 연산 및 진행하고 결과로 int로 반환(CPU의 특성)
		int num1 = b1 + s1;
		System.out.println("num1은 " + num1);
		
		// char형에 byte형을 바로 대입 불가능(둘 성질이 다르므로 명시적 형변환 후 대입해야 함)
		
		//char ch1 = b1; -> 에러 발생
		char ch2= (char)b1;
		System.out.println("b1 = " + b1 + ", ch2 = " + ch2);
		
		// 명시적 형변환 : 큰 상자의 자료를 작은 상자의 자료형에 할당해야 할 때 사용.
		// 단, 자료의 손실이 있을 수 있으므로 필요한 경우에만 사용해야 함.
		
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.printf("데이터 미손실: b2 = %d, s2 = %d\n", b2, s2);
		
		// 소수 아래 부분이 버려지므로 데이터 손실 발생.
		// 따라서 특수한 경우가 아니라면 사용에 주의 필요.
		int num3;
		double dl=3.14;
		num3 = (int)dl;
		System.out.printf("데이터 손실: num3 = %d, dl = %.2f %n", num3, dl);
		// 서식문자 사용시 %.2f => 정수부는 모두 표현하고, 소수 이하 2자리까지만 표현하겠다는 의미 
		
		// char 와 int 를 연산하면 결과는 int형이므로 char형 변수에 결과를 대입하려면
		// 반드시 명시적 형변환 후 진행 필요
		
		char ch3 = 'A', ch4;
		int num4 = 2;
		
		//ch4 = ch3 + num4;
		ch4 = (char)(ch3 + num4);
		System.out.println("ch4 = " + ch4);
	}

}
