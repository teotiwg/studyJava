package ex06array;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class QuArray1To10A {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("배열 전체 요소의 합: " + sum);
	}

}
