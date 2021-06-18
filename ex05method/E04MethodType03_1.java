package ex05method;

import java.util.Scanner;

public class E04MethodType03_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작값: ");
		int s = scanner.nextInt();
		System.out.print("종료값: ");
		int e = scanner.nextInt();
		yesParamNoReturn(s, e);
		
	}
	
	static void yesParamNoReturn(int startNum, int endNum) {
		int sum = 0;
		for(int i = startNum; i <= endNum; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d까지의 합은 : %d", startNum, endNum, sum);
	}

}
