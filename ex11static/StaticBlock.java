package ex11static;

/*
 Static블럭:
동일 클래스 안의 메인메소드보다 먼저 실행되는 블럭으로
메인메소드의 실행코드가 없어도 먼저 실행
단, 다른 클래스에 메인이 있는 경우엔
메인이 순차적으로 실행되다가 static블럭에 있는 클래스가 객체화될 때 실행됌
이때 생성자보다 static블럭이 먼저 실행
 */

public class StaticBlock {

	// 인스턴스형 멤버변수
	int instanceVar;
	void instanceMethod() {}
	
	// 정적멤버
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
	
	// static 블럭
	static {
		// 블럭 내에서 정적 멤버에 접근 가능
		staticVar = 1000;
		
		/*
		 블럭 내에서만 사용할 수 있는 변수로써, 블럭 내에서 일반변수 생성 가능
		 */
		int localVar;
		localVar = 1000;
		System.out.println("localVar = " + localVar);
		
		// 스태틱블럭 내에서는 인스턴스형 멤버에 접근 불가
		//System.out.println("instanceVar = " + instanceVar);
		//instanceMethod();
		
		// 정적멤버에 접근 가능
		System.out.println("staticVar = " + staticVar);
		staticMethod();
		System.out.println("====static block====");
	}
	
	// 생성자메소드
	/*
	 생성자메소드
	 외부파일의 메인메소드에서 실행되는 경우 
	 해당 클래스의 객체가 생성자를 통해 생성되기 전에 스태틱 블럭이 먼저 실행
	 */
	public StaticBlock() {
		staticVar = -1;
		
		System.out.println("==Static Block의 생성자===");
		
	}
	
	// 메인메소드가 외부파일에 있을 경우 테스트를 위해 아래 부분은 주석처리 후 실행해본다. E02 예제 실행
	//public static void main(String[] args) {
		//System.out.println("==StaticBlock 생성자==");
		//스태틱 블럭 내에서 선언된 지역변수이므로 메인메소드에선 사용 불가능
		//System.out.println("localVar = " + localVar);
	//}
	
}
