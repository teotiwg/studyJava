package ex11static;

/*
 static variable(정적변수):
- 멤버변수 앞에 static 지정자가 붙으면 정적변수가 됌
- 정적변수는 JVM에 의해 프로그램이 시작되는 시점에 초기화
- main()메소드가 실행되기 전에 이미 초기화되므로 메인메소드 실행 시 별도의 선언없이 변수 사용 가능

접근방법
- 클래스 내부: 변수명으로 접근가능(일반적인 멤버변수와 동일)
- 클래스 외부: 참조변수.변수명 혹은 클래스명.변수명 (둘 다 가능, 단, 클래스명으로 접근하는 걸 권장)

 */

class MyStatic{
	
	//멤버변수:
	//인스턴스형 멤버변수는 반드시 클래스의 객체를 생성한 후
	//참조변수를 통해 접근해야 함
	
	/*
	 정적멤버변수:
	 객체를 생성할 필요 없이 클래스명으로 바로 접근 가능
	 프로그램 시작 시 이미 메소드영역에 로드됌
	 */
	int instanceVar;
	static int staticVar;
	
	/*
	 인스턴스형 멤버메소드:
	인스턴스형 메스드에선 모든 멤버 사용 가능
	인스턴스형 변수, 정적 변수 둘다 접근 가능
	 */
	
	void instanceMethod() {
		System.out.println("instanceVar = " + instanceVar);
		System.out.println("staticVar = " + staticVar);
		staticMethod();
	}
	
	/*정적 멤버메소드:
	정적메소드 안에서는 인스턴스멤버를 사용 불가
	정적 멤버만 접근 가능
	메인메소드에선 static으로 선언된 메소드만 호출될 수 있음
	 */
	static void staticMethod() {
		//System.out.println("instanceVar = " + instanceVar);
		System.out.println("staticVar = " + staticVar);
		//instanceMethod();
	}

}

public class E01StaticModifier {

	public static void main(String[] args) {
		
		/*
		 일반적인 멤버변수에 접근하는 방법:
		 MyStatic클래스의 객체를 생성한 후 참조변수를 통해 접근
		 */
		
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar = " + myStatic.instanceVar);
		
		//static멤버변수 접근방법
		//1: 클래스명 통해서 접근. 객체 생성 없이 바로 접근 가능
		
		MyStatic.staticVar = 200;
		System.out.println("MyStatic.staticVar = " + MyStatic.staticVar);
		
		// 2. 일반 멤버변수처럼 참조변수를 통해 접근 가능
		// 단,  이 경우 정적변수를 일반 멤버변수로 착각할 수 있으므로 권장 ㄴㄴ
		
		myStatic.staticVar = 300;
		System.out.println("myStatic.staticVar = " + myStatic.staticVar);
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		/*
		 인스턴스형 멤버변수는 객체별로 각각 존재하므로
		아래 초기화된 값은 객체별로 각각저장. 따라서 출력결과는 100, 1000
		 */
		
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;
		
		System.out.println("ms1.instanceVar = " + ms1.instanceVar);
		System.out.println("ms2.instanceVar = " + ms2.instanceVar);
		
		/*
		 정적 멤버변수는 각각의 객체마다 멤버변수가 존재 않고,
		메소드 영역에 하나만 생성되어 공유되므로 아래 대입문장은 하나의 변수에 값을 할당하게 됌
		따라서 겨로가는 마지막에 입력한 900 출력
		 */
		MyStatic.staticVar = 800;
		MyStatic.staticVar = 900;
		
		System.out.println("ms1.staticVar = " + ms1.staticVar);
		System.out.println("ms2.staticVar = " + ms2.staticVar);
		
		// 정적 멤버메소드의 접근방법은 정적변수의 접근법과 동일
		myStatic.instanceMethod();
		myStatic.staticMethod(); // 권장사항 아님. 클래스명을 통한 호출이 좋음
		
		//MyStatic.instanceMethod();
		MyStatic.staticMethod();
	}

}
