package ex06array;

import java.util.Scanner;

/*
 홀수/짝수 구분하여 배열채우기
 
(첫번째 배열) 
길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장

(두번째 배열)
순서대로 저장된 숫자들을 
홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다

 */

public class QuFillArray {

	public static void main(String[] args) {
		int[] numArr1= new int[10];
		int[] numArr2 = new int[10];
		
		// 배열1에 정수 입력 
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 정수를 입력하세요: ");
			Scanner scanner = new Scanner(System.in);
			numArr1[i] = scanner.nextInt();
			//System.out.println(numArr1[i]);
		}
		
		// 배열1 출력
		for(int i = 0; i < 10; i++) {
			System.out.print(numArr1[i] + " ");
		}
		System.out.println();
		
		// 배열2에 홀/짝 나눠 넣기ㅗㅗㅗ
		for(int i = 0; i < 10; i++) {
			if(numArr1[i] % 2 == 1) {
				if(numArr2[i] == 0) {
					numArr2[i] = numArr1[i];
				}
				else {
					numArr2[i++] = numArr1[i];
				}
			}
			else {
				if(numArr2[9 - i] == 0) {
					numArr2[9 - i] = numArr1[i];
				}
				else
					numArr2[ 9- ( i + 1 )] = numArr1[i];
			}
		}
		
		// 배열2 출력
		for(int j = 0; j < 10; j++) {
			System.out.print(numArr2[j] + " ");
		}
	}

}
