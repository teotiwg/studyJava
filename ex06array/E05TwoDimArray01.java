package ex06array;


public class E05TwoDimArray01 {

	public static void main(String[] args) {
		/*
		 아래와 같이 2차원 배열을 초기화하면 세로 3, 가로 4인 배열 생성
		 초기화할 요소가 없는 부분은 null로 채워짐
		 - null값: 아무것도 없는 값, 빈 값
		   스페이스와 같은 공백문자와는 다르니 주의
		 */
		int[][] arr= {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
		/*
		 2차원 배열에서 "배열명.length"로 출력하면 세로 크기가 반환됌.
		 */
		
		System.out.println("배열의 세로크기: " + arr.length); // 배열이름.length -> 세로 길이
		System.out.println("배열명이 가진 값 출력(arr): " + arr); // 배열의 주소값
		
		/*
		 각 행의 가로 크기는 초기화된 상태에 따라 다음
		 0행은 2, 2행은 4의 크기를 가짐
		 */
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d행의 크기: %d\n", i, arr[i].length); // 배열이름[i].length -> 가로
			System.out.printf("%d행 출력: %d\n", i, arr[i]);
		}
		
		System.out.println("배열 출력하기");
		System.out.println("arr[0][1] = " + arr[0][1]); //정상출력
		System.out.println("arr[0][3] = " + arr[0][3]); //예외발생
		System.out.println("arr[0][3] = " + arr[0][3]); //예외발생
		/*
		 ArrayIndexOutOfBoundsException 예외 발생 -: 배열의 인덱스를 초과했다는 의미
		 */
	}

}
