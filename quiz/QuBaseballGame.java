package quiz;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/*
게임설명 : 야구게임을 메소드를 이용하여 구현한다.

중복되지 않는 3개의 정수를 생성한다.(1~9)
사용자는 3개의 숫자를 입력한다.

생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
3 strike 가 되면 게임은 종료된다.
시도한 횟수를 표시한다.
계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들을 배열을 이용하여 구현해본다.
   int com1, com2, com3; -> int[] com = new int[3];
   int user1, user2, user3; -> int[] user = new int[3]; 
3개의 난수를 생성하는 부분과 스트라이크, 볼을 판정하는 부분은 배열을 이용한 로직으로 변경해야 한다.

*/

public class QuBaseballGame {
	
	public static void main(String[] args) {
		
		HashSet<Integer> c = new HashSet<Integer>();
		Random random = new Random();
		int[] com = new int[3];
		int[] user = new int[3];
		
		int i = 0, j;
		
		while(i < 3) {
			int temp = random.nextInt(9) + 1;
			c.add(temp);
			if(c.contains(temp)) {
				com[i] = temp;
				i++;
			}
		}
		
		while(true) {
			int round = 1;
			
			while(i < 4) {
				System.out.println("중복되지 않는 양수 3개를 입력하세요: ");
				Scanner scan = new Scanner(System.in);
				for(j = 0; j < 3; j++) {
					user[j] = scan.nextInt();
				}
				System.out.print(round + "회 입력한 양수 3개는 ");
				for(j = 0; j < 3; j++) {
					System.out.print(user[j] + " ");
				}
				System.out.println("입니다.");
				int strike = 0, ball = 0, out = 0;
				
				for(i = 0; i < 3; i++) {
						if(user[i] == com[i]) {
							strike++;
							System.out.println((i+1) + "번 자리 " + strike + " 스트라이크!");
						}
						else if(user[i] == com[0]) {
							System.out.println((i+1) + "번 자리 " + ball + " 볼!");
						}
						else if(user[i] == com[1]) {
							System.out.println((i+1) + "번 자리 " + ball + " 볼!");
						}
						else if(user[i] == com[2]) {
							System.out.println((i+1) + "번 자리 " + ball + " 볼!");
						}
						else{
							System.out.println((i+1) + "번 자리 " + out +" 아웃!");
						}
					}
				System.out.println(round + "회 종료");
				round++;
				if(strike == 3)
					break;
				}	
					System.out.println("한 경기 더 하시겠습니까? 예(0) / 아니오(1)");
					Scanner sc = new Scanner(System.in);
					int answer = sc.nextInt();
					if(answer == 0) {
						continue;
					}
					else if(answer == 1) {
						System.out.println("이번 경기는 총 " + (round - 1) + "라운드 진행했습니다.");
						System.out.println("게임을 종료합니다.");
						System.exit(0);
					}
					else
						System.out.println("이번 경기는 총 " + (round - 1) + "라운드 진행했습니다.");
						System.out.println("게임을 종료합니다.");
						System.exit(0);
			}
		
	}	
}

