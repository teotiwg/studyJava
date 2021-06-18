package ex06array;

public class E05TwoDimArray02 {

	public static void main(String[] args) {
		
		// 세로 3, 가로 4 2차원배열
		int[][] arr2Dim = new int[3][4];
		
		// 잘안씀
		// 세로, 가로 크기만큼 반복하면서 초기화 진행
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				arr2Dim[i][j] = i + j;
			}
		}
		
		// 초기화된 데이터 출력
		for(int n = 0; n < arr2Dim.length; n++) { // 배열의 세로 길이
			for(int m = 0; m < arr2Dim[n].length; m++) { // 배열의 가로 길이
				System.out.print(arr2Dim[n][m] + " ");
			}
			System.out.println();
		}
		
		// 2차원 배열 선언.(세로 2, 가로 4)
		int[][] twoArray = new int[2][4];
		// 세로 행 크기만큼 반복
		for(int i = 0; i < twoArray.length; i++) {
			// 가로 열 만큼 반복
			for(int j = 0; j < twoArray[i].length; j++) {
				// 난수 통해 각 요소 초기화
				twoArray[i][j] = (int)(Math.random() * 100);
			}
		}
		
		System.out.println("초기화 후==========================");	
		showArray(twoArray);
		
		twoDimPlus(twoArray, 10); // 10만큼 배열 요소 증가
		
		System.out.println("메소드 호출 후==========================");	
		showArray(twoArray);
	
	}
	
	// 2차원 배열 출력용 메소드
	static void showArray(int[][] arr2) {
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%-3d", arr2[i][j]);
			}
			System.out.println();
		}
	}
	
	// 2차원 배열에 전달된 매개변수만큼 각 요소를 증가시키는 함수
	static void twoDimPlus(int[][] arr2, int plusNum) {
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				// plusNum만큼 증가시킴
				arr2[i][j] += plusNum;
			}
		}
	}

}
