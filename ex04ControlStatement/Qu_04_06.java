package ex04ControlStatement;

public class Qu_04_06 {

	public static void main(String[] args) {
		int m = 1;
		while(m <= 6) { //행으로 4번 반복
			
			int n = 1;
			while(n <= 6) { // 열을 4번 반복
				// 행과 열의 번호가 동일할 때 1 출력
				if(m <= n )
					System.out.print("");
				else
					System.out.print("*");
				n++;
			}
			System.out.println(); // 
			m++;
		}
	}

}
