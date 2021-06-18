package ex10accessmodifier;

import ex10accessmodifier.sub.*;

public class E01AccessModifier1Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
		// 동일한 패키지에 선언됐으므로 import 없이 객체 생성 가능
		// private으로 선언된 멤버는 동일한 패키지라도 접근 불가
		// private으로 선언된 멤버에 외부클래스에서 접근하려면 public으로 선언된 멤버메소드를 통해 간접적으로 접근해야 한다.
		
		E01AccessModifier1 one = new E01AccessModifier1();
		
		//System.out.println("one.privateVar = " + one.privateVar);
		System.out.println("one.defaultVar = " + one.defaultVar);
		System.out.println("one.publicVar = " + one.publicVar);
		
		//one.privateMethod();
		one.defaultMethod();
		one.publicMethod();
		
		/* 
		 동일한 패키지에 선언된 클래스이므로 import없이 객체생성 가능
		 또한 default클래스는 동일한 패키지에선 접근 가능
		*/
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
		/*
		 다른 패키지에 선언된 클래스이므로 객체생성을 위해 import선언을 해야 함
		 또한 패키지가 달면 private, default멤버에 접근 불가
		 */
		
		E01AccessModifier2 two = new E01AccessModifier2();
		
		//System.out.println("two.privateVar = " + two.privateVar);
		//System.out.println("two.defaultVar = " + two.defaultVar);
		System.out.println("two.publicVar = " + two.publicVar);
		
		//two.privateMethod();
		//two.defaultMethod();
		two.publicMethod();
		
		/*
		 다른 패키지에 선언된 디폴트 클래스이므로 객체생성이 불가능
		 import도 불가능하므로 아예 사용할 수 없는 클래스가 됌
		 */
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		//new DefaultClass2().myFunc();
		
	}

}
