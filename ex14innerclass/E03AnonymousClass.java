package ex14innerclass;
/*
 익명클래스(Anoymous class):
- 이름이 없는 클래스
- 내부클래스처럼 이벤트기반의 프로그래밍에서 많이 사용
- 클래스를 정의하는 것이 메소드 정의와 비슷
- 마지막에는 반드시 세미콜른을 써줘야 함
 */

class Person{
	String name;
	public Person(String n) {
		name = n;
	}
	void printInfo() {
		System.out.println(String.format("이름: %s", name));
	}
}

class Student extends Person{
	String stNumber;
	public Student(String n, String stNum) {
		super(n);
		stNumber = stNum;
	}
	
	// 자식에서 확장한 멤버메소드(부모에선 정의 않음)
	String getInfo() {
		return String.format("학번: %s", stNumber);
	}
	// 오버라이딩한 메소드(부모에서 정의함)
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println(getInfo());
	}
}

abstract class AbstractClass{
	public abstract void abstractMethod();
}

public class E03AnonymousClass {

	public static void main(String[] args) {
		/*
		 Student라는 이름을 가진 자식클래스를 통해 
		 객체를 생성하고 부모의 참조변수로 참조하는 이질화 형태
		 참조변수가 부모타입이므로 자식객체에 직접 접근은 불가능하고 
		 접근시 반드시 다운캐스팅(강제형변환) 이후 접근 필요
		 
		 형식)
	부모클래스명 참조변수 = new 부모클래스명(){
	익명클래스의 실행부;
	부모클래스의 메소드 오버라이딩();
	};

*** 부모클래스를 상속받아 이름 없는 자식클래스를 생성하는 개념
상속되기때문에 오버라이딩 가능
즉, {}안쪽은 "자식"의 영역
		 */
		
		Person person = new Student("문사람", "2016");
		person.printInfo();
		//person.stNumber = "2015";
		((Student)person).stNumber = "2015";
		System.out.println(((Student)person).getInfo());
/*
 Person클래스의 상속받은 익명클래스 정의:
Person타입의 인스턴스변수에 Person을 상속받은 익명클래스를 생성해서 그 주소를 할당
-개념적으로 new Person(){}; -> 익명 extends Person();
형태로 보면 됌
-이름 없는 객체이므로 부모클래스의 이름을 빌려서 객체를 생성한 셈

 */		
		Person anonyPerson = new Person("이말년") {
			/*
			 자식(익명클래스) 객체에서 새롭게 확장한 멤버
			-> 아래 멤버는 익명클래스 내에서만 접근 허용
			익명이므로 다운캐스팅 불가능
			따라서 익명클래스에선 멤버 확장은 거의 사용 않음
			 */
			int newVar;
			void newMethod() {
				System.out.println("익명클래스에서 새롭게 확장한 메소드");
			}
			// 오버라이딩해서 재정의한 메소드
			void printInfo() {
				System.out.println("newVar = " + newVar);
				newMethod();
				System.out.println("익명클래스에서 오버라이딩");
			}
		};
		anonyPerson.printInfo(); // 오버라이딩해서 호출 가능
		//anonyPerson.newMethod(); // 확장한 멤버이므로 접근 불가
		/*
		 부모타입의 참조변수를 자식객체에서 확장한 멤버에 접근할 수 없으므로 에러 발생
		 접근을 위해선 다운캐스팅해야 하지만 다운캐스팅이 불가능
		 */
	}
/*
 결론)
상속의 목적은 "확장"
익명클래스의 목적은 "오버라이딩"
그러믈 주로 익명클래스의 부모는 interface를 사용
 */
}
