package ex08class;

public class PersonConstructor {

	String name;
	int age;
	String addr;
	
	public PersonConstructor() {
		name = "무명";
		age = 0;
		addr = "미상";
		System.out.println("나는 기본생성자입니다.");
		
	}
	
	public PersonConstructor(String name) {
		this.name = name;
		age = 1;
		addr = "출처분명";
		
	}
	
	public PersonConstructor(String name, int age) {
		// this() 생성자 내에서 또다른 생성자를 호출 시 사용
		// 단, 생성자 내에서만 가능하고 일반 메소드에선 사용 불가
		this(name, age, "미상");
		System.out.println("난 인자생성자[2]입니다.");
	
	}
	
	public PersonConstructor(String _name, int age, String addr) {
		// 매개변수와 멤버변수 명이 다르면 this는 쓰지 않음
		// 변수 명이 동일할 떄만 사용 권장
		name = _name;
		// 멤버변수를 구분하기 위한 this는 멤버메소드에서도 사용 가능
		this.age = age;
		this.addr = addr;
		System.out.println("난 인자생성자[3]입니다.");
	}
	
	void initialize(String name, int age, String addr) {
		// 해당 코드는 생성자 내에서만 사용 가능
		// this(name, age, "미상"); -> 에러
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	void showPersonInfo() {
		System.out.printf("%s 님의 정보\n", this.name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("주소: %s\n", addr);
	}
	
}
