package ex06array;

public class QuTwoDimLotateA {
	
	public static void main(String[] args) {
		//int[][] arr = new int[3][3];
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		arrPrint(arr);
		
		// 행 이동 후 출력1
		rotateArray(arr);
		arrPrint(arr);		
		// 행 이동 후 출력2
		rotateArray(arr);
		arrPrint(arr);		
		// 행 이동 후 출력3
		rotateArray(arr);
		arrPrint(arr);		
	}
	
	static void rotateArray(int[][] arrParam) {
		int[] lastRow = arrParam[arrParam.length - 1];
		
		for(int row = arrParam.length - 1; row > 0; row--) {
			arrParam[row] = arrParam[row - 1];
		}
		
		arrParam[0] = lastRow;
	}
	
	static void arrPrint(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
