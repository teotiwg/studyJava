package ex06array;

public class E06ArrayInit {

	public static void main(String[] args) {
		
		/*
		 1차원, 2차원 배열은 크기가 지정된 경우엔 전체요소가 0으로 초기화됌
		 */
		
		int[] arr = new int[3];
		System.out.println("arr[0] = " + arr[0]);
		
		int[][] arr2 = new int[3][4];
		System.out.println("arr2[0][0] = " + arr2[0][0]);
		
		/*
		 1차원 배열의 경우 요소의 갯수에 의해 전체 크기가 결정됌
		 2차원 배열도 마찬가지이나 다른 점은 가장 큰 요소의 갯수에 의해 크기가 결정되므로
		 빈 공간 발생 가능
		 이 때 빈 공간은 0으로 채울 수 없고, null값으로 채워짐
		 */
		// 배열 선언과 동시에 초기화
		int[] arrDim = {1, 2, 3};
		System.out.println("arrdim[0] = " + arrDim[0]);
		
		int[][] arr2Dim = {
				{1},
				{2,3}
		};
		System.out.println("arr2dim[0][0] = " + arr2Dim[0][0]);
		System.out.println("arr2dim[0][1] = " + arr2Dim[0][1]);
		// 해당 인덱스느 null값이므로 출력 불가능
		// 에러 발생
	}

}
