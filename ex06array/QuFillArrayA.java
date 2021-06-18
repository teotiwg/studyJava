package ex06array;

import java.util.Scanner;

public class QuFillArrayA {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 =  new int[10];
		
		int indexStart = 0;
		int indexEnd = arr2.length - 1; // 배열의 크기는 length로 표현하는 것이 젤 편리
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < arr2.length; i++) {
			
			System.out.print("채울 숫자를 입력하세요");
			int inputNum = scanner.nextInt();
			
			arr1[1] = inputNum;
			
			if(inputNum % 2 == 1) {
				arr2[indexStart++] = inputNum;
			}
			else {
				arr2[indexEnd--] = inputNum;
			}
		}
		System.out.println("첫번째 출력");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
		
		System.out.println("두번째 출력");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i] + " ");
		}
	}

}
