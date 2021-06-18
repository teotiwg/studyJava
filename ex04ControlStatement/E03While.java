package ex04ControlStatement;

public class E03While {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 10) {
			sum += 1;
			i++;
		}
		System.out.println("1~10까지의 합은: " + sum);
		
		int dan = 2;
		while(dan <= 9){
			int su = 1;
			while(su <= 9) {
				//System.out.printf("%-2d * %-2d = %2d", dan, su, (dan*su));
				System.out.print(dan + "*" + su + "=" + (dan*su));
				System.out.print(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
		
		System.out.println("\n=============================================\n");
		
		/*
		 시나리오) 1부터 100까지의 정수 중 3이나 4의 배수인 수의 합을 구하는 프로그램을 while문으로 작성
		 */
		
		int j = 1, total = 0;
		
		while(j <= 100) {
			
			if(j % 3 == 0 || j % 4 == 0) {
				//total = total + j;
				total += j; //복합대입연산자로 더 간단히 표현
			}
			
			j++;
		}
		System.out.println("1~100에서의 3이나 4의 배수의 합: " + total);
		
		System.out.println("\n============================================\n");
		/*
		시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오
			출력결과
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		int m = 1;
		while(m <=4) { //행으로 4번 반복
			
			int n = 1;
			while(n <= 4) { // 열을 4번 반복
				// 행과 열의 번호가 동일할 때 1 출력
				if(m==n)
					System.out.print("1 ");
				else
					System.out.print("0 ");
				n++;
			}
			System.out.println(); // 한 행을 출력한 후에 줄바꿈 처리
			m++;
		}
		

	}

}
