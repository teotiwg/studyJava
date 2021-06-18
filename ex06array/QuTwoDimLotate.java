package ex06array;

public class QuTwoDimLotate {

	public static void main(String[] args) {
		int[][] changeArr = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};	
		
		switchArr(changeArr, 0);
	}
	
	static void switchArr(int[][] arr, int a) {
		int[] temp = new int[3];
		int[] temp2 = new int[3];
		
		temp = arr[a];
		temp2 = arr[a + 2];
		arr[a + 2] = arr[a + 1];
		arr[a + 1] = temp;
		arr[a] = temp2;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/*
	static void switchArr(int[][] arr) {
		int[] temp = new int[3];
		int[] temp2 = new int[3];
		
		temp = arr[0];
		temp2 = arr[2];
		arr[2] = arr[1];
		arr[1] = temp;
		arr[0] = temp2;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	*/

}
