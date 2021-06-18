package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {
	
	static void arithmetic(int a, int b) {
		if(a >= 0 && b >= 0) {
		System.out.println("덧셈결과 -> " + (a + b));
		System.out.println("뺄셈결과 -> " + (a - b));
		System.out.println("곱셈결과-> " + (a * b));
		System.out.println("나눗셈결과(몫)  -> " + (a / b));
		System.out.println("나눗셈결과(나머지) -> " + (a % b));
		}
		else {
			System.out.println("양수를 입력하세요.");
		}
	}

	public static void main(String[] args) {
		System.out.println("양수 2개를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		
		arithmetic(i, j);
	}

}
