package ex14innerclass;

/*
 내부정적클래스:
	클래스 안에 정의하는 클래스로 static을 붙여준다.
- 이와 같은 내부클래스를 static으로 선언하면 Nested클래스라 한다.
- 정적 멤버변수, 정적 멤버메소드를 가질 수 있다.
- 외부클래스의 인스턴스형 멤버는 사용불가
 */

class OuterClass {
	
	// 인스턴스형 멤버변수
	InnerStaticClass innerStaticClass = new InnerStaticClass();
	int outerMemberVar;
	
	// 인스턴스형 멤버메소드
	void outerMemberMethod() {
		/*
		 외부클래스의 멤버메소드는 내부정적클래스의 멤버에 접근 가능
			(힙 영역에선 메소드 영역 참조 가능
		 */
		System.out.println("외부클래스의 멤버메소드 호출");
		innerStaticClass.innerMemberVar = 100;// 내부정적클래스의 멤버변수
		InnerStaticClass.innerStaticVar = 101;// 내부정적클래스의 정적멤버변수
	}
	
	static int outerStaticVar;
	static void outerStaticMethod() {
		System.out.println("외부클래스의 정적메소드 호출");
		
		/*
		 외부클래스의 정적멤버메소드에선 내부클래스의 정적멤버만 접근 가능
			(메소드 영역에선 힙 영역 참조 불가)
		 */
		//innerStaticClass.innerMemberVar = 102;
		//innerStaticClass.innerMemberMethod();
		
		InnerStaticClass.innerStaticVar = 103;
		InnerStaticClass.innerStaticMethod();
		
		//InnerStaticClass.innerMemberVar = 104;
		//InnerStaticClass.innerMemberMethod();
	}
	
	static class InnerStaticClass{
		
		int innerMemberVar;
		
		void innerMemberMethod() {
			System.out.println("내부클래스의 멤버메소드 호출");
		}
		
		static int innerStaticVar;
		static void innerStaticMethod() {
			System.out.println("내부클래스의 정적메소드 호출");
		}
		
	}
	
}

public class E02InnerStaticClass {

	public static void main(String[] args) {
		/*
		 내부정적 클래스의 정적멤버에 접근할 때는 외부클래스의 객체생성 없이 클래스명으로 바로 접근 가능
		 */
		
		OuterClass.InnerStaticClass.innerStaticVar = 1;
		OuterClass.InnerStaticClass.innerStaticMethod();
		
		/*
		 내부정적클래스가 인스턴스형 멤버에 접근할 떄는 객체를 생성해 참조변수를 통해 접근해야 함
		 */
		OuterClass.InnerStaticClass innerStaticClass = 
				new OuterClass.InnerStaticClass();
		innerStaticClass.innerMemberVar = 2;
		innerStaticClass.innerMemberMethod();
		
		/*
		 그외는 클래스의 일반적인 방법을 따른다
		외부클래스의 멤버변수(메소드)는 객체생성 후 참조변수를 통해 접근
		 */
		OuterClass outerClass = new OuterClass();
		outerClass.outerMemberVar = 3;
		outerClass.outerMemberMethod();
		
		OuterClass.outerStaticVar = 4;
		OuterClass.outerStaticMethod();
		
	}

}
