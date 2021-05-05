package homework;

import java.util.HashSet;
import java.util.Random;

/*
 Bubble Sort는 인접한 두 수를 비교하여 큰 수를 뒤로 보내는 간단한 정렬 알고리즘
 첫번째 자료와 두번째 자료를, 두번째 자료와 세번째 자료를...순차적으로 비교하여 교환  
 1회전을 수행하면 가장 큰수가 맨 뒤로 이동하므로 맨끝의 수는 제외하고 다시 처음부터 비교
 다른 정렬 알고리즘에 비해 속도가 상당히 느린 편이지만, 코드가 단순하므로 자주 사용
 원소의 이동이 거품이 수면으로 올라오는 듯한 모습을 보이기 때문에 Bubble Sort라는 이름을 가지게 되었다

 1. 중복되지 않는 난수 10개(1~99)를 생성하여 크기가 10인 배열에 담는다.
 2. 오름차순으로 버블정렬한다.(1, 2, 3 …… 10)
 3. 버블정렬이란 모든 배열요소를 순차적으로 비교하여 스왑(교환)하는 알고리즘이다.
 4. 단, 정렬되는 과정을 모두 출력해야 한다.
 5. 위 그림은 버블정렬을 이용하여 오름차순으로 정렬하는 과정이다.
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		Random random = new Random();
		HashSet<Integer> nSet = new HashSet<Integer>();
		int[] bArr = new int[10];
		int temp;
		
		int n = 0;
		while(n < 10) {
			int nansu = random.nextInt(99) + 1;
			if(!nSet.contains(nansu)) {
				nSet.add(nansu);
				//System.out.println(nansu);
				bArr[n] = nansu;
				n++;
			}
		}
		for(int h = 0; h < bArr.length; h++) {
			for(int i = 0; i < bArr.length-1; i++) {
				if(bArr[i] > bArr[i+1]) {
					temp = bArr[i+1];
					bArr[i+1] = bArr[i];
					bArr[i] = temp;
				}
				for(int j = 0; j < 10; j++) {
					System.out.print(bArr[j] + " ");
				}
				System.out.println();
			}	
		}
	}

}
