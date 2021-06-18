package ex06array;

public class UpgradeGuGu {

	public static void main(String[] args) {
		int dan, result = 0;

		for(dan = 2; dan < 10; dan++) {
			System.out.println(dan + " x 1 = " + dan);
			
			for(int su = 2; su < 10; su++) {
				result = (int)Math.pow(dan, su);
				System.out.print(dan);
				
				int i = 1;
				while( i < su) {
					System.out.printf(" x %d", dan);
					i++;					
				}				
				System.out.println( " = " + result);
			}
			System.out.println();
		}
	}

}
