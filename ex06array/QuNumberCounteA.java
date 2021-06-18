package ex06array;

public class QuNumberCounteA {

	public static void main(String[] args) {
		int[] answer = {1,4,4,5,1,5,5,2,1,3,2};
		int[] counter = new int[4]; // 배열은 정수는 0으로 초기화됌 실수는 0.0
		
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == 1) counter[0]++; /////
			else if(answer[i] == 2) counter[1]++; /////
			else if(answer[i] == 3) counter[2]++; /////
			else if(answer[i] == 4) counter[3]++; /////
		}
		
		for(int i = 0; i < counter.length; i++) {
			System.out.printf("counter[%d] (%d)의 갯수: %d\n", i, i + 1, counter[i]);
		}
		
	}

}
