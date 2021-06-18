package ex11static;

/*
 싱글톤 디자인 패턴:
클래스를 설계하는 디자인 패턴의 하나로써
하나의 인스턴스 즉 하나의 메모리를 생성해 이를 공유해 사용하고자 할 떄 사용하는 패턴

작성방법:
1. 생성자의 접근지정자를 private로 정의
2. 클래스 외부에선 생성자를 통해 접근할 수 없으므로 new를 통해 객체생성 불가
3. 클래스 내부에 정적메소드로 해당 클래스의 객체를 반환하도록 정의 => getInstance()
4. 위 방법을 통해 객체를 생성하면 메모리에 딱 하나만 만들어짐
 */

class NoSingleTone{
	
	int instVar;
	public NoSingleTone() {
		
	}
}

class SingleTone{
	
	int shareVar;
	
	private static SingleTone single = new SingleTone();
	
	private SingleTone() {
		
	}
	public static SingleTone getInstance() {
		return single;
	}
	void print() {
		System.out.println(String.format("shareVar=%d", shareVar));
	}
}
public class E03SingleToneDesignPattern {

	public static void main(String[] args) {
		// 일반적 방식의 객체생성방법으로 객체를 생성할 때마다 새 참조값(주소값)을 할당받음
		NoSingleTone nst1 = new NoSingleTone();
		nst1.instVar = 100;
		System.out.println("nst1 = "+ nst1);
		
		NoSingleTone nst2 = new NoSingleTone();
		nst1.instVar = 200;
		System.out.println("nst2 = "+ nst2);
		
		// 생성자가 private이므로 접근 불가
		//SingleTone st1 = new SingleTone();
		
		// 생성자를 접근할 수 없는 대신 getInstance() 메소드를 통해서만 객체의 참조값을 반환받을 수 있음
		// 받환받을 땐 항상 같은 객체만 반환받음
		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar = 100;
		st2.print();

		SingleTone st3 = SingleTone.getInstance();
		st3.shareVar = 200;
		st3.print();
		
		// 두 객체의 주소값도 동일
		System.out.println(String.format("st2의 주소: %s", st2));
		System.out.println(String.format("st3의 주소: %s", st3));
		
		System.out.println(String.format("st2의 shareVar: %d", st2.shareVar));
		System.out.println(String.format("st3의 shareVar: %d", st3.shareVar));
		
	}

}
