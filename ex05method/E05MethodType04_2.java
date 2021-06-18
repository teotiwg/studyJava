package ex05method;

import java.util.Scanner;

public class E05MethodType04_2 {

	public static void main(String[] args) {
		int maxVal1 = returnMaxNum(4);
		System.out.println("최대값1: " + maxVal1);
		
		int maxVal2 = returnMaxNum(6);
		System.out.println("최대값2: "+ maxVal2);
		
	}
	
	static int returnMaxNum(int numberCnt) {
		Scanner scanner = new Scanner(System.in);
		
		int maxVal = 0;
		
		// 매개변수만큼 반복하여 입력받음
		for(int i = 1; i <= numberCnt; i++) {
			System.out.print("정수를 입력하세요. ");
			int inputNum = scanner.nextInt();
			
			if(i == 1) {
				// 입력받은 값 중 첫번째를 기준으로 설정
				maxVal = inputNum;
			}
			else {
				// 두번째 입력값부터 maxVal과 비교
				if(maxVal < inputNum) {
					maxVal = inputNum;
				}
			}// maxVal이 더 크면 
		}
		return maxVal;
	}

}
