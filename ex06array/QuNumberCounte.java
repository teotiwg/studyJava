package ex06array;

/*
 다음에 주어진 answer 배열에는 1~4까지의 정수가 여러 개 저장되어 있다. 
 배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

 */

public class QuNumberCounte {

	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		int a0 = 0, a1 = 0, a2 = 0, a3 = 0; 
		
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] ==1) {
				a0++;
				counter[0] = a0;
			}
			else if(answer[i] == 2) {
				a1++;
				counter[1] = a1;
			}
			else if(answer[i] == 3) {
				a2++;
				counter[2] = a2;
			}
			else {
				a3++;
				counter[3] = a3;
			}
		}
			System.out.println("counter[0] =>" + counter[0]);
			System.out.println("counter[1] =>" + counter[1]);
			System.out.println("counter[2] =>" + counter[2]);
			System.out.println("counter[3] =>" + counter[3]);
		}


}
