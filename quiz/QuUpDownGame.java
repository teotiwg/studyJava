package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 게임설명 : 업다운게임을 메소드를 이용해 구현한다.
1) 컴퓨터는 1~100사이의 숫자 하나를 생성한다.
2) 총 시도횟수는 7번을 부여한다.
3) 사용자는 7번의 시도안에 숫자를 맞춰야 한다.
4) 사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
5) 7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
6) 성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.

7) 함수를 사용하여 구현한다?????????????????????????????????? 
8) 무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.?????????????????? 존나 뭔솔

업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
클래스명 : NumberRangeException
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오

 */

class NumberRangeException extends Exception{
	public NumberRangeException() {
		super("1~100 사이의 정수만 입력하세요.");
	}
}
class WrongRestart extends Exception{
	public WrongRestart() {
		super("잘못입력하셨습니다. 꼭 숫자 0(재시작), 1(종료)중에 입력하세요.");		
	}
}

public class QuUpDownGame {

	public static void main(String[] args) {
		
		int com, u, round = 0;
		
		while(true) {
			Random random = new Random();
			com = random.nextInt(100);
			
			do {	
				System.out.print("1~100 사이의 정수를 입력하세요: ");
				//Scanner scan = new Scanner(System.in);
				//u = scan.nextInt();
				u = userInput();
				
				if(u > com) {
					System.out.println("더 작은 수를 입력하세요.");
				}
				else if(u < com) {
					System.out.println("더 큰 수를 입력하세요.");
				}
				else {
					System.out.println("성공입니다.");
					break;
				}
				round++;
			}while(round <= 7);				
			
			if(round > 7) {
				System.out.println("실패하였습니다.");
			}
			
			System.out.println("다시 하겠습니까? ( 예(0) / 아니오(1) )");
			//Scanner sc = new Scanner(System.in);
			//int re = sc.nextInt();
			int re = restartInput();
			
			if(re == 0) {
				continue;
			}
			else {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
			
		}
		
	}
	public static int userInput() {
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		try {
			userInput = sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		try {
			if(userInput < 0 || userInput > 100) {
				NumberRangeException ex = new NumberRangeException();
				throw ex; 
			}
		}
		catch(NumberRangeException e) {
			System.out.println(e.getMessage());
		}
		return userInput;
	}
	public static int restartInput() {
		Scanner sc = new Scanner(System.in);
		int restartInput = sc.nextInt();
		try {
			if(restartInput != 0 && restartInput != 1) {
				WrongRestart ex = new WrongRestart();
				throw ex; 
			}
		}
		catch(WrongRestart e) {
			System.out.println(e.getMessage());
		}
		
		return restartInput;
		
	}
}
