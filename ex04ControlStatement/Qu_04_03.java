package ex04ControlStatement;

import java.util.Scanner;

/*
 국어, 영어, 수학 점수를 사용자로부터 입력받아서	평균을 구해  
 90점이상 A학점, 
 80점이상 B학점,
	....
 60점미만 F학점을 출력하는 프로그램을 작성하시오.
단 switch문을 사용해야 합니다.(Scanner클래스를 사용하세요)

 */

public class Qu_04_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어: ");
		int kor = scanner.nextInt();
		System.out.print("영어: ");
		int eng = scanner.nextInt();
		System.out.print("수학: ");
		int math = scanner.nextInt();
		
		double avg =(kor + eng + math) / 3.0;
		System.out.println("평균점수: " + (int)avg);
		int result = (int)(avg / 10);//*******
		
		switch(result) {
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default :
			System.out.println("F학점");
		
		}
		
		
		/*
		System.out.print("국어, 영어, 수학 점수를 각각 입력하시오. ");
		Scanner scanner = new Scanner(System.in);
		
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		int avg = (kor + eng + math) / 3;
		int grade;
		System.out.printf("국어 : %d%n영어 : %d%n수학 : %d%n평균 : %d%n", kor, eng, math, avg);
		
		if(avg >= 90) {
			grade = 'A';
		}
		else if(avg >= 80){
			grade = 'B';
		}
		else if(avg >= 70) {
			grade = 'C';
		}
		else if(avg >= 60){
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		switch(grade) {
		case 'A':
			System.out.print("학점 : A");
			break;
		case 'B':
			System.out.print("학점 : B");
			break;
		case 'C':
			System.out.print("학점 : C");
			break;
		case 'D':
			System.out.print("학점 : D");
			break;
		default:
			System.out.print("학점 : F");
			break;
		}
		*/
		
		
	}

}
