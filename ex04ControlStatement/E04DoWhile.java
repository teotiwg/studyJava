package ex04ControlStatement;

/*
 do~while문:
 	반드시 한 번은 무조건 실행해야 할 경우 사용 -> 조건 검사 없이 무조건 한 번은 실행
 	형식)
 		반복을 위한 변수;
 		do{
 			실행문장;
 			반복문을 탈출하기 위한 증감식;
 		} while(조건식);  <- 문장 끝에는 반드시 새미콜론이 있어야 함.
 		
 */


import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile {

	public static void main(String[] args) throws IOException {
		
		// E03 예제의 수열문제를 do~while로
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println("1~10까지의 누적합: " + sum);
		
		/////////////////////////////
		int total = 0;
		int j = 1;
		do {
			if(j % 4 == 0 || j % 7 == 0) {
				System.out.println("j = " + j);
				total += j;
			}
			j++;
		}while(j <= 1000);
		System.out.println("1~1000 사이의 4나 7읠 배수 합: " + total);
		
		///////////////////////
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		
		do {
			System.out.print("국어 점수: ");
			kor = scanner.nextInt();
			System.out.print("영어 점수: ");
			eng = scanner.nextInt();
			System.out.print("수학 점수: ");
			math = scanner.nextInt();
			avg = (kor + eng + math) / (3 * 10);
			
			// switch문은 if문과 같은 조건식을 사용할 수 없고 산술식만 사용할 수 있으므로
			// 점수의 구간을 구하기 위해 총점을 30으로 나눠줌	
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점"); break;
			case 8:
				System.out.println("B학점"); break;
			case 7:
				System.out.println("C학점"); break;
			case 6:
				System.out.println("D학점"); break;
			default:
				System.out.println("F학점"); break;
			}
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무 키나 입력하세요.");
			exitCode = System.in.read();
		}while(!(exitCode == 'x' || exitCode == 'X'));
		
		/*
		 X를 입력한 경우:
		 	:(false or true) -> !(true) -> false 변환
		 	do~while문 탈출
		 
		 a를 입력한 경우:
		 	: (false or false) -> !(false) -> true 변환
		 	do~while문 계속 반복
		 */
	}

}
