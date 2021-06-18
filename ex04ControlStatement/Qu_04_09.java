package ex04ControlStatement;

public class Qu_04_09 {

	public static void main(String[] args) {
		int dan, su;
		
		for( su = 1; su <= 9; su++ ) {
			for(dan = 2; dan <= 9; dan++) {
				System.out.print(dan + " * " + su + " = " + (dan*su)+ "  ");	
			}
			System.out.println("");
		}

	}

}
