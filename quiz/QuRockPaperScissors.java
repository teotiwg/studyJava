package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
1) 난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
2) 사용자가 가위(1),바위(2),보(3) 중 하나를 낸다. 
3) 승부를 판단하여 출력한다.
//////////4) 1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다. 
5) 숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
6) 게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0) 
//////////7) 0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.  

가위바위보 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오
숫자대신 문자를 입력할 경우 발생되는 예외를 처리하시오. (가위바위보 입력시, 재시작여부 입력시)
게임과 관련없는 숫자를 입력했을때 사용자정의 예외클래스를 통해 처리하시오.
예외처리 클래스명 : WrongNumberException
 */

class WrongNumberException extends Exception{
	public WrongNumberException() {
		super("가위바위보 할줄 모르세요? 제대로 내세요^^;");
	}
}

class WrongRestart extends Exception{
	public WrongRestart() {
		super("잘못입력하셨습니다. 꼭 숫자 0(재시작), 1(종료)중에 입력하세요");		
	}
}

public class QuRockPaperScissors {
	
	public static void main(String[] args) {
		
		int c, u, round = 0;
		
			while(true) {
				Random random = new Random();
				c = random.nextInt(3);
				
				System.out.print("가위(1), 바위(2), 보(3) 중 하나를 내세요: ");
				//Scanner scan = new Scanner(System.in); /////
				//u = scan.nextInt(); /////
				u = userInput(); /////
				
				if(u == 1) {
					if( c == 1)
						System.out.println("사용자: 가위 / 컴퓨터: 가위 => 비겼습니다.");
					else if( c == 2 )
						System.out.println("사용자: 가위 / 컴퓨터: 바위 => 컴퓨터가 이겼습니다.");
					else
						System.out.println("사용자: 가위 / 컴퓨터: 보 => 사용자가 이겼습니다.");
				}
				else if(u == 2) {
					if( c == 1)
						System.out.println("사용자: 바위 / 컴퓨터: 가위 => 사용자가 이겼습니다.");
					else if( c == 2 )
						System.out.println("사용자: 바위 / 컴퓨터: 바위 => 비겼습니다.");
					else
						System.out.println("사용자: 바위 / 컴퓨터: 보 => 컴퓨터가 이겼습니다.");	
				}
				else {
					if( c == 1)
						System.out.println("사용자: 보 / 컴퓨터: 가위 => 컴퓨터가 이겼습니다.");
					else if( c == 2 )
						System.out.println("사용자: 보 / 컴퓨터: 바위 => 사용자가 이겼습니다.");
					else
						System.out.println("사용자: 보 / 컴퓨터: 보 => 비겼습니다.");	
				}
				round++;
				if(round % 5 == 0) {
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
			if(userInput < 0 || userInput > 3) {
				WrongNumberException ex = new WrongNumberException();
				throw ex; 
			}
		}
		catch(WrongNumberException e) {
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
