package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

// 무한루프 내에서 예외 처리 후 생기는 문제 해결방법
public class QuRockPaperScissorsA {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try {
				System.err.println("메뉴 입력");
				int in = scan.nextInt();
				if(in == 9) break;
			}
			catch(InputMismatchException e) {
				e.printStackTrace();
				System.out.println("게임 중 예외발생");
				scan.nextLine();
			}
			System.out.println("계속");
		}
		System.out.println("끝");
		
	}

}
