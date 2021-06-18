package ex05method;

import java.util.Scanner;

//원의 반지름을 파라메타로 전달하면 
//원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의
//이를 호출하는 main 메소드를 정의

public class QuCircleCalculator {
	
	// 반환형이 잆으면 return기입은 필수
	
	static double circleArea(double rad) {
		//final double PI = 3.14;
		//System.out.printf("원의 넓이(%f) : " + (PI * r * r), r);
		double result = 3.14 * rad * rad;
		
		return result;
	}
	
	static double circleRound(double rad) {
		//final double PI = 3.14;
		//System.out.printf("\n원의 둘레(%f) : " + (2 * PI * r), r);
		
		return 2 * 3.14 * rad;
	}

	public static void main(String[] args) {
		System.out.println("원의 반지름을 입력하세요. :");
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		
		System.out.println("원의 넓이: " + circleArea(r));
		System.out.println("원의 둘레: " + circleRound(r));
		
		//circleArea(r);
		//circleRound(r);
	}

}
