package ex05method;

public class E06LocalVariable {

	public static void main(String[] args) {
		
		// main 지역에서 num을 선언하면 그보다 작은 지역에서 같은 이름으로 선언 불가
		// 큰 지역에서 이미 선언되어 메모리 상에서 상주하기 때문
		
		boolean scope = true;
		//int num = 9;
		
		if(scope) {
			int num = 1;
			num++;
			System.out.println("첫 if문의 지역: " + num);
		}
		else {
			int num = 5;
			System.out.println("첫 if문의 else 지역: " + num);
		}
		int num = 100; 
		System.out.println("main메소드 지역: " + num);
		
		simpleFunc();
		
		System.out.println("main메소드 끝");
	}
	static void simpleFunc() {
		int num = 1000;
		System.out.println("simple메소드 지역: " + num);
	}

}
