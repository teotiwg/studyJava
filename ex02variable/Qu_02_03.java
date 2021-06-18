package ex02variable;

/*
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 면적의 타입을 int, float, double형
세가지로 선언하여 각각 출력해야한다

 */

public class Qu_02_03 {

	public static void main(String[] args) {
		final double PI = 3.14;
		int rr = 10; //반지름
		double area_double = rr * rr * PI;
		int area_int = (int)area_double;
		float area_float = (float)area_double;
		// 큰 자료형을 작은 자료형에 대입할 때는 자료손실이 발생할 수 있으므로
		// 반드시 강제형변환을 하고 대입해야 함

		System.out.println("int형 넓이: " + area_int);
		System.out.println("float형 넓이: " + area_float);
		System.out.println("double형 넓이: " + area_double);
	
	}

}
