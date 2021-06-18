package ex06array;

import java.util.Scanner;

public class QuSungJuk {

	public static void main(String[] args) {
		System.out.print("학생 수를 입력하세요 :");
		Scanner scanner = new Scanner(System.in);
		int students = scanner.nextInt();
		System.out.println("학생 수: " + students);
		
		int[][] grades = new int[students][5];
		for(int sn = 0; sn < students; sn++) {
			System.out.printf("[%d번째 학생의 점수 입력]%n", (sn + 1));
			
			System.out.printf("국어점수 입력: ");
			grades[sn][0] = scanner.nextInt();
			System.out.printf("영어점수 입력: ");
			grades[sn][1] = scanner.nextInt();
			System.out.printf("수학점수 입력: ");
			grades[sn][2] = scanner.nextInt();
			grades[sn][3] = (grades[sn][0] + grades[sn][1] + grades[sn][2]); //총점
			grades[sn][4] = (int)(grades[sn][3] / 3); //평균
			
		}
		System.out.println("========================================");
		System.out.println(" 번호 / 국어 / 영어 / 수학 / 총점 / 평균점수");
		System.out.println("========================================");
		
		for(int p = 0; p < students; p++) {
			System.out.println((p + 1) + " " + grades[p][0] + " " + grades[p][1] + " " + grades[p][2] + " " + grades[p][3] + " " + grades[p][4]);
		}
		
		System.out.println("========================================");
	}


}
