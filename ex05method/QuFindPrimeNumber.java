package ex05method;

// 전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true/false를 반환하는 메소드
// 이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드

public class QuFindPrimeNumber {
	
	/*
	static void isPrimeNum(int num) {
		if(num % 2 != 0){
			if(num % 3!= 0){
				if(num % 5 !=0)
					System.out.println(num);;
			}
		}
	}*/
	
	public static boolean isPrimeNum(int num) {
		
		if(num == 1) {
			return false;
		}
		else {
			for(int i = 2; i<= num - 1; i++) {
				if( num % i == 0)
					return false;
			}
		}
		// 위 조건을 통과하면 소수이므로 true반환
		return true;
		
	}

	public static void main(String[] args) {
		
		for( int i = 1; i <= 100; i++) {
			if(isPrimeNum(i) == true) {
				System.out.println("소수 : " + i);
				
			}
		}
		
		/*
		System.out.println(2);
		System.out.println(3);
		System.out.println(5);
		
		for(int i = 2; i <= 100; i++) {
			isPrimeNum(i);
		}*/
	}

}
