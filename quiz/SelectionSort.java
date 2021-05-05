package homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/*
 선택정렬은 전체요소 중에서 최소값을 찾아 첫번째 자리와 교환
 1회전을 수행하면 최소값이 맨 앞에 오게되므로 
 첫번째 자료를 제외한 나머지 자료에서 다시 최소값을 찾아 두번째 자리와 교환 
 이 과정을 반복한다. 
 자료가 N개라면 교환은 (N-1)번 이루어진다.

 1. 1~100 사이의 중복되지 않는 정수 10개의 난수를 생성한다. 
 2. 생성한 난수는 크기 10인 배열에 저장한다. 
 3. 위 그림을 참조하여 선택정렬로 오름차순 정렬한다. 
 4. 정렬한 결과를 출력한다. 
 5. 단 정렬되는 과정을 모두 출력해야 한다. 
 */

public class SelectionSort {
	
	public static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Random random = new Random();
		HashSet<Integer> nSet = new HashSet<Integer>();
		int[] arr = new int[10];
		int temp, n = 0;
		
		System.out.println("난수 생성: ");
		while(n < 10){
			int nansu = random.nextInt(100);
			if(!nSet.contains(nansu)) {
				nSet.add(nansu);
				arr[n] = nansu;
				System.out.print(nansu + " ");
				n++;				
			}	
		}
		System.out.println();
		
		int[] arr2 = arr.clone();
		Arrays.sort(arr2);
		System.out.println("정렬된 배열:");
		printArr(arr2);
		
		System.out.println("선택정렬 시작:");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == arr2[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print((i+1) + "회) ");
			printArr(arr);
		}
	}

}
