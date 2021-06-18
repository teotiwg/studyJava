package ex04ControlStatement;

public class Qu_04_07 {

	public static void main(String[] args) {
		int i, total = 0 ; 
		
		for(i = 1; i <= 100; i++) {
			if(i % 3 == 0 || i % 7 == 0) {
				if(i % 21 != 0) {
					System.out.print(i);
					total += i;
				if(i < 99) {
					System.out.print("+");
					}
				}
			}
		}
		System.out.print(" = " + total);
	}

}
