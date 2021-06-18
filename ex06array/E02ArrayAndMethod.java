package ex06array;

public class E02ArrayAndMethod {

	public static void main(String[] args) {

		// 배열을 선언과 동시에 초기화 요소의 갯수에 의해 크기 결정됌
		int[] arr = {1, 2, 3, 4, 5};
		int[] ref;
			System.out.println("초기화 직후 출력");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " "); // 1, 2, 3, 4, 5 출력
		}
		System.out.println();
		
		/*
		 배열명을 매개변수로 전달하는 것은 배열의 참조값(주소값)을 전달하는 것
		 정수의 경우는 해당 값이 그대로 전달됌
		 */
		ref = addAllArr(arr, 7);
		
		/*
		 addAllArr() 메소드에서 반환하는값은 처음에 전달했던 배열의 주소값이므로,
		 결과적으로 ref도 동일한 배열을 참조
		 */
		
		// arr과 ref는 동일한 참조값을 가지게 됐으므로 출력결과는 동일함
		System.out.println("arr = " + arr);
		System.out.println("ref = " + ref);
		
		System.out.println("메소드 호출 후 출력");
		for(int i = 0; i < ref.length; i++) {
			System.out.print(ref[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	/*
	 매개변수로 전달된 참조값을 ar이 받게되므로 결국 동일한 배열을 참조하게 됌
	 즉, main() 메소드에서 생성한 배열과 동일한 배열이 됌 
	 */
	
	static  int[] addAllArr(int[] ar, int addVal) {
		for(int i = 0; i < ar.length; i++) {
			/*
			 배열의 각 요소값에 7을 더한 후 결과값을 다시 저장
			 즉 7씩 증가시키는 연산이 수행됌
			 */
			ar[i] += addVal;
		}
		return ar;
	}

}
