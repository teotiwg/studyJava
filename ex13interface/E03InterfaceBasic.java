package ex13interface;

/*
 인터페이스(interface):
클래스가 객체의 설계도라면 인터페이스는 클래스의 설계도
- 자바는 단일 상속을 원칙으로 하나 인터페이스를 통해 다중상속 구현 가능
- 추상클래스와 동일하게 상속을 목적으로 제작되므로 구현받은 하위클래서 반드시 오버라이딩해야 함
- 멤버로는 추상메소드와 상수로만 구성
메소드 -> public abstract
상수 -> public static final
- 인터페이스는 생성자 없음
 */

interface MyInterface1{
	// 생성자는 사용 불가
	// public MyInterface1() {}
	
	// 변수를 선언하면 무조건 상수로 선언
	public static final int MAX_INT = 2100000000;
	double MAX_DBL = 1.999999999;
	
	// 메소드는 무조건 추상메소드로 선언
	public abstract void absFunc1();
	void absFunc2();
}

interface MyInterface2{
	void absFunc2();
}

class SimpleClass{
	int simple = 1;
	void mySimple() {
		System.out.println("simple = " + simple);
	}
}
/*
 	인터페이스는 콤마를 이용해서 여러개를 동시에 구현 가능
	또한 상속과 구현을 동시 사용도 가능
 */
class MyClass implements MyInterface1, MyInterface2{
	/*
	 인터페이스에 동일한 이름의 추상메소드가 존재하는 경우
	하나만 오버라이딩하면 됌
	 */
	
	@Override
	public void absFunc1() {
		System.out.println("absFunc1() 호출");
	}
	@Override
	public void absFunc2() {
		System.out.println("absFunc2() 호출");
	}
}

public class E03InterfaceBasic {

	public static void main(String[] args) {
		
		// 구현한 인터페이스형 참조변수를 통해 자식객체를 참조
		MyInterface1 my1 = new MyClass();
		my1.absFunc1();
		my1.absFunc2();
		// 자식쪽 멤버에 접근하기 위해 다운캐스팅한 후 호출
		((SimpleClass)my1).mySimple();
		
	}

}
