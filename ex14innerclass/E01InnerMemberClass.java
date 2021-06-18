package ex14innerclass;

/*
 내부멤버클래스:
클래스 안에 정의된 클래스로 static이 없는 클래스
- 외부클래스의 모든 멤버(정적 혹은 인스턴스형)을 사용가능
- 정적멤버를 가질 수 없음. 단 상수는 가능
- 컴파일 시 외부클래스명$내부클래스명.class 파일 생성
- 이벤트 기반의 프로그래밍에서 많이 사용

 */

import java.util.ArrayList;
// 외부클래스
class OuterMember{
	int outerInstanceVar; // 인스턴스형 멤버변수
	static int outerStaticVar; // 정적 멤버변수
	
	int sameVar = 1000;
	// 내부클래스를 사용하기 위한 멤버변수 및 객체 생성
	InnerMember inner;
	public OuterMember() {
		inner = new InnerMember();
	}
	// 인스턴스형 멤버메소드
	void outerInstanceMethod() {
		// 멤버변수 접근
		System.out.println("외부의 sameVar: " + sameVar);
		// 정적멤버는 클래스명으로 접근가능
		System.out.println("내부클래스의 상수: " + InnerMember.MAX_INT);
		// 내부클래스의 멤버변수에 접근할 땐 참조변수 사용
		System.out.println("내부의 sameVar: " + inner.sameVar);
	}
	// 정적 멤버메소드
	static void outerStaticMethod() {
		// 외부클래스의 정적 메소드에서 내부클래스의 정적상수 접근 가능
		System.out.println(InnerMember.MAX_INT);
		// 정적메소드에선 정적멤버에만 접근 가능
		//System.out.println("내부의 sameVar: " + inner.sameVar);
	}
	//내부클래스(내부멤버클래스)
	class InnerMember{
		int innerInstanceVar;
		int sameVar = 100;
		
		//외부클래스는 내부클래스보다 넓은 지역이므로 내부클래스에선 외부클래스의 모든 멤버에 접근 가능
		void innerInstanceMethod() {
			outerInstanceMethod();
			outerStaticMethod();
			this.sameVar = sameVar;
			OuterMember.this.sameVar = sameVar;
		}
		/*
		 내부클래스에선 static멤버 선언 불가능
		단, 상수인 경우엔 허용
		 */
		static final int MAX_INT = Integer.MAX_VALUE;
	}
}


public class E01InnerMemberClass {

	public static void main(String[] args) {
		
		//외부클래스가 아닌 다른 클래스에선 내부멤버클래스가 보이지 않으므로 직접 인스턴스 생성불가
		//InnerMember innerClass = new InnerMember();
		
		// 외부클래스의 인스턴스를 먼저 생성한 후 내부클래스의 인스턴스를 생성해야 함
		OuterMember outerClass = new OuterMember();
		// 외부클래스의 참조변수를 통해 내부클래스의 멤버메소드 호출
		
		outerClass.inner.innerInstanceMethod();
		
		//내부클래스의 객체는 아래의 2가지방법으로 생성 가능
		OuterMember.InnerMember in = outerClass.new InnerMember();
		OuterMember.InnerMember in2 = new OuterMember().new InnerMember();
		
		
	}

}
