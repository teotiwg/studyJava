package ex05method;

import java.util.Scanner;

/*
 * 연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입
력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메소드명 : inputGugudan(int sNum, int eNum)


 */

public class E04MethodType03_2 {

	static void inputGugudan(int sNum, int eNum) {
		
		for(int dan = sNum; dan <= eNum; dan++) {
			for(int su = 1; su <=9; su++) {
				System.out.print(dan + " + " + su + " = " + (dan*su));
			}
			System.out.println("");
		}
		
		//Scanner scanner = new Scanner(System.in);
		//int sNum = scanner.nextInt();
		//int eNum = scanner.nextInt();
		
		/*
		int no1 = sNum;
		int no2 = eNum;
		int i ;
		
		for( int no1 ; no1 <= no2; no1++) {
			for(i = 1; i <= 9; i++) {
				System.out.print(no1 + " * " + i + " = " + (no1*i));
				}
		}*/
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작 단을 입력하세요.: ");
		int startNum = scanner.nextInt();
		System.out.print("끝단을 입력하세요.: ");
		int endNum = scanner.nextInt();
		inputGugudan(startNum, endNum);
		
		
		/*Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int e = scanner.nextInt();*/
	}

}
