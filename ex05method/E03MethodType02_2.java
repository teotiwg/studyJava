package ex05method;

import java.util.Scanner;

public class E03MethodType02_2 {
	
	static String getHakjum() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = scanner.nextInt();
		System.out.print("영어점수 : ");
		int eng = scanner.nextInt();
		System.out.print("수학점수 : ");
		int math = scanner.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		String hakjum = "";
		
		int result = (int)avg / 10;
		switch(result) {
		case 10: case 9:
			hakjum = "A학점"; break;
		case 8:
			hakjum = "B학점"; break;
		case 7:
			hakjum = "C학점"; break;
		case 6:
			hakjum = "D학점"; break;
		default: 
			hakjum = "F학점";
		}
		return hakjum;
	}

	public static void main(String[] args) {
		System.out.println("학점은 " + getHakjum() + "입니다.");
		String h = getHakjum();
		System.out.printf("당신의 학점은 %s입니다.", h);
	}

}
