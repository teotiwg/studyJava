package ex03operator;

public class E07BitOperator {

	public static void main(String[] args) {
		int num1 = 5; // 00000000 00000000 00000000 00000101
		int num2 = 3; // 00000000 00000000 00000000 00000011
		int num3 = -1; // 11111111 11111111 11111111 11111111
		 	           // 00000000 00000000 00000000 00000001
		System.out.println("비트AND : " + (num1 & num2));
		System.out.println("비트OR : " + (num1 | num2));
		System.out.println("비트XOR : " + (num1 ^ num2));
		System.out.println("비트NOT : " + (~num3));
	}

}
