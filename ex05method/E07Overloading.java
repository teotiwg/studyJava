package ex05method;

public class E07Overloading {
	
	static void person(int juminNum, int milNum) {
		System.out.println("군필자시군요.");
		System.out.println("주민번호: " + juminNum);
		System.out.println("군번: " + milNum);
	}
	
	static void person(int juminNum) {
		System.out.println("미필자이거나 여성이시군요.");
		System.out.println("주민번호: " + juminNum);
	}
	
	/* 반환타입만 다른 형태는 오버로딩되지 않는다.
	static void person(int juminNum) {
		System.out.println("미필자이거나 여성이시군요.");
		System.out.println("주민번호: " + juminNum);
		
		return 1;
	}
*/
	
	public static void main(String[] args) {
		person(123456, 7890123);
		System.out.println("=========================");
		person(987654);

	}

}
