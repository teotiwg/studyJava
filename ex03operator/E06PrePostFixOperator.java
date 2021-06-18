package ex03operator;

public class E06PrePostFixOperator {

	public static void main(String[] args) {
		int num1 = 7;
		int num2, num3;
		
		
		num2 = ++num1;   // num1의 값이 먼저 1 증가하고 num2에 대입
		num3 = --num1;   // num1의 값이 먼저 1 감소하고 num3에 대입
		System.out.println("전위증가/감소시");
		System.out.printf("num1 = %d, num2 = %d, num3 = %d %n%n", num1, num2, num3);
		
		num1 = 7;
		num2 = num1++;   // num1의 값이 먼저 num2에 대입되고 나서 num1값 1 증가
		num3 = num1--;   // num1값이 먼저 num3에 대입되고 num1값 1 감소
		
		System.out.println("후위증가/감소시");
		System.out.printf("num1 = %d, num2 = %d, num3 = %d", num1, num2, num3);
		
	}

}
