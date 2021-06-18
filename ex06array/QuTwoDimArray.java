package ex06array;

public class QuTwoDimArray {
	
	public static void addOneArr(int[] arr, int add)
	{
		for(int i = 0; i < arr.length; i++){
			arr[i] += add;
		}
	}
	
	public static void addTwoArr(int[][] arr, int add)
	{
		for(int j = 0; j < arr.length; j++) {
			addOneArr(arr[j], add);
		}
	}
		
	public static void main(String[] args) {
		
				int[][] arr = {
					{1, 2, 3, 4},
					{5, 6, 7},
					{8, 9}
				};
				
				arrPrint(arr);		
				
				addTwoArr(arr, 2);
				
				arrPrint(arr);
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
	


