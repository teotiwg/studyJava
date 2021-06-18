package ex10accessmodifier;

/*
 	클래스를 정의할 때는 반드시 퍼블릭이나 디폴트(생략형)만 사용해야 한다.
 */

//private class privateClass1{
	//void myFunc() {
		//System.out.println("나는 정의할 수 없는 클래스");
	//}
	
//}

/*
  접근지정자를 생략했으므로 default클래스로 지정됌
  이 경우 동일 패키지 내에서는 접근 가능
 */

class DefaultClass1{
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc() 메소드 호출");
	}
	
}

/*
 public 클래스는 해당 자바파일을 대표하는 클래스로 파일명과 동일해야 하고
 다른 패키지에서도 접근 가능
 public 클래스는 하나의 자바파일로 단 하나만 정의 가능
 */

public class E01AccessModifier1 {
	
	/*
	 멤버변수를 각각의 접근지정자를 통해 선언
	 */
	
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	/*
	 동일 클래스 내에서는 private멤버라 할지라도 접근 가능
	 즉 동일 클래스 내에선 접근지정자의 영향을 받지 않는다.
	 */
	
	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod() 메소드 호출");
	}
	
	void defaultMethod() {
		privateVar = 200;
		System.out.println("defaultMethod() 메소드 호출");
	}
	
	/*
	 private으로 선언된 멤버(변수 혹은 메소드)를 외부클래스에서 접근하고 싶을 때는 public으로 선언된 멤버메소드를 이용해서 간접 접근 가능
	 */
	
	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
	
}
